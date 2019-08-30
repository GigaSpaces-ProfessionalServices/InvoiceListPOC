package com.gigaspaces.pojos.tables;

/**
 * @author Denys_Novikov
 * Date: 8/5/19
 */

import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceId;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(schema = "BMGVZP", name = "COLUMBIA_STATUS_T")
@SpaceClass
public class ColumbiaStatusT {

    @EmbeddedId
    private ColumbiaStatusTCompoundId columbiaStatusTCompoundId;

    @Column(name = "OPCO")
    private String opco;
    @Column(name = "STATUS")
    private Character status;
    @Column(name = "DUE_BY_DATE")
    private String dueByDate;
    @Column(name = "MAN_LOAD_TS")
    private String manLoadTs;
    @Column(name = "XML_LOAD_TS")
    private String xmlLoadTs;
    @Column(name = "UPDATED_TS")
    private String updatedTs;
    @Column(name = "ACTIONED_BY_USERID")
    private String actionedByUserid;
    @Column(name = "ACTIONED_BY_NAME")
    private String actionedByName;
    @Column(name = "REASON_TEXT")
    private String reasonText;

    public ColumbiaStatusT(){}

    @SpaceId
    public ColumbiaStatusTCompoundId getColumbiaStatusTCompoundId() {
        return columbiaStatusTCompoundId;
    }

    public void setColumbiaStatusTCompoundId(ColumbiaStatusTCompoundId columbiaStatusTCompoundId) {
        this.columbiaStatusTCompoundId = columbiaStatusTCompoundId;
    }

    public String getOpco() {
        return opco;
    }

    public void setOpco(String opco) {
        this.opco = opco;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public String getDueByDate() {
        return dueByDate;
    }

    public void setDueByDate(String dueByDate) {
        this.dueByDate = dueByDate;
    }

    public String getManLoadTs() {
        return manLoadTs;
    }

    public void setManLoadTs(String manLoadTs) {
        this.manLoadTs = manLoadTs;
    }

    public String getXmlLoadTs() {
        return xmlLoadTs;
    }

    public void setXmlLoadTs(String xmlLoadTs) {
        this.xmlLoadTs = xmlLoadTs;
    }

    public String getUpdatedTs() {
        return updatedTs;
    }

    public void setUpdatedTs(String updatedTs) {
        this.updatedTs = updatedTs;
    }

    public String getActionedByUserid() {
        return actionedByUserid;
    }

    public void setActionedByUserid(String actionedByUserid) {
        this.actionedByUserid = actionedByUserid;
    }

    public String getActionedByName() {
        return actionedByName;
    }

    public void setActionedByName(String actionedByName) {
        this.actionedByName = actionedByName;
    }

    public String getReasonText() {
        return reasonText;
    }

    public void setReasonText(String reasonText) {
        this.reasonText = reasonText;
    }
}
