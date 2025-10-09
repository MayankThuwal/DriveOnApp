package com.driveon.driveOnApp.bussines.Service;

import com.driveon.driveOnApp.bussines.IService.IDistanceService;
import org.locationtech.jts.geom.Point;
import org.springframework.stereotype.Service;

@Service
public class DistanceService implements IDistanceService {
    @Override
    public double calculateDistance(Point src, Point dest) {
        return 0;
    }
}
