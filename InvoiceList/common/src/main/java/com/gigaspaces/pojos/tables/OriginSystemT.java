package com.gigaspaces.pojos.tables;

import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceId;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Denys_Novikov
 * Date: 8/1/19
 */
@Entity
@Table(schema = "BMGVZP", name = "ORIGIN_SYSTEM_T")
@SpaceClass
public class OriginSystemT {

    @Id
    @Column(name = "ORIG_SYSTEM_ID")
    private String origSystemId;
    @Column(name = "SYST_ABBREVIATION")
    private String systAbbreviation;
    @Column(name = "SYST_DESCRIPTION")
    private String systDescription;
    @Column(name = "BILL_TYPE")
    private String billType;
    @Column(name = "CLASSIFICATION_CD")
    private Character classificationCd;
    @Column(name = "INVOICE_TYPE")
    private String invoiceType;
    @Column(name = "PORTAL_START_PAGE")
    private Integer portalStartPage;
    @Column(name = "GBR_CLASS_CD")
    private Character gbrClassCd;
    @Column(name = "GBR_REGION_CD")
    private String gbrRegionCd;
    @Column(name = "PORTAL_API_NAME")
    private String portalApiName;
    @Column(name = "PORTAL_LINK")
    private Character portalLink;
    @Column(name = "PAYMENT_ELIGABLE")
    private Character paymentEligable;
    @Column(name = "IRV_MAN_LABEL")
    private String irvManLabel;
    @Column(name = "IRV_BAN_LABEL")
    private String irvBanLabel;
    @Column(name = "GCP_ELIGIBILITY")
    private Character gcpEligibility;
    @Column(name = "CLAIM_ELIGIBLE")
    private Character claimEligible;
    @Column(name = "VBE_ELIGIBLE")
    private Character vbeEligible;

    public OriginSystemT() {}

    @SpaceId
    public String getOrigSystemId() {
        return origSystemId;
    }

    public void setOrigSystemId(String origSystemId) {
        this.origSystemId = origSystemId;
    }

    public String getSystAbbreviation() {
        return systAbbreviation;
    }

    public void setSystAbbreviation(String systAbbreviation) {
        this.systAbbreviation = systAbbreviation;
    }

    public String getSystDescription() {
        return systDescription;
    }

    public void setSystDescription(String systDescription) {
        this.systDescription = systDescription;
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }

    public Character getClassificationCd() {
        return classificationCd;
    }

    public void setClassificationCd(Character classificationCd) {
        this.classificationCd = classificationCd;
    }

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    public Integer getPortalStartPage() {
        return portalStartPage;
    }

    public void setPortalStartPage(Integer portalStartPage) {
        this.portalStartPage = portalStartPage;
    }

    public Character getGbrClassCd() {
        return gbrClassCd;
    }

    public void setGbrClassCd(Character gbrClassCd) {
        this.gbrClassCd = gbrClassCd;
    }

    public String getGbrRegionCd() {
        return gbrRegionCd;
    }

    public void setGbrRegionCd(String gbrRegionCd) {
        this.gbrRegionCd = gbrRegionCd;
    }

    public String getPortalApiName() {
        return portalApiName;
    }

    public void setPortalApiName(String portalApiName) {
        this.portalApiName = portalApiName;
    }

    public Character getPortalLink() {
        return portalLink;
    }

    public void setPortalLink(Character portalLink) {
        this.portalLink = portalLink;
    }

    public Character getPaymentEligable() {
        return paymentEligable;
    }

    public void setPaymentEligable(Character paymentEligable) {
        this.paymentEligable = paymentEligable;
    }

    public String getIrvManLabel() {
        return irvManLabel;
    }

    public void setIrvManLabel(String irvManLabel) {
        this.irvManLabel = irvManLabel;
    }

    public String getIrvBanLabel() {
        return irvBanLabel;
    }

    public void setIrvBanLabel(String irvBanLabel) {
        this.irvBanLabel = irvBanLabel;
    }

    public Character getGcpEligibility() {
        return gcpEligibility;
    }

    public void setGcpEligibility(Character gcpEligibility) {
        this.gcpEligibility = gcpEligibility;
    }

    public Character getClaimEligible() {
        return claimEligible;
    }

    public void setClaimEligible(Character claimEligible) {
        this.claimEligible = claimEligible;
    }

    public Character getVbeEligible() {
        return vbeEligible;
    }

    public void setVbeEligible(Character vbeEligible) {
        this.vbeEligible = vbeEligible;
    }
}
