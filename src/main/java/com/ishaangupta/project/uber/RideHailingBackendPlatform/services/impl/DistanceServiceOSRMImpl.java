package com.ishaangupta.project.uber.RideHailingBackendPlatform.services.impl;

import com.ishaangupta.project.uber.RideHailingBackendPlatform.services.DistanceService;
import org.locationtech.jts.geom.Point;
import org.springframework.stereotype.Service;

@Service
public class DistanceServiceOSRMImpl implements DistanceService {
    @Override
    public Double calculateDistance(Point source, Point destination) {
        return 0.0;
    }
}
