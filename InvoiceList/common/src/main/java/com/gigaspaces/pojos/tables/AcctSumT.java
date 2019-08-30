package com.gigaspaces.pojos.tables;

import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceId;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * @author Denys_Novikov
 * Date: 15.08.2018
 */
@Entity
@Table(schema = "BMGVZP", name = "ACCT_SUM_T")
@SpaceClass
public class AcctSumT {

    @EmbeddedId
    private AcctSumTCompositeId acctSumTCompositeId;

    @Column(name = "STATE_CODE")
    private String stateCode;
    @Column(name = "DEPT_CD")
    private String deptCd;
    @Column(name = "PAY_BY_DATE")
    private String payByDate;
    @Column(name = "TOT_BILL_AMT")
    private BigDecimal totBillAmt;
    @Column(name = "PREV_BILL_AMT")
    private BigDecimal prevBillAmt;
    @Column(name = "TOT_PAYS")
    private BigDecimal totPays;
    @Column(name = "TOT_ADJS")
    private BigDecimal totAdjs;
    @Column(name = "TRNSFR_AMT")
    private BigDecimal trnsfrAmt;
    @Column(name = "CURR_CHGS_MAN")
    private BigDecimal currChgs_man;
    @Column(name = "TOT_BILL_CHGS_BANS")
    private BigDecimal totBillChgsBans;
    @Column(name = "NET_PAST_DUE")
    private BigDecimal netPastDue;
    @Column(name = "LATE_PAY_CHGS")
    private BigDecimal latePayChgs;
    @Column(name = "TOT_CURR_CHGS")
    private BigDecimal totCurrChgs;
    @Column(name = "PMTS_THRU_DATE")
    private String pmtsThruDate;
    @Column(name = "SUMM_BILL_IND")
    private Character summBillInd;
    @Column(name = "ACCT_STATUS_IND")
    private Character acctStatusInd;
    @Column(name = "CLS_OF_SVC_TYPE")
    private Character clsOfSvcType;
    @Column(name = "HOLD_BILL_IND")
    private Character holdBillInd;
    @Column(name = "ARREARS_IND")
    private Character arrearsInd;
    @Column(name = "LATE_PAY_CHG_RATE")
    private BigDecimal latePayChgRate;
    @Column(name = "TAX_STATUS_IND_FD")
    private Character taxStatusIndFd;
    @Column(name = "TAX_STATUS_IND_ST")
    private Character taxStatusIndSt;
    @Column(name = "TAX_STATUS_E911")
    private Character taxStatusE911;
    @Column(name = "TAX_STATUS_SCHG")
    private Character taxStatusSchg;
    @Column(name = "TAX_STATUS_IND_LOC")
    private Character taxStatusIndLoc;
    @Column(name = "TAR_CD_INFO")
    private String tarCdInfo;
    @Column(name = "GEO_CD")
    private String geoCd;
    @Column(name = "ACCT_TYPE_CD")
    private Character acctTypeCd;
    @Column(name = "RESALE_DISC_AMT")
    private BigDecimal resaleDiscAmt;
    @Column(name = "PACKAGE_DISC_AMT")
    private BigDecimal packageDiscAmt;
    @Column(name = "ACCSUMXT_DAN")
    private String accsumxtDan;
    @Column(name = "ACCT_NAME")
    private String acctName;
    @Column(name = "ADDR_SEQ_NBR")
    private Integer addrSeqNbr;
    @Column(name = "TAR_CD_INFO_ID")
    private Integer tarCdInfoId;
    @Column(name = "TXFER_TYPE")
    private Character txferType;
    @Column(name = "TEXT_IND")
    private Character textInd;
    @Column(name = "BILL_PAGE_NUMBER")
    private Integer billPageNumber;
    @Column(name = "ITEM_NUMBER")
    private Byte itemNumber;
    @Column(name = "CUST_ID_CD")
    private String custIdCd;
    @Column(name = "CUST_ID_DEPT_CD")
    private String custIdDeptCd;
    @Column(name = "TOT_CARR_CHGS")
    private BigDecimal totCarrChgs;
    @Column(name = "COLL_REFER_AMT")
    private BigDecimal collReferAmt;
    @Column(name = "BILL_BASIS_CD")
    private Character billBasisCd;
    @Column(name = "AMT_PEND_LEGAL")
    private BigDecimal amtPendLegal;
    @Column(name = "FUTURE_LPAY_RATE")
    private BigDecimal futureLpayRate;
    @Column(name = "AMT_SUBJ_LPAY")
    private BigDecimal amtSubjLpay;
    @Column(name = "PAYM_OPT_CD")
    private Character paymOptCd;
    @Column(name = "PEND_LPAY_AMT")
    private BigDecimal pendLpayAmt;
    @Column(name = "TOLL_CAP_AMT")
    private BigDecimal tollCapAmt;
    @Column(name = "CUSTOMER_PIN")
    private String customerPin;
    @Column(name = "TRANSFER_PAST_CHGS")
    private BigDecimal transferPastChgs;
    @Column(name = "RAO")
    private String rao;
    @Column(name = "CLASSIFICATION_CD")
    private Character classificationCd;
    @Column(name = "NBBE_CODE")
    private Character nbbeCode;
    @Column(name = "COMPANY_CODE")
    private String companyCode;
    @Column(name = "END_VZ450_SEQ_NBR")
    private Integer endVz450SeqNbr;
    @Column(name = "CUST_ID_CD_ID")
    private Integer custIdCdId;
    @Column(name = "CUST_ID_DEPT_CD_ID")
    private Integer custIdDeptCdId;
    @Column(name = "PAYMADDT_SEQ_NBR")
    private Integer paymaddtSeqNbr;
    @Column(name = "TEXT1_SEQ_NBR")
    private Integer text1SeqNbr;
    @Column(name = "TEXT2_SEQ_NBR")
    private Integer text2SeqNbr;
    @Column(name = "ADDL_TEXT_IND")
    private Character addlTextInd;
    @Column(name = "FIBER_ACCT_CD")
    private Character fiberAcctCd;
    @Column(name = "SUB_CIC")
    private String subCic;
    @Column(name = "COMP_SVC_TYPE")
    private Character compSvcType;
    @Column(name = "ISRT_CD")
    private String isrtCd;
    @Column(name = "ISRT_STATION")
    private Character isrtStation;
    @Column(name = "ISRT_WEIGHT")
    private BigDecimal isrt_weight;
    @Column(name = "CHK_DIGIT_NBR")
    private String chkDigitNbr;
    @Column(name = "CHK_ACCEPT_IND")
    private Character chkAcceptInd;
    @Column(name = "BILL_LINE_ID")
    private String billLineId;
    @Column(name = "ACCT_ASSOC_CD")
    private Character acctAssocCd;
    @Column(name = "ACCT_SYSTEM_ID")
    private Character acctSystemId;
    @Column(name = "CLSSVC_USOC")
    private String clssvcUsoc;
    @Column(name = "REV_BOOK_CD")
    private String revBookCd;
    @Column(name = "MERGE_FMT_IND")
    private Character mergeFmtInd;
    @Column(name = "SPEC_REC_ORIG_CD")
    private Character specRecOrigCd;
    @Column(name = "ENTITY_CD")
    private String entityCd;
    @Column(name = "CHANNEL_CD")
    private String channelCd;
    @Column(name = "NATL_ACCT_ID")
    private String natlAcctId;
    @Column(name = "LEGACY_ACCT_ID")
    private String legacyAcctId;
    @Column(name = "INV_BILL_IND")
    private Character invBillInd;
    @Column(name = "INVOICE_NBR")
    private String invoiceNbr;
    @Column(name = "TEXT_KEY_NBR1")
    private Integer text_keyNbr1;
    @Column(name = "TEXT_KEY_NBR2")
    private Integer text_keyNbr2;
    @Column(name = "TEXT_KEY_NBR3")
    private Integer text_keyNbr3;
    @Column(name = "IMMEDIATE_MAN")
    private String immediateMan;
    @Column(name = "RECORD_LEVEL")
    private Character recordLevel;
    @Column(name = "REMIT_ACCT_IND")
    private Character remitAcctInd;
    @Column(name = "LDEP_IND")
    private Character ldepInd;
    @Column(name = "ORG_LEVEL1_CD")
    private String orgLevel1Cd;
    @Column(name = "ORG_LEVEL2_CD")
    private String orgLevel2Cd;
    @Column(name = "FREQUENCY")
    private Character frequency;
    @Column(name = "BILL_CURR")
    private String billCurr;
    @Column(name = "CONV_CURR")
    private String convCurr;
    @Column(name = "REGION_CD")
    private String regionCd;
    @Column(name = "INVOICE_SERIES_NBR")
    private String invoiceSeriesNbr;
    @Column(name = "COST_CNTR_IND")
    private Character costCntrInd;
    @Column(name = "WIRELESS_DAN")
    private String wirelessDan;
    @Column(name = "MASTER_CHANNEL_CD")
    private String masterChannelCd;
    @Column(name = "MODULE_084")
    private String module084;
    @Column(name = "OPCO")
    private String opco;
    @Column(name = "MODULE_087")
    private String module087;
    @Column(name = "SPEC_PROC_CD")
    private Character specProcCd;
    @Column(name = "WCAS_TAX_CAT")
    private String wcasTaxCat;
    @Column(name = "VAMLOAD_DATE")
    private String vamloadDate;
    @Column(name = "MODULE_302")
    private String module302;
    @Column(name = "SHIELDED_IND")
    private Character shieldedInd;

