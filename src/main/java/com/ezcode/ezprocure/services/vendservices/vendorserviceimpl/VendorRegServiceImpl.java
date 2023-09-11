package com.ezcode.ezprocure.services.vendservices.vendorserviceimpl;

import com.ezcode.ezprocure.dto.*;
import com.ezcode.ezprocure.models.*;
import com.ezcode.ezprocure.repository.*;
import com.ezcode.ezprocure.services.vendservices.VendorRegService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    private MVendorRepository mVendorRepository;

    @Autowired
    ModelMapper modelMapper;

    public List<MCountryDto> fetchAllCountry()
    {
        List<MCountry> mCountries =  mCountryRepository.findAll();
        List<MCountryDto> mCountryDtos = mCountries.stream().map(mCountry -> modelMapper.map(mCountry,MCountryDto.class)).collect(Collectors.toList());
        return mCountryDtos;
    }

    @Override
    public boolean saveVendorFormReg(MVendorDto mVendorDto) {
        MVendor mVendor = new MVendor();
        BeanUtils.copyProperties(mVendorDto,mVendor);
        mVendorRepository.save(mVendor);
        return true;
    }




    public List<MLocDto> fetchAllStates()
    {
        List<MLoc> mLocs =  mLocRepository.findAll();
        List<MLocDto> mLocDtos = new ArrayList<>();
        for(MLoc mLoc : mLocs)
        {
            MLocDto mLocDto = new MLocDto(mLoc.getIdLoc(),mLoc.getNmLoc(),mLoc.getCdLoc(),mLoc.getCompanyGroupLogo());
            mLocDtos.add(mLocDto);
        }
        return mLocDtos;
    }

    public List<MSublocDto> fetchAllCities()
    {
        List<MSublocDto> mSublocDtos = new ArrayList<>();
        List<MSubloc> mSublocs =  mSubLocRepository.findAll();
        for (MSubloc mSubloc : mSublocs )
        {
            MSublocDto mSublocDto = new MSublocDto(mSubloc.getIdSloc(),mSubloc.getCdSubl(), mSubloc.getNmSubl(),mSubloc.getGstin(),mSubloc.getGstDoc());
            mSublocDtos.add(mSublocDto);
        }
        return mSublocDtos;
    }


    public List<MBuildingDto> fetchDistrictsById(int id)
    {
        List<MBuilding> mBuildings =  mBuildingRepository.findMBuildingByIdBuilding(String.valueOf(id));
        List<MBuildingDto> mBuildingDtos = new ArrayList<>();
        for (MBuilding mBuilding : mBuildings) {
        	MBuildingDto buildingDto = new MBuildingDto(mBuilding.getIdBuilding(),mBuilding.getNmBuilding(),mBuilding.getCdBuilding());
            mBuildingDtos.add(buildingDto);
		}
        return mBuildingDtos;
    }


    public List<MBussTypeDto> fetchAllBusType()
    {
        List<MBussTypeDto> mBussTypeDtos = new ArrayList<>();
        List<MBussType> mBussTypes = mBusTypeRepository.findAll();
        for (MBussType mBussType: mBussTypes)
        {
            MBussTypeDto mBussTypeDto = new MBussTypeDto(mBussType.getIdBussType(),mBussType.getNmBussType());
            mBussTypeDtos.add(mBussTypeDto);
        }
        return mBussTypeDtos;
    }


    public List<MAssetDivDto> fetchAllAssetDiv()
    {
        List<MAssetDiv> mAssetDivs = mAssetDivRepository.findAll();
        List<MAssetDivDto> mBussTypeDtos = new ArrayList<>();
        for(MAssetDiv mAssetDiv: mAssetDivs){
            MAssetDivDto mAssetDivDto = new MAssetDivDto(mAssetDiv.getIdAssetdiv(),mAssetDiv.getCdAssetdiv(),mAssetDiv.getDsAssetdiv(),mAssetDiv.getNmAssetdiv(),mAssetDiv.getTypeGrp(),mAssetDiv.getFileName());
            mBussTypeDtos.add(mAssetDivDto);
        }
        return mBussTypeDtos;
    }


    public List<MSubassetDivDto> fetchSubAssetDivBId(int id)
    {
        List<MSubassetDivDto> mAssetDivDtos  = new ArrayList<>();
        List<MSubassetDiv> mSubassetDivs = mSubAssetDivRepository.findByMMAssetDivByIdAssetdiv(id);

        for (MSubassetDiv mSubassetDiv : mSubassetDivs) {
            MSubassetDivDto mSubassetDivDto = new MSubassetDivDto(mSubassetDiv.getIdSAssetdiv(),mSubassetDiv.getNmSAssetdiv(),mSubassetDiv.getCdSAssetdiv(),mSubassetDiv.getPreAsset(),mSubassetDiv.getTypeCus(),mSubassetDiv.getFileName());
            mAssetDivDtos.add(mSubassetDivDto);
        }
        return mAssetDivDtos;
    }


    public List<MCertificateTypeDto> fetchAllCertType()
    {
        List<MCertificateTypeDto> mCertificateTypeDtos = new ArrayList<>();
        List<MCertificateType> mCertificateTypes = mCertificateTypeRepository.findAll();
        for(MCertificateType mCertificateType:mCertificateTypes)
        {
            MCertificateTypeDto mCertificateTypeDto = new MCertificateTypeDto(mCertificateType.getIdCertificateType(),mCertificateType.getNmCertificateType());
            mCertificateTypeDtos.add(mCertificateTypeDto);
        }
        return mCertificateTypeDtos;
    }
}
