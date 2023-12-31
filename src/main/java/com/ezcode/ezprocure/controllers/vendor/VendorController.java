package com.ezcode.ezprocure.controllers.vendor;

import com.ezcode.ezprocure.dto.*;
import com.ezcode.ezprocure.services.vendservices.VendorRegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "*", maxAge = 3600)
//for Angular Client (withCredentials)
//@CrossOrigin(origins = "http://localhost:8081", maxAge = 3600, allowCredentials="true")
@RestController
@RequestMapping("/api/vend")
public class VendorController {

  @Autowired
  VendorRegService vendorRegService;

  @GetMapping("/fetchAllCountry")
  public ResponseEntity<?>  fetchAllCountry() throws Exception
  {
    List<MCountryDto> mCountryDtos =  vendorRegService.fetchAllCountry();
    //return mCountryDtos;
    return ResponseEntity.ok(mCountryDtos);

    //return new ResponseEntity<List<MCountryDto>>(mCountryDtos, HttpStatus.OK);
  }

  @PostMapping("/saveVendorFormDtils")
  public ResponseEntity<?>  saveVendFormDtls(MVendorDto mVendorDto) throws Exception
  {
    boolean formSubmit=  vendorRegService.saveVendorFormReg(mVendorDto);
    //return mCountryDtos;
    return ResponseEntity.ok("FORM SBMIUTTED SUCCESSFULLY");

    //return new ResponseEntity<List<MCountryDto>>(mCountryDtos, HttpStatus.OK);
  }

  @GetMapping("/fetchAllStates")
  public ResponseEntity<List<MLocDto>> fetchAllStates()
  {

    List<MLocDto> mLocDtos = vendorRegService.fetchAllStates();
    return ResponseEntity.ok(mLocDtos);
  }


  @GetMapping("/fetchAllCities")
  public ResponseEntity<List<MSublocDto>> fetchAllCities()
  {
    List<MSublocDto> mSublocDtos = vendorRegService.fetchAllCities();
    return ResponseEntity.ok(mSublocDtos);
  }

  @GetMapping("/fetchDistrictsById")
  public ResponseEntity<List<MBuildingDto>> fetchDistrictsById(String id)
  {
    int id1 = Integer.parseInt(id);
    List<MBuildingDto> mBuildingDtos = vendorRegService.fetchDistrictsById(id1);
    return ResponseEntity.ok(mBuildingDtos);
  }

  @GetMapping("/fetchAllBusType")
  public ResponseEntity<List<MBussTypeDto>> fetchAllBusType()
  {
    List<MBussTypeDto> mBussTypeDtos = vendorRegService.fetchAllBusType();
    return ResponseEntity.ok(mBussTypeDtos);
  }

  @GetMapping("/fetchAllAssetDiv")
  public ResponseEntity<List<MAssetDivDto>> fetchAllAssetDiv()
  {
    List<MAssetDivDto> mBussTypeDtos = vendorRegService.fetchAllAssetDiv();
    return ResponseEntity.ok(mBussTypeDtos);
  }

  @GetMapping("/fetchSubAssetDivBId")
  public ResponseEntity<List<MSubassetDivDto>> fetchSubAssetDivBId(int id)
  {
    List<MSubassetDivDto> mAssetDivDtos = vendorRegService.fetchSubAssetDivBId(id);
    return ResponseEntity.ok(mAssetDivDtos);
  }

  @GetMapping("/fetchAllCertType")
  public ResponseEntity<List<MCertificateTypeDto>> fetchAllCertType()
  {
    List<MCertificateTypeDto> mCertificateTypeDtos = vendorRegService.fetchAllCertType();
    return ResponseEntity.ok(mCertificateTypeDtos);
  }

}
