package com.gigaspaces.pojos.tables;

import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceId;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.sql.Date;

/**
 * @author Denys_Novikov
 * Date: 8/5/19
 */
@Entity
@Table(schema = "BMGVZP", name = "INVOICE_LIST_T")
@SpaceClass
public class InvoiceListT {

    @EmbeddedId
    private InvoiceListTCompositeId invoiceListTCompositeId;

    @Column(name = "MAN")
    private String man;
    @Column(name = "MAN_BILL_DATE")
    private Date manBillDate;
    @Column(name = "ORIG_SYSTEM_ID")
    private String origSystemId;
    @Column(name = "BAN")
    private String ban;
    @Column(name = "BILL_DATE")
    private Date billDate;
    @Column(name = "VZ450_SEQ_NBR")
    private Integer vz450SeqNbr;
    @Column(name = "ENTITY_CD")
    private String entityCd;
    @Column(name = "PREV_BILL_AMT")
    private BigDecimal prevBillAmt;
    @Column(name = "TOT_PAYS")
    private BigDecimal totPays;
    @Column(name = "TOT_ADJS")
    private BigDecimal totAdjs;
    @Column(name = "NET_PAST_DUE")
    private BigDecimal netPast_Due;
    @Column(name = "LATE_PAY_CHGS")
    private BigDecimal latePayChgs;
    @Column(name = "TOT_CURR_CHGS")
    private BigDecimal totCurrChgs;
    @Column(name = "PORTAL_START_PAGE")
    private Integer portalStartPage;
    @Column(name = "DISP_ACCT_NUM")
    private String dispAcctNum;
    @Column(name = "CUST_ACCT_NUM")
    private String custAcctNum;
    @Column(name = "WTN")
    private String wtn;
    @Column(name = "MAN_PARTIAL_IND")
    private Character manPartialInd;
    @Column(name = "RECENT_DATE")
    private Date recentDate;
    @Column(name = "LAST_DATE")
    private Date lastDate;
    @Column(name = "BAN_LVL")
    private Character banLvl;
    @Column(name = "ENTERPRISE_ID")
    private BigDecimal enterpriseId;
    @Column(name = "SB_OID")
    private BigDecimal sbOid;
    @Column(name = "SP_OID")
    private BigDecimal spOid;
    @Column(name = "SERVICE_TYPE")
    private String serviceType;
    @Column(name = "SP_STATUS")
    private Character spStatus;
    @Column(name = "SP_STATUS_DATE")
    private Date spStatusDate;
    @Column(name = "SP_BACKEND_SYSTEM")
    private String spBackendSystem;
    @Column(name = "CHANNEL_CD")
    private String channelCd;
    @Column(name = "LOGIN_ID")
    private String loginId;
    @Column(name = "INVOICE_NBR")
    private String invoiceNbr;
    @Column(name = "REMIT_ACCT_IND")
    private Character remitAcctInd;
    @Column(name = "CURRENCY_CD")
    private String currencyCd;
    @Column(name = "REGION_CD")
    private String regionCd;
    @Column(name = "INVOICE_TYPE")
    private Character invoiceType;
    @Column(name = "INTERNATIONAL_IND")
    private Character internationalInd;
    @Column(name = "ACCT_NAME")
    private String acctName;
    @Column(name = "ADDR_SEQ_NBR")
    private Integer addrSeqmbr;
    @Column(name = "ADDR_CITY")
    private String addrCity;
    @Column(name = "ADDR_STATE")
    private String addrState;
    @Column(name = "GBR")
    private String gbr;
    @Column(name = "GBR_OSID")
    private String gbrOsid;
    @Column(name = "GBR_DATE")
    private String gbrDate;
    @Column(name = "PAPER_SUPP_IND")
    private Character paperSuppInd;
    @Column(name = "PAPER_ELIG_IND")
    private Character paperEligInd;
    @Column(name = "PAPER_CONTR_AMEND")
    private Character paperContrAmend;
    @Column(name = "ZIP_CD")
    private String zipCd;
    @Column(name = "TOT_BILL_AMT")
    private BigDecimal totBillAmt;
    @Column(name = "VERIFIED")
    private Character verified;
    @Column(name = "PEND_PAY_AMT")
    private BigDecimal pendPayAmt;
    @Column(name = "PEND_ADJ_AMT")
    private BigDecimal pendAdjAmt;
    @Column(name = "BILL_ADDRESS")
    private String billAddress;
    @Column(name = "SVC_ADDRESS")
    private String svcAddress;
    @Column(name = "CREF")
    private String cref;
    @Column(name = "STAND_ALONE_IND")
    private Character standAloneInd;
    @Column(name = "BILL_PERIOD")
    private String billPeriod;
    @Column(name = "PAPER_CHARGE_CODE")
    private String paperChargeCode;
    @Column(name = "PAPER_CALL_DETAIL")
    private String paperCallDetail;
    @Column(name = "PAPER_OID_STATUS")
    private String paperOidStatus;
    @Column(name = "ACCT_ALIAS")
    private String acctAlias;
    @Column(name = "GBR_CLASS_CD")
    private Character gbrClassCd;
    @Column(name = "GBR_SP_OID")
    private BigDecimal gbrSpOid;
    @Column(name = "GBR_SB_OID")
    private BigDecimal gbrSbOid;
    @Column(name = "GBR_SERVICE_TYPE")
    private String gbrServiceType;
    @Column(name = "M077_SUPP_DATA_ID")
    private String m077SuppDataId;
    @Column(name = "FREQUENCY")
    private Character frequency;
    @Column(name = "OPCO")
    private String opco;
    @Column(name = "ACCT_IN_GCP")
    private Character acctInGcp;
    @Column(name = "CORP_IN_GCP")
    private Character corpInGcp;
    @Column(name = "LVL_7_TYPE")
    private String lvl7type;
    @Column(name = "LVL_7_OID")
    private BigDecimal lvl7oid;
    @Column(name = "LVL_8_TYPE")
    private String lvl8type;
    @Column(name = "LVL_8_OID")
    private BigDecimal lvl8oid;
    @Column(name = "LVL_9_TYPE")
    private String lvl9type;
    @Column(name = "LVL_9_OID")
    private BigDecimal lvl9oid;
    @Column(name = "LVL_10_TYPE")
    private String lvl10type;
    @Column(name = "LVL_10_OID")
    private BigDecimal lvl10oid;
    @Column(name = "STATE_CODE")
    private String stateCode;
    @Column(name = "LAST_ONLINE_ACTION")
    private Character lastOnlineAction;
    @Column(name = "INQUIRY_PENDING")
    private Character inquiryPending;
    @Column(name = "DISP_MAN")
    private String dispMan;
    @Column(name = "ACCOUNT_TYPE")
    private String accountType;
    @Column(name = "STRUCTURE_ID")
    private Integer structureId;
    @Column(name = "LINE_NUM")
    private Integer lineNum;
    @Column(name = "Q2C_FLAG")
    private Character q2cFlag;

