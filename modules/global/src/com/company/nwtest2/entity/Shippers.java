package com.company.nwtest2.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.global.DesignSupport;
import javax.persistence.Column;
import javax.persistence.Lob;
import com.haulmont.cuba.core.entity.BaseIntIdentityIdEntity;

@DesignSupport("{'imported':true}")
@Table(name = "\"Shippers\"")
@Entity(name = "nwtest2$Shippers")
public class Shippers extends BaseIntIdentityIdEntity {
    private static final long serialVersionUID = 4388348109645163465L;

    @Column(name = "\"Company\"", length = 50)
    protected String company;

    @Column(name = "\"Last Name\"", length = 50)
    protected String last_Name;

    @Column(name = "\"First Name\"", length = 50)
    protected String first_Name;

    @Column(name = "\"E-mail Address\"", length = 50)
    protected String e_mail_Address;

    @Column(name = "\"Job Title\"", length = 50)
    protected String job_Title;

    @Column(name = "\"Business Phone\"", length = 25)
    protected String business_Phone;

    @Column(name = "\"Home Phone\"", length = 25)
    protected String home_Phone;

    @Column(name = "\"Mobile Phone\"", length = 25)
    protected String mobile_Phone;

    @Column(name = "\"Fax Number\"", length = 25)
    protected String fax_Number;

    @Lob
    @Column(name = "\"Address\"")
    protected String address;

    @Column(name = "\"City\"", length = 50)
    protected String city;

    @Column(name = "\"State/Province\"", length = 50)
    protected String state_Province;

    @Column(name = "\"ZIP/Postal Code\"", length = 15)
    protected String zIP_Postal_Code;

    @Column(name = "\"Country/Region\"", length = 50)
    protected String country_Region;

    @Lob
    @Column(name = "\"Web Page\"")
    protected String web_Page;

    @Lob
    @Column(name = "\"Notes\"")
    protected String notes;

    @Column(name = "\"Attachments\"", length = 8000)
    protected String attachments;

    @Column(name = "\"SSMA_TimeStamp\"", nullable = false)
    protected byte[] ssmaTimestamp;

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setLast_Name(String last_Name) {
        this.last_Name = last_Name;
    }

    public String getLast_Name() {
        return last_Name;
    }

    public void setFirst_Name(String first_Name) {
        this.first_Name = first_Name;
    }

    public String getFirst_Name() {
        return first_Name;
    }

    public void setE_mail_Address(String e_mail_Address) {
        this.e_mail_Address = e_mail_Address;
    }

    public String getE_mail_Address() {
        return e_mail_Address;
    }

    public void setJob_Title(String job_Title) {
        this.job_Title = job_Title;
    }

    public String getJob_Title() {
        return job_Title;
    }

    public void setBusiness_Phone(String business_Phone) {
        this.business_Phone = business_Phone;
    }

    public String getBusiness_Phone() {
        return business_Phone;
    }

    public void setHome_Phone(String home_Phone) {
        this.home_Phone = home_Phone;
    }

    public String getHome_Phone() {
        return home_Phone;
    }

    public void setMobile_Phone(String mobile_Phone) {
        this.mobile_Phone = mobile_Phone;
    }

    public String getMobile_Phone() {
        return mobile_Phone;
    }

    public void setFax_Number(String fax_Number) {
        this.fax_Number = fax_Number;
    }

    public String getFax_Number() {
        return fax_Number;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setState_Province(String state_Province) {
        this.state_Province = state_Province;
    }

    public String getState_Province() {
        return state_Province;
    }

    public void setZIP_Postal_Code(String zIP_Postal_Code) {
        this.zIP_Postal_Code = zIP_Postal_Code;
    }

    public String getZIP_Postal_Code() {
        return zIP_Postal_Code;
    }

    public void setCountry_Region(String country_Region) {
        this.country_Region = country_Region;
    }

    public String getCountry_Region() {
        return country_Region;
    }

    public void setWeb_Page(String web_Page) {
        this.web_Page = web_Page;
    }

    public String getWeb_Page() {
        return web_Page;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getNotes() {
        return notes;
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