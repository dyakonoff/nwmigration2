package com.company.nwtest2.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.global.DesignSupport;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;

@DesignSupport("{'imported':true}")
@Table(name = "\"Inventory Transaction Types\"")
@Entity(name = "nwtest2$InventoryTransactionTypes")
public class InventoryTransactionTypes extends BaseIntegerIdEntity {
    private static final long serialVersionUID = -8519087152664945174L;

    @Column(name = "\"Type Name\"", nullable = false, length = 50)
    protected String type_Name;

    public void setType_Name(String type_Name) {
        this.type_Name = type_Name;
    }

    public String getType_Name() {
        return type_Name;
    }


}