package com.ezcode.ezprocure.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link com.ezcode.ezprocure.models.MAssetDiv} entity
 */
public class MAssetDivDto implements Serializable {
    private final int idAssetdiv;
    private final String cdAssetdiv;
    private final String dsAssetdiv;
    private final String nmAssetdiv;
    private final String typeGrp;
    private final String fileName;

    public MAssetDivDto(int idAssetdiv, String cdAssetdiv, String dsAssetdiv, String nmAssetdiv, String typeGrp, String fileName) {
        this.idAssetdiv = idAssetdiv;
        this.cdAssetdiv = cdAssetdiv;
        this.dsAssetdiv = dsAssetdiv;
        this.nmAssetdiv = nmAssetdiv;
        this.typeGrp = typeGrp;
        this.fileName = fileName;
    }

    public int getIdAssetdiv() {
        return idAssetdiv;
    }

    public String getCdAssetdiv() {
        return cdAssetdiv;
    }

    public String getDsAssetdiv() {
        return dsAssetdiv;
    }

    public String getNmAssetdiv() {
        return nmAssetdiv;
    }

    public String getTypeGrp() {
        return typeGrp;
    }

    public String getFileName() {
        return fileName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MAssetDivDto entity = (MAssetDivDto) o;
        return Objects.equals(this.idAssetdiv, entity.idAssetdiv) &&
                Objects.equals(this.cdAssetdiv, entity.cdAssetdiv) &&
                Objects.equals(this.dsAssetdiv, entity.dsAssetdiv) &&
                Objects.equals(this.nmAssetdiv, entity.nmAssetdiv) &&
                Objects.equals(this.typeGrp, entity.typeGrp) &&
                Objects.equals(this.fileName, entity.fileName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAssetdiv, cdAssetdiv, dsAssetdiv, nmAssetdiv, typeGrp, fileName);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "idAssetdiv = " + idAssetdiv + ", " +
                "cdAssetdiv = " + cdAssetdiv + ", " +
                "dsAssetdiv = " + dsAssetdiv + ", " +
                "nmAssetdiv = " + nmAssetdiv + ", " +
                "typeGrp = " + typeGrp + ", " +
                "fileName = " + fileName + ")";
    }
}