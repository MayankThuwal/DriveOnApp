package com.driveon.driveOnApp.strategies;

import com.driveon.driveOnApp.dto.RideRequestDTO;
import com.driveon.driveOnApp.entity.Driver;

import java.util.List;

public interface DriverMatchingStrategy {
    List<Driver> findMatchingDriver(RideRequestDTO rideRequestDTO);
}
