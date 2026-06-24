package com.ishaangupta.project.uber.RideHailingBackendPlatform.strategies;

import com.ishaangupta.project.uber.RideHailingBackendPlatform.dto.RideRequestDto;

public interface RideFareCalculationStrategy {
    double calculateFare(RideRequestDto rideRequestDto);
}
