package com.ezcode.ezprocure.models;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "M_User_Type")
public class MUserType {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_usertype", nullable = false)
    private int idUsertype;
    @Basic
    @Column(name = "nm_usertype", nullable = true, length = 50)
    private String nmUsertype;
    @Basic
    @Column(name = "cd_usertype", nullable = true, length = 50)
    private String cdUsertype;
    @Basic
    @Column(name = "crud_allow", nullable = false, length = 50)
    private String crudAllow;
   /* @OneToMany(mappedBy = "mUserTypeByIdUsertype")
    private Collection<MUserLogin> mUserLoginsByIdUsertype;*/

    public int getIdUsertype() {
        return idUsertype;
    }

    public void setIdUsertype(int idUsertype) {
        this.idUsertype = idUsertype;
    }

    public String getNmUsertype() {
        return nmUsertype;
    }

    public void setNmUsertype(String nmUsertype) {
        this.nmUsertype = nmUsertype;
    }

    public String getCdUsertype() {
        return cdUsertype;
    }

    public void setCdUsertype(String cdUsertype) {
        this.cdUsertype = cdUsertype;
    }

    public String getCrudAllow() {
        return crudAllow;
    }

    public void setCrudAllow(String crudAllow) {
        this.crudAllow = crudAllow;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MUserType mUserType = (MUserType) o;
        return idUsertype == mUserType.idUsertype && Objects.equals(nmUsertype, mUserType.nmUsertype) && Objects.equals(cdUsertype, mUserType.cdUsertype) && Objects.equals(crudAllow, mUserType.crudAllow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUsertype, nmUsertype, cdUsertype, crudAllow);
    }

    /*public Collection<MUserLogin> getmUserLoginsByIdUsertype() {
        return mUserLoginsByIdUsertype;
    }

    public void setmUserLoginsByIdUsertype(Collection<MUserLogin> mUserLoginsByIdUsertype) {
        this.mUserLoginsByIdUsertype = mUserLoginsByIdUsertype;
    }*/
}
