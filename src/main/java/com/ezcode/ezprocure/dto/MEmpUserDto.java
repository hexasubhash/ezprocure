package com.ezcode.ezprocure.dto;

import com.ezcode.ezprocure.models.MFloor;
import com.ezcode.ezprocure.models.MLoc;
import com.ezcode.ezprocure.models.MSubloc;
import com.ezcode.ezprocure.models.MVendor;

import java.io.Serializable;
import java.util.Collection;
import java.util.Objects;

/**
 * A DTO for the {@link com.ezcode.ezprocure.models.MEmpUser} entity
 */
public class MEmpUserDto implements Serializable {
    private final int idEmpUser;
    private final String cdEmp;
    private final String nmEmp;
    private final String idEmp;
    private final String contNo;
    private final Integer idDesign;
    private final Integer idDept;
    private final String statusEmp;
    private final String repoMngr;
    private final String nmStrg;
    private final String idWdesk;
    private final String idDport;
    private final String nmExt;
    private final String empType;
    private final Integer idCc;
    private final String empImage;
    private final Integer idSFunction;
    private final Integer idBu;
    private final Integer functionHead;
    private final String adrepoMngr;
    private final MCompanyDivisionDto mCompanyDivisionByIdDiv;
    private final MLoc mLocByIdLoc;
    private final MSubloc mSublocByIdSloc;
    private final MBuildingDto mBuildingByIdBuilding;
    private final MFloor mFloorByIdFlr;
    private final Collection<MVendor> mVendorsByIdEmpUser;

    public MEmpUserDto(int idEmpUser, String cdEmp, String nmEmp, String idEmp, String contNo, Integer idDesign, Integer idDept, String statusEmp, String repoMngr, String nmStrg, String idWdesk, String idDport, String nmExt, String empType, Integer idCc, String empImage, Integer idSFunction, Integer idBu, Integer functionHead, String adrepoMngr, MCompanyDivisionDto mCompanyDivisionByIdDiv, MLoc mLocByIdLoc, MSubloc mSublocByIdSloc, MBuildingDto mBuildingByIdBuilding, MFloor mFloorByIdFlr, Collection<MVendor> mVendorsByIdEmpUser) {
        this.idEmpUser = idEmpUser;
        this.cdEmp = cdEmp;
        this.nmEmp = nmEmp;
        this.idEmp = idEmp;
        this.contNo = contNo;
        this.idDesign = idDesign;
        this.idDept = idDept;
        this.statusEmp = statusEmp;
        this.repoMngr = repoMngr;
        this.nmStrg = nmStrg;
        this.idWdesk = idWdesk;
        this.idDport = idDport;
        this.nmExt = nmExt;
        this.empType = empType;
        this.idCc = idCc;
        this.empImage = empImage;
        this.idSFunction = idSFunction;
        this.idBu = idBu;
        this.functionHead = functionHead;
        this.adrepoMngr = adrepoMngr;
        this.mCompanyDivisionByIdDiv = mCompanyDivisionByIdDiv;
        this.mLocByIdLoc = mLocByIdLoc;
        this.mSublocByIdSloc = mSublocByIdSloc;
        this.mBuildingByIdBuilding = mBuildingByIdBuilding;
        this.mFloorByIdFlr = mFloorByIdFlr;
        this.mVendorsByIdEmpUser = mVendorsByIdEmpUser;
    }

    public int getIdEmpUser() {
        return idEmpUser;
    }

    public String getCdEmp() {
        return cdEmp;
    }

    public String getNmEmp() {
        return nmEmp;
    }

    public String getIdEmp() {
        return idEmp;
    }

    public String getContNo() {
        return contNo;
    }

    public Integer getIdDesign() {
        return idDesign;
    }

    public Integer getIdDept() {
        return idDept;
    }

    public String getStatusEmp() {
        return statusEmp;
    }

    public String getRepoMngr() {
        return repoMngr;
    }

    public String getNmStrg() {
        return nmStrg;
    }

    public String getIdWdesk() {
        return idWdesk;
    }

    public String getIdDport() {
        return idDport;
    }

    public String getNmExt() {
        return nmExt;
    }

    public String getEmpType() {
        return empType;
    }

    public Integer getIdCc() {
        return idCc;
    }

    public String getEmpImage() {
        return empImage;
    }

    public Integer getIdSFunction() {
        return idSFunction;
    }

    public Integer getIdBu() {
        return idBu;
    }

    public Integer getFunctionHead() {
        return functionHead;
    }

    public String getAdrepoMngr() {
        return adrepoMngr;
    }

