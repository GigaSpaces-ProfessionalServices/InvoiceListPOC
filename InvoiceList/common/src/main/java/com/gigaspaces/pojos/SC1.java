package com.gigaspaces.pojos;

import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceId;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Objects;

/**
 * @author Denys_Novikov
 * Date: 8/15/19
 */
@SpaceClass
public class SC1 {

    private String id;
    private BigDecimal sbOid;
    private BigDecimal spOid;
    private String serviceType;
    private String man;
    private String dispMan;
    private Date manBillDate;
    private String origSystemId;
    private String ban;
    private String dispBan;
    private Date billDate;
    private String aban;
    private String opco;
    private String invoiceNbr;
    private String acctName;
    private String acctAlias;
    private String currencyCd;
    private BigDecimal totCurrChgs;
    private BigDecimal prevBillAmt;
    private Character paperSuppInd;
    private String addrCity;
    private String addrState;
    private String gbr;
    private Character remitAcctInd;
    private Character vesLarge;
    private String accountType;
    private Integer startPage;
    private Character partialInd;
    private String dueDate;
    private String wtn;
    private String shieldedNbr;
    private Character xmlStatus;

    private String reportIdTs;

    public SC1() {}

    public SC1(SC1 source) {
        this.id = source.id;
        this.sbOid = source.sbOid;
        this.spOid = source.spOid;
        this.serviceType = source.serviceType;
        this.man = source.man;
        this.dispMan = source.dispMan;
        this.manBillDate = source.manBillDate;
        this.origSystemId = source.origSystemId;
        this.ban = source.ban;
        this.dispBan = source.dispBan;
        this.billDate = source.billDate;
        this.aban = source.aban;
        this.opco = source.opco;
        this.invoiceNbr = source.invoiceNbr;
        this.acctName = source.acctName;
        this.acctAlias = source.acctAlias;
        this.currencyCd = source.currencyCd;
        this.totCurrChgs = source.totCurrChgs;
        this.prevBillAmt = source.prevBillAmt;
        this.paperSuppInd = source.paperSuppInd;
        this.addrCity = source.addrCity;
        this.addrState = source.addrState;
        this.gbr = source.gbr;
        this.remitAcctInd = source.remitAcctInd;
        this.accountType = source.accountType;
        this.startPage = source.startPage;
        this.partialInd = source.partialInd;
        this.dueDate = source.dueDate;
        this.wtn = source.wtn;
        this.shieldedNbr = source.shieldedNbr;
        this.vesLarge = source.vesLarge;
        this.xmlStatus = source.xmlStatus;
        this.reportIdTs = source.reportIdTs;
    }

    @SpaceId(autoGenerate = true)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getSbOid() {
        return sbOid;
    }

    public void setSbOid(BigDecimal sbOid) {
        this.sbOid = sbOid;
    }

    public BigDecimal getSpOid() {
        return spOid;
    }

