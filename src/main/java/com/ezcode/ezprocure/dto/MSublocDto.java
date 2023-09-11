package com.ezcode.ezprocure.dto;

import java.io.Serializable;
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
    private MLocDto mLocByIdLoc;


    public MSublocDto(int idSloc, String cdSubl, String nmSubl, String gstin, String gstDoc, MLocDto mLocByIdLoc) {
        this.idSloc = idSloc;
        this.cdSubl = cdSubl;
        this.nmSubl = nmSubl;
        this.gstin = gstin;
        this.gstDoc = gstDoc;
        this.mLocByIdLoc = mLocByIdLoc;
    }

    public MSublocDto(int idSloc, String cdSubl, String nmSubl, String gstin, String gstDoc) {
        this.idSloc = idSloc;
        this.cdSubl = cdSubl;
        this.nmSubl = nmSubl;
        this.gstin = gstin;
        this.gstDoc = gstDoc;
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
                Objects.equals(this.mLocByIdLoc, entity.mLocByIdLoc) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSloc, cdSubl, nmSubl, gstin, gstDoc, mLocByIdLoc);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "idSloc = " + idSloc + ", " +
                "cdSubl = " + cdSubl + ", " +
                "nmSubl = " + nmSubl + ", " +
                "gstin = " + gstin + ", " +
                "gstDoc = " + gstDoc + ", " +
                "mLocByIdLoc = " + mLocByIdLoc + ")";
    }
}