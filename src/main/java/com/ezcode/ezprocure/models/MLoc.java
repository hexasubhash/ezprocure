package com.ezcode.ezprocure.models;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "M_Loc")
public class MLoc {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_loc", nullable = false)
    private int idLoc;
    @Basic
    @Column(name = "nm_loc", nullable = false, length = 110)
    private String nmLoc;
    @Basic
    @Column(name = "cd_loc", nullable = false, length = 70)
    private String cdLoc;
    @Basic
    @Column(name = "company_group_logo", nullable = true, length = 2147483647)
    private String companyGroupLogo;
    /*@Basic
    @Column(name = "id_country", nullable = true)
    private Integer idCountry;*/
    /*@OneToMany(mappedBy = "mLocByIdLoc")
    private Collection<MBuilding> mBuildingsByIdLoc;
    @OneToMany(mappedBy = "mLocByIdLoc")
    private Collection<MFloor> mFloorsByIdLoc;*/
    @ManyToOne
    @JoinColumn(name = "id_country", referencedColumnName = "id_country")
    private MCountry mCountryByIdCountry;
    @OneToMany(mappedBy = "mLocByIdLoc")
    private Collection<MVendor> mVendorsByIdLoc;

    public int getIdLoc() {
        return idLoc;
    }

    public void setIdLoc(int idLoc) {
        this.idLoc = idLoc;
    }

    public String getNmLoc() {
        return nmLoc;
    }

    public void setNmLoc(String nmLoc) {
        this.nmLoc = nmLoc;
    }

    public String getCdLoc() {
        return cdLoc;
    }

    public void setCdLoc(String cdLoc) {
        this.cdLoc = cdLoc;
    }

    public String getCompanyGroupLogo() {
        return companyGroupLogo;
    }

    public void setCompanyGroupLogo(String companyGroupLogo) {
        this.companyGroupLogo = companyGroupLogo;
    }

    /*public Integer getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(Integer idCountry) {
        this.idCountry = idCountry;
    }
*/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MLoc mLoc = (MLoc) o;
        return idLoc == mLoc.idLoc && Objects.equals(nmLoc, mLoc.nmLoc) && Objects.equals(cdLoc, mLoc.cdLoc) && Objects.equals(companyGroupLogo, mLoc.companyGroupLogo) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idLoc, nmLoc, cdLoc, companyGroupLogo);
    }

    /*public Collection<MBuilding> getmBuildingsByIdLoc() {
        return mBuildingsByIdLoc;
    }

    public void setmBuildingsByIdLoc(Collection<MBuilding> mBuildingsByIdLoc) {
        this.mBuildingsByIdLoc = mBuildingsByIdLoc;
    }*/

    /*public Collection<MFloor> getmFloorsByIdLoc() {
        return mFloorsByIdLoc;
    }

    public void setmFloorsByIdLoc(Collection<MFloor> mFloorsByIdLoc) {
        this.mFloorsByIdLoc = mFloorsByIdLoc;
    }
*/
    public MCountry getmCountryByIdCountry() {
        return mCountryByIdCountry;
    }

    public void setmCountryByIdCountry(MCountry mCountryByIdCountry) {
        this.mCountryByIdCountry = mCountryByIdCountry;
    }

    public Collection<MVendor> getmVendorsByIdLoc() {
        return mVendorsByIdLoc;
    }

    public void setmVendorsByIdLoc(Collection<MVendor> mVendorsByIdLoc) {
        this.mVendorsByIdLoc = mVendorsByIdLoc;
    }
}
