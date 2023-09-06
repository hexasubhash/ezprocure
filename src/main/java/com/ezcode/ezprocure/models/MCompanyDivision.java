package com.ezcode.ezprocure.models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "M_Company_Division")
public class MCompanyDivision {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_div", nullable = false)
    private int idDiv;
    @Basic
    @Column(name = "cd_div", nullable = true, length = 50)
    private String cdDiv;
    @Basic
    @Column(name = "nm_div", nullable = true, length = 50)
    private String nmDiv;

    public int getIdDiv() {
        return idDiv;
    }

    public void setIdDiv(int idDiv) {
        this.idDiv = idDiv;
    }

    public String getCdDiv() {
        return cdDiv;
    }

    public void setCdDiv(String cdDiv) {
        this.cdDiv = cdDiv;
    }

    public String getNmDiv() {
        return nmDiv;
    }

    public void setNmDiv(String nmDiv) {
        this.nmDiv = nmDiv;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MCompanyDivision that = (MCompanyDivision) o;
        return idDiv == that.idDiv && Objects.equals(cdDiv, that.cdDiv) && Objects.equals(nmDiv, that.nmDiv);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDiv, cdDiv, nmDiv);
    }
}
