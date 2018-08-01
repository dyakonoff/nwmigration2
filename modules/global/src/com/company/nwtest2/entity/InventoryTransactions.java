package com.company.nwtest2.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.AttributeOverrides;
import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import com.haulmont.cuba.core.global.DesignSupport;
import java.util.Date;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.haulmont.cuba.core.entity.BaseIntIdentityIdEntity;

@DesignSupport("{'imported':true}")
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "\"Transaction ID\""))
})
@Table(name = "\"Inventory Transactions\"")
@Entity(name = "nwtest2$InventoryTransactions")
public class InventoryTransactions extends BaseIntIdentityIdEntity {
    private static final long serialVersionUID = 8706646759905166143L;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "\"Transaction Type\"")
    protected InventoryTransactionTypes transaction_Type;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "\"Transaction Created Date\"")
    protected Date transaction_Created_Date;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "\"Transaction Modified Date\"")
    protected Date transaction_Modified_Date;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "\"Product ID\"")
    protected Products product_ID;

    @Column(name = "\"Quantity\"", nullable = false)
    protected Integer quantity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"Purchase Order ID\"")
    protected PurchaseOrders purchase_Order_ID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"Customer Order ID\"")
    protected Orders customer_Order_ID;

    @Column(name = "\"Comments\"")
    protected String comments;

    public void setTransaction_Type(InventoryTransactionTypes transaction_Type) {
        this.transaction_Type = transaction_Type;
    }

    public InventoryTransactionTypes getTransaction_Type() {
        return transaction_Type;
    }

    public void setTransaction_Created_Date(Date transaction_Created_Date) {
        this.transaction_Created_Date = transaction_Created_Date;
    }

    public Date getTransaction_Created_Date() {
        return transaction_Created_Date;
    }

    public void setTransaction_Modified_Date(Date transaction_Modified_Date) {
        this.transaction_Modified_Date = transaction_Modified_Date;
    }

    public Date getTransaction_Modified_Date() {
        return transaction_Modified_Date;
    }

    public void setProduct_ID(Products product_ID) {
        this.product_ID = product_ID;
    }

    public Products getProduct_ID() {
        return product_ID;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setPurchase_Order_ID(PurchaseOrders purchase_Order_ID) {
        this.purchase_Order_ID = purchase_Order_ID;
    }

    public PurchaseOrders getPurchase_Order_ID() {
        return purchase_Order_ID;
    }

    public void setCustomer_Order_ID(Orders customer_Order_ID) {
        this.customer_Order_ID = customer_Order_ID;
    }

    public Orders getCustomer_Order_ID() {
        return customer_Order_ID;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getComments() {
        return comments;
    }


}