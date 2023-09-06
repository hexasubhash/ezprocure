package com.ezcode.ezprocure.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link com.ezcode.ezprocure.models.MSubassetDiv} entity
 */
public class MSubassetDivDto implements Serializable {
    private final int idSAssetdiv;
    private final String nmSAssetdiv;
    private final String cdSAssetdiv;
    private final String preAsset;
    private final String typeCus;
    private final String fileName;
    private final MAssetDivDto mAssetDivByIdAssetdiv;

    public MSubassetDivDto(int idSAssetdiv, String nmSAssetdiv, String cdSAssetdiv, String preAsset, String typeCus, String fileName, MAssetDivDto mAssetDivByIdAssetdiv) {
        this.idSAssetdiv = idSAssetdiv;
        this.nmSAssetdiv = nmSAssetdiv;
        this.cdSAssetdiv = cdSAssetdiv;
        this.preAsset = preAsset;
        this.typeCus = typeCus;
        this.fileName = fileName;
        this.mAssetDivByIdAssetdiv = mAssetDivByIdAssetdiv;
    }

    public int getIdSAssetdiv() {
        return idSAssetdiv;
    }

    public String getNmSAssetdiv() {
        return nmSAssetdiv;
    }

    public String getCdSAssetdiv() {
        return cdSAssetdiv;
    }

    public String getPreAsset() {
        return preAsset;
    }

    public String getTypeCus() {
        return typeCus;
    }

    public String getFileName() {
        return fileName;
    }

    public MAssetDivDto getMAssetDivByIdAssetdiv() {
        return mAssetDivByIdAssetdiv;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MSubassetDivDto entity = (MSubassetDivDto) o;
        return Objects.equals(this.idSAssetdiv, entity.idSAssetdiv) &&
                Objects.equals(this.nmSAssetdiv, entity.nmSAssetdiv) &&
                Objects.equals(this.cdSAssetdiv, entity.cdSAssetdiv) &&
                Objects.equals(this.preAsset, entity.preAsset) &&
                Objects.equals(this.typeCus, entity.typeCus) &&
                Objects.equals(this.fileName, entity.fileName) &&
                Objects.equals(this.mAssetDivByIdAssetdiv, entity.mAssetDivByIdAssetdiv);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSAssetdiv, nmSAssetdiv, cdSAssetdiv, preAsset, typeCus, fileName, mAssetDivByIdAssetdiv);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "idSAssetdiv = " + idSAssetdiv + ", " +
                "nmSAssetdiv = " + nmSAssetdiv + ", " +
                "cdSAssetdiv = " + cdSAssetdiv + ", " +
                "preAsset = " + preAsset + ", " +
                "typeCus = " + typeCus + ", " +
                "fileName = " + fileName + ", " +
                "mAssetDivByIdAssetdiv = " + mAssetDivByIdAssetdiv + ")";
    }
}