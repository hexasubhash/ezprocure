package com.ezcode.ezprocure.models;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "M_Subloc")
public class MSubloc {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_sloc", nullable = false)
    private int idSloc;
    /*@Basic
    @Column(name = "id_loc", nullable = true)
    private Integer idLoc;*/
    @Basic
    @Column(name = "cd_subl", nullable = true, length = 2147483647)
    private String cdSubl;
    @Basic
    @Column(name = "nm_subl", nullable = true, length = 2147483647)
    private String nmSubl;
    @Basic
    @Column(name = "gstin", nullable = true, length = 2147483647)
    private String gstin;
    @Basic
    @Column(name = "gst_doc", nullable = true, length = 2147483647)
    private String gstDoc;
    /*@OneToMany(mappedBy = "mSublocByIdSloc")
    private Collection<MBuilding> mBuildingsByIdSloc;
    @OneToMany(mappedBy = "mSublocByIdSloc")
    private Collection<MFloor> mFloorsByIdSloc;*/
    @ManyToOne
    @JoinColumn(name = "id_loc", referencedColumnName = "id_loc")
    private MLoc mLocByIdLoc;
    @OneToMany(mappedBy = "mSublocByIdSubl")
    private Collection<MVendor> mVendorsByIdSloc;

    public int getIdSloc() {
        return idSloc;
    }

    public void setIdSloc(int idSloc) {
        this.idSloc = idSloc;
    }

   /* public Integer getIdLoc() {
        return idLoc;
    }

    public void setIdLoc(Integer idLoc) {
        this.idLoc = idLoc;
    }*/

    public String getCdSubl() {
        return cdSubl;
    }

    public void setCdSubl(String cdSubl) {
        this.cdSubl = cdSubl;
    }

    public String getNmSubl() {
        return nmSubl;
    }

    public void setNmSubl(String nmSubl) {
        this.nmSubl = nmSubl;
    }

    public String getGstin() {
        return gstin;
    }

    public void setGstin(String gstin) {
        this.gstin = gstin;
    }

    public String getGstDoc() {
        return gstDoc;
    }

    public void setGstDoc(String gstDoc) {
        this.gstDoc = gstDoc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MSubloc mSubloc = (MSubloc) o;
        return idSloc == mSubloc.idSloc && Objects.equals(cdSubl, mSubloc.cdSubl) && Objects.equals(nmSubl, mSubloc.nmSubl) && Objects.equals(gstin, mSubloc.gstin) && Objects.equals(gstDoc, mSubloc.gstDoc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSloc, cdSubl, nmSubl, gstin, gstDoc);
    }

   /* public Collection<MBuilding> getmBuildingsByIdSloc() {
        return mBuildingsByIdSloc;
    }

    public void setmBuildingsByIdSloc(Collection<MBuilding> mBuildingsByIdSloc) {
        this.mBuildingsByIdSloc = mBuildingsByIdSloc;
    }

    public Collection<MFloor> getmFloorsByIdSloc() {
        return mFloorsByIdSloc;
    }

    public void setmFloorsByIdSloc(Collection<MFloor> mFloorsByIdSloc) {
        this.mFloorsByIdSloc = mFloorsByIdSloc;
    }
*/
    public MLoc getmLocByIdLoc() {
        return mLocByIdLoc;
    }

    public void setmLocByIdLoc(MLoc mLocByIdLoc) {
        this.mLocByIdLoc = mLocByIdLoc;
    }

    public Collection<MVendor> getmVendorsByIdSloc() {
        return mVendorsByIdSloc;
    }

    public void setmVendorsByIdSloc(Collection<MVendor> mVendorsByIdSloc) {
        this.mVendorsByIdSloc = mVendorsByIdSloc;
    }
}
