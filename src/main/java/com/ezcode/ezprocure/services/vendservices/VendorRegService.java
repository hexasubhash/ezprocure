package com.ezcode.ezprocure.services.vendservices;

import com.ezcode.ezprocure.dto.*;

import java.util.List;

public interface VendorRegService {
    public List<MCountryDto> fetchAllCountry();
    public List<MLocDto> fetchAllStates();
    public List<MSublocDto> fetchAllCities();
    public List<MBuildingDto> fetchDistrictsById(int id);
    public List<MBussTypeDto> fetchAllBusType();
    public List<MAssetDivDto> fetchAllAssetDiv();
    public List<MSubassetDivDto> fetchSubAssetDivBId(int id);
    public List<MCertificateTypeDto> fetchAllCertType();
}
