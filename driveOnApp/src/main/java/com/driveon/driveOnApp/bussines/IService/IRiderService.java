package com.driveon.driveOnApp.bussines.IService;

import com.driveon.driveOnApp.dto.DriverDTO;
import com.driveon.driveOnApp.dto.RideDTO;
import com.driveon.driveOnApp.dto.RideRequestDTO;
import com.driveon.driveOnApp.dto.RiderDTO;

import java.util.List;

public interface IRiderService {

    RideRequestDTO requestRide(RideRequestDTO rideRequestDto);

    RideDTO cancelRide(Long rideId);

    DriverDTO rateDriver(Long rideId, Integer rating);

    RiderDTO getMyProfile();

    List<RideDTO> getAllMyRides();
}
