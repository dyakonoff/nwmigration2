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
@Table(name = "\"Order Details\"")
@Entity(name = "nwtest2$OrderDetails")
public class OrderDetails extends BaseIntIdentityIdEntity {
    private static final long serialVersionUID = -4979758658321194074L;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "\"Order ID\"")
    protected Orders order_ID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"Product ID\"")
    protected Products product_ID;

    @Column(name = "\"Quantity\"", nullable = false)
    protected Double quantity;

    @Column(name = "\"Unit Price\"", precision = 19, scale = 4)
    protected BigDecimal unit_Price;

    @Column(name = "\"Discount\"", nullable = false)
    protected Double discount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"Status ID\"")
    protected OrderDetailsStatus status_ID;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "\"Date Allocated\"")
    protected Date date_Allocated;

    @Column(name = "\"Purchase Order ID\"")
    protected Integer purchase_Order_ID;

    @Column(name = "\"Inventory ID\"")
    protected Integer inventory_ID;

    @Column(name = "\"SSMA_TimeStamp\"", nullable = false)
    protected byte[] ssmaTimestamp;

    public void setOrder_ID(Orders order_ID) {
        this.order_ID = order_ID;
    }

    public Orders getOrder_ID() {
        return order_ID;
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

    public void setUnit_Price(BigDecimal unit_Price) {
        this.unit_Price = unit_Price;
    }

    public BigDecimal getUnit_Price() {
        return unit_Price;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setStatus_ID(OrderDetailsStatus status_ID) {
        this.status_ID = status_ID;
    }

    public OrderDetailsStatus getStatus_ID() {
        return status_ID;
    }

    public void setDate_Allocated(Date date_Allocated) {
        this.date_Allocated = date_Allocated;
    }

    public Date getDate_Allocated() {
        return date_Allocated;
    }

    public void setPurchase_Order_ID(Integer purchase_Order_ID) {
        this.purchase_Order_ID = purchase_Order_ID;
    }

    public Integer getPurchase_Order_ID() {
        return purchase_Order_ID;
    }

    public void setInventory_ID(Integer inventory_ID) {
        this.inventory_ID = inventory_ID;
    }

    public Integer getInventory_ID() {
        return inventory_ID;
    }

    public byte[] getSsmaTimestamp() {
        return ssmaTimestamp;
    }


}