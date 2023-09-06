package com.ezcode.ezprocure.dto;

import com.ezcode.ezprocure.models.MBussType;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link com.ezcode.ezprocure.models.MVendor} entity
 */
public class MVendorDto implements Serializable {
    private final int idVen;
    private final String nmVen;
    private final String cdVen;
    private final String ctMailid;
    private final String password;
    private final String nmContact1;
    private final String venLogo;
    private final Integer otp;
    private final String sapStatus;
    private final String searchTerm;
    private final String sapCdVen;
    private final String username;
    private final String stUpdate;
    private final String stSapUpdate;
    private final String action;
    private final String regAdd;
    private final String add1;
    private final String add2;
    private final String district;
    private final String zipCode;
    private final String regNo;
    private final String dunsNo;
    private final String compWebLink;
    private final String corpPresentLink;
    private final String corpPresentPdf;
    private final String idAssetdiv;
    private final String idSAssetdiv;
    private final String idCertificateType;
    private final String poc;
    private final String pocMail;
    private final Integer pocContactNo;
    private final String secondPoc;
    private final String secondPocMail;
    private final Integer secondPocContactNo;
    private final MEmpUserDto mEmpUserByAddBy;
    private final MSublocDto mSublocByIdSubl;
    private final MLocDto mLocByIdLoc;
    private final MCountryDto mCountryByIdCountry;
    private final MBussType mBussTypeByIdBussType;

    public MVendorDto(int idVen, String nmVen, String cdVen, String ctMailid, String password, String nmContact1, String venLogo, Integer otp, String sapStatus, String searchTerm, String sapCdVen, String username, String stUpdate, String stSapUpdate, String action, String regAdd, String add1, String add2, String district, String zipCode, String regNo, String dunsNo, String compWebLink, String corpPresentLink, String corpPresentPdf, String idAssetdiv, String idSAssetdiv, String idCertificateType, String poc, String pocMail, Integer pocContactNo, String secondPoc, String secondPocMail, Integer secondPocContactNo, MEmpUserDto mEmpUserByAddBy, MSublocDto mSublocByIdSubl, MLocDto mLocByIdLoc, MCountryDto mCountryByIdCountry, MBussType mBussTypeByIdBussType) {
        this.idVen = idVen;
        this.nmVen = nmVen;
        this.cdVen = cdVen;
        this.ctMailid = ctMailid;
        this.password = password;
        this.nmContact1 = nmContact1;
        this.venLogo = venLogo;
        this.otp = otp;
        this.sapStatus = sapStatus;
        this.searchTerm = searchTerm;
        this.sapCdVen = sapCdVen;
        this.username = username;
        this.stUpdate = stUpdate;
        this.stSapUpdate = stSapUpdate;
        this.action = action;
        this.regAdd = regAdd;
        this.add1 = add1;
        this.add2 = add2;
        this.district = district;
        this.zipCode = zipCode;
        this.regNo = regNo;
        this.dunsNo = dunsNo;
        this.compWebLink = compWebLink;
        this.corpPresentLink = corpPresentLink;
        this.corpPresentPdf = corpPresentPdf;
        this.idAssetdiv = idAssetdiv;
        this.idSAssetdiv = idSAssetdiv;
        this.idCertificateType = idCertificateType;
        this.poc = poc;
        this.pocMail = pocMail;
        this.pocContactNo = pocContactNo;
        this.secondPoc = secondPoc;
        this.secondPocMail = secondPocMail;
        this.secondPocContactNo = secondPocContactNo;
        this.mEmpUserByAddBy = mEmpUserByAddBy;
        this.mSublocByIdSubl = mSublocByIdSubl;
        this.mLocByIdLoc = mLocByIdLoc;
        this.mCountryByIdCountry = mCountryByIdCountry;
        this.mBussTypeByIdBussType = mBussTypeByIdBussType;
    }

    public int getIdVen() {
        return idVen;
    }

    public String getNmVen() {
        return nmVen;
    }

