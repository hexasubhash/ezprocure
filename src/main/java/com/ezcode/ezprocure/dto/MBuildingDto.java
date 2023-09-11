package com.ezcode.ezprocure.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link com.ezcode.ezprocure.models.MBuilding} entity
 */
public class MBuildingDto implements Serializable {
    private final int idBuilding;
    private final String nmBuilding;
    private final String cdBuilding;

    public MBuildingDto(int idBuilding, String nmBuilding, String cdBuilding) {
        this.idBuilding = idBuilding;
        this.nmBuilding = nmBuilding;
        this.cdBuilding = cdBuilding;
    }

    public int getIdBuilding() {
        return idBuilding;
    }

    public String getNmBuilding() {
        return nmBuilding;
    }

    public String getCdBuilding() {
        return cdBuilding;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MBuildingDto entity = (MBuildingDto) o;
        return Objects.equals(this.idBuilding, entity.idBuilding) &&
                Objects.equals(this.nmBuilding, entity.nmBuilding) &&
                Objects.equals(this.cdBuilding, entity.cdBuilding);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idBuilding,nmBuilding, cdBuilding);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "idBuilding = " + idBuilding + ", " +
                "nmBuilding = " + nmBuilding + ", " +
                "cdBuilding = " + cdBuilding + ")";
    }
}