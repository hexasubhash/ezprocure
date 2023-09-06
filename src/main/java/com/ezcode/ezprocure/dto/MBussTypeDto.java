package com.ezcode.ezprocure.dto;

import java.io.Serializable;
import java.util.Collection;
import java.util.Objects;

/**
 * A DTO for the {@link com.ezcode.ezprocure.models.MBussType} entity
 */
public class MBussTypeDto implements Serializable {
    private final int idBussType;
    private final String nmBussType;
    private final Collection<MVendorDto> mVendorsByIdBussType;

    public MBussTypeDto(int idBussType, String nmBussType, Collection<MVendorDto> mVendorsByIdBussType) {
        this.idBussType = idBussType;
        this.nmBussType = nmBussType;
        this.mVendorsByIdBussType = mVendorsByIdBussType;
    }

    public int getIdBussType() {
        return idBussType;
    }

    public String getNmBussType() {
        return nmBussType;
    }

    public Collection<MVendorDto> getMVendorsByIdBussType() {
        return mVendorsByIdBussType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MBussTypeDto entity = (MBussTypeDto) o;
        return Objects.equals(this.idBussType, entity.idBussType) &&
                Objects.equals(this.nmBussType, entity.nmBussType) &&
                Objects.equals(this.mVendorsByIdBussType, entity.mVendorsByIdBussType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idBussType, nmBussType, mVendorsByIdBussType);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "idBussType = " + idBussType + ", " +
                "nmBussType = " + nmBussType + ", " +
                "mVendorsByIdBussType = " + mVendorsByIdBussType + ")";
    }
}