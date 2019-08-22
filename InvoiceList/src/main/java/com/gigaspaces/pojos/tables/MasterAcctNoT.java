package com.gigaspaces.pojos.tables;

import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceId;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * @author Denys_Novikov
 * Date: 8/2/19
 */
@Entity
@Table(schema = "BMGVZP", name = "MASTER_ACCT_NO_T")
@SpaceClass
public class MasterAcctNoT {

    @EmbeddedId
    private MasterAcctNoTCompoundId masterAcctNoTCompoundId;

    @Column(name = "STAND_ALONE_IND")
    private Character standAloneInd;
    @Column(name = "STATE_CODE")
    private String stateCode;
    @Column(name = "VZ450_SEQ_NBR")
    private Integer vz450SeqNbr;
    @Column(name = "DB_SEGMENT_ID")
    private Character dbSegmentId;
    @Column(name = "RAO")
    private String rao;
    @Column(name = "CYCLE_DATE")
    private Date cycleDate;
    @Column(name = "CYCLE_NBR")
    private Integer cycleNbr;
    @Column(name = "CYCLE_ADJ_FACTOR")
    private Character cycleAdjFactor;
    @Column(name = "VZ450_VERSION")
    private Short vz450Version;
    @Column(name = "VZ450_RELEASE")
    private Short vz450Release;
    @Column(name = "VZ450_VERS_DATE")
    private Date vz450VersDate;
    @Column(name = "TECH_SUPPT_NBR")
    private String techSupptNbr;
    @Column(name = "LOB")
    private String lob;
    @Column(name = "LOB_SUB_CD")
    private String lobSubCd;
    @Column(name = "VZ450_DSNAME")
    private String vz450Dsname;
    @Column(name = "LOAD_DATE")
    private Date loadDate;
    @Column(name = "PURGE_DATE")
    private Date purgeDate;
    @Column(name = "LOCATION")
    private Character location;
    @Column(name = "MAN_DAN")
    private String manDan;
    @Column(name = "ACCT_NAME")
    private String acctName;
    @Column(name = "ADDR_SEQ_NBR")
    private Integer addrSeqNbr;
    @Column(name = "MAN_LINES")
    private Integer manLines;
    @Column(name = "BAN_COUNT")
    private Integer banCount;
    @Column(name = "ABAN")
    private String aban;
    @Column(name = "FILE_SEQ_NBR")
    private Short fileSeqNbr;
    @Column(name = "FILE_RERUN_IND")
    private Character fileRerunInd;
    @Column(name = "BILL_SYSTEM_ID")
    private Character billSystemId;
    @Column(name = "CONV_IND")
    private Character convInd;
    @Column(name = "MAN_PARTIAL_IND")
    private Character manPartialInd;
    @Column(name = "INVOICE_NBR")
    private String invoiceNbr;
    @Column(name = "BILL_SYSTEM_ANNX")
    private String billSystemAnnx;
    @Column(name = "INVOICE_SERIES_NBR")
    private String invoiceSeriesNbr;
    @Column(name = "INVOICE_TYPE")
    private Character invoiceType;
    @Column(name = "INTERNATIONAL_IND")
    private Character internationalInd;
    @Column(name = "TIMESTAMP")
    private Timestamp timestamp;
    @Column(name = "BILL_ACC_NUMBER")
    private String billAccNumber;
    @Column(name = "BILL_SYSTEM_CODE")
    private String billSystemCode;
    @Column(name = "REF_NUMBER")
    private String refNumber;
    @Column(name = "FINANCE_PERIOD")
    private String financePeriod;
    @Column(name = "FINANCE_SUB_SEG")
    private String financeSubSeg;
    @Column(name = "RESOURCE_UBILL_IND")
    private Character resourceUbillInd;
    @Column(name = "PDF_LOAD_DATE")
    private String pdfLoadDate;
    @Column(name = "BIN_FILE_SEQ_NBR")
    private Integer binFileSeqNbr;
    @Column(name = "SHIELDED_IND")
    private Character shieldedInd;

    public MasterAcctNoT(){}

    @SpaceId
    public MasterAcctNoTCompoundId getMasterAcctNoTCompoundId() {
        return masterAcctNoTCompoundId;
    }

    public void setMasterAcctNoTCompoundId(MasterAcctNoTCompoundId masterAcctNoTCompoundId) {
        this.masterAcctNoTCompoundId = masterAcctNoTCompoundId;
    }

    public Character getStandAloneInd() {
        return standAloneInd;
    }

