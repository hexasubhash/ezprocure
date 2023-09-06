package com.ezcode.ezprocure.models;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "M_Emp_User")
public class MEmpUser {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_emp_user", nullable = false)
    private int idEmpUser;
    @Basic
    @Column(name = "cd_emp", nullable = true, length = 50)
    private String cdEmp;
    @Basic
    @Column(name = "nm_emp", nullable = true, length = 50)
    private String nmEmp;
    @Basic
    @Column(name = "id_emp", nullable = true, length = 50)
    private String idEmp;
    @Basic
    @Column(name = "cont_no", nullable = true, length = 50)
    private String contNo;
    @Basic
    @Column(name = "id_design", nullable = true)
    private Integer idDesign;
    @Basic
    @Column(name = "id_dept", nullable = true)
    private Integer idDept;
    /*@Basic
    @Column(name = "id_div", nullable = true)
    private Integer idDiv;*/
    @Basic
    @Column(name = "status_emp", nullable = true, length = 50)
    private String statusEmp;
    @Basic
    @Column(name = "repo_mngr", nullable = true, length = 50)
    private String repoMngr;
    /*@Basic
    @Column(name = "id_loc", nullable = true)
    private Integer idLoc;*/
    /*@Basic
    @Column(name = "id_sloc", nullable = true)
    private Integer idSloc;*/
    /*@Basic
    @Column(name = "id_building", nullable = true)
    private Integer idBuilding;*/
    @Basic
    @Column(name = "nm_strg", nullable = true, length = 10)
    private String nmStrg;
    @Basic
    @Column(name = "id_wdesk", nullable = true, length = 10)
    private String idWdesk;
    @Basic
    @Column(name = "id_dport", nullable = true, length = 10)
    private String idDport;
    @Basic
    @Column(name = "nm_ext", nullable = true, length = 10)
    private String nmExt;
    @Basic
    @Column(name = "emp_type", nullable = true, length = 50)
    private String empType;
    @Basic
    @Column(name = "id_cc", nullable = true)
    private Integer idCc;
    @Basic
    @Column(name = "emp_image", nullable = true, length = 2147483647)
    private String empImage;
    /*@Basic
    @Column(name = "id_flr", nullable = true)
    private Integer idFlr;*/
    @Basic
    @Column(name = "id_s_function", nullable = true)
    private Integer idSFunction;
    @Basic
    @Column(name = "id_bu", nullable = true)
    private Integer idBu;
    @Basic
    @Column(name = "Function_Head", nullable = true)
    private Integer functionHead;
    @Basic
    @Column(name = "adrepo_mngr", nullable = true, length = 2147483647)
    private String adrepoMngr;
    @ManyToOne
    @JoinColumn(name = "id_div", referencedColumnName = "id_div")
    private MCompanyDivision mCompanyDivisionByIdDiv;
    @ManyToOne
    @JoinColumn(name = "id_loc", referencedColumnName = "id_loc")
    private MLoc mLocByIdLoc;
    @ManyToOne
    @JoinColumn(name = "id_sloc", referencedColumnName = "id_sloc")
    private MSubloc mSublocByIdSloc;
    @ManyToOne
    @JoinColumn(name = "id_building", referencedColumnName = "id_building")
    private MBuilding mBuildingByIdBuilding;
    @ManyToOne
    @JoinColumn(name = "id_flr", referencedColumnName = "id_flr")
    private MFloor mFloorByIdFlr;
   /* @OneToMany(mappedBy = "mEmpUserByIdEmpUser")
    private Collection<MUserLogin> mUserLoginsByIdEmpUser;*/
    @OneToMany(mappedBy = "mEmpUserByAddBy")
    private Collection<MVendor> mVendorsByIdEmpUser;

    public int getIdEmpUser() {
        return idEmpUser;
    }

    public void setIdEmpUser(int idEmpUser) {
        this.idEmpUser = idEmpUser;
    }

    public String getCdEmp() {
        return cdEmp;
    }

    public void setCdEmp(String cdEmp) {
        this.cdEmp = cdEmp;
    }

    public String getNmEmp() {
        return nmEmp;
    }

    public void setNmEmp(String nmEmp) {
        this.nmEmp = nmEmp;
    }

    public String getIdEmp() {
        return idEmp;
    }

    public void setIdEmp(String idEmp) {
        this.idEmp = idEmp;
    }

    public String getContNo() {
        return contNo;
    }

    public void setContNo(String contNo) {
        this.contNo = contNo;
    }

    public Integer getIdDesign() {
        return idDesign;
    }

    public void setIdDesign(Integer idDesign) {
        this.idDesign = idDesign;
    }

    public Integer getIdDept() {
        return idDept;
    }

    public void setIdDept(Integer idDept) {
        this.idDept = idDept;
    }

   /* public Integer getIdDiv() {
        return idDiv;
    }

    public void setIdDiv(Integer idDiv) {
        this.idDiv = idDiv;
    }*/

    public String getStatusEmp() {
        return statusEmp;
    }

    public void setStatusEmp(String statusEmp) {
        this.statusEmp = statusEmp;
    }

    public String getRepoMngr() {
        return repoMngr;
    }

    public void setRepoMngr(String repoMngr) {
        this.repoMngr = repoMngr;
    }

    /*public Integer getIdLoc() {
        return idLoc;
    }

    public void setIdLoc(Integer idLoc) {
        this.idLoc = idLoc;
    }
*/
    /*public Integer getIdSloc() {
        return idSloc;
    }

    public void setIdSloc(Integer idSloc) {
        this.idSloc = idSloc;
    }
*/
    /*public Integer getIdBuilding() {
        return idBuilding;
    }

    public void setIdBuilding(Integer idBuilding) {
        this.idBuilding = idBuilding;
    }
*/
    public String getNmStrg() {
        return nmStrg;
    }

