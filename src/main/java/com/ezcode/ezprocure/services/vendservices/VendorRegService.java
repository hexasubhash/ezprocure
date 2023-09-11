package com.ezcode.ezprocure.services.vendservices;

import com.ezcode.ezprocure.dto.*;

import java.util.List;

public interface VendorRegService {
    List<MCountryDto> fetchAllCountry() throws Exception;
    List<MLocDto> fetchAllStates();
    List<MSublocDto> fetchAllCities();
    List<MBuildingDto> fetchDistrictsById(int id);
    List<MBussTypeDto> fetchAllBusType();
    List<MAssetDivDto> fetchAllAssetDiv();
    List<MSubassetDivDto> fetchSubAssetDivBId(int id);
    List<MCertificateTypeDto> fetchAllCertType();

    boolean saveVendorFormReg(MVendorDto mVendorDto);
}
