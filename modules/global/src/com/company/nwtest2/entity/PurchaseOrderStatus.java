package com.company.nwtest2.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.AttributeOverrides;
import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import com.haulmont.cuba.core.global.DesignSupport;
import com.haulmont.cuba.core.entity.BaseIntegerIdEntity;

@DesignSupport("{'imported':true}")
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "\"Status ID\""))
})
@Table(name = "\"Purchase Order Status\"")
@Entity(name = "nwtest2$PurchaseOrderStatus")
public class PurchaseOrderStatus extends BaseIntegerIdEntity {
    private static final long serialVersionUID = 136602241617364836L;

    @Column(name = "\"Status\"", length = 50)
    protected String status;

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }


}