    public AcctSumT(){}

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public String getDeptCd() {
        return deptCd;
    }

    public void setDeptCd(String deptCd) {
        this.deptCd = deptCd;
    }

    public String getPayByDate() {
        return payByDate;
    }

    public void setPayByDate(String payByDate) {
        this.payByDate = payByDate;
    }

    public BigDecimal getTotBillAmt() {
        return totBillAmt;
    }

    public void setTotBillAmt(BigDecimal totBillAmt) {
        this.totBillAmt = totBillAmt;
    }

    public BigDecimal getPrevBillAmt() {
        return prevBillAmt;
    }

    public void setPrevBillAmt(BigDecimal prevBillAmt) {
        this.prevBillAmt = prevBillAmt;
    }

    public BigDecimal getTotPays() {
        return totPays;
    }

    public void setTotPays(BigDecimal totPays) {
        this.totPays = totPays;
    }

    public BigDecimal getTotAdjs() {
        return totAdjs;
    }

    public void setTotAdjs(BigDecimal totAdjs) {
        this.totAdjs = totAdjs;
    }

    public BigDecimal getTrnsfrAmt() {
        return trnsfrAmt;
    }

    public void setTrnsfrAmt(BigDecimal trnsfrAmt) {
        this.trnsfrAmt = trnsfrAmt;
    }

