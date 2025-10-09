package com.driveon.driveOnApp.bussines.IService;

import com.driveon.driveOnApp.dto.RideRequestDTO;
import com.driveon.driveOnApp.entity.Driver;
import com.driveon.driveOnApp.entity.Ride;
import com.driveon.driveOnApp.shared.Enums.RideStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface IRideService {
    Ride getRideById(Long rideId);

    void matchWithDrivers(RideRequestDTO rideRequestDto);

    Ride createNewRide(RideRequestDTO rideRequestDto, Driver driver);

    Ride updateRideStatus(Long rideId, RideStatus rideStatus);

    Page<Ride> getAllRidesOfRider(Long riderId, PageRequest pageRequest);

    Page<Ride> getAllRidesOfDriver(Long driverId, PageRequest pageRequest);
}
