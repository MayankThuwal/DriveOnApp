package com.driveon.driveOnApp.strategies.impl;

import com.driveon.driveOnApp.dto.RideRequestDTO;
import com.driveon.driveOnApp.strategies.RideFareCalculationStrategy;

public class RiderFareDefaultFareCalculationStrategy implements RideFareCalculationStrategy {
    @Override
    public double calculateFare(RideRequestDTO rideRequestDTO) {
        return 0;
    }
}

