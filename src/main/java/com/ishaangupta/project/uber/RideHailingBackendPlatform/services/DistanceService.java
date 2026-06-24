package com.ishaangupta.project.uber.RideHailingBackendPlatform.services;

import org.locationtech.jts.geom.Point;

public interface DistanceService {
    Double calculateDistance(Point source, Point destination);
}
