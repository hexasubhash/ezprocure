package com.ezcode.ezprocure.models;

import javax.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "M_certificate_type")
public class MCertificateType {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_certificate_type", nullable = false)
    private int idCertificateType;
    @Basic
    @Column(name = "nm_certificate_type", nullable = true, length = 2147483647)
    private String nmCertificateType;

    public int getIdCertificateType() {
        return idCertificateType;
    }

    public void setIdCertificateType(int idCertificateType) {
        this.idCertificateType = idCertificateType;
    }

    public String getNmCertificateType() {
        return nmCertificateType;
    }

    public void setNmCertificateType(String nmCertificateType) {
        this.nmCertificateType = nmCertificateType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MCertificateType that = (MCertificateType) o;
        return idCertificateType == that.idCertificateType && Objects.equals(nmCertificateType, that.nmCertificateType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCertificateType, nmCertificateType);
    }
}
