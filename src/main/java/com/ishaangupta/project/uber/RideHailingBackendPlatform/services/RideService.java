package com.ishaangupta.project.uber.RideHailingBackendPlatform.services;

import com.ishaangupta.project.uber.RideHailingBackendPlatform.dto.RideRequestDto;
import com.ishaangupta.project.uber.RideHailingBackendPlatform.entities.Driver;
import com.ishaangupta.project.uber.RideHailingBackendPlatform.entities.Ride;
import com.ishaangupta.project.uber.RideHailingBackendPlatform.entities.enums.RideStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;


public interface RideService {
    Ride getRideById(Long rideId);

    void matchWithDrivers(RideRequestDto rideRequestDto);

    Ride createNewRide(RideRequestDto rideRequestDto , Driver driver);

    Ride updateRideStatus(Long rideId, RideStatus rideStatus);

    Page<Ride> getAllRidesOfRider(Long riderId, PageRequest pageRequest);

    Page<Ride> getAllRidesOfDriver(Long DriverId, PageRequest pageRequest);

}
