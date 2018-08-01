package com.company.nwtest2.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.AttributeOverrides;
import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import com.haulmont.cuba.core.global.DesignSupport;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.haulmont.cuba.core.entity.BaseIntIdentityIdEntity;

@DesignSupport("{'imported':true}")
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "\"Purchase Order ID\""))
})
@Table(name = "\"Purchase Orders\"")
@Entity(name = "nwtest2$PurchaseOrders")
public class PurchaseOrders extends BaseIntIdentityIdEntity {
    private static final long serialVersionUID = -6190323107445686334L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"Supplier ID\"")
    protected Suppliers supplier_ID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"Created By\"")
    protected Employees created_By;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "\"Submitted Date\"")
    protected Date submitted_Date;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "\"Creation Date\"")
    protected Date creation_Date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"Status ID\"")
    protected PurchaseOrderStatus status_ID;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "\"Expected Date\"")
    protected Date expected_Date;

    @Column(name = "\"Shipping Fee\"", nullable = false, precision = 19, scale = 4)
    protected BigDecimal shipping_Fee;

    @Column(name = "\"Taxes\"", nullable = false, precision = 19, scale = 4)
    protected BigDecimal taxes;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "\"Payment Date\"")
    protected Date payment_Date;

    @Column(name = "\"Payment Amount\"", precision = 19, scale = 4)
    protected BigDecimal payment_Amount;

    @Column(name = "\"Payment Method\"", length = 50)
    protected String payment_Method;

    @Lob
    @Column(name = "\"Notes\"")
    protected String notes;

    @Column(name = "\"Approved By\"")
    protected Integer approved_By;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "\"Approved Date\"")
    protected Date approved_Date;

    @Column(name = "\"Submitted By\"")
    protected Integer submitted_By;

    @Column(name = "\"SSMA_TimeStamp\"", nullable = false)
    protected byte[] ssmaTimestamp;

    public void setSupplier_ID(Suppliers supplier_ID) {
        this.supplier_ID = supplier_ID;
    }

    public Suppliers getSupplier_ID() {
        return supplier_ID;
    }

    public void setCreated_By(Employees created_By) {
        this.created_By = created_By;
    }

    public Employees getCreated_By() {
        return created_By;
    }

    public void setSubmitted_Date(Date submitted_Date) {
        this.submitted_Date = submitted_Date;
    }

    public Date getSubmitted_Date() {
        return submitted_Date;
    }

    public void setCreation_Date(Date creation_Date) {
        this.creation_Date = creation_Date;
    }

    public Date getCreation_Date() {
        return creation_Date;
    }

    public void setStatus_ID(PurchaseOrderStatus status_ID) {
        this.status_ID = status_ID;
    }

    public PurchaseOrderStatus getStatus_ID() {
        return status_ID;
    }

    public void setExpected_Date(Date expected_Date) {
        this.expected_Date = expected_Date;
    }

    public Date getExpected_Date() {
        return expected_Date;
    }

    public void setShipping_Fee(BigDecimal shipping_Fee) {
        this.shipping_Fee = shipping_Fee;
    }

    public BigDecimal getShipping_Fee() {
        return shipping_Fee;
    }

    public void setTaxes(BigDecimal taxes) {
        this.taxes = taxes;
    }

    public BigDecimal getTaxes() {
        return taxes;
    }

    public void setPayment_Date(Date payment_Date) {
        this.payment_Date = payment_Date;
    }

    public Date getPayment_Date() {
        return payment_Date;
    }

    public void setPayment_Amount(BigDecimal payment_Amount) {
        this.payment_Amount = payment_Amount;
    }

    public BigDecimal getPayment_Amount() {
        return payment_Amount;
    }

    public void setPayment_Method(String payment_Method) {
        this.payment_Method = payment_Method;
    }

    public String getPayment_Method() {
        return payment_Method;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getNotes() {
        return notes;
    }

    public void setApproved_By(Integer approved_By) {
        this.approved_By = approved_By;
    }

    public Integer getApproved_By() {
        return approved_By;
    }

    public void setApproved_Date(Date approved_Date) {
        this.approved_Date = approved_Date;
    }

    public Date getApproved_Date() {
        return approved_Date;
    }

    public void setSubmitted_By(Integer submitted_By) {
        this.submitted_By = submitted_By;
    }

    public Integer getSubmitted_By() {
        return submitted_By;
    }

    public byte[] getSsmaTimestamp() {
        return ssmaTimestamp;
    }


}