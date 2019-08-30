package com.gigaspaces.pojos.tables;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

/**
 * @author Denys_Novikov
 * Date: 8/8/19
 */
@Embeddable
public class ShieldXrefTCompositeId implements Serializable {


    @Column(name = "LEG_MAN")
    private String legMan;
    @Column(name = "LEG_BAN")
    private String legBan;
    @Column(name = "LEG_OSID")
    private String legOsid;

    public ShieldXrefTCompositeId() {
    }

    public String getLegMan() {
        return legMan;
    }

    public void setLegMan(String legMan) {
        this.legMan = legMan;
    }

    public String getLegBan() {
        return legBan;
    }

    public void setLegBan(String legBan) {
        this.legBan = legBan;
    }

    public String getLegOsid() {
        return legOsid;
    }

    public void setLegOsid(String legOsid) {
        this.legOsid = legOsid;
    }

    @Override
    public String toString() {
        return "ShieldXrefTCompositeId{" +
                "legMan='" + legMan + '\'' +
                ", legBan='" + legBan + '\'' +
                ", legOsid='" + legOsid + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShieldXrefTCompositeId that = (ShieldXrefTCompositeId) o;
        return Objects.equals(legMan, that.legMan) &&
                Objects.equals(legBan, that.legBan) &&
                Objects.equals(legOsid, that.legOsid);
    }

    @Override
    public int hashCode() {

        return Objects.hash(legMan, legBan, legOsid);
    }
}
