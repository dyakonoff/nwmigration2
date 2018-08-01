package com.company.nwtest2.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.AttributeOverrides;
import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import com.haulmont.cuba.core.global.DesignSupport;
import java.util.List;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import com.haulmont.cuba.core.entity.BaseIntIdentityIdEntity;

@DesignSupport("{'imported':true}")
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "\"Privilege ID\""))
})
@Table(name = "\"Privilegesnw\"")
@Entity(name = "nwtest2$Privilegesnw")
public class Privilegesnw extends BaseIntIdentityIdEntity {
    private static final long serialVersionUID = -1914649108115651984L;

    @JoinTable(name = "Employee Privileges",
        joinColumns = @JoinColumn(name = "Privilege ID"),
        inverseJoinColumns = @JoinColumn(name = "Employee ID"))
    @ManyToMany
    protected List<Employees> employees;

    @Column(name = "\"Privilege Name\"", length = 50)
    protected String privilege_Name;

    public void setEmployees(List<Employees> employees) {
        this.employees = employees;
    }

    public List<Employees> getEmployees() {
        return employees;
    }

    public void setPrivilege_Name(String privilege_Name) {
        this.privilege_Name = privilege_Name;
    }

    public String getPrivilege_Name() {
        return privilege_Name;
    }


}