package com.ezcode.ezprocure.models;

import javax.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "M_Building")
public class MBuilding {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_building", nullable = false)
    private int idBuilding;
    @Basic
    @Column(name = "id_loc", nullable = false)
    private int idLoc;
    @Basic
    @Column(name = "id_sloc", nullable = false)
    private int idSloc;
    @Basic
    @Column(name = "nm_building", nullable = false, length = 90)
    private String nmBuilding;
    @Basic
    @Column(name = "cd_building", nullable = false, length = 90)
    private String cdBuilding;

    public int getIdBuilding() {
        return idBuilding;
    }

    public void setIdBuilding(int idBuilding) {
        this.idBuilding = idBuilding;
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

    public String getNmBuilding() {
        return nmBuilding;
    }

    public void setNmBuilding(String nmBuilding) {
        this.nmBuilding = nmBuilding;
    }

    public String getCdBuilding() {
        return cdBuilding;
    }

    public void setCdBuilding(String cdBuilding) {
        this.cdBuilding = cdBuilding;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MBuilding mBuilding = (MBuilding) o;
        return idBuilding == mBuilding.idBuilding && idLoc == mBuilding.idLoc && idSloc == mBuilding.idSloc && Objects.equals(nmBuilding, mBuilding.nmBuilding) && Objects.equals(cdBuilding, mBuilding.cdBuilding);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idBuilding, idLoc, idSloc, nmBuilding, cdBuilding);
    }
}
