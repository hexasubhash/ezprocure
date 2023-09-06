package com.ezcode.ezprocure.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link com.ezcode.ezprocure.models.MBuilding} entity
 */
public class MBuildingDto implements Serializable {
    private final int idBuilding;
    private final int idLoc;
    private final int idSloc;
    private final String nmBuilding;
    private final String cdBuilding;

    public MBuildingDto(int idBuilding, int idLoc, int idSloc, String nmBuilding, String cdBuilding) {
        this.idBuilding = idBuilding;
        this.idLoc = idLoc;
        this.idSloc = idSloc;
        this.nmBuilding = nmBuilding;
        this.cdBuilding = cdBuilding;
    }

    public int getIdBuilding() {
        return idBuilding;
    }

    public int getIdLoc() {
        return idLoc;
    }

    public int getIdSloc() {
        return idSloc;
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
                Objects.equals(this.idLoc, entity.idLoc) &&
                Objects.equals(this.idSloc, entity.idSloc) &&
                Objects.equals(this.nmBuilding, entity.nmBuilding) &&
                Objects.equals(this.cdBuilding, entity.cdBuilding);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idBuilding, idLoc, idSloc, nmBuilding, cdBuilding);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "idBuilding = " + idBuilding + ", " +
                "idLoc = " + idLoc + ", " +
                "idSloc = " + idSloc + ", " +
                "nmBuilding = " + nmBuilding + ", " +
                "cdBuilding = " + cdBuilding + ")";
    }
}