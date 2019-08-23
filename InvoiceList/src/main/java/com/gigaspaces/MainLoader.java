package com.gigaspaces;

import com.gigaspaces.pojos.LST;
import com.gigaspaces.pojos.SC1;
import com.gigaspaces.pojos.tables.*;
import com.j_spaces.core.client.SQLQuery;
import org.openspaces.core.GigaSpace;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


/**
 * @author Denys_Novikov
 * Date: 12/19/18
 */
public class MainLoader {

    private static Logger logger = LoggerFactory.getLogger(MainLoader.class);


    private static final List<String> ORIG_SYSTEM_IDS = Arrays.asList("23","T0","T2","T8","??","ML","CA","ZI","Z2","Z3");
    private static final List<String> ORIG_SYSTEM_IDS_FOR_ACCT_SUM_T_1 = Arrays.asList("M1","M2","PO");
    private static final List<String> ORIG_SYSTEM_IDS_FOR_ACCT_SUM_T_2 = Arrays.asList("07","10","PO","GC","GD","IC","ID");
    private static final List<String> ABANS = Arrays.asList("0000000","00000000");
    private static final List<String> ORIG_SYSTEM_IDS_FOR_INVOICE_1 = Arrays.asList("GD","IC","ID","RA");
    private static final List<String> ORIG_SYSTEM_IDS_FOR_INVOICE_2 = Arrays.asList("IC","ID","25","26","GD","PO");

    @Autowired
    private GigaSpace gigaspace;

