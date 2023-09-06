package com.ezcode.ezprocure.models;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "M_Company")
public class MCompany {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_com", nullable = false)
    private int idCom;
    @Basic
    @Column(name = "nm_com", nullable = true, length = 80)
    private String nmCom;
    @Basic
    @Column(name = "add1", nullable = true, length = 180)
    private String add1;
    @Basic
    @Column(name = "add2", nullable = true, length = 180)
    private String add2;
    @Basic
    @Column(name = "city", nullable = true, length = 90)
    private String city;
    @Basic
    @Column(name = "country", nullable = true, length = 90)
    private String country;
    @Basic
    @Column(name = "pin", nullable = true, length = 50)
    private String pin;
    @Basic
    @Column(name = "a_stp_no", nullable = true, length = 50)
    private String aStpNo;
    @Basic
    @Column(name = "a_stp_dt", nullable = true, length = 50)
    private String aStpDt;
    @Basic
    @Column(name = "reg_stp_no", nullable = true, length = 100)
    private String regStpNo;
    @Basic
    @Column(name = "license_no", nullable = true, length = 100)
    private String licenseNo;
    @Basic
    @Column(name = "reg_stp_dt", nullable = true, length = 50)
    private String regStpDt;
    @Basic
    @Column(name = "licence_dt", nullable = true, length = 50)
    private String licenceDt;
    @Basic
    @Column(name = "phone", nullable = true, length = 50)
    private String phone;
    @Basic
    @Column(name = "fax", nullable = true, length = 50)
    private String fax;
    @Basic
    @Column(name = "ip_add", nullable = true, length = 20)
    private String ipAdd;
    @Basic
    @Column(name = "port", nullable = true, length = 50)
    private String port;
    @Basic
    @Column(name = "mailid", nullable = true, length = 100)
    private String mailid;
    @Basic
    @Column(name = "u_val_cg", nullable = false, precision = 2)
    private BigDecimal uValCg;
    @Basic
    @Column(name = "nm_state", nullable = true, length = 50)
    private String nmState;
    @Basic
    @Column(name = "nm_city", nullable = true, length = 100)
    private String nmCity;
    @Basic
    @Column(name = "file_name", nullable = true, length = 500)
    private String fileName;
    @Basic
    @Column(name = "tin", nullable = true, length = 50)
    private String tin;
    @Basic
    @Column(name = "cst", nullable = true, length = 50)
    private String cst;
    @Basic
    @Column(name = "pan", nullable = true, length = 50)
    private String pan;
    @Basic
    @Column(name = "cin", nullable = true, length = 50)
    private String cin;
    @Basic
    @Column(name = "dt_register", nullable = true)
    private Date dtRegister;
    @Basic
    @Column(name = "FreeTrail", nullable = true, length = 50)
    private String freeTrail;
    @Basic
    @Column(name = "dt_trail_end", nullable = true)
    private Date dtTrailEnd;
    @Basic
    @Column(name = "li_enddt", nullable = true)
    private Date liEnddt;
    @Basic
    @Column(name = "asset_prefix", nullable = true, length = 50)
    private String assetPrefix;
    @Basic
    @Column(name = "nm_contact", nullable = true, length = 2147483647)
    private String nmContact;

    public int getIdCom() {
        return idCom;
    }

    public void setIdCom(int idCom) {
        this.idCom = idCom;
    }

    public String getNmCom() {
        return nmCom;
    }

    public void setNmCom(String nmCom) {
        this.nmCom = nmCom;
    }

    public String getAdd1() {
        return add1;
    }

    public void setAdd1(String add1) {
        this.add1 = add1;
    }

    public String getAdd2() {
        return add2;
    }

