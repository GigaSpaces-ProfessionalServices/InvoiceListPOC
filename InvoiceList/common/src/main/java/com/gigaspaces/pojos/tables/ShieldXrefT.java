package com.gigaspaces.pojos.tables;

import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceId;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Date;

/**
 * @author Denys_Novikov
 * Date: 8/5/19
 */
@Entity
@Table(schema = "BMGVZP", name = "SHIELD_XREF_T")
@SpaceClass
public class ShieldXrefT {

    @EmbeddedId
    private ShieldXrefTCompositeId shieldXrefTCompositeId;

    @Column(name = "NEW_SYS_MAN")
    private String newSysMan;
    @Column(name = "NEW_SYS_BAN")
    private String newSysBan;
    @Column(name = "FIRST_BILL_DATE")
    private Date firstBillDate;
    @Column(name = "LAST_BILL_DATE")
    private Date lastBillDate;

    public ShieldXrefT(){}

    public String getNewSysMan() {
        return newSysMan;
    }

    public void setNewSysMan(String newSysMan) {
        this.newSysMan = newSysMan;
    }

    public String getNewSysBan() {
        return newSysBan;
    }

    public void setNewSysBan(String newSysBan) {
        this.newSysBan = newSysBan;
    }

    public Date getFirstBillDate() {
        return firstBillDate;
    }

    public void setFirstBillDate(Date firstBillDate) {
        this.firstBillDate = firstBillDate;
    }

    public Date getLastBillDate() {
        return lastBillDate;
    }

    public void setLastBillDate(Date lastBillDate) {
        this.lastBillDate = lastBillDate;
    }

    @SpaceId
    public ShieldXrefTCompositeId getShieldXrefTCompositeId() {
        return shieldXrefTCompositeId;
    }

    public void setShieldXrefTCompositeId(ShieldXrefTCompositeId shieldXrefTCompositeId) {
        this.shieldXrefTCompositeId = shieldXrefTCompositeId;
    }
}
