package com.ishaangupta.project.uber.RideHailingBackendPlatform.services;

import com.ishaangupta.project.uber.RideHailingBackendPlatform.dto.DriverDto;
import com.ishaangupta.project.uber.RideHailingBackendPlatform.dto.RideDto;
import com.ishaangupta.project.uber.RideHailingBackendPlatform.dto.RiderDto;

import java.util.List;

public interface DriverService {

    RideDto acceptRide(Long rideId);

    RideDto cancelRide(Long rideId);

    RideDto endRide(Long rideId);

    RideDto startRide(Long rideId);

    RiderDto rateRider(Long riderId, Integer rating);

    DriverDto getMyProfile();

    List<RideDto> getAllMyRides();

}

