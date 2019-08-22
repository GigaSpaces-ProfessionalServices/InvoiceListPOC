package com.gigaspaces.pojos;

import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceId;

import java.sql.Date;
import java.util.Objects;

/**
 * @author Denys_Novikov
 * Date: 8/5/19
 */
@SpaceClass
public class LST {

    private String id;
    private String reportIdTs;
    private String origSystemId;
    private String man;
    private String ban;
    private Date manBillDate;

    public LST(){}

    public String getReportIdTs() {
        return reportIdTs;
    }

    public void setReportIdTs(String reportIdTs) {
        this.reportIdTs = reportIdTs;
    }

    public String getOrigSystemId() {
        return origSystemId;
    }

    public void setOrigSystemId(String origSystemId) {
        this.origSystemId = origSystemId;
    }

    public String getMan() {
        return man;
    }

    public void setMan(String man) {
        this.man = man;
    }

    public String getBan() {
        return ban;
    }

    public void setBan(String ban) {
        this.ban = ban;
    }

    public Date getManBillDate() {
        return manBillDate;
    }

    public void setManBillDate(Date manBillDate) {
        this.manBillDate = manBillDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LST LST = (LST) o;
        return Objects.equals(reportIdTs, LST.reportIdTs) &&
                Objects.equals(origSystemId, LST.origSystemId) &&
                Objects.equals(man, LST.man) &&
                Objects.equals(ban, LST.ban) &&
                Objects.equals(manBillDate, LST.manBillDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(reportIdTs, origSystemId, man, ban, manBillDate);
    }

    @SpaceId(autoGenerate = true)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
