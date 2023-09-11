package com.ezcode.ezprocure.models;

import javax.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "M_Vendor")
public class MVendor {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_ven", nullable = false)
    private int idVen;
    @Basic
    @Column(name = "nm_ven", nullable = true, length = 2147483647)
    private String nmVen;
    @Basic
    @Column(name = "cd_ven", nullable = true, length = 2147483647)
    private String cdVen;
    @Basic
    @Column(name = "ct_mailid", nullable = true, length = 2147483647)
    private String ctMailid;
    @Basic
    @Column(name = "password", nullable = true, length = 2147483647)
    private String password;
    @Basic
    @Column(name = "nm_contact1", nullable = true, length = 2147483647)
    private String nmContact1;
    @Basic
    @Column(name = "ven_logo", nullable = true, length = 2147483647)
    private String venLogo;
    @Basic
    @Column(name = "otp", nullable = true)
    private Integer otp;
    @Basic
    @Column(name = "sap_status", nullable = true, length = 50)
    private String sapStatus;
    @Basic
    @Column(name = "search_term", nullable = true, length = 2147483647)
    private String searchTerm;
    @Basic
    @Column(name = "sap_cd_ven", nullable = true, length = 2147483647)
    private String sapCdVen;
    @Basic
    @Column(name = "username", nullable = true, length = 2147483647)
    private String username;
   /* @Basic
    @Column(name = "id_subl", nullable = true)
    private Integer idSubl;*/
    @Basic
    @Column(name = "st_update", nullable = true, length = 50)
    private String stUpdate;
    @Basic
    @Column(name = "st_sap_update", nullable = true, length = 50)
    private String stSapUpdate;
    @Basic
    @Column(name = "action", nullable = true, length = 50)
    private String action;
    @Basic
    @Column(name = "reg_add", nullable = true, length = 2147483647)
    private String regAdd;
    @Basic
    @Column(name = "add1", nullable = true, length = 2147483647)
    private String add1;
    @Basic
    @Column(name = "add2", nullable = true, length = 2147483647)
    private String add2;
    /*@Basic
    @Column(name = "id_country", nullable = true)
    private Integer idCountry;*/
    @Basic
    @Column(name = "district", nullable = true, length = 2147483647)
    private String district;
    @Basic
    @Column(name = "zip_code", nullable = true, length = 2147483647)
    private String zipCode;
   /* @Basic
    @Column(name = "id_buss_type", nullable = true)
    private Integer idBussType;*/
    @Basic
    @Column(name = "reg_no", nullable = true, length = 2147483647)
    private String regNo;
    @Basic
    @Column(name = "duns_no", nullable = true, length = 2147483647)
    private String dunsNo;
    @Basic
    @Column(name = "comp_web_link", nullable = true, length = 2147483647)
    private String compWebLink;
    @Basic
    @Column(name = "corp_present_link", nullable = true, length = 2147483647)
    private String corpPresentLink;
    @Basic
    @Column(name = "corp_present_pdf", nullable = true, length = 2147483647)
    private String corpPresentPdf;
    @Basic
    @Column(name = "id_assetdiv", nullable = true, length = 2147483647)
    private String idAssetdiv;
    @Basic
    @Column(name = "id_s_assetdiv", nullable = true, length = 2147483647)
    private String idSAssetdiv;
    @Basic
    @Column(name = "id_certificate_type", nullable = true, length = 2147483647)
    private String idCertificateType;
    @Basic
    @Column(name = "poc", nullable = true, length = 2147483647)
    private String poc;
    @Basic
    @Column(name = "poc_mail", nullable = true, length = 2147483647)
    private String pocMail;
    @Basic
    @Column(name = "poc_contact_no", nullable = true)
    private Integer pocContactNo;
    @Basic
    @Column(name = "second_poc", nullable = true, length = 2147483647)
    private String secondPoc;
    @Basic
    @Column(name = "second_poc_mail", nullable = true, length = 2147483647)
    private String secondPocMail;
    @Basic
    @Column(name = "second_poc_contact_no", nullable = true)
    private Integer secondPocContactNo;
    @ManyToOne
    @JoinColumn(name = "add_by", referencedColumnName = "id_emp_user")
    private MEmpUser mEmpUserByAddBy;
    @ManyToOne
    @JoinColumn(name = "id_subl", referencedColumnName = "id_sloc")
    private MSubloc mSublocByIdSubl;
    @ManyToOne
    @JoinColumn(name = "id_loc", referencedColumnName = "id_loc")
    private MLoc mLocByIdLoc;
    @ManyToOne
    @JoinColumn(name = "id_country", referencedColumnName = "id_country")
    private MCountry mCountryByIdCountry;
    @ManyToOne
    @JoinColumn(name = "id_buss_type", referencedColumnName = "id_buss_type")
    private MBussType mBussTypeByIdBussType;

