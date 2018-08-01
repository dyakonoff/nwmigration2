package com.company.nwtest2.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.AttributeOverrides;
import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import com.haulmont.cuba.core.global.DesignSupport;
import com.haulmont.cuba.core.entity.BaseIntIdentityIdEntity;

@DesignSupport("{'imported':true}")
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "\"String ID\""))
})
@Table(name = "\"Strings\"")
@Entity(name = "nwtest2$Strings")
public class Strings extends BaseIntIdentityIdEntity {
    private static final long serialVersionUID = 6973211557883355844L;

    @Column(name = "\"String Data\"")
    protected String string_Data;

    public void setString_Data(String string_Data) {
        this.string_Data = string_Data;
    }

    public String getString_Data() {
        return string_Data;
    }


}