    public void init() {

        InvoiceListT[] invoiceListTS = gigaspace.readMultiple(new SQLQuery<>(InvoiceListT.class, ""));
        CurrentBanT[] currentBanTS = gigaspace.readMultiple(new SQLQuery<>(CurrentBanT.class, ""));


        Map<String, List<InvoiceListT>> mappedInvoiceListT = Arrays.stream(invoiceListTS)
//                .filter(invoice -> "2019-05-31-10.56.18.238481".equals(invoice.getInvoiceListTCompositeId().getReportIdTs())) // 2017-09-13-10.51.21.157064, 2019-02-07-01.30.28.944631
                .filter(invoice -> invoice.getManBillDate().before(java.sql.Date.valueOf("9999-12-31")))
                .filter(invoice -> invoice.getManBillDate().getTime() > LocalDateTime.now().minusMonths(13).toInstant(ZoneOffset.UTC).toEpochMilli())
                .filter(invoice -> !ORIG_SYSTEM_IDS.contains(invoice.getOrigSystemId()))
                .collect(Collectors.groupingBy(MainLoader::createMappingKey));

        Map<String, CurrentBanT> mappedCurrentBanT = Arrays.stream(currentBanTS).collect(Collectors.toMap(MainLoader::createMappingKey, Function.identity()));

        Set<LST> LSTS = new HashSet<>();

        for (Map.Entry<String, List<InvoiceListT>> entry : mappedInvoiceListT.entrySet()) {

            String key = entry.getKey();
            List<InvoiceListT> value = entry.getValue();
            CurrentBanT matchedValue = mappedCurrentBanT.get(key);

            if (matchedValue != null) {

                for (InvoiceListT invoice : value) {

                    LST LST = new LST();
                    LST.setReportIdTs(invoice.getInvoiceListTCompositeId().getReportIdTs());
                    LST.setOrigSystemId(invoice.getOrigSystemId());
                    LST.setMan(invoice.getMan());
                    LST.setBan(invoice.getBan());
                    LST.setManBillDate(invoice.getManBillDate());
                    LSTS.add(LST);

                }
            }
        }

        logger.info("Step 1 result size -> " + LSTS.size());
        gigaspace.writeMultiple(LSTS.toArray());


        // ------ step 2

        AcctSumT[] acctSumTS = gigaspace.readMultiple(new SQLQuery<>(AcctSumT.class, ""));
        MasterAcctNoT[] masterAcctNoTS = gigaspace.readMultiple(new SQLQuery<>(MasterAcctNoT.class, ""));
        OriginSystemT[] originSystemTS = gigaspace.readMultiple(new SQLQuery<>(OriginSystemT.class, ""));
        PaymentIneligibleT[] paymentIneligibleTS = gigaspace.readMultiple(new SQLQuery<>(PaymentIneligibleT.class, ""));
        OpcoMasterT[] opcoMasterTS = gigaspace.readMultiple(new SQLQuery<>(OpcoMasterT.class, ""));
        ShieldXrefT[] shieldXrefTS = gigaspace.readMultiple(new SQLQuery<>(ShieldXrefT.class, ""));
        ColumbiaStatusT[] columbiaStatusTS = gigaspace.readMultiple(new SQLQuery<>(ColumbiaStatusT.class, ""));


        Set<String> lst = LSTS.stream().map(step -> step.getReportIdTs() + step.getOrigSystemId() + step.getMan() + step.getBan() + step.getManBillDate()).collect(Collectors.toSet());

        // ----- LST INNER JOIN BMGVZP.INVOICE_LIST_T (no additional data required from LST, only filtering)
        Map<String, List<InvoiceListT>> inv = Arrays.stream(invoiceListTS).collect(Collectors.groupingBy(step -> step.getInvoiceListTCompositeId().getReportIdTs() + step.getOrigSystemId() + step.getMan() + step.getBan() + step.getManBillDate()));
        inv = inv.entrySet().stream().filter(entry -> lst.contains(entry.getKey())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        // ------------------------------------------------------

        Map<String, List<AcctSumT>> act = Arrays.stream(acctSumTS)
                .filter(acctSumT -> !ORIG_SYSTEM_IDS_FOR_ACCT_SUM_T_1.contains(acctSumT.getAcctSumTCompositeId().getOrigSystemId()) || '5' == acctSumT.getRecordLevel())
                .collect(Collectors.groupingBy(acctSumT -> acctSumT.getAcctSumTCompositeId().getBan() + acctSumT.getAcctSumTCompositeId().getBillDate() + acctSumT.getAcctSumTCompositeId().getMan() + acctSumT.getAcctSumTCompositeId().getManBillDate() + acctSumT.getAcctSumTCompositeId().getOrigSystemId()));


        Map<String, MasterAcctNoT> mst = Arrays.stream(masterAcctNoTS)
                .filter(masterAcctNoT -> 'V' == masterAcctNoT.getLocation())
                .collect(Collectors.toMap(masterAcctNoT -> masterAcctNoT.getMasterAcctNoTCompoundId().getMan() + masterAcctNoT.getMasterAcctNoTCompoundId().getManBillDate() + masterAcctNoT.getMasterAcctNoTCompoundId().getOrigSystemId(), Function.identity()));

        Map<String, OriginSystemT> osys = Arrays.stream(originSystemTS).collect(Collectors.toMap(OriginSystemT::getOrigSystemId, Function.identity()));

        Map<String, OpcoMasterT> opcm = Arrays.stream(opcoMasterTS).collect(Collectors.toMap(OpcoMasterT::getOpco, Function.identity()));
        Map<String, Set<PaymentIneligibleT>> inelg = Arrays.stream(paymentIneligibleTS).collect(Collectors.groupingBy(payment -> payment.getCompositeId().getMan() + payment.getCompositeId().getBan() + payment.getCompositeId().getOrigSystemId(), Collectors.toSet()));
        Map<String, ShieldXrefT> shld = Arrays.stream(shieldXrefTS).collect(Collectors.toMap(shield -> shield.getShieldXrefTCompositeId().getLegMan() + shield.getShieldXrefTCompositeId().getLegBan() + shield.getShieldXrefTCompositeId().getLegOsid(), Function.identity()));
        Map<String, ColumbiaStatusT> cst = Arrays.stream(columbiaStatusTS).collect(Collectors.toMap(columbiaStatusT -> columbiaStatusT.getColumbiaStatusTCompoundId().getMan() + columbiaStatusT.getColumbiaStatusTCompoundId().getOsid() + columbiaStatusT.getColumbiaStatusTCompoundId().getBan() + columbiaStatusT.getColumbiaStatusTCompoundId().getBillDate() + columbiaStatusT.getColumbiaStatusTCompoundId().getInvoiceNbr(), Function.identity()));

        Map<String, List<InvoiceListT>> remappedInvForAct = inv.values().stream().flatMap(List::stream).collect(Collectors.groupingBy(step -> step.getBan() + step.getBillDate()  + step.getMan() + step.getManBillDate() + step.getOrigSystemId()));


        Set<SC1> sc1s = new HashSet<>();
        // ---- INV INNER JOIN ACT
        for (Map.Entry<String, List<InvoiceListT>> entry : remappedInvForAct.entrySet()) {
            if (act.containsKey(entry.getKey())) {

                List<AcctSumT> acts = act.get(entry.getKey());

                for (InvoiceListT invoice : entry.getValue()) {
                    for (AcctSumT account : acts) {
                        // ---- INV INNER JOIN MST &&  INV INNER JOIN OSYS
                        if (!ORIG_SYSTEM_IDS_FOR_ACCT_SUM_T_2.contains(account.getAcctSumTCompositeId().getOrigSystemId())
                        || account.getAcctSumTCompositeId().getAban().equals(invoice.getInvoiceListTCompositeId().getAban())) {

                            if (mst.containsKey(invoice.getMan() + invoice.getManBillDate() + invoice.getOrigSystemId())
                                    && osys.containsKey(invoice.getOrigSystemId())) {

                                SC1 sc1 = new SC1();

                                sc1.setReportIdTs(invoice.getInvoiceListTCompositeId().getReportIdTs());

                                sc1.setSpOid(invoice.getSpOid());
                                sc1.setSbOid(invoice.getSbOid());

                                if("PO".equals(invoice.getOrigSystemId().trim())
                                        && "BTN".equals(invoice.getServiceType().trim())
                                        && 'Y' == invoice.getQ2cFlag()) {
                                    sc1.setServiceType("BTNE2EI");
                                } else if ("CGI".equals(invoice.getServiceType())) {
                                    sc1.setServiceType("CORP");
                                } else {
                                    sc1.setServiceType(invoice.getServiceType());
                                }

                                sc1.setMan(invoice.getMan());
                                sc1.setDispMan(invoice.getDispMan());
                                sc1.setManBillDate(account.getAcctSumTCompositeId().getManBillDate());
                                sc1.setOrigSystemId(invoice.getOrigSystemId());
                                sc1.setBan(invoice.getBan());
                                sc1.setDispBan(invoice.getDispAcctNum());
                                sc1.setBillDate(account.getAcctSumTCompositeId().getBillDate());
                                sc1.setAban(account.getAcctSumTCompositeId().getAban());

                                if (account.getOpco() != null) {
                                    sc1.setOpco(account.getOpco());
                                } else {
                                    sc1.setOpco("");
                                }

                                sc1.setInvoiceNbr(account.getInvoiceNbr());
                                sc1.setAcctName(account.getAcctName().trim());
                                sc1.setAcctAlias(invoice.getAcctAlias());
                                sc1.setCurrencyCd(account.getBillCurr());
                                sc1.setTotCurrChgs(account.getTotCurrChgs());
                                sc1.setPrevBillAmt(account.getPrevBillAmt());
                                sc1.setPaperSuppInd(invoice.getPaperSuppInd());
                                sc1.setAddrCity(invoice.getAddrCity());
                                sc1.setAddrState(invoice.getAddrState());
                                sc1.setGbr(invoice.getGbr());

                                if ('B' == account.getRemitAcctInd() || 'B' == invoice.getRemitAcctInd()) {
                                    sc1.setRemitAcctInd('N');
                                } else if (account.getRemitAcctInd() != null) {
                                    sc1.setRemitAcctInd(account.getRemitAcctInd());
                                } else {
                                    sc1.setRemitAcctInd(invoice.getRemitAcctInd());
                                }

                                sc1.setAccountType(invoice.getAccountType());

                                OriginSystemT originSystemT = osys.get(invoice.getOrigSystemId());
                                MasterAcctNoT masterAcctNoT = mst.get(invoice.getMan() + invoice.getManBillDate() + invoice.getOrigSystemId());
                                OpcoMasterT opcoMasterT = opcm.get(invoice.getOpco());
                                ColumbiaStatusT columbiaStatusT = cst.get(account.getAcctSumTCompositeId().getMan() + account.getAcctSumTCompositeId().getOrigSystemId() + account.getAcctSumTCompositeId().getBan() + account.getAcctSumTCompositeId().getBillDate() + account.getInvoiceNbr());
                                Set<PaymentIneligibleT> paymentIneligibleT = inelg.get(invoice.getMan() + invoice.getBan() + invoice.getOrigSystemId());

                                if ("07".equals(invoice.getOrigSystemId()) && ('Y' == invoice.getStandAloneInd()
                                        || !invoice.getMan().equals(invoice.getBan())
                                        || !ABANS.contains(invoice.getInvoiceListTCompositeId().getAban()))) {

                                    sc1.setStartPage(903);
                                } else if (!ORIG_SYSTEM_IDS_FOR_INVOICE_1.contains(invoice.getOrigSystemId())) {
                                    sc1.setStartPage(originSystemT.getPortalStartPage());
                                } else if (masterAcctNoT.getInternationalInd() == null) {
                                    sc1.setStartPage(5200);
                                } else if (masterAcctNoT.getInternationalInd() == 'Y' && !ORIG_SYSTEM_IDS_FOR_INVOICE_2.contains(invoice.getOrigSystemId())) {
                                    sc1.setStartPage(0);
                                } else if ("PO".equals(invoice.getOrigSystemId())) {
                                    if (opcoMasterT != null && opcoMasterT.getOpco() == null) {
                                        sc1.setStartPage(originSystemT.getPortalStartPage());
                                    } else if (!invoice.getMan().equals(invoice.getBan())) {
                                        if (opcoMasterT != null) {
                                            sc1.setStartPage(opcoMasterT.getPortalStartPage());
                                        }
                                    } else if (invoice.getMan().equals(invoice.getBan())) {
                                        if (opcoMasterT != null) {
                                            sc1.setStartPage(opcoMasterT.getPortalStartPageMan());
                                        }
                                    }
                                } else if ('I' == originSystemT.getPortalLink()) {
                                    sc1.setStartPage(originSystemT.getPortalStartPage());
                                } else {
                                    sc1.setStartPage(5200);
                                }

                                sc1.setPartialInd(masterAcctNoT.getManPartialInd());

                                if (account.getPayByDate() == null || account.getPayByDate().trim().equals("0000-00-00")) {
                                    sc1.setDueDate("9999-12-31");
                                } else {
                                    sc1.setDueDate(account.getPayByDate());
                                }
                                sc1.setWtn(" ");

                                String shieldKey = invoice.getMan() + invoice.getBan() + invoice.getOrigSystemId();
                                ShieldXrefT shield = shld.get(shieldKey);
                                if (shield != null
                                        && account.getAcctSumTCompositeId().getManBillDate().after(shield.getFirstBillDate())
                                        && account.getAcctSumTCompositeId().getManBillDate().before(shield.getLastBillDate())) {

                                    if (shield.getNewSysBan() != null) {
                                        sc1.setShieldedNbr(shield.getNewSysBan());
                                    } else {
                                        sc1.setShieldedNbr(" ");
                                    }
                                }

                                if ("2803".equals(invoice.getOpco())) {
                                    if (columbiaStatusT != null && columbiaStatusT.getStatus() != null) {
                                        sc1.setXmlStatus(columbiaStatusT.getStatus());
                                    } else {
                                        sc1.setXmlStatus(' ');
                                    }
                                }

                                if (paymentIneligibleT != null) {
                                    for (PaymentIneligibleT payment : paymentIneligibleT) {
                                        SC1 newStep = new SC1(sc1);
                                        newStep.setVesLarge(payment.getCompositeId().getMan() != null ? 'Y' : ' ');
                                        sc1s.add(newStep);
                                    }
                                } else {
                                    sc1s.add(sc1);
                                }
                            }
                        }
                    }
                }
            }
        }


        logger.info("Step 2 result size : " + sc1s.size());

        gigaspace.writeMultiple(sc1s.toArray());

    }


    private static String createMappingKey(InvoiceListT invoiceListT) {
        return invoiceListT.getBan() + invoiceListT.getMan() + invoiceListT.getOrigSystemId() + invoiceListT.getManBillDate();
    }

    private static String createMappingKey(CurrentBanT currentBanT) {
        return currentBanT.getBan() + currentBanT.getMan() + currentBanT.getOrigSystemId() + currentBanT.getLastDate();
    }
}
