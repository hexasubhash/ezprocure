package com.ezcode.ezprocure.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Objects;

/**
 * A DTO for the {@link com.ezcode.ezprocure.models.MCompany} entity
 */
public class MCompanyDto implements Serializable {
    private final int idCom;
    private final String nmCom;
    private final String add1;
    private final String add2;
    private final String city;
    private final String country;
    private final String pin;
    private final String aStpNo;
    private final String aStpDt;
    private final String regStpNo;
    private final String licenseNo;
    private final String regStpDt;
    private final String licenceDt;
    private final String phone;
    private final String fax;
    private final String ipAdd;
    private final String port;
    private final String mailid;
    private final BigDecimal uValCg;
    private final String nmState;
    private final String nmCity;
    private final String fileName;
    private final String tin;
    private final String cst;
    private final String pan;
    private final String cin;
    private final Date dtRegister;
    private final String freeTrail;
    private final Date dtTrailEnd;
    private final Date liEnddt;
    private final String assetPrefix;
    private final String nmContact;

    public MCompanyDto(int idCom, String nmCom, String add1, String add2, String city, String country, String pin, String aStpNo, String aStpDt, String regStpNo, String licenseNo, String regStpDt, String licenceDt, String phone, String fax, String ipAdd, String port, String mailid, BigDecimal uValCg, String nmState, String nmCity, String fileName, String tin, String cst, String pan, String cin, Date dtRegister, String freeTrail, Date dtTrailEnd, Date liEnddt, String assetPrefix, String nmContact) {
        this.idCom = idCom;
        this.nmCom = nmCom;
        this.add1 = add1;
        this.add2 = add2;
        this.city = city;
        this.country = country;
        this.pin = pin;
        this.aStpNo = aStpNo;
        this.aStpDt = aStpDt;
        this.regStpNo = regStpNo;
        this.licenseNo = licenseNo;
        this.regStpDt = regStpDt;
        this.licenceDt = licenceDt;
        this.phone = phone;
        this.fax = fax;
        this.ipAdd = ipAdd;
        this.port = port;
        this.mailid = mailid;
        this.uValCg = uValCg;
        this.nmState = nmState;
        this.nmCity = nmCity;
        this.fileName = fileName;
        this.tin = tin;
        this.cst = cst;
        this.pan = pan;
        this.cin = cin;
        this.dtRegister = dtRegister;
        this.freeTrail = freeTrail;
        this.dtTrailEnd = dtTrailEnd;
        this.liEnddt = liEnddt;
        this.assetPrefix = assetPrefix;
        this.nmContact = nmContact;
    }

    public int getIdCom() {
        return idCom;
    }

    public String getNmCom() {
        return nmCom;
    }

    public String getAdd1() {
        return add1;
    }