    public int getIdVen() {
        return idVen;
    }

    public void setIdVen(int idVen) {
        this.idVen = idVen;
    }

    public String getNmVen() {
        return nmVen;
    }

    public void setNmVen(String nmVen) {
        this.nmVen = nmVen;
    }

    public String getCdVen() {
        return cdVen;
    }

    public void setCdVen(String cdVen) {
        this.cdVen = cdVen;
    }

    public String getCtMailid() {
        return ctMailid;
    }

    public void setCtMailid(String ctMailid) {
        this.ctMailid = ctMailid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNmContact1() {
        return nmContact1;
    }

    public void setNmContact1(String nmContact1) {
        this.nmContact1 = nmContact1;
    }

    public String getVenLogo() {
        return venLogo;
    }

    public void setVenLogo(String venLogo) {
        this.venLogo = venLogo;
    }

    public Integer getOtp() {
        return otp;
    }

    public void setOtp(Integer otp) {
        this.otp = otp;
    }

    /*public Integer getAddBy() {
        return addBy;
    }

    public void setAddBy(Integer addBy) {
        this.addBy = addBy;
    }*/

    public String getSapStatus() {
        return sapStatus;
    }

    public void setSapStatus(String sapStatus) {
        this.sapStatus = sapStatus;
    }

    public String getSearchTerm() {
        return searchTerm;
    }

    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }

    public String getSapCdVen() {
        return sapCdVen;
    }

