package com.ishaangupta.project.uber.RideHailingBackendPlatform.services;

import com.ishaangupta.project.uber.RideHailingBackendPlatform.dto.DriverDto;
import com.ishaangupta.project.uber.RideHailingBackendPlatform.dto.RideDto;
import com.ishaangupta.project.uber.RideHailingBackendPlatform.dto.RideRequestDto;
import com.ishaangupta.project.uber.RideHailingBackendPlatform.dto.RiderDto;

import java.util.List;

public interface RiderService {
    RideRequestDto requestRide(RideRequestDto rideRequestDto);

    RideDto cancelRide(Long rideId);

    DriverDto rateDriver(Long rideId, Integer rating);

    RiderDto getMyProfile();

    List<RideDto> getAllMyRides();
}
