package com.ishaangupta.project.uber.RideHailingBackendPlatform.services;

import com.ishaangupta.project.uber.RideHailingBackendPlatform.dto.DriverDto;
import com.ishaangupta.project.uber.RideHailingBackendPlatform.dto.SignupDto;
import com.ishaangupta.project.uber.RideHailingBackendPlatform.dto.UserDto;

public interface AuthService {
    String login(String email, String password);

    UserDto signup(SignupDto signupDto);

    DriverDto  onboardingDriver(Long userId);
}
