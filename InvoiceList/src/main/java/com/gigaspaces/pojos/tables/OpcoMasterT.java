package com.gigaspaces.pojos.tables;

import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceId;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * @author Denys_Novikov
 * Date: 8/5/19
 */
@Entity
@Table(schema = "BMGVZP", name = "OPCO_MASTER_T")
@SpaceClass
public class OpcoMasterT {

    @Id
    @Column(name = "OPCO")
    private String opco;
    @Column(name = "GCP_ELIGIBLE")
    private Character gcpEligible;
    @Column(name = "COUNTRY_ID")
    private Short countryId;
    @Column(name = "OPCO_NAME")
    private String opcoName;
    @Column(name = "PORTAL_START_PAGE")
    private Integer portalStartPage;
    @Column(name = "PORTAL_START_PAGE_MAN")
    private Integer portalStartPageMan;
    @Column(name = "PORTAL_START_PAGE2")
    private Integer portalStartPage2;
    @Column(name = "PORTAL_START_PAGE2_MAN")
    private Integer portalStartPage2Man;
    @Column(name = "INVOICE_TYPE")
    private Character invoiceType;
    @Column(name = "HOW_TO_PAY_IND")
    private Character howToPayInd;
    @Column(name = "PAPERLESS_ELIGIBLE")
    private Character paperlessEligible;
    @Column(name = "PAY_BY_MAIL_IND")
    private Character payByMailInd;
    @Column(name = "PAY_CRED_RPT_IND")
    private Character payCredRptInd;
    @Column(name = "INQUIRY_ELIGIBLE")
    private Character inquiryEligible;
    @Column(name = "AUTO_CRED_CLM_IND")
    private Character autoCredClmInd;
    @Column(name = "E2EI_IND")
    private Character e2eiInd;
    @Column(name = "GBR_ELIGIBLE")
    private Character gbrEligible;
    @Column(name = "PAYMENT_ELIGIBLE")
    private Character paymentEligible;
    @Column(name = "NOTES")
    private String notes;
    @Column(name = "UPDATED_BY")
    private String updatedBy;
    @Column(name = "UPDATED_TIMESTAMP")
    private Timestamp updatedTimestamp;
    @Column(name = "REGION_CD")
    private String regionCd;
    @Column(name = "TAX_PAGE")
    private Integer taxPage;
    @Column(name = "HOW2PAY_PAGE")
    private Integer how2payPage;
    @Column(name = "DEC_PREC_ZERO_IND")
    private Character decPrecZeroInd;
    @Column(name = "LATAM_RPT_IND")
    private Character latamRptInd;
    @Column(name = "ICI_ADJ_ELIGIBLE")
    private Character iciAdjEligible;
    @Column(name = "DOC_SUPPRESS")
    private Character docSuppress;
    @Column(name = "CURRENCY_FMT")
    private String currencyFmt;
    @Column(name = "N_CURRENCY_FMT")
    private String nCurrencyFmt;
    @Column(name = "CURRENCY_CD")
    private String currencyCd;
    @Column(name = "DPZ_CURRENCY_FMT")
    private String dpzCurrencyFmt;
    @Column(name = "INVOICING_VLE")
    private String invoicingVle;

    public OpcoMasterT(){}

    @SpaceId
    public String getOpco() {
        return opco;
    }

    public void setOpco(String opco) {
        this.opco = opco;
    }

    public Character getGcpEligible() {
        return gcpEligible;
    }

    public void setGcpEligible(Character gcpEligible) {
        this.gcpEligible = gcpEligible;
    }

    public Short getCountryId() {
        return countryId;
    }

    public void setCountryId(Short countryId) {
        this.countryId = countryId;
    }

    public String getOpcoName() {
        return opcoName;
    }

    public void setOpcoName(String opcoName) {
        this.opcoName = opcoName;
    }

    public Integer getPortalStartPage() {
        return portalStartPage;
    }

    public void setPortalStartPage(Integer portalStartPage) {
        this.portalStartPage = portalStartPage;
    }

    public Integer getPortalStartPageMan() {
        return portalStartPageMan;
    }

    public void setPortalStartPageMan(Integer portalStartPageMan) {
        this.portalStartPageMan = portalStartPageMan;
    }

    public Integer getPortalStartPage2() {
        return portalStartPage2;
    }

    public void setPortalStartPage2(Integer portalStartPage2) {
        this.portalStartPage2 = portalStartPage2;
    }

