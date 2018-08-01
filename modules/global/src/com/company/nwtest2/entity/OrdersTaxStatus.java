package com.company.nwtest2.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.global.DesignSupport;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;

@DesignSupport("{'imported':true}")
@Table(name = "\"Orders Tax Status\"")
@Entity(name = "nwtest2$OrdersTaxStatus")
public class OrdersTaxStatus extends BaseIntegerIdEntity {
    private static final long serialVersionUID = -1281461687652682533L;

    @Column(name = "\"Tax Status Name\"", nullable = false, length = 50)
    protected String tax_Status_Name;

    public void setTax_Status_Name(String tax_Status_Name) {
        this.tax_Status_Name = tax_Status_Name;
    }

    public String getTax_Status_Name() {
        return tax_Status_Name;
    }


}