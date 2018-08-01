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
@Table(name = "\"Order Details Status\"")
@Entity(name = "nwtest2$OrderDetailsStatus")
public class OrderDetailsStatus extends BaseIntegerIdEntity {
    private static final long serialVersionUID = 626258374210512166L;

    @Column(name = "\"Status Name\"", nullable = false, length = 50)
    protected String status_Name;

    public void setStatus_Name(String status_Name) {
        this.status_Name = status_Name;
    }

    public String getStatus_Name() {
        return status_Name;
    }


}