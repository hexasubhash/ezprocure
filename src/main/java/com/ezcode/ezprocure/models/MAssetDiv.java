package com.ezcode.ezprocure.models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "M_Asset_Div")
public class MAssetDiv {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_assetdiv", nullable = false)
    private int idAssetdiv;
    @Basic
    @Column(name = "cd_assetdiv", nullable = false, length = 60)
    private String cdAssetdiv;
    @Basic
    @Column(name = "ds_assetdiv", nullable = false, length = 220)
    private String dsAssetdiv;
    @Basic
    @Column(name = "nm_assetdiv", nullable = false, length = 110)
    private String nmAssetdiv;
    @Basic
    @Column(name = "type_grp", nullable = false, length = 110)
    private String typeGrp;
    @Basic
    @Column(name = "file_name", nullable = true, length = 500)
    private String fileName;

    public int getIdAssetdiv() {
        return idAssetdiv;
    }

    public void setIdAssetdiv(int idAssetdiv) {
        this.idAssetdiv = idAssetdiv;
    }

    public String getCdAssetdiv() {
        return cdAssetdiv;
    }

    public void setCdAssetdiv(String cdAssetdiv) {
        this.cdAssetdiv = cdAssetdiv;
    }

    public String getDsAssetdiv() {
        return dsAssetdiv;
    }

    public void setDsAssetdiv(String dsAssetdiv) {
        this.dsAssetdiv = dsAssetdiv;
    }

    public String getNmAssetdiv() {
        return nmAssetdiv;
    }

    public void setNmAssetdiv(String nmAssetdiv) {
        this.nmAssetdiv = nmAssetdiv;
    }

    public String getTypeGrp() {
        return typeGrp;
    }

    public void setTypeGrp(String typeGrp) {
        this.typeGrp = typeGrp;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MAssetDiv mAssetDiv = (MAssetDiv) o;
        return idAssetdiv == mAssetDiv.idAssetdiv && Objects.equals(cdAssetdiv, mAssetDiv.cdAssetdiv) && Objects.equals(dsAssetdiv, mAssetDiv.dsAssetdiv) && Objects.equals(nmAssetdiv, mAssetDiv.nmAssetdiv) && Objects.equals(typeGrp, mAssetDiv.typeGrp) && Objects.equals(fileName, mAssetDiv.fileName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAssetdiv, cdAssetdiv, dsAssetdiv, nmAssetdiv, typeGrp, fileName);
    }
}
