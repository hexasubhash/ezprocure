package com.ezcode.ezprocure.models;

import javax.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "M_buss_type")
public class MBussType {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_buss_type", nullable = false)
    private int idBussType;
    @Basic
    @Column(name = "nm_buss_type", nullable = true, length = 2147483647)
    private String nmBussType;
    @OneToMany(mappedBy = "mBussTypeByIdBussType")
    private Collection<MVendor> mVendorsByIdBussType;

    public int getIdBussType() {
        return idBussType;
    }

    public void setIdBussType(int idBussType) {
        this.idBussType = idBussType;
    }

    public String getNmBussType() {
        return nmBussType;
    }

    public void setNmBussType(String nmBussType) {
        this.nmBussType = nmBussType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MBussType mBussType = (MBussType) o;
        return idBussType == mBussType.idBussType && Objects.equals(nmBussType, mBussType.nmBussType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idBussType, nmBussType);
    }

    public Collection<MVendor> getmVendorsByIdBussType() {
        return mVendorsByIdBussType;
    }

    public void setmVendorsByIdBussType(Collection<MVendor> mVendorsByIdBussType) {
        this.mVendorsByIdBussType = mVendorsByIdBussType;
    }
}