    public BigDecimal getCurrChgs_man() {
        return currChgs_man;
    }

    public void setCurrChgs_man(BigDecimal currChgs_man) {
        this.currChgs_man = currChgs_man;
    }

    public BigDecimal getTotBillChgsBans() {
        return totBillChgsBans;
    }

    public void setTotBillChgsBans(BigDecimal totBillChgsBans) {
        this.totBillChgsBans = totBillChgsBans;
    }

    public BigDecimal getNetPastDue() {
        return netPastDue;
    }

    public void setNetPastDue(BigDecimal netPastDue) {
        this.netPastDue = netPastDue;
    }

    public BigDecimal getLatePayChgs() {
        return latePayChgs;
    }

    public void setLatePayChgs(BigDecimal latePayChgs) {
        this.latePayChgs = latePayChgs;
    }

    public BigDecimal getTotCurrChgs() {
        return totCurrChgs;
    }

    public void setTotCurrChgs(BigDecimal totCurrChgs) {
        this.totCurrChgs = totCurrChgs;
    }

    public String getPmtsThruDate() {
        return pmtsThruDate;
    }

    public void setPmtsThruDate(String pmtsThruDate) {
        this.pmtsThruDate = pmtsThruDate;
    }

    public Character getSummBillInd() {
        return summBillInd;
    }

    public void setSummBillInd(Character summBillInd) {
        this.summBillInd = summBillInd;
    }

    public Character getAcctStatusInd() {
        return acctStatusInd;
    }

    public void setAcctStatusInd(Character acctStatusInd) {
        this.acctStatusInd = acctStatusInd;
    }

    public Character getClsOfSvcType() {
        return clsOfSvcType;
    }

    public void setClsOfSvcType(Character clsOfSvcType) {
        this.clsOfSvcType = clsOfSvcType;
    }

