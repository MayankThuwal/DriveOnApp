package com.driveon.driveOnApp.bussines.Service;

import com.driveon.driveOnApp.bussines.IService.IRiderService;
import com.driveon.driveOnApp.dto.DriverDTO;
import com.driveon.driveOnApp.dto.RideDTO;
import com.driveon.driveOnApp.dto.RideRequestDTO;
import com.driveon.driveOnApp.dto.RiderDTO;

import java.util.List;

public class RiderService implements IRiderService {

    @Override
    public RideRequestDTO requestRide(RideRequestDTO rideRequestDto) { // Send response as rideResponseDTO
        return null;
    }

    @Override
    public RideDTO cancelRide(Long rideId) {
        return null;
    }

    @Override
    public DriverDTO rateDriver(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public RiderDTO getMyProfile() {
        return null;
    }

    @Override
    public List<RideDTO> getAllMyRides() {
        return List.of();
    }
}
