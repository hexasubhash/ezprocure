package com.ezcode.ezprocure.models;

import javax.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "M_Subasset_Div")
public class MSubassetDiv {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_s_assetdiv", nullable = false)
    private int idSAssetdiv;
    /*@Basic
    @Column(name = "id_assetdiv", nullable = false)
    private int idAssetdiv;*/
    @Basic
    @Column(name = "nm_s_assetdiv", nullable = true, length = 100)
    private String nmSAssetdiv;
    @Basic
    @Column(name = "cd_s_assetdiv", nullable = true, length = 100)
    private String cdSAssetdiv;
    @Basic
    @Column(name = "pre_asset", nullable = true, length = 100)
    private String preAsset;
    @Basic
    @Column(name = "type_cus", nullable = true, length = 100)
    private String typeCus;
    @Basic
    @Column(name = "file_name", nullable = true, length = 500)
    private String fileName;
    @ManyToOne
    @JoinColumn(name = "id_assetdiv", referencedColumnName = "id_assetdiv", nullable = false)
    private MAssetDiv mAssetDivByIdAssetdiv;

    public int getIdSAssetdiv() {
        return idSAssetdiv;
    }

    public void setIdSAssetdiv(int idSAssetdiv) {
        this.idSAssetdiv = idSAssetdiv;
    }

    /*public int getIdAssetdiv() {
        return idAssetdiv;
    }

    public void setIdAssetdiv(int idAssetdiv) {
        this.idAssetdiv = idAssetdiv;
    }
*/
    public String getNmSAssetdiv() {
        return nmSAssetdiv;
    }

    public void setNmSAssetdiv(String nmSAssetdiv) {
        this.nmSAssetdiv = nmSAssetdiv;
    }

    public String getCdSAssetdiv() {
        return cdSAssetdiv;
    }

    public void setCdSAssetdiv(String cdSAssetdiv) {
        this.cdSAssetdiv = cdSAssetdiv;
    }

    public String getPreAsset() {
        return preAsset;
    }

    public void setPreAsset(String preAsset) {
        this.preAsset = preAsset;
    }

    public String getTypeCus() {
        return typeCus;
    }

    public void setTypeCus(String typeCus) {
        this.typeCus = typeCus;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    //@Override
    /*public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MSubassetDiv that = (MSubassetDiv) o;
        return idSAssetdiv == that.idSAssetdiv && idAssetdiv == that.idAssetdiv && Objects.equals(nmSAssetdiv, that.nmSAssetdiv) && Objects.equals(cdSAssetdiv, that.cdSAssetdiv) && Objects.equals(preAsset, that.preAsset) && Objects.equals(typeCus, that.typeCus) && Objects.equals(fileName, that.fileName);
    }*/

    @Override
    public int hashCode() {
        return Objects.hash(idSAssetdiv, nmSAssetdiv, cdSAssetdiv, preAsset, typeCus, fileName);
    }

    public MAssetDiv getmAssetDivByIdAssetdiv() {
        return mAssetDivByIdAssetdiv;
    }

    public void setmAssetDivByIdAssetdiv(MAssetDiv mAssetDivByIdAssetdiv) {
        this.mAssetDivByIdAssetdiv = mAssetDivByIdAssetdiv;
    }
}
