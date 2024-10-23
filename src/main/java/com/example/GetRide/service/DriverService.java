package com.example.GetRide.service;

import com.example.GetRide.dto.request.DriverRequest;
import com.example.GetRide.dto.response.DriverResponse;
import com.example.GetRide.model.Cab;
import com.example.GetRide.model.Driver;
import com.example.GetRide.repository.DriverRepository;
import com.example.GetRide.transformer.CabTransformer;
import com.example.GetRide.transformer.DriverTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriverService {
    @Autowired
    DriverRepository driverRepository;
    public String addDriverAndCab(DriverRequest driverRequest) {
        Driver driver = DriverTransformer.driverRequestToDriver(driverRequest);
        Cab cab = CabTransformer.cabRequestToCab(driverRequest.getCabRequest());
        driver.setCab(cab);
        cab.setDriver(driver);

        // save both driver and cab
        driverRepository.save(driver); // save both
        return "Driver registered successfully";
//        try {
//            Driver driver = DriverTransformer.driverRequestToDriver(driverRequest);
//            Cab cab = CabTransformer.cabRequestToCab(driverRequest.getCabRequest());
//            driver.setCab(cab);
//            cab.setDriver(driver);
//
//            driverRepository.save(driver);
//            return "Driver registered successfully";
//        } catch (Exception e) {
//            e.printStackTrace(); // or use a logger to log the error
//            return "Error: " + e.getMessage();
//        }


    }

    public DriverResponse getDriver(long mobileNo) {
        Driver savedDriver = driverRepository.findByMobileNo(mobileNo);
        //entity to dto
        return DriverTransformer.driverToDriverResponse(savedDriver);
    }
}