    public void setStandAloneInd(Character standAloneInd) {
        this.standAloneInd = standAloneInd;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public Integer getVz450SeqNbr() {
        return vz450SeqNbr;
    }

    public void setVz450SeqNbr(Integer vz450SeqNbr) {
        this.vz450SeqNbr = vz450SeqNbr;
    }

    public Character getDbSegmentId() {
        return dbSegmentId;
    }

    public void setDbSegmentId(Character dbSegmentId) {
        this.dbSegmentId = dbSegmentId;
    }

    public String getRao() {
        return rao;
    }

    public void setRao(String rao) {
        this.rao = rao;
    }

    public Date getCycleDate() {
        return cycleDate;
    }

    public void setCycleDate(Date cycleDate) {
        this.cycleDate = cycleDate;
    }

    public Integer getCycleNbr() {
        return cycleNbr;
    }

    public void setCycleNbr(Integer cycleNbr) {
        this.cycleNbr = cycleNbr;
    }

    public Character getCycleAdjFactor() {
        return cycleAdjFactor;
    }

    public void setCycleAdjFactor(Character cycleAdjFactor) {
        this.cycleAdjFactor = cycleAdjFactor;
    }

    public Short getVz450Version() {
        return vz450Version;
    }

    public void setVz450Version(Short vz450Version) {
        this.vz450Version = vz450Version;
    }

    public Short getVz450Release() {
        return vz450Release;
    }

    public void setVz450Release(Short vz450Release) {
        this.vz450Release = vz450Release;
    }

    public Date getVz450VersDate() {
        return vz450VersDate;
    }

    public void setVz450VersDate(Date vz450VersDate) {
        this.vz450VersDate = vz450VersDate;
    }

    public String getTechSupptNbr() {
        return techSupptNbr;
    }

    public void setTechSupptNbr(String techSupptNbr) {
        this.techSupptNbr = techSupptNbr;
    }

    public String getLob() {
        return lob;
    }

    public void setLob(String lob) {
        this.lob = lob;
    }

    public String getLobSubCd() {
        return lobSubCd;
    }

    public void setLobSubCd(String lobSubCd) {
        this.lobSubCd = lobSubCd;
    }

    public String getVz450Dsname() {
        return vz450Dsname;
    }

    public void setVz450Dsname(String vz450Dsname) {
        this.vz450Dsname = vz450Dsname;
    }

    public Date getLoadDate() {
        return loadDate;
    }

    public void setLoadDate(Date loadDate) {
        this.loadDate = loadDate;
    }

    public Date getPurgeDate() {
        return purgeDate;
    }

    public void setPurgeDate(Date purgeDate) {
        this.purgeDate = purgeDate;
    }

    public Character getLocation() {
        return location;
    }

    public void setLocation(Character location) {
        this.location = location;
    }

    public String getManDan() {
        return manDan;
    }

    public void setManDan(String manDan) {
        this.manDan = manDan;
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

    public Integer getManLines() {
        return manLines;
    }

    public void setManLines(Integer manLines) {
        this.manLines = manLines;
    }

    public Integer getBanCount() {
        return banCount;
    }

    public void setBanCount(Integer banCount) {
        this.banCount = banCount;
    }

    public String getAban() {
        return aban;
    }

    public void setAban(String aban) {
        this.aban = aban;
    }

    public Short getFileSeqNbr() {
        return fileSeqNbr;
    }

    public void setFileSeqNbr(Short fileSeqNbr) {
        this.fileSeqNbr = fileSeqNbr;
    }

    public Character getFileRerunInd() {
        return fileRerunInd;
    }

    public void setFileRerunInd(Character fileRerunInd) {
        this.fileRerunInd = fileRerunInd;
    }

    public Character getBillSystemId() {
        return billSystemId;
    }

    public void setBillSystemId(Character billSystemId) {
        this.billSystemId = billSystemId;
    }

    public Character getConvInd() {
        return convInd;
    }

    public void setConvInd(Character convInd) {
        this.convInd = convInd;
    }

    public Character getManPartialInd() {
        return manPartialInd;
    }

    public void setManPartialInd(Character manPartialInd) {
        this.manPartialInd = manPartialInd;
    }

    public String getInvoiceNbr() {
        return invoiceNbr;
    }

    public void setInvoiceNbr(String invoiceNbr) {
        this.invoiceNbr = invoiceNbr;
    }

    public String getBillSystemAnnx() {
        return billSystemAnnx;
    }

    public void setBillSystemAnnx(String billSystemAnnx) {
        this.billSystemAnnx = billSystemAnnx;
    }

    public String getInvoiceSeriesNbr() {
        return invoiceSeriesNbr;
    }

    public void setInvoiceSeriesNbr(String invoiceSeriesNbr) {
        this.invoiceSeriesNbr = invoiceSeriesNbr;
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

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public String getBillAccNumber() {
        return billAccNumber;
    }

    public void setBillAccNumber(String billAccNumber) {
        this.billAccNumber = billAccNumber;
    }

    public String getBillSystemCode() {
        return billSystemCode;
    }

    public void setBillSystemCode(String billSystemCode) {
        this.billSystemCode = billSystemCode;
    }

    public String getRefNumber() {
        return refNumber;
    }

    public void setRefNumber(String refNumber) {
        this.refNumber = refNumber;
    }

    public String getFinancePeriod() {
        return financePeriod;
    }

    public void setFinancePeriod(String financePeriod) {
        this.financePeriod = financePeriod;
    }

    public String getFinanceSubSeg() {
        return financeSubSeg;
    }

    public void setFinanceSubSeg(String financeSubSeg) {
        this.financeSubSeg = financeSubSeg;
    }

    public Character getResourceUbillInd() {
        return resourceUbillInd;
    }

    public void setResourceUbillInd(Character resourceUbillInd) {
        this.resourceUbillInd = resourceUbillInd;
    }

    public String getPdfLoadDate() {
        return pdfLoadDate;
    }

    public void setPdfLoadDate(String pdfLoadDate) {
        this.pdfLoadDate = pdfLoadDate;
    }

    public Integer getBinFileSeqNbr() {
        return binFileSeqNbr;
    }

    public void setBinFileSeqNbr(Integer binFileSeqNbr) {
        this.binFileSeqNbr = binFileSeqNbr;
    }

    public Character getShieldedInd() {
        return shieldedInd;
    }

    public void setShieldedInd(Character shieldedInd) {
        this.shieldedInd = shieldedInd;
    }
}
