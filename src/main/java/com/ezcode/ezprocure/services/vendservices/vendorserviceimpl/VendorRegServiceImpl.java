package com.ezcode.ezprocure.services.vendservices.vendorserviceimpl;

import com.ezcode.ezprocure.dto.*;
import com.ezcode.ezprocure.models.*;
import com.ezcode.ezprocure.repository.*;
import com.ezcode.ezprocure.services.vendservices.VendorRegService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VendorRegServiceImpl implements VendorRegService {


    @Autowired
    MCountryRepository mCountryRepository;

    @Autowired
    MLocRepository mLocRepository;

    @Autowired
    MSubLocRepository mSubLocRepository;

    @Autowired
    MBuildingRepository mBuildingRepository;

    @Autowired
    MBusTypeRepository mBusTypeRepository;

    @Autowired
    MAssetDivRepository mAssetDivRepository;

    @Autowired
    MSubAssetDivRepository mSubAssetDivRepository;
    @Autowired
    private MCertificateTypeRepository mCertificateTypeRepository;

    @Autowired
    ModelMapper modelMapper;

    public List<MCountryDto> fetchAllCountry()
    {
        List<MCountry> mCountries =  mCountryRepository.findAll();
        List<MCountryDto> mCountryDtos = mCountries.stream().map(mCountry -> modelMapper.map(mCountry,MCountryDto.class)).collect(Collectors.toList());
        return mCountryDtos;
    }


    public List<MLocDto> fetchAllStates()
    {
        List<MLoc> mLocs =  mLocRepository.findAll();
        List<MLocDto> mLocDtos = mLocs.stream().map(mLoc -> modelMapper.map(mLoc, MLocDto.class)).collect(Collectors.toList());
        return mLocDtos;
    }

    public List<MSublocDto> fetchAllCities()
    {
        List<MSubloc> mSublocs =  mSubLocRepository.findAll();
        List<MSublocDto> mSublocDtos = mSublocs.stream().map(mSubloc -> modelMapper.map(mSubloc, MSublocDto.class)).collect(Collectors.toList());
        return mSublocDtos;
    }


    public List<MBuildingDto> fetchDistrictsById(int id)
    {
        List<MBuilding> mBuildings =  mBuildingRepository.findMBuildingByIsSubLoc(String.valueOf(id));
        List<MBuildingDto> mBuildingDtos = mBuildings.stream().map(mBuilding -> modelMapper.map(mBuildings, MBuildingDto.class)).collect(Collectors.toList());
        return mBuildingDtos;
    }


    public List<MBussTypeDto> fetchAllBusType()
    {
        List<MBussType> mBussTypes = mBusTypeRepository.findAll();
        List<MBussTypeDto> mBussTypeDtos = mBussTypes.stream().map(mBussType -> modelMapper.map(mBussTypes, MBussTypeDto.class)).collect(Collectors.toList());
        return mBussTypeDtos;
    }


    public List<MAssetDivDto> fetchAllAssetDiv()
    {
        List<MAssetDiv> mAssetDivs = mAssetDivRepository.findAll();
        List<MAssetDivDto> mBussTypeDtos = mAssetDivs.stream().map(mAssetDiv -> modelMapper.map(mAssetDivs, MAssetDivDto.class)).collect(Collectors.toList());
        return mBussTypeDtos;
    }


    public List<MSubassetDivDto> fetchSubAssetDivBId(int id)
    {
        List<MSubassetDiv> mSubassetDivs = mSubAssetDivRepository.findByMMAssetDivByIdAssetdiv(id);
        List<MSubassetDivDto> mAssetDivDtos = mSubassetDivs.stream().map(mSubassetDiv -> modelMapper.map(mSubassetDivs, MSubassetDivDto.class)).collect(Collectors.toList());
        return mAssetDivDtos;
    }


    public List<MCertificateTypeDto> fetchAllCertType()
    {
        List<MCertificateType> mCertificateTypes = mCertificateTypeRepository.findAll();
        List<MCertificateTypeDto> mCertificateTypeDtos = mCertificateTypes.stream().map(mCertificateType -> modelMapper.map(mCertificateTypes, MCertificateTypeDto.class)).collect(Collectors.toList());
        return mCertificateTypeDtos;
    }
}
