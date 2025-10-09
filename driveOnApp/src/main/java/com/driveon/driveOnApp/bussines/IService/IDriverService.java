package com.driveon.driveOnApp.bussines.IService;

import com.driveon.driveOnApp.dto.DriverDTO;
import com.driveon.driveOnApp.dto.RideDTO;
import com.driveon.driveOnApp.dto.RiderDTO;

import java.util.List;

public interface IDriverService {

    RideDTO acceptRide(Long rideId);

    RideDTO cancelRide(Long rideId);

    RideDTO startRide(Long rideId);

    RideDTO endRide(Long rideId);

    RiderDTO rateRider(Long rideId, Integer rating);

    DriverDTO getMyProfile();

    List<RideDTO> getAllMyRides();
}
