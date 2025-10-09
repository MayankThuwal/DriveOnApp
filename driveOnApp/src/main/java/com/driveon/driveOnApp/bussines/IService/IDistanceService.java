package com.driveon.driveOnApp.bussines.IService;

import org.locationtech.jts.geom.Point;

public interface IDistanceService {

    double calculateDistance(Point src, Point dest);
}
