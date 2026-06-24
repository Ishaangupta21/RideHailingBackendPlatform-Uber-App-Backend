package com.ishaangupta.project.uber.RideHailingBackendPlatform.services.impl;

import com.ishaangupta.project.uber.RideHailingBackendPlatform.dto.DriverDto;
import com.ishaangupta.project.uber.RideHailingBackendPlatform.dto.RideDto;
import com.ishaangupta.project.uber.RideHailingBackendPlatform.dto.RideRequestDto;
import com.ishaangupta.project.uber.RideHailingBackendPlatform.dto.RiderDto;
import com.ishaangupta.project.uber.RideHailingBackendPlatform.services.RiderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RiderServiceImpl implements RiderService {
    @Override
    public RideRequestDto requestRide(RideRequestDto rideRequestDto) {
        return null;
    }

    @Override
    public RideDto cancelRide(Long rideId) {
        return null;
    }

    @Override
    public DriverDto rateDriver(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public RiderDto getMyProfile() {
        return null;
    }

    @Override
    public List<RideDto> getAllMyRides() {
        return List.of();
    }
}
