package com.ishaangupta.project.uber.RideHailingBackendPlatform.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DriverDto {
    private UserDto user;
    private double rating;
}