    public void setSpOid(BigDecimal spOid) {
        this.spOid = spOid;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getMan() {
        return man;
    }

    public void setMan(String man) {
        this.man = man;
    }

    public String getDispMan() {
        return dispMan;
    }

    public void setDispMan(String dispMan) {
        this.dispMan = dispMan;
    }

    public Date getManBillDate() {
        return manBillDate;
    }

    public void setManBillDate(Date manBillDate) {
        this.manBillDate = manBillDate;
    }

    public String getOrigSystemId() {
        return origSystemId;
    }

    public void setOrigSystemId(String origSystemId) {
        this.origSystemId = origSystemId;
    }

    public String getBan() {
        return ban;
    }

    public void setBan(String ban) {
        this.ban = ban;
    }

    public String getDispBan() {
        return dispBan;
    }

    public void setDispBan(String dispBan) {
        this.dispBan = dispBan;
    }

    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public String getAban() {
        return aban;
    }

    public void setAban(String aban) {
        this.aban = aban;
    }

    public String getOpco() {
        return opco;
    }

    public void setOpco(String opco) {
        this.opco = opco;
    }

    public String getInvoiceNbr() {
        return invoiceNbr;
    }

    public void setInvoiceNbr(String invoiceNbr) {
        this.invoiceNbr = invoiceNbr;
    }

    public String getAcctName() {
        return acctName;
    }

    public void setAcctName(String acctName) {
        this.acctName = acctName;
    }

    public String getAcctAlias() {
        return acctAlias;
    }

    public void setAcctAlias(String acctAlias) {
        this.acctAlias = acctAlias;
    }

    public String getCurrencyCd() {
        return currencyCd;
    }

    public void setCurrencyCd(String currencyCd) {
        this.currencyCd = currencyCd;
    }

    public BigDecimal getTotCurrChgs() {
        return totCurrChgs;
    }

    public void setTotCurrChgs(BigDecimal totCurrChgs) {
        this.totCurrChgs = totCurrChgs;
    }

    public BigDecimal getPrevBillAmt() {
        return prevBillAmt;
    }

    public void setPrevBillAmt(BigDecimal prevBillAmt) {
        this.prevBillAmt = prevBillAmt;
    }

    public Character getPaperSuppInd() {
        return paperSuppInd;
    }

    public void setPaperSuppInd(Character paperSuppInd) {
        this.paperSuppInd = paperSuppInd;
    }

    public String getAddrCity() {
        return addrCity;
    }

    public void setAddrCity(String addrCity) {
        this.addrCity = addrCity;
    }

    public String getAddrState() {
        return addrState;
    }

    public void setAddrState(String addrState) {
        this.addrState = addrState;
    }

    public String getGbr() {
        return gbr;
    }

    public void setGbr(String gbr) {
        this.gbr = gbr;
    }

    public Character getRemitAcctInd() {
        return remitAcctInd;
    }

    public void setRemitAcctInd(Character remitAcctInd) {
        this.remitAcctInd = remitAcctInd;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Integer getStartPage() {
        return startPage;
    }

    public void setStartPage(Integer startPage) {
        this.startPage = startPage;
    }

    public Character getPartialInd() {
        return partialInd;
    }

    public void setPartialInd(Character partialInd) {
        this.partialInd = partialInd;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getWtn() {
        return wtn;
    }

    public void setWtn(String wtn) {
        this.wtn = wtn;
    }

    public String getShieldedNbr() {
        return shieldedNbr;
    }

    public void setShieldedNbr(String shieldedNbr) {
        this.shieldedNbr = shieldedNbr;
    }

    public Character getVesLarge() {
        return vesLarge;
    }

    public void setVesLarge(Character vesLarge) {
        this.vesLarge = vesLarge;
    }

    public Character getXmlStatus() {
        return xmlStatus;
    }

    public void setXmlStatus(Character xmlStatus) {
        this.xmlStatus = xmlStatus;
    }

    public String getReportIdTs() {
        return reportIdTs;
    }

    public void setReportIdTs(String reportIdTs) {
        this.reportIdTs = reportIdTs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SC1 SC1 = (SC1) o;
        return Objects.equals(id != null ? id.trim() : id, SC1.id != null ? SC1.id.trim() : SC1.id) &&
                Objects.equals(sbOid, SC1.sbOid) &&
                Objects.equals(spOid, SC1.spOid) &&
                Objects.equals(serviceType != null ? serviceType .trim() : serviceType, SC1.serviceType != null ? SC1.serviceType.trim() : SC1.serviceType) &&
                Objects.equals(man != null ? man .trim() : man, SC1.man != null ? SC1.man.trim() : SC1.man) &&
                Objects.equals(dispMan != null ? dispMan .trim() : dispMan, SC1.dispMan != null ? SC1.dispMan.trim() : SC1.dispMan) &&
                Objects.equals(manBillDate, SC1.manBillDate) &&
                Objects.equals(origSystemId != null ? origSystemId .trim() : origSystemId, SC1.origSystemId != null ? SC1.origSystemId.trim() : SC1.origSystemId) &&
                Objects.equals(ban != null ? ban .trim() : ban, SC1.ban != null ? SC1.ban.trim() : SC1.ban) &&
                Objects.equals(dispBan != null ? dispBan .trim() : dispBan, SC1.dispBan != null ? SC1.dispBan.trim() : SC1.dispBan) &&
                Objects.equals(billDate, SC1.billDate) &&
                Objects.equals(aban != null ? aban .trim() : aban, SC1.aban != null ? SC1.aban.trim() : SC1.aban) &&
                Objects.equals(opco != null ? opco .trim() : opco, SC1.opco != null ? SC1.opco.trim() : SC1.opco) &&
                Objects.equals(invoiceNbr != null ? invoiceNbr .trim() : invoiceNbr, SC1.invoiceNbr != null ? SC1.invoiceNbr.trim() : SC1.invoiceNbr) &&
                Objects.equals(acctName != null ? acctName .trim() : acctName, SC1.acctName != null ? SC1.acctName.trim() : SC1.acctName) &&
                Objects.equals(acctAlias != null ? acctAlias .trim() : acctAlias, SC1.acctAlias != null ? SC1.acctAlias.trim() : SC1.acctAlias) &&
                Objects.equals(currencyCd != null ? currencyCd .trim() : currencyCd, SC1.currencyCd != null ? SC1.currencyCd.trim() : SC1.currencyCd) &&
                Objects.equals(totCurrChgs, SC1.totCurrChgs) &&
                Objects.equals(prevBillAmt, SC1.prevBillAmt) &&
                Objects.equals(paperSuppInd, SC1.paperSuppInd) &&
                Objects.equals(addrCity != null ? addrCity .trim() : addrCity, SC1.addrCity != null ? SC1.addrCity.trim() : SC1.addrCity) &&
                Objects.equals(addrState != null ? addrState .trim() : addrState, SC1.addrState != null ? SC1.addrState.trim() : SC1.addrState) &&
                Objects.equals(gbr != null ? gbr .trim() : gbr, SC1.gbr != null ? SC1.gbr.trim() : SC1.gbr) &&
                Objects.equals(remitAcctInd, SC1.remitAcctInd) &&
                Objects.equals(accountType != null ? accountType .trim() : accountType, SC1.accountType != null ? SC1.accountType.trim() : SC1.accountType) &&
                Objects.equals(startPage, SC1.startPage) &&
                Objects.equals(partialInd, SC1.partialInd) &&
                Objects.equals(dueDate != null ? dueDate .trim() : dueDate, SC1.dueDate != null ? SC1.dueDate.trim() : SC1.dueDate) &&
                Objects.equals(wtn != null ? wtn .trim() : wtn, SC1.wtn != null ? SC1.wtn.trim() : SC1.wtn) &&
                Objects.equals(shieldedNbr != null ? shieldedNbr .trim() : shieldedNbr, SC1.shieldedNbr != null ? SC1.shieldedNbr.trim() : SC1.shieldedNbr) &&
                Objects.equals(vesLarge, SC1.vesLarge) &&
                Objects.equals(xmlStatus, SC1.xmlStatus) &&
                Objects.equals(reportIdTs != null ? reportIdTs .trim() : reportIdTs, SC1.reportIdTs != null ? SC1.reportIdTs.trim() : SC1.reportIdTs);
    }


    @Override
    public int hashCode() {

        return Objects.hash(
                id != null ? id.trim() :id,
                sbOid,
                spOid,
                serviceType != null ? serviceType .trim() : serviceType,
                man != null ? man .trim() : man,
                dispMan != null ? dispMan .trim() : dispMan,
                manBillDate,
                origSystemId != null ? origSystemId .trim() : origSystemId,
                ban != null ? ban .trim() : ban,
                dispBan != null ? dispBan .trim() : dispBan,
                billDate,
                aban != null ? aban .trim() : aban,
                opco != null ? opco .trim() : opco,
                invoiceNbr != null ? invoiceNbr .trim() : invoiceNbr,
                acctName != null ? acctName .trim() : acctName,
                acctAlias != null ? acctAlias .trim() : acctAlias,
                currencyCd != null ? currencyCd .trim() : currencyCd,
                totCurrChgs,
                prevBillAmt,
                paperSuppInd,
                addrCity != null ? addrCity .trim() : addrCity,
                addrState != null ? addrState .trim() : addrState,
                gbr != null ? gbr .trim() : gbr,
                remitAcctInd,
                accountType != null ? accountType .trim() : accountType,
                startPage,
                partialInd,
                dueDate != null ? dueDate .trim() : dueDate,
                wtn != null ? wtn .trim() : wtn,
                shieldedNbr != null ? shieldedNbr .trim() : shieldedNbr,
                vesLarge,
                xmlStatus,
                reportIdTs != null ? reportIdTs .trim() : reportIdTs);
    }
}
