package com.driveon.driveOnApp.bussines.Service;

import com.driveon.driveOnApp.bussines.IService.IDriverService;
import com.driveon.driveOnApp.dto.DriverDTO;
import com.driveon.driveOnApp.dto.RideDTO;
import com.driveon.driveOnApp.dto.RiderDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverService implements IDriverService {
        @Override
        public RideDTO acceptRide(Long rideId) {
        return null;
    }

        @Override
        public RideDTO cancelRide(Long rideId) {
        return null;
    }

        @Override
        public RideDTO startRide(Long rideId) {
        return null;
    }

        @Override
        public RideDTO endRide(Long rideId) {
        return null;
    }

        @Override
        public RiderDTO rateRider(Long rideId, Integer rating) {
        return null;
    }

        @Override
        public DriverDTO getMyProfile() {
        return null;
    }

        @Override
        public List<RideDTO> getAllMyRides() {
        return List.of();
    }
}
