package com.gigaspaces.pojos.tables;

import com.gigaspaces.annotation.pojo.SpaceClass;
import com.gigaspaces.annotation.pojo.SpaceId;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * @author Denys_Novikov
 * Date: 8/1/19
 */
@Entity
@Table(schema = "BMGVZP", name = "PAYMENT_INELIGIBLE_T")
@SpaceClass
public class PaymentIneligibleT {


    @EmbeddedId
    private PaymentIneligibleTCompositeId compositeId;

    @Column(name = "PAYMENT_TYPE")
    private Character paymentType;

    @Column(name = "SOURCE_SYSTEM")
    private String sourceSystem;
    @Column(name = "ALT_ACCOUNT_NUMBER")
    private String altAccountNumber;
    @Column(name = "CARMS_SHORT_NAME")
    private String carmsShortName;
    @Column(name = "LAST_UPD_TIMESTAMP")
    private Timestamp lastUpdTimestamp;

    public PaymentIneligibleT(){}

    @SpaceId
    public PaymentIneligibleTCompositeId getCompositeId() {
        return compositeId;
    }

    public void setCompositeId(PaymentIneligibleTCompositeId compositeId) {
        this.compositeId = compositeId;
    }

    public Character getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Character paymentType) {
        this.paymentType = paymentType;
    }

    public String getSourceSystem() {
        return sourceSystem;
    }

    public void setSourceSystem(String sourceSystem) {
        this.sourceSystem = sourceSystem;
    }

    public String getAltAccountNumber() {
        return altAccountNumber;
    }

    public void setAltAccountNumber(String altAccountNumber) {
        this.altAccountNumber = altAccountNumber;
    }

    public String getCarmsShortName() {
        return carmsShortName;
    }

    public void setCarmsShortName(String carmsShortName) {
        this.carmsShortName = carmsShortName;
    }

    public Timestamp getLastUpdTimestamp() {
        return lastUpdTimestamp;
    }

    public void setLastUpdTimestamp(Timestamp lastUpdTimestamp) {
        this.lastUpdTimestamp = lastUpdTimestamp;
    }
}
