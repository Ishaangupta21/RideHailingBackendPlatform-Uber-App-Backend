package com.ishaangupta.project.uber.RideHailingBackendPlatform.services.impl;

import com.ishaangupta.project.uber.RideHailingBackendPlatform.dto.DriverDto;
import com.ishaangupta.project.uber.RideHailingBackendPlatform.dto.RideDto;
import com.ishaangupta.project.uber.RideHailingBackendPlatform.dto.RiderDto;
import com.ishaangupta.project.uber.RideHailingBackendPlatform.services.DriverService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverServiceImpl implements DriverService {
    @Override
    public RideDto acceptRide(Long rideId) {
        return null;
    }

    @Override
    public RideDto cancelRide(Long rideId) {
        return null;
    }

    @Override
    public RideDto endRide(Long rideId) {
        return null;
    }

    @Override
    public RideDto startRide(Long rideId) {
        return null;
    }

    @Override
    public RiderDto rateRider(Long riderId, Integer rating) {
        return null;
    }

    @Override
    public DriverDto getMyProfile() {
        return null;
    }

    @Override
    public List<RideDto> getAllMyRides() {
        return List.of();
    }
}
