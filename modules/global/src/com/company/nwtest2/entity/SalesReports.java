package com.company.nwtest2.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.global.DesignSupport;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Lob;
import com.haulmont.cuba.core.entity.BaseStringIdEntity;

@DesignSupport("{'imported':true}")
@NamePattern("%s|title")
@Table(name = "\"Sales Reports\"")
@Entity(name = "nwtest2$SalesReports")
public class SalesReports extends BaseStringIdEntity {
    private static final long serialVersionUID = 6660366721500142786L;

    @Column(name = "\"Display\"", length = 50)
    protected String display;

    @Column(name = "\"Title\"", length = 50)
    protected String title;

    @Lob
    @Column(name = "\"Filter Row Source\"")
    protected String filter_Row_Source;

    @Column(name = "\"Default\"", nullable = false)
    protected Boolean _default = false;

    @Column(name = "\"SSMA_TimeStamp\"", nullable = false)
    protected byte[] ssmaTimestamp;

    @Id
    @Column(name = "\"Group By\"", nullable = false, length = 50)
    protected String group_By;

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getDisplay() {
        return display;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setFilter_Row_Source(String filter_Row_Source) {
        this.filter_Row_Source = filter_Row_Source;
    }

    public String getFilter_Row_Source() {
        return filter_Row_Source;
    }

    public void set_default(Boolean _default) {
        this._default = _default;
    }

    public Boolean get_default() {
        return _default;
    }

    public byte[] getSsmaTimestamp() {
        return ssmaTimestamp;
    }

    public void setGroup_By(String group_By) {
        this.group_By = group_By;
    }

    public String getGroup_By() {
        return group_By;
    }

    @Override
    public String getId() {
        return group_By;
    }

    @Override
    public void setId(String id) {
        this.group_By = id;
    }


}