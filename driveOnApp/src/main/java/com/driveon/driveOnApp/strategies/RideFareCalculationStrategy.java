package com.driveon.driveOnApp.strategies;

import com.driveon.driveOnApp.dto.RideRequestDTO;

public interface RideFareCalculationStrategy {

    double calculateFare(RideRequestDTO rideRequestDTO);

}
