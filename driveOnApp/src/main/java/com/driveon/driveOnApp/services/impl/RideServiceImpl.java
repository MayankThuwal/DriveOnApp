package com.driveon.driveOnApp.services.impl;

import com.driveon.driveOnApp.dto.RideRequestDTO;
import com.driveon.driveOnApp.entity.Driver;
import com.driveon.driveOnApp.entity.Ride;
import com.driveon.driveOnApp.services.RideService;
import com.driveon.driveOnApp.entity.enums.RideStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public class RideServiceImpl implements RideService {

    @Override
    public Ride getRideById(Long rideId) {
        return null;
    }

    @Override
    public void matchWithDrivers(RideRequestDTO rideRequestDto) {

    }

    @Override
    public Ride createNewRide(RideRequestDTO rideRequestDto, Driver driver) {
        return null;
    }

    @Override
    public Ride updateRideStatus(Long rideId, RideStatus rideStatus) {
        return null;
    }

    @Override
    public Page<Ride> getAllRidesOfRider(Long riderId, PageRequest pageRequest) {
        return null;
    }

    @Override
    public Page<Ride> getAllRidesOfDriver(Long driverId, PageRequest pageRequest) {
        return null;
    }
}
