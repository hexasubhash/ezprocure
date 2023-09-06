package com.ezcode.ezprocure.models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "M_Floor")
public class MFloor {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_flr", nullable = false)
    private int idFlr;
    @Basic
    @Column(name = "id_loc", nullable = false)
    private int idLoc;
    @Basic
    @Column(name = "id_sloc", nullable = false)
    private int idSloc;
    @Basic
    @Column(name = "nm_flr", nullable = false, length = 90)
    private String nmFlr;
    @Basic
    @Column(name = "cd_flr", nullable = false, length = 50)
    private String cdFlr;
    /*@Basic
    @Column(name = "id_building", nullable = true)
    private Integer idBuilding;*/
    @ManyToOne
    @JoinColumn(name = "id_building", referencedColumnName = "id_building")
    private MBuilding mBuildingByIdBuilding;

    public int getIdFlr() {
        return idFlr;
    }

    public void setIdFlr(int idFlr) {
        this.idFlr = idFlr;
    }

    public int getIdLoc() {
        return idLoc;
    }

    public void setIdLoc(int idLoc) {
        this.idLoc = idLoc;
    }

    public int getIdSloc() {
        return idSloc;
    }

    public void setIdSloc(int idSloc) {
        this.idSloc = idSloc;
    }

    public String getNmFlr() {
        return nmFlr;
    }

    public void setNmFlr(String nmFlr) {
        this.nmFlr = nmFlr;
    }

    public String getCdFlr() {
        return cdFlr;
    }

    public void setCdFlr(String cdFlr) {
        this.cdFlr = cdFlr;
    }

    /*public Integer getIdBuilding() {
        return idBuilding;
    }

    public void setIdBuilding(Integer idBuilding) {
        this.idBuilding = idBuilding;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MFloor mFloor = (MFloor) o;
        return idFlr == mFloor.idFlr && idLoc == mFloor.idLoc && idSloc == mFloor.idSloc && Objects.equals(nmFlr, mFloor.nmFlr) && Objects.equals(cdFlr, mFloor.cdFlr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idFlr, idLoc, idSloc, nmFlr, cdFlr);
    }

    public MBuilding getmBuildingByIdBuilding() {
        return mBuildingByIdBuilding;
    }

    public void setmBuildingByIdBuilding(MBuilding mBuildingByIdBuilding) {
        this.mBuildingByIdBuilding = mBuildingByIdBuilding;
    }
}
