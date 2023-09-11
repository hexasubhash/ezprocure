package com.ezcode.ezprocure.models;

import javax.persistence.*;

import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "M_User_Login")
public class MUserLogin {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_log_user", nullable = false)
    private int idLogUser;
    @Basic
    @Column(name = "id_emp_user", nullable = true)
    private Integer idEmpUser;
    @Basic
    @Column(name = "nm_login", nullable = true, length = 50)
    private String nmLogin;
    @Basic
    @Column(name = "id_email", nullable = true, length = 100)
    private String idEmail;
    @Basic
    @Column(name = "pwd", nullable = true, length = 100)
    private String pwd;
    @Basic
    @Column(name = "type_user", nullable = true, length = 100)
    private String typeUser;
    @Basic
    @Column(name = "status_user", nullable = true, length = 100)
    private String statusUser;
    @Basic
    @Column(name = "typ_asst", nullable = true, length = 150)
    private String typAsst;
    @Basic
    @Column(name = "id_loc", nullable = true, length = 2147483647)
    private String idLoc;
    @Basic
    @Column(name = "id_subl", nullable = true, length = 2147483647)
    private String idSubl;
    @Basic
    @Column(name = "id_flr", nullable = true, length = 2147483647)
    private String idFlr;
    @Basic
    @Column(name = "id_div", nullable = true)
    private Integer idDiv;
    @Basic
    @Column(name = "dt_disable", nullable = true)
    private Date dtDisable;
    @Basic
    @Column(name = "id_usertype", nullable = true)
    private Integer idUsertype;
    @Basic
    @Column(name = "id_dept", nullable = true, length = 2147483647)
    private String idDept;
    @Basic
    @Column(name = "id_building", nullable = true, length = 2147483647)
    private String idBuilding;
    @Basic
    @Column(name = "status_logout", nullable = true)
    private Integer statusLogout;

    public int getIdLogUser() {
        return idLogUser;
    }

    public void setIdLogUser(int idLogUser) {
        this.idLogUser = idLogUser;
    }

    public Integer getIdEmpUser() {
        return idEmpUser;
    }

    public void setIdEmpUser(Integer idEmpUser) {
        this.idEmpUser = idEmpUser;
    }

    public String getNmLogin() {
        return nmLogin;
    }

    public void setNmLogin(String nmLogin) {
        this.nmLogin = nmLogin;
    }

    public String getIdEmail() {
        return idEmail;
    }

    public void setIdEmail(String idEmail) {
        this.idEmail = idEmail;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getTypeUser() {
        return typeUser;
    }

    public void setTypeUser(String typeUser) {
        this.typeUser = typeUser;
    }

    public String getStatusUser() {
        return statusUser;
    }

    public void setStatusUser(String statusUser) {
        this.statusUser = statusUser;
    }

    public String getTypAsst() {
        return typAsst;
    }

    public void setTypAsst(String typAsst) {
        this.typAsst = typAsst;
    }

    public String getIdLoc() {
        return idLoc;
    }

    public void setIdLoc(String idLoc) {
        this.idLoc = idLoc;
    }

    public String getIdSubl() {
        return idSubl;
    }

    public void setIdSubl(String idSubl) {
        this.idSubl = idSubl;
    }

    public String getIdFlr() {
        return idFlr;
    }

    public void setIdFlr(String idFlr) {
        this.idFlr = idFlr;
    }

    public Integer getIdDiv() {
        return idDiv;
    }

    public void setIdDiv(Integer idDiv) {
        this.idDiv = idDiv;
    }

    public Date getDtDisable() {
        return dtDisable;
    }

    public void setDtDisable(Date dtDisable) {
        this.dtDisable = dtDisable;
    }

    public Integer getIdUsertype() {
        return idUsertype;
    }

    public void setIdUsertype(Integer idUsertype) {
        this.idUsertype = idUsertype;
    }

    public String getIdDept() {
        return idDept;
    }

    public void setIdDept(String idDept) {
        this.idDept = idDept;
    }

    public String getIdBuilding() {
        return idBuilding;
    }

    public void setIdBuilding(String idBuilding) {
        this.idBuilding = idBuilding;
    }

    public Integer getStatusLogout() {
        return statusLogout;
    }

    public void setStatusLogout(Integer statusLogout) {
        this.statusLogout = statusLogout;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MUserLogin that = (MUserLogin) o;
        return idLogUser == that.idLogUser && Objects.equals(idEmpUser, that.idEmpUser) && Objects.equals(nmLogin, that.nmLogin) && Objects.equals(idEmail, that.idEmail) && Objects.equals(pwd, that.pwd) && Objects.equals(typeUser, that.typeUser) && Objects.equals(statusUser, that.statusUser) && Objects.equals(typAsst, that.typAsst) && Objects.equals(idLoc, that.idLoc) && Objects.equals(idSubl, that.idSubl) && Objects.equals(idFlr, that.idFlr) && Objects.equals(idDiv, that.idDiv) && Objects.equals(dtDisable, that.dtDisable) && Objects.equals(idUsertype, that.idUsertype) && Objects.equals(idDept, that.idDept) && Objects.equals(idBuilding, that.idBuilding) && Objects.equals(statusLogout, that.statusLogout);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idLogUser, idEmpUser, nmLogin, idEmail, pwd, typeUser, statusUser, typAsst, idLoc, idSubl, idFlr, idDiv, dtDisable, idUsertype, idDept, idBuilding, statusLogout);
    }
}