    public void setNmStrg(String nmStrg) {
        this.nmStrg = nmStrg;
    }

    public String getIdWdesk() {
        return idWdesk;
    }

    public void setIdWdesk(String idWdesk) {
        this.idWdesk = idWdesk;
    }

    public String getIdDport() {
        return idDport;
    }

    public void setIdDport(String idDport) {
        this.idDport = idDport;
    }

    public String getNmExt() {
        return nmExt;
    }

    public void setNmExt(String nmExt) {
        this.nmExt = nmExt;
    }

    public String getEmpType() {
        return empType;
    }

    public void setEmpType(String empType) {
        this.empType = empType;
    }

    public Integer getIdCc() {
        return idCc;
    }

    public void setIdCc(Integer idCc) {
        this.idCc = idCc;
    }

    public String getEmpImage() {
        return empImage;
    }

    public void setEmpImage(String empImage) {
        this.empImage = empImage;
    }

    /*public Integer getIdFlr() {
        return idFlr;
    }

    public void setIdFlr(Integer idFlr) {
        this.idFlr = idFlr;
    }*/

    public Integer getIdSFunction() {
        return idSFunction;
    }

    public void setIdSFunction(Integer idSFunction) {
        this.idSFunction = idSFunction;
    }

    public Integer getIdBu() {
        return idBu;
    }

    public void setIdBu(Integer idBu) {
        this.idBu = idBu;
    }

    public Integer getFunctionHead() {
        return functionHead;
    }

    public void setFunctionHead(Integer functionHead) {
        this.functionHead = functionHead;
    }

    public String getAdrepoMngr() {
        return adrepoMngr;
    }

    public void setAdrepoMngr(String adrepoMngr) {
        this.adrepoMngr = adrepoMngr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MEmpUser mEmpUser = (MEmpUser) o;
        return idEmpUser == mEmpUser.idEmpUser && Objects.equals(cdEmp, mEmpUser.cdEmp) && Objects.equals(nmEmp, mEmpUser.nmEmp) && Objects.equals(idEmp, mEmpUser.idEmp) && Objects.equals(contNo, mEmpUser.contNo) && Objects.equals(idDesign, mEmpUser.idDesign) && Objects.equals(idDept, mEmpUser.idDept) && Objects.equals(statusEmp, mEmpUser.statusEmp) && Objects.equals(repoMngr, mEmpUser.repoMngr) && Objects.equals(nmStrg, mEmpUser.nmStrg) && Objects.equals(idWdesk, mEmpUser.idWdesk) && Objects.equals(idDport, mEmpUser.idDport) && Objects.equals(nmExt, mEmpUser.nmExt) && Objects.equals(empType, mEmpUser.empType) && Objects.equals(idCc, mEmpUser.idCc) && Objects.equals(empImage, mEmpUser.empImage) && Objects.equals(idSFunction, mEmpUser.idSFunction) && Objects.equals(idBu, mEmpUser.idBu) && Objects.equals(functionHead, mEmpUser.functionHead) && Objects.equals(adrepoMngr, mEmpUser.adrepoMngr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEmpUser, cdEmp, nmEmp, idEmp, contNo, idDesign, idDept, statusEmp, repoMngr, nmStrg, idWdesk, idDport, nmExt, empType, idCc, empImage, idSFunction, idBu, functionHead, adrepoMngr);
    }

    public MCompanyDivision getmCompanyDivisionByIdDiv() {
        return mCompanyDivisionByIdDiv;
    }

    public void setmCompanyDivisionByIdDiv(MCompanyDivision mCompanyDivisionByIdDiv) {
        this.mCompanyDivisionByIdDiv = mCompanyDivisionByIdDiv;
    }

    public MLoc getmLocByIdLoc() {
        return mLocByIdLoc;
    }

    public void setmLocByIdLoc(MLoc mLocByIdLoc) {
        this.mLocByIdLoc = mLocByIdLoc;
    }

    public MSubloc getmSublocByIdSloc() {
        return mSublocByIdSloc;
    }

    public void setmSublocByIdSloc(MSubloc mSublocByIdSloc) {
        this.mSublocByIdSloc = mSublocByIdSloc;
    }

    public MBuilding getmBuildingByIdBuilding() {
        return mBuildingByIdBuilding;
    }

    public void setmBuildingByIdBuilding(MBuilding mBuildingByIdBuilding) {
        this.mBuildingByIdBuilding = mBuildingByIdBuilding;
    }

    public MFloor getmFloorByIdFlr() {
        return mFloorByIdFlr;
    }

    public void setmFloorByIdFlr(MFloor mFloorByIdFlr) {
        this.mFloorByIdFlr = mFloorByIdFlr;
    }

   /* public Collection<MUserLogin> getmUserLoginsByIdEmpUser() {
        return mUserLoginsByIdEmpUser;
    }

    public void setmUserLoginsByIdEmpUser(Collection<MUserLogin> mUserLoginsByIdEmpUser) {
        this.mUserLoginsByIdEmpUser = mUserLoginsByIdEmpUser;
    }*/

    public Collection<MVendor> getmVendorsByIdEmpUser() {
        return mVendorsByIdEmpUser;
    }

    public void setmVendorsByIdEmpUser(Collection<MVendor> mVendorsByIdEmpUser) {
        this.mVendorsByIdEmpUser = mVendorsByIdEmpUser;
    }
}
