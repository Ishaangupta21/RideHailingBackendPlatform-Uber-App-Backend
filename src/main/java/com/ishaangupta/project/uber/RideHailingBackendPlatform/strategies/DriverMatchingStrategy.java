package com.ishaangupta.project.uber.RideHailingBackendPlatform.strategies;

import com.ishaangupta.project.uber.RideHailingBackendPlatform.dto.RideRequestDto;
import com.ishaangupta.project.uber.RideHailingBackendPlatform.entities.Driver;

import java.util.List;

public interface DriverMatchingStrategy {
    List<Driver> findMatchingDrivers(RideRequestDto rideRequestDto);
}