    public Character getHoldBillInd() {
        return holdBillInd;
    }

    public void setHoldBillInd(Character holdBillInd) {
        this.holdBillInd = holdBillInd;
    }

    public Character getArrearsInd() {
        return arrearsInd;
    }

    public void setArrearsInd(Character arrearsInd) {
        this.arrearsInd = arrearsInd;
    }

    public BigDecimal getLatePayChgRate() {
        return latePayChgRate;
    }

    public void setLatePayChgRate(BigDecimal latePayChgRate) {
        this.latePayChgRate = latePayChgRate;
    }

    public Character getTaxStatusIndFd() {
        return taxStatusIndFd;
    }

    public void setTaxStatusIndFd(Character taxStatusIndFd) {
        this.taxStatusIndFd = taxStatusIndFd;
    }

    public Character getTaxStatusIndSt() {
        return taxStatusIndSt;
    }

    public void setTaxStatusIndSt(Character taxStatusIndSt) {
        this.taxStatusIndSt = taxStatusIndSt;
    }

    public Character getTaxStatusE911() {
        return taxStatusE911;
    }

    public void setTaxStatusE911(Character taxStatusE911) {
        this.taxStatusE911 = taxStatusE911;
    }

    public Character getTaxStatusSchg() {
        return taxStatusSchg;
    }

    public void setTaxStatusSchg(Character taxStatusSchg) {
        this.taxStatusSchg = taxStatusSchg;
    }

    public Character getTaxStatusIndLoc() {
        return taxStatusIndLoc;
    }

    public void setTaxStatusIndLoc(Character taxStatusIndLoc) {
        this.taxStatusIndLoc = taxStatusIndLoc;
    }

    public String getTarCdInfo() {
        return tarCdInfo;
    }

    public void setTarCdInfo(String tarCdInfo) {
        this.tarCdInfo = tarCdInfo;
    }

    public String getGeoCd() {
        return geoCd;
    }

    public void setGeoCd(String geoCd) {
        this.geoCd = geoCd;
    }

    public Character getAcctTypeCd() {
        return acctTypeCd;
    }

    public void setAcctTypeCd(Character acctTypeCd) {
        this.acctTypeCd = acctTypeCd;
    }

    public BigDecimal getResaleDiscAmt() {
        return resaleDiscAmt;
    }

    public void setResaleDiscAmt(BigDecimal resaleDiscAmt) {
        this.resaleDiscAmt = resaleDiscAmt;
    }

    public BigDecimal getPackageDiscAmt() {
        return packageDiscAmt;
    }

    public void setPackageDiscAmt(BigDecimal packageDiscAmt) {
        this.packageDiscAmt = packageDiscAmt;
    }

    public String getAccsumxtDan() {
        return accsumxtDan;
    }

    public void setAccsumxtDan(String accsumxtDan) {
        this.accsumxtDan = accsumxtDan;
    }

    public String getAcctName() {
        return acctName;
    }

    public void setAcctName(String acctName) {
        this.acctName = acctName;
    }

    public Integer getAddrSeqNbr() {
        return addrSeqNbr;
    }

    public void setAddrSeqNbr(Integer addrSeqNbr) {
        this.addrSeqNbr = addrSeqNbr;
    }

    public Integer getTarCdInfoId() {
        return tarCdInfoId;
    }

    public void setTarCdInfoId(Integer tarCdInfoId) {
        this.tarCdInfoId = tarCdInfoId;
    }

    public Character getTxferType() {
        return txferType;
    }

    public void setTxferType(Character txferType) {
        this.txferType = txferType;
    }

    public Character getTextInd() {
        return textInd;
    }

    public void setTextInd(Character textInd) {
        this.textInd = textInd;
    }

    public Integer getBillPageNumber() {
        return billPageNumber;
    }

    public void setBillPageNumber(Integer billPageNumber) {
        this.billPageNumber = billPageNumber;
    }

