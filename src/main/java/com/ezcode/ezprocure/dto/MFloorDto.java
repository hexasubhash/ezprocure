package com.ezcode.ezprocure.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link com.ezcode.ezprocure.models.MFloor} entity
 */
public class MFloorDto implements Serializable {
    private final int idFlr;
    private final int idLoc;
    private final int idSloc;
    private final String nmFlr;
    private final String cdFlr;
    private final MBuildingDto mBuildingByIdBuilding;

    public MFloorDto(int idFlr, int idLoc, int idSloc, String nmFlr, String cdFlr, MBuildingDto mBuildingByIdBuilding) {
        this.idFlr = idFlr;
        this.idLoc = idLoc;
        this.idSloc = idSloc;
        this.nmFlr = nmFlr;
        this.cdFlr = cdFlr;
        this.mBuildingByIdBuilding = mBuildingByIdBuilding;
    }

    public int getIdFlr() {
        return idFlr;
    }

    public int getIdLoc() {
        return idLoc;
    }

    public int getIdSloc() {
        return idSloc;
    }

    public String getNmFlr() {
        return nmFlr;
    }

    public String getCdFlr() {
        return cdFlr;
    }

    public MBuildingDto getMBuildingByIdBuilding() {
        return mBuildingByIdBuilding;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MFloorDto entity = (MFloorDto) o;
        return Objects.equals(this.idFlr, entity.idFlr) &&
                Objects.equals(this.idLoc, entity.idLoc) &&
                Objects.equals(this.idSloc, entity.idSloc) &&
                Objects.equals(this.nmFlr, entity.nmFlr) &&
                Objects.equals(this.cdFlr, entity.cdFlr) &&
                Objects.equals(this.mBuildingByIdBuilding, entity.mBuildingByIdBuilding);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idFlr, idLoc, idSloc, nmFlr, cdFlr, mBuildingByIdBuilding);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "idFlr = " + idFlr + ", " +
                "idLoc = " + idLoc + ", " +
                "idSloc = " + idSloc + ", " +
                "nmFlr = " + nmFlr + ", " +
                "cdFlr = " + cdFlr + ", " +
                "mBuildingByIdBuilding = " + mBuildingByIdBuilding + ")";
    }
}