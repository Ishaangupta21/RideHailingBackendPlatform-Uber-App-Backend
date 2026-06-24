package com.ishaangupta.project.uber.RideHailingBackendPlatform.services.impl;

import com.ishaangupta.project.uber.RideHailingBackendPlatform.dto.RideRequestDto;
import com.ishaangupta.project.uber.RideHailingBackendPlatform.entities.Driver;
import com.ishaangupta.project.uber.RideHailingBackendPlatform.entities.Ride;
import com.ishaangupta.project.uber.RideHailingBackendPlatform.entities.enums.RideStatus;
import com.ishaangupta.project.uber.RideHailingBackendPlatform.services.RideService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class RideServiceImpl implements RideService {
    @Override
    public Ride getRideById(Long rideId) {
        return null;
    }

    @Override
    public void matchWithDrivers(RideRequestDto rideRequestDto) {

    }

    @Override
    public Ride createNewRide(RideRequestDto rideRequestDto, Driver driver) {
        return null;
    }

    @Override
    public Ride updateRideStatus(Long rideId, RideStatus rideStatus) {
        return null;
    }

    @Override
    public Page<Ride> getAllRidesOfRider(Long riderId, PageRequest pageRequest) {
        return null;
    }

    @Override
    public Page<Ride> getAllRidesOfDriver(Long DriverId, PageRequest pageRequest) {
        return null;
    }
}