    public Byte getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(Byte itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getCustIdCd() {
        return custIdCd;
    }

    public void setCustIdCd(String custIdCd) {
        this.custIdCd = custIdCd;
    }

    public String getCustIdDeptCd() {
        return custIdDeptCd;
    }

    public void setCustIdDeptCd(String custIdDeptCd) {
        this.custIdDeptCd = custIdDeptCd;
    }

    public BigDecimal getTotCarrChgs() {
        return totCarrChgs;
    }

    public void setTotCarrChgs(BigDecimal totCarrChgs) {
        this.totCarrChgs = totCarrChgs;
    }

    public BigDecimal getCollReferAmt() {
        return collReferAmt;
    }

    public void setCollReferAmt(BigDecimal collReferAmt) {
        this.collReferAmt = collReferAmt;
    }

    public Character getBillBasisCd() {
        return billBasisCd;
    }

    public void setBillBasisCd(Character billBasisCd) {
        this.billBasisCd = billBasisCd;
    }

    public BigDecimal getAmtPendLegal() {
        return amtPendLegal;
    }

    public void setAmtPendLegal(BigDecimal amtPendLegal) {
        this.amtPendLegal = amtPendLegal;
    }

    public BigDecimal getFutureLpayRate() {
        return futureLpayRate;
    }

    public void setFutureLpayRate(BigDecimal futureLpayRate) {
        this.futureLpayRate = futureLpayRate;
    }

    public BigDecimal getAmtSubjLpay() {
        return amtSubjLpay;
    }

    public void setAmtSubjLpay(BigDecimal amtSubjLpay) {
        this.amtSubjLpay = amtSubjLpay;
    }

    public Character getPaymOptCd() {
        return paymOptCd;
    }

    public void setPaymOptCd(Character paymOptCd) {
        this.paymOptCd = paymOptCd;
    }

    public BigDecimal getPendLpayAmt() {
        return pendLpayAmt;
    }

    public void setPendLpayAmt(BigDecimal pendLpayAmt) {
        this.pendLpayAmt = pendLpayAmt;
    }

    public BigDecimal getTollCapAmt() {
        return tollCapAmt;
    }

    public void setTollCapAmt(BigDecimal tollCapAmt) {
        this.tollCapAmt = tollCapAmt;
    }

    public String getCustomerPin() {
        return customerPin;
    }

    public void setCustomerPin(String customerPin) {
        this.customerPin = customerPin;
    }

    public BigDecimal getTransferPastChgs() {
        return transferPastChgs;
    }

    public void setTransferPastChgs(BigDecimal transferPastChgs) {
        this.transferPastChgs = transferPastChgs;
    }

    public String getRao() {
        return rao;
    }

    public void setRao(String rao) {
        this.rao = rao;
    }

    public Character getClassificationCd() {
        return classificationCd;
    }

    public void setClassificationCd(Character classificationCd) {
        this.classificationCd = classificationCd;
    }

    public Character getNbbeCode() {
        return nbbeCode;
    }

    public void setNbbeCode(Character nbbeCode) {
        this.nbbeCode = nbbeCode;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public Integer getEndVz450SeqNbr() {
        return endVz450SeqNbr;
    }

    public void setEndVz450SeqNbr(Integer endVz450SeqNbr) {
        this.endVz450SeqNbr = endVz450SeqNbr;
    }

    public Integer getCustIdCdId() {
        return custIdCdId;
    }

    public void setCustIdCdId(Integer custIdCdId) {
        this.custIdCdId = custIdCdId;
    }

    public Integer getCustIdDeptCdId() {
        return custIdDeptCdId;
    }

    public void setCustIdDeptCdId(Integer custIdDeptCdId) {
        this.custIdDeptCdId = custIdDeptCdId;
    }

    public Integer getPaymaddtSeqNbr() {
        return paymaddtSeqNbr;
    }

    public void setPaymaddtSeqNbr(Integer paymaddtSeqNbr) {
        this.paymaddtSeqNbr = paymaddtSeqNbr;
    }

    public Integer getText1SeqNbr() {
        return text1SeqNbr;
    }

    public void setText1SeqNbr(Integer text1SeqNbr) {
        this.text1SeqNbr = text1SeqNbr;
    }

    public Integer getText2SeqNbr() {
        return text2SeqNbr;
    }

    public void setText2SeqNbr(Integer text2SeqNbr) {
        this.text2SeqNbr = text2SeqNbr;
    }

    public Character getAddlTextInd() {
        return addlTextInd;
    }

    public void setAddlTextInd(Character addlTextInd) {
        this.addlTextInd = addlTextInd;
    }

    public Character getFiberAcctCd() {
        return fiberAcctCd;
    }

    public void setFiberAcctCd(Character fiberAcctCd) {
        this.fiberAcctCd = fiberAcctCd;
    }

    public String getSubCic() {
        return subCic;
    }

    public void setSubCic(String subCic) {
        this.subCic = subCic;
    }

    public Character getCompSvcType() {
        return compSvcType;
    }

    public void setCompSvcType(Character compSvcType) {
        this.compSvcType = compSvcType;
    }

    public String getIsrtCd() {
        return isrtCd;
    }

    public void setIsrtCd(String isrtCd) {
        this.isrtCd = isrtCd;
    }

    public Character getIsrtStation() {
        return isrtStation;
    }

    public void setIsrtStation(Character isrtStation) {
        this.isrtStation = isrtStation;
    }

    public BigDecimal getIsrt_weight() {
        return isrt_weight;
    }

    public void setIsrt_weight(BigDecimal isrt_weight) {
        this.isrt_weight = isrt_weight;
    }

    public String getChkDigitNbr() {
        return chkDigitNbr;
    }

    public void setChkDigitNbr(String chkDigitNbr) {
        this.chkDigitNbr = chkDigitNbr;
    }

    public Character getChkAcceptInd() {
        return chkAcceptInd;
    }

    public void setChkAcceptInd(Character chkAcceptInd) {
        this.chkAcceptInd = chkAcceptInd;
    }

    public String getBillLineId() {
        return billLineId;
    }

    public void setBillLineId(String billLineId) {
        this.billLineId = billLineId;
    }

    public Character getAcctAssocCd() {
        return acctAssocCd;
    }

    public void setAcctAssocCd(Character acctAssocCd) {
        this.acctAssocCd = acctAssocCd;
    }

    public Character getAcctSystemId() {
        return acctSystemId;
    }

    public void setAcctSystemId(Character acctSystemId) {
        this.acctSystemId = acctSystemId;
    }

    public String getClssvcUsoc() {
        return clssvcUsoc;
    }

    public void setClssvcUsoc(String clssvcUsoc) {
        this.clssvcUsoc = clssvcUsoc;
    }

    public String getRevBookCd() {
        return revBookCd;
    }

    public void setRevBookCd(String revBookCd) {
        this.revBookCd = revBookCd;
    }

    public Character getMergeFmtInd() {
        return mergeFmtInd;
    }

    public void setMergeFmtInd(Character mergeFmtInd) {
        this.mergeFmtInd = mergeFmtInd;
    }

    public Character getSpecRecOrigCd() {
        return specRecOrigCd;
    }

    public void setSpecRecOrigCd(Character specRecOrigCd) {
        this.specRecOrigCd = specRecOrigCd;
    }

    public String getEntityCd() {
        return entityCd;
    }

    public void setEntityCd(String entityCd) {
        this.entityCd = entityCd;
    }

    public String getChannelCd() {
        return channelCd;
    }

    public void setChannelCd(String channelCd) {
        this.channelCd = channelCd;
    }

    public String getNatlAcctId() {
        return natlAcctId;
    }

    public void setNatlAcctId(String natlAcctId) {
        this.natlAcctId = natlAcctId;
    }

    public String getLegacyAcctId() {
        return legacyAcctId;
    }

    public void setLegacyAcctId(String legacyAcctId) {
        this.legacyAcctId = legacyAcctId;
    }

    public Character getInvBillInd() {
        return invBillInd;
    }

    public void setInvBillInd(Character invBillInd) {
        this.invBillInd = invBillInd;
    }

    public String getInvoiceNbr() {
        return invoiceNbr;
    }

    public void setInvoiceNbr(String invoiceNbr) {
        this.invoiceNbr = invoiceNbr;
    }

    public Integer getText_keyNbr1() {
        return text_keyNbr1;
    }

    public void setText_keyNbr1(Integer text_keyNbr1) {
        this.text_keyNbr1 = text_keyNbr1;
    }

    public Integer getText_keyNbr2() {
        return text_keyNbr2;
    }

    public void setText_keyNbr2(Integer text_keyNbr2) {
        this.text_keyNbr2 = text_keyNbr2;
    }

    public Integer getText_keyNbr3() {
        return text_keyNbr3;
    }

    public void setText_keyNbr3(Integer text_keyNbr3) {
        this.text_keyNbr3 = text_keyNbr3;
    }

    public String getImmediateMan() {
        return immediateMan;
    }

    public void setImmediateMan(String immediateMan) {
        this.immediateMan = immediateMan;
    }

    public Character getRecordLevel() {
        return recordLevel;
    }

    public void setRecordLevel(Character recordLevel) {
        this.recordLevel = recordLevel;
    }

    public Character getRemitAcctInd() {
        return remitAcctInd;
    }

    public void setRemitAcctInd(Character remitAcctInd) {
        this.remitAcctInd = remitAcctInd;
    }

    public Character getLdepInd() {
        return ldepInd;
    }

    public void setLdepInd(Character ldepInd) {
        this.ldepInd = ldepInd;
    }

    public String getOrgLevel1Cd() {
        return orgLevel1Cd;
    }

    public void setOrgLevel1Cd(String orgLevel1Cd) {
        this.orgLevel1Cd = orgLevel1Cd;
    }

    public String getOrgLevel2Cd() {
        return orgLevel2Cd;
    }

    public void setOrgLevel2Cd(String orgLevel2Cd) {
        this.orgLevel2Cd = orgLevel2Cd;
    }

    public Character getFrequency() {
        return frequency;
    }

    public void setFrequency(Character frequency) {
        this.frequency = frequency;
    }

    public String getBillCurr() {
        return billCurr;
    }

    public void setBillCurr(String billCurr) {
        this.billCurr = billCurr;
    }

    public String getConvCurr() {
        return convCurr;
    }

    public void setConvCurr(String convCurr) {
        this.convCurr = convCurr;
    }

    public String getRegionCd() {
        return regionCd;
    }

    public void setRegionCd(String regionCd) {
        this.regionCd = regionCd;
    }

    public String getInvoiceSeriesNbr() {
        return invoiceSeriesNbr;
    }

    public void setInvoiceSeriesNbr(String invoiceSeriesNbr) {
        this.invoiceSeriesNbr = invoiceSeriesNbr;
    }

    public Character getCostCntrInd() {
        return costCntrInd;
    }

    public void setCostCntrInd(Character costCntrInd) {
        this.costCntrInd = costCntrInd;
    }

    public String getWirelessDan() {
        return wirelessDan;
    }

    public void setWirelessDan(String wirelessDan) {
        this.wirelessDan = wirelessDan;
    }

    public String getMasterChannelCd() {
        return masterChannelCd;
    }

    public void setMasterChannelCd(String masterChannelCd) {
        this.masterChannelCd = masterChannelCd;
    }

    public String getModule084() {
        return module084;
    }

    public void setModule084(String module084) {
        this.module084 = module084;
    }

    public String getOpco() {
        return opco;
    }

    public void setOpco(String opco) {
        this.opco = opco;
    }

    public String getModule087() {
        return module087;
    }

    public void setModule087(String module087) {
        this.module087 = module087;
    }

    public Character getSpecProcCd() {
        return specProcCd;
    }

    public void setSpecProcCd(Character specProcCd) {
        this.specProcCd = specProcCd;
    }

    public String getWcasTaxCat() {
        return wcasTaxCat;
    }

    public void setWcasTaxCat(String wcasTaxCat) {
        this.wcasTaxCat = wcasTaxCat;
    }

    public String getVamloadDate() {
        return vamloadDate;
    }

    public void setVamloadDate(String vamloadDate) {
        this.vamloadDate = vamloadDate;
    }

    public String getModule302() {
        return module302;
    }

    public void setModule302(String module302) {
        this.module302 = module302;
    }

    public Character getShieldedInd() {
        return shieldedInd;
    }

    public void setShieldedInd(Character shieldedInd) {
        this.shieldedInd = shieldedInd;
    }

    @SpaceId
    public AcctSumTCompositeId getAcctSumTCompositeId() {
        return acctSumTCompositeId;
    }

    public void setAcctSumTCompositeId(AcctSumTCompositeId acctSumTCompositeId) {
        this.acctSumTCompositeId = acctSumTCompositeId;
    }

}
