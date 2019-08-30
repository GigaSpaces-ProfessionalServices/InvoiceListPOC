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
public class MasterAcctNoTCompoundId implements Serializable {

    @Column(name = "MAN")
    private String man;
    @Column(name = "MAN_BILL_DATE")
    private Date manBillDate;
    @Column(name = "ORIG_SYSTEM_ID")
    private String origSystemId;

    public MasterAcctNoTCompoundId() {
    }

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

    @Override
    public String toString() {
        return "MasterAcctNoTCompoundId{" +
                "man='" + man + '\'' +
                ", manBillDate=" + manBillDate +
                ", origSystemId='" + origSystemId + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MasterAcctNoTCompoundId that = (MasterAcctNoTCompoundId) o;
        return Objects.equals(man, that.man) &&
                Objects.equals(manBillDate, that.manBillDate) &&
                Objects.equals(origSystemId, that.origSystemId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(man, manBillDate, origSystemId);
    }
}
