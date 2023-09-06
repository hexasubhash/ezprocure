package com.ezcode.ezprocure.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link com.ezcode.ezprocure.models.MCertificateType} entity
 */
public class MCertificateTypeDto implements Serializable {
    private final int idCertificateType;
    private final String nmCertificateType;

    public MCertificateTypeDto(int idCertificateType, String nmCertificateType) {
        this.idCertificateType = idCertificateType;
        this.nmCertificateType = nmCertificateType;
    }

    public int getIdCertificateType() {
        return idCertificateType;
    }

    public String getNmCertificateType() {
        return nmCertificateType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MCertificateTypeDto entity = (MCertificateTypeDto) o;
        return Objects.equals(this.idCertificateType, entity.idCertificateType) &&
                Objects.equals(this.nmCertificateType, entity.nmCertificateType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCertificateType, nmCertificateType);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "idCertificateType = " + idCertificateType + ", " +
                "nmCertificateType = " + nmCertificateType + ")";
    }
}