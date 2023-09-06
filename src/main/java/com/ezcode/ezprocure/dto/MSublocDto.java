package com.ezcode.ezprocure.dto;

import java.io.Serializable;
import java.util.Collection;
import java.util.Objects;

/**
 * A DTO for the {@link com.ezcode.ezprocure.models.MSubloc} entity
 */
public class MSublocDto implements Serializable {
    private final int idSloc;
    private final String cdSubl;
    private final String nmSubl;
    private final String gstin;
    private final String gstDoc;
    private final MLocDto mLocByIdLoc;
    private final Collection<MVendorDto> mVendorsByIdSloc;

    public MSublocDto(int idSloc, String cdSubl, String nmSubl, String gstin, String gstDoc, MLocDto mLocByIdLoc, Collection<MVendorDto> mVendorsByIdSloc) {
        this.idSloc = idSloc;
        this.cdSubl = cdSubl;
        this.nmSubl = nmSubl;
        this.gstin = gstin;
        this.gstDoc = gstDoc;
        this.mLocByIdLoc = mLocByIdLoc;
        this.mVendorsByIdSloc = mVendorsByIdSloc;
    }

    public int getIdSloc() {
        return idSloc;
    }

    public String getCdSubl() {
        return cdSubl;
    }

    public String getNmSubl() {
        return nmSubl;
    }

    public String getGstin() {
        return gstin;
    }

    public String getGstDoc() {
        return gstDoc;
    }

    public MLocDto getMLocByIdLoc() {
        return mLocByIdLoc;
    }

    public Collection<MVendorDto> getMVendorsByIdSloc() {
        return mVendorsByIdSloc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MSublocDto entity = (MSublocDto) o;
        return Objects.equals(this.idSloc, entity.idSloc) &&
                Objects.equals(this.cdSubl, entity.cdSubl) &&
                Objects.equals(this.nmSubl, entity.nmSubl) &&
                Objects.equals(this.gstin, entity.gstin) &&
                Objects.equals(this.gstDoc, entity.gstDoc) &&
                Objects.equals(this.mLocByIdLoc, entity.mLocByIdLoc) &&
                Objects.equals(this.mVendorsByIdSloc, entity.mVendorsByIdSloc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSloc, cdSubl, nmSubl, gstin, gstDoc, mLocByIdLoc, mVendorsByIdSloc);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "idSloc = " + idSloc + ", " +
                "cdSubl = " + cdSubl + ", " +
                "nmSubl = " + nmSubl + ", " +
                "gstin = " + gstin + ", " +
                "gstDoc = " + gstDoc + ", " +
                "mLocByIdLoc = " + mLocByIdLoc + ", " +
                "mVendorsByIdSloc = " + mVendorsByIdSloc + ")";
    }
}