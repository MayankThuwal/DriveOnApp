package com.driveon.driveOnApp.strategies.impl;

import com.driveon.driveOnApp.dto.RideRequestDTO;
import com.driveon.driveOnApp.entity.Driver;
import com.driveon.driveOnApp.strategies.DriverMatchingStrategy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverMatchingNearestDriverStrategy implements DriverMatchingStrategy {

    @Override
    public List<Driver> findMatchingDriver(RideRequestDTO rideRequestDTO) {
        return List.of();
    }
}