    public void setAdd2(String add2) {
        this.add2 = add2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getaStpNo() {
        return aStpNo;
    }

    public void setaStpNo(String aStpNo) {
        this.aStpNo = aStpNo;
    }

    public String getaStpDt() {
        return aStpDt;
    }

    public void setaStpDt(String aStpDt) {
        this.aStpDt = aStpDt;
    }

    public String getRegStpNo() {
        return regStpNo;
    }

    public void setRegStpNo(String regStpNo) {
        this.regStpNo = regStpNo;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    public String getRegStpDt() {
        return regStpDt;
    }

    public void setRegStpDt(String regStpDt) {
        this.regStpDt = regStpDt;
    }

    public String getLicenceDt() {
        return licenceDt;
    }

    public void setLicenceDt(String licenceDt) {
        this.licenceDt = licenceDt;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getIpAdd() {
        return ipAdd;
    }

    public void setIpAdd(String ipAdd) {
        this.ipAdd = ipAdd;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getMailid() {
        return mailid;
    }

    public void setMailid(String mailid) {
        this.mailid = mailid;
    }

    public BigDecimal getuValCg() {
        return uValCg;
    }

    public void setuValCg(BigDecimal uValCg) {
        this.uValCg = uValCg;
    }

    public String getNmState() {
        return nmState;
    }

    public void setNmState(String nmState) {
        this.nmState = nmState;
    }

    public String getNmCity() {
        return nmCity;
    }

    public void setNmCity(String nmCity) {
        this.nmCity = nmCity;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getTin() {
        return tin;
    }

    public void setTin(String tin) {
        this.tin = tin;
    }

    public String getCst() {
        return cst;
    }

    public void setCst(String cst) {
        this.cst = cst;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public Date getDtRegister() {
        return dtRegister;
    }

    public void setDtRegister(Date dtRegister) {
        this.dtRegister = dtRegister;
    }

    public String getFreeTrail() {
        return freeTrail;
    }

    public void setFreeTrail(String freeTrail) {
        this.freeTrail = freeTrail;
    }

    public Date getDtTrailEnd() {
        return dtTrailEnd;
    }

    public void setDtTrailEnd(Date dtTrailEnd) {
        this.dtTrailEnd = dtTrailEnd;
    }

    public Date getLiEnddt() {
        return liEnddt;
    }

    public void setLiEnddt(Date liEnddt) {
        this.liEnddt = liEnddt;
    }

    public String getAssetPrefix() {
        return assetPrefix;
    }

    public void setAssetPrefix(String assetPrefix) {
        this.assetPrefix = assetPrefix;
    }

    public String getNmContact() {
        return nmContact;
    }

    public void setNmContact(String nmContact) {
        this.nmContact = nmContact;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MCompany mCompany = (MCompany) o;
        return idCom == mCompany.idCom && Objects.equals(nmCom, mCompany.nmCom) && Objects.equals(add1, mCompany.add1) && Objects.equals(add2, mCompany.add2) && Objects.equals(city, mCompany.city) && Objects.equals(country, mCompany.country) && Objects.equals(pin, mCompany.pin) && Objects.equals(aStpNo, mCompany.aStpNo) && Objects.equals(aStpDt, mCompany.aStpDt) && Objects.equals(regStpNo, mCompany.regStpNo) && Objects.equals(licenseNo, mCompany.licenseNo) && Objects.equals(regStpDt, mCompany.regStpDt) && Objects.equals(licenceDt, mCompany.licenceDt) && Objects.equals(phone, mCompany.phone) && Objects.equals(fax, mCompany.fax) && Objects.equals(ipAdd, mCompany.ipAdd) && Objects.equals(port, mCompany.port) && Objects.equals(mailid, mCompany.mailid) && Objects.equals(uValCg, mCompany.uValCg) && Objects.equals(nmState, mCompany.nmState) && Objects.equals(nmCity, mCompany.nmCity) && Objects.equals(fileName, mCompany.fileName) && Objects.equals(tin, mCompany.tin) && Objects.equals(cst, mCompany.cst) && Objects.equals(pan, mCompany.pan) && Objects.equals(cin, mCompany.cin) && Objects.equals(dtRegister, mCompany.dtRegister) && Objects.equals(freeTrail, mCompany.freeTrail) && Objects.equals(dtTrailEnd, mCompany.dtTrailEnd) && Objects.equals(liEnddt, mCompany.liEnddt) && Objects.equals(assetPrefix, mCompany.assetPrefix) && Objects.equals(nmContact, mCompany.nmContact);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCom, nmCom, add1, add2, city, country, pin, aStpNo, aStpDt, regStpNo, licenseNo, regStpDt, licenceDt, phone, fax, ipAdd, port, mailid, uValCg, nmState, nmCity, fileName, tin, cst, pan, cin, dtRegister, freeTrail, dtTrailEnd, liEnddt, assetPrefix, nmContact);
    }
}
