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
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.haulmont.cuba.core.entity.BaseIntIdentityIdEntity;

@DesignSupport("{'imported':true}")
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "\"Invoice ID\""))
})
@Table(name = "\"Invoices\"")
@Entity(name = "nwtest2$Invoices")
public class Invoices extends BaseIntIdentityIdEntity {
    private static final long serialVersionUID = 2243251487041981999L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"Order ID\"")
    protected Orders order_ID;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "\"Invoice Date\"")
    protected Date invoice_Date;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "\"Due Date\"")
    protected Date due_Date;

    @Column(name = "\"Tax\"", precision = 19, scale = 4)
    protected BigDecimal tax;

    @Column(name = "\"Shipping\"", precision = 19, scale = 4)
    protected BigDecimal shipping;

    @Column(name = "\"Amount Due\"", precision = 19, scale = 4)
    protected BigDecimal amount_Due;

    public void setOrder_ID(Orders order_ID) {
        this.order_ID = order_ID;
    }

    public Orders getOrder_ID() {
        return order_ID;
    }

    public void setInvoice_Date(Date invoice_Date) {
        this.invoice_Date = invoice_Date;
    }

    public Date getInvoice_Date() {
        return invoice_Date;
    }

    public void setDue_Date(Date due_Date) {
        this.due_Date = due_Date;
    }

    public Date getDue_Date() {
        return due_Date;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public BigDecimal getTax() {
        return tax;
    }

    public void setShipping(BigDecimal shipping) {
        this.shipping = shipping;
    }

    public BigDecimal getShipping() {
        return shipping;
    }

    public void setAmount_Due(BigDecimal amount_Due) {
        this.amount_Due = amount_Due;
    }

    public BigDecimal getAmount_Due() {
        return amount_Due;
    }


}