    public String getAdd2() {
        return add2;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getPin() {
        return pin;
    }

    public String getAStpNo() {
        return aStpNo;
    }

    public String getAStpDt() {
        return aStpDt;
    }

    public String getRegStpNo() {
        return regStpNo;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public String getRegStpDt() {
        return regStpDt;
    }

    public String getLicenceDt() {
        return licenceDt;
    }

    public String getPhone() {
        return phone;
    }

    public String getFax() {
        return fax;
    }

    public String getIpAdd() {
        return ipAdd;
    }

    public String getPort() {
        return port;
    }

    public String getMailid() {
        return mailid;
    }

    public BigDecimal getUValCg() {
        return uValCg;
    }

    public String getNmState() {
        return nmState;
    }

    public String getNmCity() {
        return nmCity;
    }

    public String getFileName() {
        return fileName;
    }

    public String getTin() {
        return tin;
    }

    public String getCst() {
        return cst;
    }

    public String getPan() {
        return pan;
    }

    public String getCin() {
        return cin;
    }

    public Date getDtRegister() {
        return dtRegister;
    }

    public String getFreeTrail() {
        return freeTrail;
    }

    public Date getDtTrailEnd() {
        return dtTrailEnd;
    }

    public Date getLiEnddt() {
        return liEnddt;
    }

    public String getAssetPrefix() {
        return assetPrefix;
    }

    public String getNmContact() {
        return nmContact;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MCompanyDto entity = (MCompanyDto) o;
        return Objects.equals(this.idCom, entity.idCom) &&
                Objects.equals(this.nmCom, entity.nmCom) &&
                Objects.equals(this.add1, entity.add1) &&
                Objects.equals(this.add2, entity.add2) &&
                Objects.equals(this.city, entity.city) &&
                Objects.equals(this.country, entity.country) &&
                Objects.equals(this.pin, entity.pin) &&
                Objects.equals(this.aStpNo, entity.aStpNo) &&
                Objects.equals(this.aStpDt, entity.aStpDt) &&
                Objects.equals(this.regStpNo, entity.regStpNo) &&
                Objects.equals(this.licenseNo, entity.licenseNo) &&
                Objects.equals(this.regStpDt, entity.regStpDt) &&
                Objects.equals(this.licenceDt, entity.licenceDt) &&
                Objects.equals(this.phone, entity.phone) &&
                Objects.equals(this.fax, entity.fax) &&
                Objects.equals(this.ipAdd, entity.ipAdd) &&
                Objects.equals(this.port, entity.port) &&
                Objects.equals(this.mailid, entity.mailid) &&
                Objects.equals(this.uValCg, entity.uValCg) &&
                Objects.equals(this.nmState, entity.nmState) &&
                Objects.equals(this.nmCity, entity.nmCity) &&
                Objects.equals(this.fileName, entity.fileName) &&
                Objects.equals(this.tin, entity.tin) &&
                Objects.equals(this.cst, entity.cst) &&
                Objects.equals(this.pan, entity.pan) &&
                Objects.equals(this.cin, entity.cin) &&
                Objects.equals(this.dtRegister, entity.dtRegister) &&
                Objects.equals(this.freeTrail, entity.freeTrail) &&
                Objects.equals(this.dtTrailEnd, entity.dtTrailEnd) &&
                Objects.equals(this.liEnddt, entity.liEnddt) &&
                Objects.equals(this.assetPrefix, entity.assetPrefix) &&
                Objects.equals(this.nmContact, entity.nmContact);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCom, nmCom, add1, add2, city, country, pin, aStpNo, aStpDt, regStpNo, licenseNo, regStpDt, licenceDt, phone, fax, ipAdd, port, mailid, uValCg, nmState, nmCity, fileName, tin, cst, pan, cin, dtRegister, freeTrail, dtTrailEnd, liEnddt, assetPrefix, nmContact);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "idCom = " + idCom + ", " +
                "nmCom = " + nmCom + ", " +
                "add1 = " + add1 + ", " +
                "add2 = " + add2 + ", " +
                "city = " + city + ", " +
                "country = " + country + ", " +
                "pin = " + pin + ", " +
                "aStpNo = " + aStpNo + ", " +
                "aStpDt = " + aStpDt + ", " +
                "regStpNo = " + regStpNo + ", " +
                "licenseNo = " + licenseNo + ", " +
                "regStpDt = " + regStpDt + ", " +
                "licenceDt = " + licenceDt + ", " +
                "phone = " + phone + ", " +
                "fax = " + fax + ", " +
                "ipAdd = " + ipAdd + ", " +
                "port = " + port + ", " +
                "mailid = " + mailid + ", " +
                "uValCg = " + uValCg + ", " +
                "nmState = " + nmState + ", " +
                "nmCity = " + nmCity + ", " +
                "fileName = " + fileName + ", " +
                "tin = " + tin + ", " +
                "cst = " + cst + ", " +
                "pan = " + pan + ", " +
                "cin = " + cin + ", " +
                "dtRegister = " + dtRegister + ", " +
                "freeTrail = " + freeTrail + ", " +
                "dtTrailEnd = " + dtTrailEnd + ", " +
                "liEnddt = " + liEnddt + ", " +
                "assetPrefix = " + assetPrefix + ", " +
                "nmContact = " + nmContact + ")";
    }
}