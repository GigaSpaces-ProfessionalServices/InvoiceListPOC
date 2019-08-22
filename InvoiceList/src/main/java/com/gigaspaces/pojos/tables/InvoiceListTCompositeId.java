package com.gigaspaces.pojos.tables;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author Denys_Novikov
 * Date: 08.08.2019
 */
@Embeddable
public class InvoiceListTCompositeId implements Serializable {

    @Column(name = "REPORT_ID_TS")
    private String reportIdTs;
    @Column(name = "LVL_0_TYPE")
    private String lvl0type;
    @Column(name = "LVL_0_OID")
    private BigDecimal lvl0oid;
    @Column(name = "LVL_1_TYPE")
    private String lvl1type;
    @Column(name = "LVL_1_OID")
    private BigDecimal lvl1oid;
    @Column(name = "LVL_2_TYPE")
    private String lvl2type;
    @Column(name = "LVL_2_OID")
    private BigDecimal lvl2oid;
    @Column(name = "LVL_3_TYPE")
    private String lvl3type;
    @Column(name = "LVL_3_OID")
    private BigDecimal lvl3oid;
    @Column(name = "LVL_4_TYPE")
    private String lvl4type;
    @Column(name = "LVL_4_OID")
    private BigDecimal lvl4oid;
    @Column(name = "LVL_5_TYPE")
    private String lvl5type;
    @Column(name = "LVL_5_OID")
    private BigDecimal lvl5oid;
    @Column(name = "LVL_6_TYPE")
    private String lvl6type;
    @Column(name = "LVL_6_OID")
    private BigDecimal lvl6oid;
    @Column(name = "ABAN")
    private String aban;

    InvoiceListTCompositeId() {
    }

    public String getReportIdTs() {
        return reportIdTs;
    }

    public void setReportIdTs(String reportIdTs) {
        this.reportIdTs = reportIdTs;
    }

    public String getLvl0type() {
        return lvl0type;
    }

    public void setLvl0type(String lvl0type) {
        this.lvl0type = lvl0type;
    }

    public BigDecimal getLvl0oid() {
        return lvl0oid;
    }

    public void setLvl0oid(BigDecimal lvl0oid) {
        this.lvl0oid = lvl0oid;
    }

    public String getLvl1type() {
        return lvl1type;
    }

    public void setLvl1type(String lvl1type) {
        this.lvl1type = lvl1type;
    }

    public BigDecimal getLvl1oid() {
        return lvl1oid;
    }

    public void setLvl1oid(BigDecimal lvl1oid) {
        this.lvl1oid = lvl1oid;
    }

    public String getLvl2type() {
        return lvl2type;
    }

    public void setLvl2type(String lvl2type) {
        this.lvl2type = lvl2type;
    }

    public BigDecimal getLvl2oid() {
        return lvl2oid;
    }

    public void setLvl2oid(BigDecimal lvl2oid) {
        this.lvl2oid = lvl2oid;
    }

    public String getLvl3type() {
        return lvl3type;
    }

    public void setLvl3type(String lvl3type) {
        this.lvl3type = lvl3type;
    }

    public BigDecimal getLvl3oid() {
        return lvl3oid;
    }

    public void setLvl3oid(BigDecimal lvl3oid) {
        this.lvl3oid = lvl3oid;
    }

    public String getLvl4type() {
        return lvl4type;
    }

    public void setLvl4type(String lvl4type) {
        this.lvl4type = lvl4type;
    }

    public BigDecimal getLvl4oid() {
        return lvl4oid;
    }

    public void setLvl4oid(BigDecimal lvl4oid) {
        this.lvl4oid = lvl4oid;
    }

    public String getLvl5type() {
        return lvl5type;
    }

    public void setLvl5type(String lvl5type) {
        this.lvl5type = lvl5type;
    }

    public BigDecimal getLvl5oid() {
        return lvl5oid;
    }

    public void setLvl5oid(BigDecimal lvl5oid) {
        this.lvl5oid = lvl5oid;
    }

    public String getLvl6type() {
        return lvl6type;
    }

    public void setLvl6type(String lvl6type) {
        this.lvl6type = lvl6type;
    }

    public BigDecimal getLvl6oid() {
        return lvl6oid;
    }

    public void setLvl6oid(BigDecimal lvl6oid) {
        this.lvl6oid = lvl6oid;
    }

    public String getAban() {
        return aban;
    }

    public void setAban(String aban) {
        this.aban = aban;
    }

    @Override
    public String toString() {
        return "InvoiceListTCompositeId{" +
                "reportIdTs='" + reportIdTs + '\'' +
                ", lvl0type='" + lvl0type + '\'' +
                ", lvl0oid=" + lvl0oid +
                ", lvl1type='" + lvl1type + '\'' +
                ", lvl1oid=" + lvl1oid +
                ", lvl2type='" + lvl2type + '\'' +
                ", lvl2oid=" + lvl2oid +
                ", lvl3type='" + lvl3type + '\'' +
                ", lvl3oid=" + lvl3oid +
                ", lvl4type='" + lvl4type + '\'' +
                ", lvl4oid=" + lvl4oid +
                ", lvl5type='" + lvl5type + '\'' +
                ", lvl5oid=" + lvl5oid +
                ", lvl6type='" + lvl6type + '\'' +
                ", lvl6oid=" + lvl6oid +
                ", aban='" + aban + '\'' +
                '}';
    }
}


