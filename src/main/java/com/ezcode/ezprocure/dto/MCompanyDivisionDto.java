package com.ezcode.ezprocure.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link com.ezcode.ezprocure.models.MCompanyDivision} entity
 */
public class MCompanyDivisionDto implements Serializable {
    private final int idDiv;
    private final String cdDiv;
    private final String nmDiv;

    public MCompanyDivisionDto(int idDiv, String cdDiv, String nmDiv) {
        this.idDiv = idDiv;
        this.cdDiv = cdDiv;
        this.nmDiv = nmDiv;
    }

    public int getIdDiv() {
        return idDiv;
    }

    public String getCdDiv() {
        return cdDiv;
    }

    public String getNmDiv() {
        return nmDiv;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MCompanyDivisionDto entity = (MCompanyDivisionDto) o;
        return Objects.equals(this.idDiv, entity.idDiv) &&
                Objects.equals(this.cdDiv, entity.cdDiv) &&
                Objects.equals(this.nmDiv, entity.nmDiv);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDiv, cdDiv, nmDiv);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "idDiv = " + idDiv + ", " +
                "cdDiv = " + cdDiv + ", " +
                "nmDiv = " + nmDiv + ")";
    }
}