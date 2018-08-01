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
        @AttributeOverride(name = "id", column = @Column(name = "\"Order ID\""))
})
@Table(name = "\"Orders\"")
@Entity(name = "nwtest2$Orders")
public class Orders extends BaseIntIdentityIdEntity {
    private static final long serialVersionUID = 4892895184259571988L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"Employee ID\"")
    protected Employees employee_ID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"Customer ID\"")
    protected Customers customer_ID;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "\"Order Date\"")
    protected Date order_Date;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "\"Shipped Date\"")
    protected Date shipped_Date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"Shipper ID\"")
    protected Shippers shipper_ID;

    @Column(name = "\"Ship Name\"", length = 50)
    protected String ship_Name;

    @Lob
    @Column(name = "\"Ship Address\"")
    protected String ship_Address;

    @Column(name = "\"Ship City\"", length = 50)
    protected String ship_City;

    @Column(name = "\"Ship State/Province\"", length = 50)
    protected String ship_State_Province;

    @Column(name = "\"Ship ZIP/Postal Code\"", length = 50)
    protected String ship_ZIP_Postal_Code;

    @Column(name = "\"Ship Country/Region\"", length = 50)
    protected String ship_Country_Region;

    @Column(name = "\"Shipping Fee\"", precision = 19, scale = 4)
    protected BigDecimal shipping_Fee;

    @Column(name = "\"Taxes\"", precision = 19, scale = 4)
    protected BigDecimal taxes;

    @Column(name = "\"Payment Type\"", length = 50)
    protected String payment_Type;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "\"Paid Date\"")
    protected Date paid_Date;

    @Lob
    @Column(name = "\"Notes\"")
    protected String notes;

    @Column(name = "\"Tax Rate\"")
    protected Double tax_Rate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"Tax Status\"")
    protected OrdersTaxStatus tax_Status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"Status ID\"")
    protected OrdersStatus status_ID;

    @Column(name = "\"SSMA_TimeStamp\"", nullable = false)
    protected byte[] ssmaTimestamp;

    public void setEmployee_ID(Employees employee_ID) {
        this.employee_ID = employee_ID;
    }

    public Employees getEmployee_ID() {
        return employee_ID;
    }

    public void setCustomer_ID(Customers customer_ID) {
        this.customer_ID = customer_ID;
    }

    public Customers getCustomer_ID() {
        return customer_ID;
    }

    public void setOrder_Date(Date order_Date) {
        this.order_Date = order_Date;
    }

    public Date getOrder_Date() {
        return order_Date;
    }

    public void setShipped_Date(Date shipped_Date) {
        this.shipped_Date = shipped_Date;
    }

    public Date getShipped_Date() {
        return shipped_Date;
    }

    public void setShipper_ID(Shippers shipper_ID) {
        this.shipper_ID = shipper_ID;
    }

    public Shippers getShipper_ID() {
        return shipper_ID;
    }

    public void setShip_Name(String ship_Name) {
        this.ship_Name = ship_Name;
    }

    public String getShip_Name() {
        return ship_Name;
    }

    public void setShip_Address(String ship_Address) {
        this.ship_Address = ship_Address;
    }

    public String getShip_Address() {
        return ship_Address;
    }

    public void setShip_City(String ship_City) {
        this.ship_City = ship_City;
    }

    public String getShip_City() {
        return ship_City;
    }

    public void setShip_State_Province(String ship_State_Province) {
        this.ship_State_Province = ship_State_Province;
    }

    public String getShip_State_Province() {
        return ship_State_Province;
    }

    public void setShip_ZIP_Postal_Code(String ship_ZIP_Postal_Code) {
        this.ship_ZIP_Postal_Code = ship_ZIP_Postal_Code;
    }

    public String getShip_ZIP_Postal_Code() {
        return ship_ZIP_Postal_Code;
    }

    public void setShip_Country_Region(String ship_Country_Region) {
        this.ship_Country_Region = ship_Country_Region;
    }

    public String getShip_Country_Region() {
        return ship_Country_Region;
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

    public void setPayment_Type(String payment_Type) {
        this.payment_Type = payment_Type;
    }

    public String getPayment_Type() {
        return payment_Type;
    }

    public void setPaid_Date(Date paid_Date) {
        this.paid_Date = paid_Date;
    }

    public Date getPaid_Date() {
        return paid_Date;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getNotes() {
        return notes;
    }

    public void setTax_Rate(Double tax_Rate) {
        this.tax_Rate = tax_Rate;
    }

    public Double getTax_Rate() {
        return tax_Rate;
    }

    public void setTax_Status(OrdersTaxStatus tax_Status) {
        this.tax_Status = tax_Status;
    }

    public OrdersTaxStatus getTax_Status() {
        return tax_Status;
    }

    public void setStatus_ID(OrdersStatus status_ID) {
        this.status_ID = status_ID;
    }

    public OrdersStatus getStatus_ID() {
        return status_ID;
    }

    public byte[] getSsmaTimestamp() {
        return ssmaTimestamp;
    }


}