    public Integer getPortalStartPage2Man() {
        return portalStartPage2Man;
    }

    public void setPortalStartPage2Man(Integer portalStartPage2Man) {
        this.portalStartPage2Man = portalStartPage2Man;
    }

    public Character getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(Character invoiceType) {
        this.invoiceType = invoiceType;
    }

    public Character getHowToPayInd() {
        return howToPayInd;
    }

    public void setHowToPayInd(Character howToPayInd) {
        this.howToPayInd = howToPayInd;
    }

    public Character getPaperlessEligible() {
        return paperlessEligible;
    }

    public void setPaperlessEligible(Character paperlessEligible) {
        this.paperlessEligible = paperlessEligible;
    }

    public Character getPayByMailInd() {
        return payByMailInd;
    }

    public void setPayByMailInd(Character payByMailInd) {
        this.payByMailInd = payByMailInd;
    }

    public Character getPayCredRptInd() {
        return payCredRptInd;
    }

    public void setPayCredRptInd(Character payCredRptInd) {
        this.payCredRptInd = payCredRptInd;
    }

    public Character getInquiryEligible() {
        return inquiryEligible;
    }

    public void setInquiryEligible(Character inquiryEligible) {
        this.inquiryEligible = inquiryEligible;
    }

    public Character getAutoCredClmInd() {
        return autoCredClmInd;
    }

    public void setAutoCredClmInd(Character autoCredClmInd) {
        this.autoCredClmInd = autoCredClmInd;
    }

    public Character getE2eiInd() {
        return e2eiInd;
    }

    public void setE2eiInd(Character e2eiInd) {
        this.e2eiInd = e2eiInd;
    }

    public Character getGbrEligible() {
        return gbrEligible;
    }

    public void setGbrEligible(Character gbrEligible) {
        this.gbrEligible = gbrEligible;
    }

    public Character getPaymentEligible() {
        return paymentEligible;
    }

    public void setPaymentEligible(Character paymentEligible) {
        this.paymentEligible = paymentEligible;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Timestamp getUpdatedTimestamp() {
        return updatedTimestamp;
    }

    public void setUpdatedTimestamp(Timestamp updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
    }

    public String getRegionCd() {
        return regionCd;
    }

    public void setRegionCd(String regionCd) {
        this.regionCd = regionCd;
    }

    public Integer getTaxPage() {
        return taxPage;
    }

    public void setTaxPage(Integer taxPage) {
        this.taxPage = taxPage;
    }

    public Integer getHow2payPage() {
        return how2payPage;
    }

    public void setHow2payPage(Integer how2payPage) {
        this.how2payPage = how2payPage;
    }

    public Character getDecPrecZeroInd() {
        return decPrecZeroInd;
    }

    public void setDecPrecZeroInd(Character decPrecZeroInd) {
        this.decPrecZeroInd = decPrecZeroInd;
    }

    public Character getLatamRptInd() {
        return latamRptInd;
    }

    public void setLatamRptInd(Character latamRptInd) {
        this.latamRptInd = latamRptInd;
    }

    public Character getIciAdjEligible() {
        return iciAdjEligible;
    }

    public void setIciAdjEligible(Character iciAdjEligible) {
        this.iciAdjEligible = iciAdjEligible;
    }

    public Character getDocSuppress() {
        return docSuppress;
    }

    public void setDocSuppress(Character docSuppress) {
        this.docSuppress = docSuppress;
    }

    public String getCurrencyFmt() {
        return currencyFmt;
    }

    public void setCurrencyFmt(String currencyFmt) {
        this.currencyFmt = currencyFmt;
    }

    public String getnCurrencyFmt() {
        return nCurrencyFmt;
    }

    public void setnCurrencyFmt(String nCurrencyFmt) {
        this.nCurrencyFmt = nCurrencyFmt;
    }

    public String getCurrencyCd() {
        return currencyCd;
    }

    public void setCurrencyCd(String currencyCd) {
        this.currencyCd = currencyCd;
    }

    public String getDpzCurrencyFmt() {
        return dpzCurrencyFmt;
    }

    public void setDpzCurrencyFmt(String dpzCurrencyFmt) {
        this.dpzCurrencyFmt = dpzCurrencyFmt;
    }

    public String getInvoicingVle() {
        return invoicingVle;
    }

    public void setInvoicingVle(String invoicingVle) {
        this.invoicingVle = invoicingVle;
    }
}