    public MCompanyDivisionDto getMCompanyDivisionByIdDiv() {
        return mCompanyDivisionByIdDiv;
    }

    public MLoc getMLocByIdLoc() {
        return mLocByIdLoc;
    }

    public MSubloc getMSublocByIdSloc() {
        return mSublocByIdSloc;
    }

    public MBuildingDto getMBuildingByIdBuilding() {
        return mBuildingByIdBuilding;
    }

    public MFloor getMFloorByIdFlr() {
        return mFloorByIdFlr;
    }

    public Collection<MVendor> getMVendorsByIdEmpUser() {
        return mVendorsByIdEmpUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MEmpUserDto entity = (MEmpUserDto) o;
        return Objects.equals(this.idEmpUser, entity.idEmpUser) &&
                Objects.equals(this.cdEmp, entity.cdEmp) &&
                Objects.equals(this.nmEmp, entity.nmEmp) &&
                Objects.equals(this.idEmp, entity.idEmp) &&
                Objects.equals(this.contNo, entity.contNo) &&
                Objects.equals(this.idDesign, entity.idDesign) &&
                Objects.equals(this.idDept, entity.idDept) &&
                Objects.equals(this.statusEmp, entity.statusEmp) &&
                Objects.equals(this.repoMngr, entity.repoMngr) &&
                Objects.equals(this.nmStrg, entity.nmStrg) &&
                Objects.equals(this.idWdesk, entity.idWdesk) &&
                Objects.equals(this.idDport, entity.idDport) &&
                Objects.equals(this.nmExt, entity.nmExt) &&
                Objects.equals(this.empType, entity.empType) &&
                Objects.equals(this.idCc, entity.idCc) &&
                Objects.equals(this.empImage, entity.empImage) &&
                Objects.equals(this.idSFunction, entity.idSFunction) &&
                Objects.equals(this.idBu, entity.idBu) &&
                Objects.equals(this.functionHead, entity.functionHead) &&
                Objects.equals(this.adrepoMngr, entity.adrepoMngr) &&
                Objects.equals(this.mCompanyDivisionByIdDiv, entity.mCompanyDivisionByIdDiv) &&
                Objects.equals(this.mLocByIdLoc, entity.mLocByIdLoc) &&
                Objects.equals(this.mSublocByIdSloc, entity.mSublocByIdSloc) &&
                Objects.equals(this.mBuildingByIdBuilding, entity.mBuildingByIdBuilding) &&
                Objects.equals(this.mFloorByIdFlr, entity.mFloorByIdFlr) &&
                Objects.equals(this.mVendorsByIdEmpUser, entity.mVendorsByIdEmpUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEmpUser, cdEmp, nmEmp, idEmp, contNo, idDesign, idDept, statusEmp, repoMngr, nmStrg, idWdesk, idDport, nmExt, empType, idCc, empImage, idSFunction, idBu, functionHead, adrepoMngr, mCompanyDivisionByIdDiv, mLocByIdLoc, mSublocByIdSloc, mBuildingByIdBuilding, mFloorByIdFlr, mVendorsByIdEmpUser);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "idEmpUser = " + idEmpUser + ", " +
                "cdEmp = " + cdEmp + ", " +
                "nmEmp = " + nmEmp + ", " +
                "idEmp = " + idEmp + ", " +
                "contNo = " + contNo + ", " +
                "idDesign = " + idDesign + ", " +
                "idDept = " + idDept + ", " +
                "statusEmp = " + statusEmp + ", " +
                "repoMngr = " + repoMngr + ", " +
                "nmStrg = " + nmStrg + ", " +
                "idWdesk = " + idWdesk + ", " +
                "idDport = " + idDport + ", " +
                "nmExt = " + nmExt + ", " +
                "empType = " + empType + ", " +
                "idCc = " + idCc + ", " +
                "empImage = " + empImage + ", " +
                "idSFunction = " + idSFunction + ", " +
                "idBu = " + idBu + ", " +
                "functionHead = " + functionHead + ", " +
                "adrepoMngr = " + adrepoMngr + ", " +
                "mCompanyDivisionByIdDiv = " + mCompanyDivisionByIdDiv + ", " +
                "mLocByIdLoc = " + mLocByIdLoc + ", " +
                "mSublocByIdSloc = " + mSublocByIdSloc + ", " +
                "mBuildingByIdBuilding = " + mBuildingByIdBuilding + ", " +
                "mFloorByIdFlr = " + mFloorByIdFlr + ", " +
                "mVendorsByIdEmpUser = " + mVendorsByIdEmpUser + ")";
    }
}