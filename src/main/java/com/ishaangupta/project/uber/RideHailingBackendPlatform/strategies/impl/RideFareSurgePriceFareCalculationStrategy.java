package com.ishaangupta.project.uber.RideHailingBackendPlatform.strategies.impl;

import com.ishaangupta.project.uber.RideHailingBackendPlatform.dto.RideRequestDto;
import com.ishaangupta.project.uber.RideHailingBackendPlatform.strategies.RideFareCalculationStrategy;

public class RideFareSurgePriceFareCalculationStrategy implements RideFareCalculationStrategy {
    @Override
    public double calculateFare(RideRequestDto rideRequestDto) {
        return 0;
    }
}
