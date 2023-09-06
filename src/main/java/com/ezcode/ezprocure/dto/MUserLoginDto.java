package com.ezcode.ezprocure.dto;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

/**
 * A DTO for the {@link com.ezcode.ezprocure.models.MUserLogin} entity
 */
public class MUserLoginDto implements Serializable {
    private final int idLogUser;
    private final Integer idEmpUser;
    private final String nmLogin;
    private final String idEmail;
    private final String pwd;
    private final String typeUser;
    private final String statusUser;
    private final String typAsst;
    private final String idLoc;
    private final String idSubl;
    private final String idFlr;
    private final Integer idDiv;
    private final Date dtDisable;
    private final Integer idUsertype;
    private final String idDept;
    private final String idBuilding;
    private final Integer statusLogout;

    public MUserLoginDto(int idLogUser, Integer idEmpUser, String nmLogin, String idEmail, String pwd, String typeUser, String statusUser, String typAsst, String idLoc, String idSubl, String idFlr, Integer idDiv, Date dtDisable, Integer idUsertype, String idDept, String idBuilding, Integer statusLogout) {
        this.idLogUser = idLogUser;
        this.idEmpUser = idEmpUser;
        this.nmLogin = nmLogin;
        this.idEmail = idEmail;
        this.pwd = pwd;
        this.typeUser = typeUser;
        this.statusUser = statusUser;
        this.typAsst = typAsst;
        this.idLoc = idLoc;
        this.idSubl = idSubl;
        this.idFlr = idFlr;
        this.idDiv = idDiv;
        this.dtDisable = dtDisable;
        this.idUsertype = idUsertype;
        this.idDept = idDept;
        this.idBuilding = idBuilding;
        this.statusLogout = statusLogout;
    }

    public int getIdLogUser() {
        return idLogUser;
    }

    public Integer getIdEmpUser() {
        return idEmpUser;
    }

    public String getNmLogin() {
        return nmLogin;
    }

    public String getIdEmail() {
        return idEmail;
    }

    public String getPwd() {
        return pwd;
    }

    public String getTypeUser() {
        return typeUser;
    }

    public String getStatusUser() {
        return statusUser;
    }

    public String getTypAsst() {
        return typAsst;
    }

    public String getIdLoc() {
        return idLoc;
    }

    public String getIdSubl() {
        return idSubl;
    }

    public String getIdFlr() {
        return idFlr;
    }

    public Integer getIdDiv() {
        return idDiv;
    }

    public Date getDtDisable() {
        return dtDisable;
    }

    public Integer getIdUsertype() {
        return idUsertype;
    }

    public String getIdDept() {
        return idDept;
    }

    public String getIdBuilding() {
        return idBuilding;
    }

    public Integer getStatusLogout() {
        return statusLogout;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MUserLoginDto entity = (MUserLoginDto) o;
        return Objects.equals(this.idLogUser, entity.idLogUser) &&
                Objects.equals(this.idEmpUser, entity.idEmpUser) &&
                Objects.equals(this.nmLogin, entity.nmLogin) &&
                Objects.equals(this.idEmail, entity.idEmail) &&
                Objects.equals(this.pwd, entity.pwd) &&
                Objects.equals(this.typeUser, entity.typeUser) &&
                Objects.equals(this.statusUser, entity.statusUser) &&
                Objects.equals(this.typAsst, entity.typAsst) &&
                Objects.equals(this.idLoc, entity.idLoc) &&
                Objects.equals(this.idSubl, entity.idSubl) &&
                Objects.equals(this.idFlr, entity.idFlr) &&
                Objects.equals(this.idDiv, entity.idDiv) &&
                Objects.equals(this.dtDisable, entity.dtDisable) &&
                Objects.equals(this.idUsertype, entity.idUsertype) &&
                Objects.equals(this.idDept, entity.idDept) &&
                Objects.equals(this.idBuilding, entity.idBuilding) &&
                Objects.equals(this.statusLogout, entity.statusLogout);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idLogUser, idEmpUser, nmLogin, idEmail, pwd, typeUser, statusUser, typAsst, idLoc, idSubl, idFlr, idDiv, dtDisable, idUsertype, idDept, idBuilding, statusLogout);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "idLogUser = " + idLogUser + ", " +
                "idEmpUser = " + idEmpUser + ", " +
                "nmLogin = " + nmLogin + ", " +
                "idEmail = " + idEmail + ", " +
                "pwd = " + pwd + ", " +
                "typeUser = " + typeUser + ", " +
                "statusUser = " + statusUser + ", " +
                "typAsst = " + typAsst + ", " +
                "idLoc = " + idLoc + ", " +
                "idSubl = " + idSubl + ", " +
                "idFlr = " + idFlr + ", " +
                "idDiv = " + idDiv + ", " +
                "dtDisable = " + dtDisable + ", " +
                "idUsertype = " + idUsertype + ", " +
                "idDept = " + idDept + ", " +
                "idBuilding = " + idBuilding + ", " +
                "statusLogout = " + statusLogout + ")";
    }
}