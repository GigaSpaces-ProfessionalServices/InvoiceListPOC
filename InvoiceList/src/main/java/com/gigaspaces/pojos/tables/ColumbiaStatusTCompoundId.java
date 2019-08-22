package com.gigaspaces.pojos.tables;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

/**
 * @author Denys_Novikov
 * Date: 8/8/19
 */
@Embeddable
public class ColumbiaStatusTCompoundId implements Serializable {

    @Column(name = "MAN")
    private String man;
    @Column(name = "OSID")
    private String osid;
    @Column(name = "BAN")
    private String ban;
    @Column(name = "BILL_DATE")
    private Date billDate;
    @Column(name = "INVOICE_NBR")
    private String invoiceNbr;

    public ColumbiaStatusTCompoundId() {
    }

    public String getMan() {
        return man;
    }

    public void setMan(String man) {
        this.man = man;
    }

    public String getOsid() {
        return osid;
    }

    public void setOsid(String osid) {
        this.osid = osid;
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

    public String getInvoiceNbr() {
        return invoiceNbr;
    }

    public void setInvoiceNbr(String invoiceNbr) {
        this.invoiceNbr = invoiceNbr;
    }

    @Override
    public String toString() {
        return "ColumbiaStatusTCompoundId{" +
                "man='" + man + '\'' +
                ", osid='" + osid + '\'' +
                ", ban='" + ban + '\'' +
                ", billDate=" + billDate +
                ", invoiceNbr='" + invoiceNbr + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ColumbiaStatusTCompoundId that = (ColumbiaStatusTCompoundId) o;
        return Objects.equals(man, that.man) &&
                Objects.equals(osid, that.osid) &&
                Objects.equals(ban, that.ban) &&
                Objects.equals(billDate, that.billDate) &&
                Objects.equals(invoiceNbr, that.invoiceNbr);
    }

    @Override
    public int hashCode() {

        return Objects.hash(man, osid, ban, billDate, invoiceNbr);
    }
}
