package com.company.nwtest2.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.global.DesignSupport;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.haulmont.cuba.core.entity.BaseIntIdentityIdEntity;

@DesignSupport("{'imported':true}")
@Table(name = "\"Purchase Order Details\"")
@Entity(name = "nwtest2$PurchaseOrderDetails")
public class PurchaseOrderDetails extends BaseIntIdentityIdEntity {
    private static final long serialVersionUID = 3814236870008012520L;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "\"Purchase Order ID\"")
    protected PurchaseOrders purchase_Order_ID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"Product ID\"")
    protected Products product_ID;

    @Column(name = "\"Quantity\"", nullable = false)
    protected Double quantity;

    @Column(name = "\"Unit Cost\"", nullable = false, precision = 19, scale = 4)
    protected BigDecimal unit_Cost;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "\"Date Received\"")
    protected Date date_Received;

    @Column(name = "\"Posted To Inventory\"", nullable = false)
    protected Boolean posted_To_Inventory = false;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"Inventory ID\"")
    protected InventoryTransactions inventory_ID;

    @Column(name = "\"SSMA_TimeStamp\"", nullable = false)
    protected byte[] ssmaTimestamp;

    public void setPurchase_Order_ID(PurchaseOrders purchase_Order_ID) {
        this.purchase_Order_ID = purchase_Order_ID;
    }

    public PurchaseOrders getPurchase_Order_ID() {
        return purchase_Order_ID;
    }

    public void setProduct_ID(Products product_ID) {
        this.product_ID = product_ID;
    }

    public Products getProduct_ID() {
        return product_ID;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setUnit_Cost(BigDecimal unit_Cost) {
        this.unit_Cost = unit_Cost;
    }

    public BigDecimal getUnit_Cost() {
        return unit_Cost;
    }

    public void setDate_Received(Date date_Received) {
        this.date_Received = date_Received;
    }

    public Date getDate_Received() {
        return date_Received;
    }

    public void setPosted_To_Inventory(Boolean posted_To_Inventory) {
        this.posted_To_Inventory = posted_To_Inventory;
    }

    public Boolean getPosted_To_Inventory() {
        return posted_To_Inventory;
    }

    public void setInventory_ID(InventoryTransactions inventory_ID) {
        this.inventory_ID = inventory_ID;
    }

    public InventoryTransactions getInventory_ID() {
        return inventory_ID;
    }

    public byte[] getSsmaTimestamp() {
        return ssmaTimestamp;
    }


}