    public void setSapCdVen(String sapCdVen) {
        this.sapCdVen = sapCdVen;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

   /* public Integer getIdSubl() {
        return idSubl;
    }

    public void setIdSubl(Integer idSubl) {
        this.idSubl = idSubl;
    }*/

    /*public Integer getIdLoc() {
        return idLoc;
    }

    public void setIdLoc(Integer idLoc) {
        this.idLoc = idLoc;
    }*/

    public String getStUpdate() {
        return stUpdate;
    }

    public void setStUpdate(String stUpdate) {
        this.stUpdate = stUpdate;
    }

    public String getStSapUpdate() {
        return stSapUpdate;
    }

    public void setStSapUpdate(String stSapUpdate) {
        this.stSapUpdate = stSapUpdate;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getRegAdd() {
        return regAdd;
    }

    public void setRegAdd(String regAdd) {
        this.regAdd = regAdd;
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

    /*public Integer getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(Integer idCountry) {
        this.idCountry = idCountry;
    }*/

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /*public Integer getIdBussType() {
        return idBussType;
    }

    public void setIdBussType(Integer idBussType) {
        this.idBussType = idBussType;
    }*/

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getDunsNo() {
        return dunsNo;
    }

    public void setDunsNo(String dunsNo) {
        this.dunsNo = dunsNo;
    }

    public String getCompWebLink() {
        return compWebLink;
    }

    public void setCompWebLink(String compWebLink) {
        this.compWebLink = compWebLink;
    }

    public String getCorpPresentLink() {
        return corpPresentLink;
    }

    public void setCorpPresentLink(String corpPresentLink) {
        this.corpPresentLink = corpPresentLink;
    }

    public String getCorpPresentPdf() {
        return corpPresentPdf;
    }

    public void setCorpPresentPdf(String corpPresentPdf) {
        this.corpPresentPdf = corpPresentPdf;
    }

    public String getIdAssetdiv() {
        return idAssetdiv;
    }

    public void setIdAssetdiv(String idAssetdiv) {
        this.idAssetdiv = idAssetdiv;
    }

    public String getIdSAssetdiv() {
        return idSAssetdiv;
    }

    public void setIdSAssetdiv(String idSAssetdiv) {
        this.idSAssetdiv = idSAssetdiv;
    }

    public String getIdCertificateType() {
        return idCertificateType;
    }

    public void setIdCertificateType(String idCertificateType) {
        this.idCertificateType = idCertificateType;
    }

    public String getPoc() {
        return poc;
    }

    public void setPoc(String poc) {
        this.poc = poc;
    }

    public String getPocMail() {
        return pocMail;
    }

    public void setPocMail(String pocMail) {
        this.pocMail = pocMail;
    }

    public Integer getPocContactNo() {
        return pocContactNo;
    }

    public void setPocContactNo(Integer pocContactNo) {
        this.pocContactNo = pocContactNo;
    }

    public String getSecondPoc() {
        return secondPoc;
    }

    public void setSecondPoc(String secondPoc) {
        this.secondPoc = secondPoc;
    }

    public String getSecondPocMail() {
        return secondPocMail;
    }

    public void setSecondPocMail(String secondPocMail) {
        this.secondPocMail = secondPocMail;
    }

    public Integer getSecondPocContactNo() {
        return secondPocContactNo;
    }

    public void setSecondPocContactNo(Integer secondPocContactNo) {
        this.secondPocContactNo = secondPocContactNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MVendor mVendor = (MVendor) o;
        return idVen == mVendor.idVen && Objects.equals(nmVen, mVendor.nmVen) && Objects.equals(cdVen, mVendor.cdVen) && Objects.equals(ctMailid, mVendor.ctMailid) && Objects.equals(password, mVendor.password) && Objects.equals(nmContact1, mVendor.nmContact1) && Objects.equals(venLogo, mVendor.venLogo) && Objects.equals(otp, mVendor.otp) && Objects.equals(sapStatus, mVendor.sapStatus) && Objects.equals(searchTerm, mVendor.searchTerm) && Objects.equals(sapCdVen, mVendor.sapCdVen) && Objects.equals(username, mVendor.username) && Objects.equals(stUpdate, mVendor.stUpdate) && Objects.equals(stSapUpdate, mVendor.stSapUpdate) && Objects.equals(action, mVendor.action) && Objects.equals(regAdd, mVendor.regAdd) && Objects.equals(add1, mVendor.add1) && Objects.equals(add2, mVendor.add2)  && Objects.equals(district, mVendor.district) && Objects.equals(zipCode, mVendor.zipCode) && Objects.equals(regNo, mVendor.regNo) && Objects.equals(dunsNo, mVendor.dunsNo) && Objects.equals(compWebLink, mVendor.compWebLink) && Objects.equals(corpPresentLink, mVendor.corpPresentLink) && Objects.equals(corpPresentPdf, mVendor.corpPresentPdf) && Objects.equals(idAssetdiv, mVendor.idAssetdiv) && Objects.equals(idSAssetdiv, mVendor.idSAssetdiv) && Objects.equals(idCertificateType, mVendor.idCertificateType) && Objects.equals(poc, mVendor.poc) && Objects.equals(pocMail, mVendor.pocMail) && Objects.equals(pocContactNo, mVendor.pocContactNo) && Objects.equals(secondPoc, mVendor.secondPoc) && Objects.equals(secondPocMail, mVendor.secondPocMail) && Objects.equals(secondPocContactNo, mVendor.secondPocContactNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idVen, nmVen, cdVen, ctMailid, password, nmContact1, venLogo, otp, sapStatus, searchTerm, sapCdVen, username, stUpdate,stSapUpdate, action, regAdd, add1, add2, district, zipCode, regNo, dunsNo, compWebLink, corpPresentLink, corpPresentPdf, idAssetdiv, idSAssetdiv, idCertificateType, poc, pocMail, pocContactNo, secondPoc, secondPocMail, secondPocContactNo);
    }

    public MEmpUser getmEmpUserByAddBy() {
        return mEmpUserByAddBy;
    }

    public void setmEmpUserByAddBy(MEmpUser mEmpUserByAddBy) {
        this.mEmpUserByAddBy = mEmpUserByAddBy;
    }

    public MSubloc getmSublocByIdSubl() {
        return mSublocByIdSubl;
    }

    public void setmSublocByIdSubl(MSubloc mSublocByIdSubl) {
        this.mSublocByIdSubl = mSublocByIdSubl;
    }

    public MLoc getmLocByIdLoc() {
        return mLocByIdLoc;
    }

    public void setmLocByIdLoc(MLoc mLocByIdLoc) {
        this.mLocByIdLoc = mLocByIdLoc;
    }

    public MCountry getmCountryByIdCountry() {
        return mCountryByIdCountry;
    }

    public void setmCountryByIdCountry(MCountry mCountryByIdCountry) {
        this.mCountryByIdCountry = mCountryByIdCountry;
    }

    public MBussType getmBussTypeByIdBussType() {
        return mBussTypeByIdBussType;
    }

    public void setmBussTypeByIdBussType(MBussType mBussTypeByIdBussType) {
        this.mBussTypeByIdBussType = mBussTypeByIdBussType;
    }
}
