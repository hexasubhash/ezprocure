package com.ezcode.ezprocure.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link com.ezcode.ezprocure.models.MLoc} entity
 */
public class MLocDto implements Serializable {
    private final int idLoc;
    private final String nmLoc;
    private final String cdLoc;
    private final String companyGroupLogo;
    private MCountryDto mCountryByIdCountry;


    public MLocDto(int idLoc, String nmLoc, String cdLoc, String companyGroupLogo, MCountryDto mCountryByIdCountry) {
        this.idLoc = idLoc;
        this.nmLoc = nmLoc;
        this.cdLoc = cdLoc;
        this.companyGroupLogo = companyGroupLogo;
        this.mCountryByIdCountry = mCountryByIdCountry;

    }

    public MLocDto(int idLoc, String nmLoc, String cdLoc, String companyGroupLogo) {
        this.idLoc = idLoc;
        this.nmLoc = nmLoc;
        this.cdLoc = cdLoc;
        this.companyGroupLogo = companyGroupLogo;
    }

    public int getIdLoc() {
        return idLoc;
    }

    public String getNmLoc() {
        return nmLoc;
    }

    public String getCdLoc() {
        return cdLoc;
    }

    public String getCompanyGroupLogo() {
        return companyGroupLogo;
    }

    public MCountryDto getMCountryByIdCountry() {
        return mCountryByIdCountry;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MLocDto entity = (MLocDto) o;
        return Objects.equals(this.idLoc, entity.idLoc) &&
                Objects.equals(this.nmLoc, entity.nmLoc) &&
                Objects.equals(this.cdLoc, entity.cdLoc) &&
                Objects.equals(this.companyGroupLogo, entity.companyGroupLogo) &&
                Objects.equals(this.mCountryByIdCountry, entity.mCountryByIdCountry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idLoc, nmLoc, cdLoc, companyGroupLogo, mCountryByIdCountry);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "idLoc = " + idLoc + ", " +
                "nmLoc = " + nmLoc + ", " +
                "cdLoc = " + cdLoc + ", " +
                "companyGroupLogo = " + companyGroupLogo + ", " +
                "mCountryByIdCountry = " + mCountryByIdCountry+ ")";
    }
}