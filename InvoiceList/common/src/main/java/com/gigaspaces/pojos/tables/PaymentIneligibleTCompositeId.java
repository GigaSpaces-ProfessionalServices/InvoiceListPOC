package com.gigaspaces.pojos.tables;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

/**
 * @author Denys_Novikov
 * Date: 8/1/19
 */
@Embeddable
public class PaymentIneligibleTCompositeId implements Serializable {

    @Column(name = "MAN")
    private String man;
    @Column(name = "BAN")
    private String ban;
    @Column(name = "ORIG_SYSTEM_ID")
    private String origSystemId;
    @Column(name = "ACCOUNT_NUMBER")
    private String accountNumber;

    PaymentIneligibleTCompositeId(){}

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

    public String getOrigSystemId() {
        return origSystemId;
    }

    public void setOrigSystemId(String origSystemId) {
        this.origSystemId = origSystemId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaymentIneligibleTCompositeId that = (PaymentIneligibleTCompositeId) o;
        return Objects.equals(man, that.man) &&
                Objects.equals(ban, that.ban) &&
                Objects.equals(origSystemId, that.origSystemId) &&
                Objects.equals(accountNumber, that.accountNumber);
    }

    @Override
    public int hashCode() {

        return Objects.hash(man, ban, origSystemId, accountNumber);
    }

    @Override
    public String toString() {
        return "PaymentIneligibleTCompositeId{" +
                "man='" + man + '\'' +
                ", ban='" + ban + '\'' +
                ", origSystemId='" + origSystemId + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                '}';
    }
}