    InvoiceListT(){}

    public String getMan() {
        return man;
    }

    public void setMan(String man) {
        this.man = man;
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

    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public String getWtn() {
        return wtn;
    }

    public void setWtn(String wtn) {
        this.wtn = wtn;
    }

    public Integer getStructureId() {
        return structureId;
    }

    public void setStructureId(Integer structureId) {
        this.structureId = structureId;
    }

    public Integer getLineNum() {
        return lineNum;
    }

    public void setLineNum(Integer lineNum) {
        this.lineNum = lineNum;
    }

    public Integer getVz450SeqNbr() {
        return vz450SeqNbr;
    }

    public void setVz450SeqNbr(Integer vz450SeqNbr) {
        this.vz450SeqNbr = vz450SeqNbr;
    }

    public String getEntityCd() {
        return entityCd;
    }

    public void setEntityCd(String entityCd) {
        this.entityCd = entityCd;
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

    public BigDecimal getNetPast_Due() {
        return netPast_Due;
    }

    public void setNetPast_Due(BigDecimal netPast_Due) {
        this.netPast_Due = netPast_Due;
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

    public Integer getPortalStartPage() {
        return portalStartPage;
    }

    public void setPortalStartPage(Integer portalStartPage) {
        this.portalStartPage = portalStartPage;
    }

    public String getDispAcctNum() {
        return dispAcctNum;
    }

    public void setDispAcctNum(String dispAcctNum) {
        this.dispAcctNum = dispAcctNum;
    }

    public String getCustAcctNum() {
        return custAcctNum;
    }

    public void setCustAcctNum(String custAcctNum) {
        this.custAcctNum = custAcctNum;
    }

    public Character getManPartialInd() {
        return manPartialInd;
    }

    public void setManPartialInd(Character manPartialInd) {
        this.manPartialInd = manPartialInd;
    }

    public Date getRecentDate() {
        return recentDate;
    }

    public void setRecentDate(Date recentDate) {
        this.recentDate = recentDate;
    }

    public Date getLastDate() {
        return lastDate;
    }

    public void setLastDate(Date lastDate) {
        this.lastDate = lastDate;
    }

    public Character getBanLvl() {
        return banLvl;
    }

    public void setBanLvl(Character banLvl) {
        this.banLvl = banLvl;
    }

    public BigDecimal getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(BigDecimal enterpriseId) {
        this.enterpriseId = enterpriseId;
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

    public Character getSpStatus() {
        return spStatus;
    }

    public void setSpStatus(Character spStatus) {
        this.spStatus = spStatus;
    }

    public Date getSpStatusDate() {
        return spStatusDate;
    }

    public void setSpStatusDate(Date spStatusDate) {
        this.spStatusDate = spStatusDate;
    }

    public String getSpBackendSystem() {
        return spBackendSystem;
    }

    public void setSpBackendSystem(String spBackendSystem) {
        this.spBackendSystem = spBackendSystem;
    }

    public String getChannelCd() {
        return channelCd;
    }

    public void setChannelCd(String channelCd) {
        this.channelCd = channelCd;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getInvoiceNbr() {
        return invoiceNbr;
    }

    public void setInvoiceNbr(String invoiceNbr) {
        this.invoiceNbr = invoiceNbr;
    }

    public Character getRemitAcctInd() {
        return remitAcctInd;
    }

    public void setRemitAcctInd(Character remitAcctInd) {
        this.remitAcctInd = remitAcctInd;
    }

    public String getCurrencyCd() {
        return currencyCd;
    }

    public void setCurrencyCd(String currencyCd) {
        this.currencyCd = currencyCd;
    }

    public String getRegionCd() {
        return regionCd;
    }

    public void setRegionCd(String regionCd) {
        this.regionCd = regionCd;
    }

    public Character getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(Character invoiceType) {
        this.invoiceType = invoiceType;
    }

    public Character getInternationalInd() {
        return internationalInd;
    }

    public void setInternationalInd(Character internationalInd) {
        this.internationalInd = internationalInd;
    }

    public String getAcctName() {
        return acctName;
    }

    public void setAcctName(String acctName) {
        this.acctName = acctName;
    }

    public Integer getAddrSeqmbr() {
        return addrSeqmbr;
    }

    public void setAddrSeqmbr(Integer addrSeqmbr) {
        this.addrSeqmbr = addrSeqmbr;
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

    public String getGbrOsid() {
        return gbrOsid;
    }

    public void setGbrOsid(String gbrOsid) {
        this.gbrOsid = gbrOsid;
    }

    public String getGbrDate() {
        return gbrDate;
    }

    public void setGbrDate(String gbrDate) {
        this.gbrDate = gbrDate;
    }

    public Character getPaperSuppInd() {
        return paperSuppInd;
    }

    public void setPaperSuppInd(Character paperSuppInd) {
        this.paperSuppInd = paperSuppInd;
    }

    public Character getPaperEligInd() {
        return paperEligInd;
    }

    public void setPaperEligInd(Character paperEligInd) {
        this.paperEligInd = paperEligInd;
    }

    public Character getPaperContrAmend() {
        return paperContrAmend;
    }

    public void setPaperContrAmend(Character paperContrAmend) {
        this.paperContrAmend = paperContrAmend;
    }

    public String getZipCd() {
        return zipCd;
    }

    public void setZipCd(String zipCd) {
        this.zipCd = zipCd;
    }

    public BigDecimal getTotBillAmt() {
        return totBillAmt;
    }

    public void setTotBillAmt(BigDecimal totBillAmt) {
        this.totBillAmt = totBillAmt;
    }

    public Character getVerified() {
        return verified;
    }

    public void setVerified(Character verified) {
        this.verified = verified;
    }

    public BigDecimal getPendPayAmt() {
        return pendPayAmt;
    }

    public void setPendPayAmt(BigDecimal pendPayAmt) {
        this.pendPayAmt = pendPayAmt;
    }

    public BigDecimal getPendAdjAmt() {
        return pendAdjAmt;
    }

    public void setPendAdjAmt(BigDecimal pendAdjAmt) {
        this.pendAdjAmt = pendAdjAmt;
    }

    public String getBillAddress() {
        return billAddress;
    }

    public void setBillAddress(String billAddress) {
        this.billAddress = billAddress;
    }

    public String getSvcAddress() {
        return svcAddress;
    }

    public void setSvcAddress(String svcAddress) {
        this.svcAddress = svcAddress;
    }

    public String getCref() {
        return cref;
    }

    public void setCref(String cref) {
        this.cref = cref;
    }

    public Character getStandAloneInd() {
        return standAloneInd;
    }

    public void setStandAloneInd(Character standAloneInd) {
        this.standAloneInd = standAloneInd;
    }

    public String getBillPeriod() {
        return billPeriod;
    }

    public void setBillPeriod(String billPeriod) {
        this.billPeriod = billPeriod;
    }

    public String getPaperChargeCode() {
        return paperChargeCode;
    }

    public void setPaperChargeCode(String paperChargeCode) {
        this.paperChargeCode = paperChargeCode;
    }

    public String getPaperCallDetail() {
        return paperCallDetail;
    }

    public void setPaperCallDetail(String paperCallDetail) {
        this.paperCallDetail = paperCallDetail;
    }

    public String getPaperOidStatus() {
        return paperOidStatus;
    }

    public void setPaperOidStatus(String paperOidStatus) {
        this.paperOidStatus = paperOidStatus;
    }

    public String getAcctAlias() {
        return acctAlias;
    }

    public void setAcctAlias(String acctAlias) {
        this.acctAlias = acctAlias;
    }

    public Character getGbrClassCd() {
        return gbrClassCd;
    }

    public void setGbrClassCd(Character gbrClassCd) {
        this.gbrClassCd = gbrClassCd;
    }

    public BigDecimal getGbrSpOid() {
        return gbrSpOid;
    }

    public void setGbrSpOid(BigDecimal gbrSpOid) {
        this.gbrSpOid = gbrSpOid;
    }

    public BigDecimal getGbrSbOid() {
        return gbrSbOid;
    }

    public void setGbrSbOid(BigDecimal gbrSbOid) {
        this.gbrSbOid = gbrSbOid;
    }

    public String getGbrServiceType() {
        return gbrServiceType;
    }

    public void setGbrServiceType(String gbrServiceType) {
        this.gbrServiceType = gbrServiceType;
    }

    public String getM077SuppDataId() {
        return m077SuppDataId;
    }

    public void setM077SuppDataId(String m077SuppDataId) {
        this.m077SuppDataId = m077SuppDataId;
    }

    public Character getFrequency() {
        return frequency;
    }

    public void setFrequency(Character frequency) {
        this.frequency = frequency;
    }

    public String getOpco() {
        return opco;
    }

    public void setOpco(String opco) {
        this.opco = opco;
    }

    public Character getAcctInGcp() {
        return acctInGcp;
    }

    public void setAcctInGcp(Character acctInGcp) {
        this.acctInGcp = acctInGcp;
    }

    public Character getCorpInGcp() {
        return corpInGcp;
    }

    public void setCorpInGcp(Character corpInGcp) {
        this.corpInGcp = corpInGcp;
    }

    public String getLvl7type() {
        return lvl7type;
    }

    public void setLvl7type(String lvl7type) {
        this.lvl7type = lvl7type;
    }

    public BigDecimal getLvl7oid() {
        return lvl7oid;
    }

    public void setLvl7oid(BigDecimal lvl7oid) {
        this.lvl7oid = lvl7oid;
    }

    public String getLvl8type() {
        return lvl8type;
    }

    public void setLvl8type(String lvl8type) {
        this.lvl8type = lvl8type;
    }

    public BigDecimal getLvl8oid() {
        return lvl8oid;
    }

    public void setLvl8oid(BigDecimal lvl8oid) {
        this.lvl8oid = lvl8oid;
    }

    public String getLvl9type() {
        return lvl9type;
    }

    public void setLvl9type(String lvl9type) {
        this.lvl9type = lvl9type;
    }

    public BigDecimal getLvl9oid() {
        return lvl9oid;
    }

    public void setLvl9oid(BigDecimal lvl9oid) {
        this.lvl9oid = lvl9oid;
    }

    public String getLvl10type() {
        return lvl10type;
    }

    public void setLvl10type(String lvl10type) {
        this.lvl10type = lvl10type;
    }

    public BigDecimal getLvl10oid() {
        return lvl10oid;
    }

    public void setLvl10oid(BigDecimal lvl10oid) {
        this.lvl10oid = lvl10oid;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public Character getLastOnlineAction() {
        return lastOnlineAction;
    }

    public void setLastOnlineAction(Character lastOnlineAction) {
        this.lastOnlineAction = lastOnlineAction;
    }

    public Character getInquiryPending() {
        return inquiryPending;
    }

    public void setInquiryPending(Character inquiryPending) {
        this.inquiryPending = inquiryPending;
    }

    public String getDispMan() {
        return dispMan;
    }

    public void setDispMan(String dispMan) {
        this.dispMan = dispMan;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Character getQ2cFlag() {
        return q2cFlag;
    }

    public void setQ2cFlag(Character q2cFlag) {
        this.q2cFlag = q2cFlag;
    }

    @SpaceId
    public InvoiceListTCompositeId getInvoiceListTCompositeId() {
        return invoiceListTCompositeId;
    }

    public void setInvoiceListTCompositeId(InvoiceListTCompositeId invoiceListTCompositeId) {
        this.invoiceListTCompositeId = invoiceListTCompositeId;
    }

}
