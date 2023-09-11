package com.ezcode.ezprocure.dto;

import java.io.Serializable;

/**
 * A DTO for the {@link com.ezcode.ezprocure.models.MCountry} entity
 */
public class MCountryDto implements Serializable {
    private int idCountry;
    private String nmCountry;
    private String cdCountry;
    //private Collection<MVendor> mVendorsByIdCountry;


    public int getIdCountry() {
        return idCountry;
    }

    public String getNmCountry() {
        return nmCountry;
    }

    public String getCdCountry() {
        return cdCountry;
    }

   /* public Collection<MVendor> getMVendorsByIdCountry() {
        return mVendorsByIdCountry;
    }*/



    /**
     * set field
     *
     * @param idCountry
     */
    public void setIdCountry(int idCountry) {
        this.idCountry = idCountry;
    }

    /**
     * set field
     *
     * @param nmCountry
     */
    public void setNmCountry(String nmCountry) {
        this.nmCountry = nmCountry;
    }

    /**
     * set field
     *
     * @param cdCountry
     */
    public void setCdCountry(String cdCountry) {
        this.cdCountry = cdCountry;
    }

    /**
     * set field
     *
     * @param mVendorsByIdCountry
     */
   /* public void setMVendorsByIdCountry(Collection<MVendor> mVendorsByIdCountry) {
        this.mVendorsByIdCountry = mVendorsByIdCountry;
    }*/
}