    public String getCdVen() {
        return cdVen;
    }

    public String getCtMailid() {
        return ctMailid;
    }

    public String getPassword() {
        return password;
    }

    public String getNmContact1() {
        return nmContact1;
    }

    public String getVenLogo() {
        return venLogo;
    }

    public Integer getOtp() {
        return otp;
    }

    public String getSapStatus() {
        return sapStatus;
    }

    public String getSearchTerm() {
        return searchTerm;
    }

    public String getSapCdVen() {
        return sapCdVen;
    }

    public String getUsername() {
        return username;
    }

    public String getStUpdate() {
        return stUpdate;
    }

    public String getStSapUpdate() {
        return stSapUpdate;
    }

    public String getAction() {
        return action;
    }

    public String getRegAdd() {
        return regAdd;
    }

    public String getAdd1() {
        return add1;
    }

    public String getAdd2() {
        return add2;
    }

    public String getDistrict() {
        return district;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getRegNo() {
        return regNo;
    }

    public String getDunsNo() {
        return dunsNo;
    }

    public String getCompWebLink() {
        return compWebLink;
    }

    public String getCorpPresentLink() {
        return corpPresentLink;
    }

    public String getCorpPresentPdf() {
        return corpPresentPdf;
    }

    public String getIdAssetdiv() {
        return idAssetdiv;
    }

    public String getIdSAssetdiv() {
        return idSAssetdiv;
    }

    public String getIdCertificateType() {
        return idCertificateType;
    }

    public String getPoc() {
        return poc;
    }

    public String getPocMail() {
        return pocMail;
    }

    public Integer getPocContactNo() {
        return pocContactNo;
    }

    public String getSecondPoc() {
        return secondPoc;
    }

    public String getSecondPocMail() {
        return secondPocMail;
    }

    public Integer getSecondPocContactNo() {
        return secondPocContactNo;
    }

    public MEmpUserDto getMEmpUserByAddBy() {
        return mEmpUserByAddBy;
    }

    public MSublocDto getMSublocByIdSubl() {
        return mSublocByIdSubl;
    }

    public MLocDto getMLocByIdLoc() {
        return mLocByIdLoc;
    }

    public MCountryDto getMCountryByIdCountry() {
        return mCountryByIdCountry;
    }

    public MBussType getMBussTypeByIdBussType() {
        return mBussTypeByIdBussType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MVendorDto entity = (MVendorDto) o;
        return Objects.equals(this.idVen, entity.idVen) &&
                Objects.equals(this.nmVen, entity.nmVen) &&
                Objects.equals(this.cdVen, entity.cdVen) &&
                Objects.equals(this.ctMailid, entity.ctMailid) &&
                Objects.equals(this.password, entity.password) &&
                Objects.equals(this.nmContact1, entity.nmContact1) &&
                Objects.equals(this.venLogo, entity.venLogo) &&
                Objects.equals(this.otp, entity.otp) &&
                Objects.equals(this.sapStatus, entity.sapStatus) &&
                Objects.equals(this.searchTerm, entity.searchTerm) &&
                Objects.equals(this.sapCdVen, entity.sapCdVen) &&
                Objects.equals(this.username, entity.username) &&
                Objects.equals(this.stUpdate, entity.stUpdate) &&
                Objects.equals(this.stSapUpdate, entity.stSapUpdate) &&
                Objects.equals(this.action, entity.action) &&
                Objects.equals(this.regAdd, entity.regAdd) &&
                Objects.equals(this.add1, entity.add1) &&
                Objects.equals(this.add2, entity.add2) &&
                Objects.equals(this.district, entity.district) &&
                Objects.equals(this.zipCode, entity.zipCode) &&
                Objects.equals(this.regNo, entity.regNo) &&
                Objects.equals(this.dunsNo, entity.dunsNo) &&
                Objects.equals(this.compWebLink, entity.compWebLink) &&
                Objects.equals(this.corpPresentLink, entity.corpPresentLink) &&
                Objects.equals(this.corpPresentPdf, entity.corpPresentPdf) &&
                Objects.equals(this.idAssetdiv, entity.idAssetdiv) &&
                Objects.equals(this.idSAssetdiv, entity.idSAssetdiv) &&
                Objects.equals(this.idCertificateType, entity.idCertificateType) &&
                Objects.equals(this.poc, entity.poc) &&
                Objects.equals(this.pocMail, entity.pocMail) &&
                Objects.equals(this.pocContactNo, entity.pocContactNo) &&
                Objects.equals(this.secondPoc, entity.secondPoc) &&
                Objects.equals(this.secondPocMail, entity.secondPocMail) &&
                Objects.equals(this.secondPocContactNo, entity.secondPocContactNo) &&
                Objects.equals(this.mEmpUserByAddBy, entity.mEmpUserByAddBy) &&
                Objects.equals(this.mSublocByIdSubl, entity.mSublocByIdSubl) &&
                Objects.equals(this.mLocByIdLoc, entity.mLocByIdLoc) &&
                Objects.equals(this.mCountryByIdCountry, entity.mCountryByIdCountry) &&
                Objects.equals(this.mBussTypeByIdBussType, entity.mBussTypeByIdBussType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idVen, nmVen, cdVen, ctMailid, password, nmContact1, venLogo, otp, sapStatus, searchTerm, sapCdVen, username, stUpdate, stSapUpdate, action, regAdd, add1, add2, district, zipCode, regNo, dunsNo, compWebLink, corpPresentLink, corpPresentPdf, idAssetdiv, idSAssetdiv, idCertificateType, poc, pocMail, pocContactNo, secondPoc, secondPocMail, secondPocContactNo, mEmpUserByAddBy, mSublocByIdSubl, mLocByIdLoc, mCountryByIdCountry, mBussTypeByIdBussType);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "idVen = " + idVen + ", " +
                "nmVen = " + nmVen + ", " +
                "cdVen = " + cdVen + ", " +
                "ctMailid = " + ctMailid + ", " +
                "password = " + password + ", " +
                "nmContact1 = " + nmContact1 + ", " +
                "venLogo = " + venLogo + ", " +
                "otp = " + otp + ", " +
                "sapStatus = " + sapStatus + ", " +
                "searchTerm = " + searchTerm + ", " +
                "sapCdVen = " + sapCdVen + ", " +
                "username = " + username + ", " +
                "stUpdate = " + stUpdate + ", " +
                "stSapUpdate = " + stSapUpdate + ", " +
                "action = " + action + ", " +
                "regAdd = " + regAdd + ", " +
                "add1 = " + add1 + ", " +
                "add2 = " + add2 + ", " +
                "district = " + district + ", " +
                "zipCode = " + zipCode + ", " +
                "regNo = " + regNo + ", " +
                "dunsNo = " + dunsNo + ", " +
                "compWebLink = " + compWebLink + ", " +
                "corpPresentLink = " + corpPresentLink + ", " +
                "corpPresentPdf = " + corpPresentPdf + ", " +
                "idAssetdiv = " + idAssetdiv + ", " +
                "idSAssetdiv = " + idSAssetdiv + ", " +
                "idCertificateType = " + idCertificateType + ", " +
                "poc = " + poc + ", " +
                "pocMail = " + pocMail + ", " +
                "pocContactNo = " + pocContactNo + ", " +
                "secondPoc = " + secondPoc + ", " +
                "secondPocMail = " + secondPocMail + ", " +
                "secondPocContactNo = " + secondPocContactNo + ", " +
                "mEmpUserByAddBy = " + mEmpUserByAddBy + ", " +
                "mSublocByIdSubl = " + mSublocByIdSubl + ", " +
                "mLocByIdLoc = " + mLocByIdLoc + ", " +
                "mCountryByIdCountry = " + mCountryByIdCountry + ", " +
                "mBussTypeByIdBussType = " + mBussTypeByIdBussType + ")";
    }
}