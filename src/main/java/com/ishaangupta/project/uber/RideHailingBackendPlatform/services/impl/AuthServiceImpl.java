package com.ishaangupta.project.uber.RideHailingBackendPlatform.services.impl;

import com.ishaangupta.project.uber.RideHailingBackendPlatform.dto.DriverDto;
import com.ishaangupta.project.uber.RideHailingBackendPlatform.dto.SignupDto;
import com.ishaangupta.project.uber.RideHailingBackendPlatform.dto.UserDto;
import com.ishaangupta.project.uber.RideHailingBackendPlatform.services.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    public UserDto signup(SignupDto signupDto) {
        return null;
    }

    @Override
    public DriverDto onboardingDriver(Long userId) {
        return null;
    }
}
