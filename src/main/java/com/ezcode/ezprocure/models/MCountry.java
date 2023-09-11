package com.ezcode.ezprocure.models;

import javax.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "M_Country")
public class MCountry {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_country", nullable = false)
    private int idCountry;
    @Basic
    @Column(name = "nm_country", nullable = false, length = 90)
    private String nmCountry;
    @Basic
    @Column(name = "cd_country", nullable = false, length = 40)
    private String cdCountry;
    @OneToMany(mappedBy = "mCountryByIdCountry")
    private Collection<MVendor> mVendorsByIdCountry;

    public int getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(int idCountry) {
        this.idCountry = idCountry;
    }

    public String getNmCountry() {
        return nmCountry;
    }

    public void setNmCountry(String nmCountry) {
        this.nmCountry = nmCountry;
    }

    public String getCdCountry() {
        return cdCountry;
    }

    public void setCdCountry(String cdCountry) {
        this.cdCountry = cdCountry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MCountry mCountry = (MCountry) o;
        return idCountry == mCountry.idCountry && Objects.equals(nmCountry, mCountry.nmCountry) && Objects.equals(cdCountry, mCountry.cdCountry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCountry, nmCountry, cdCountry);
    }

    public Collection<MVendor> getmVendorsByIdCountry() {
        return mVendorsByIdCountry;
    }

    public void setmVendorsByIdCountry(Collection<MVendor> mVendorsByIdCountry) {
        this.mVendorsByIdCountry = mVendorsByIdCountry;
    }
}
