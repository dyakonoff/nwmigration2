package com.company.nwtest2.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.global.DesignSupport;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Lob;
import com.haulmont.cuba.core.entity.BaseIntIdentityIdEntity;

@DesignSupport("{'imported':true}")
@NamePattern("%s|description")
@Table(name = "\"Products\"")
@Entity(name = "nwtest2$Products")
public class Products extends BaseIntIdentityIdEntity {
    private static final long serialVersionUID = -1062500710890600449L;

    @Column(name = "\"Supplier IDs\"", length = 8000)
    protected String supplier_IDs;

    @Column(name = "\"Product Code\"", length = 25)
    protected String product_Code;

    @Column(name = "\"Product Name\"", length = 50)
    protected String product_Name;

    @Lob
    @Column(name = "\"Description\"")
    protected String description;

    @Column(name = "\"Standard Cost\"", precision = 19, scale = 4)
    protected BigDecimal standard_Cost;

    @Column(name = "\"List Price\"", nullable = false, precision = 19, scale = 4)
    protected BigDecimal list_Price;

    @Column(name = "\"Reorder Level\"")
    protected Integer reorder_Level;

    @Column(name = "\"Target Level\"")
    protected Integer target_Level;

    @Column(name = "\"Quantity Per Unit\"", length = 50)
    protected String quantity_Per_Unit;

    @Column(name = "\"Discontinued\"", nullable = false)
    protected Boolean discontinued = false;

    @Column(name = "\"Minimum Reorder Quantity\"")
    protected Integer minimum_Reorder_Quantity;

    @Column(name = "\"Category\"", length = 50)
    protected String category;

    @Column(name = "\"Attachments\"", length = 8000)
    protected String attachments;

    @Column(name = "\"SSMA_TimeStamp\"", nullable = false)
    protected byte[] ssmaTimestamp;

    public void setSupplier_IDs(String supplier_IDs) {
        this.supplier_IDs = supplier_IDs;
    }

    public String getSupplier_IDs() {
        return supplier_IDs;
    }

    public void setProduct_Code(String product_Code) {
        this.product_Code = product_Code;
    }

    public String getProduct_Code() {
        return product_Code;
    }

    public void setProduct_Name(String product_Name) {
        this.product_Name = product_Name;
    }

    public String getProduct_Name() {
        return product_Name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setStandard_Cost(BigDecimal standard_Cost) {
        this.standard_Cost = standard_Cost;
    }

    public BigDecimal getStandard_Cost() {
        return standard_Cost;
    }

    public void setList_Price(BigDecimal list_Price) {
        this.list_Price = list_Price;
    }

    public BigDecimal getList_Price() {
        return list_Price;
    }

    public void setReorder_Level(Integer reorder_Level) {
        this.reorder_Level = reorder_Level;
    }

    public Integer getReorder_Level() {
        return reorder_Level;
    }

    public void setTarget_Level(Integer target_Level) {
        this.target_Level = target_Level;
    }

    public Integer getTarget_Level() {
        return target_Level;
    }

    public void setQuantity_Per_Unit(String quantity_Per_Unit) {
        this.quantity_Per_Unit = quantity_Per_Unit;
    }

    public String getQuantity_Per_Unit() {
        return quantity_Per_Unit;
    }

    public void setDiscontinued(Boolean discontinued) {
        this.discontinued = discontinued;
    }

    public Boolean getDiscontinued() {
        return discontinued;
    }

    public void setMinimum_Reorder_Quantity(Integer minimum_Reorder_Quantity) {
        this.minimum_Reorder_Quantity = minimum_Reorder_Quantity;
    }

    public Integer getMinimum_Reorder_Quantity() {
        return minimum_Reorder_Quantity;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setAttachments(String attachments) {
        this.attachments = attachments;
    }

    public String getAttachments() {
        return attachments;
    }

    public byte[] getSsmaTimestamp() {
        return ssmaTimestamp;
    }


}