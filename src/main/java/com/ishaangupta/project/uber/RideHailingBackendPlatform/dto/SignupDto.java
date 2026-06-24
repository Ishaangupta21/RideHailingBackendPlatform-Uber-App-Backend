package com.ishaangupta.project.uber.RideHailingBackendPlatform.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SignupDto {
    String name;
    String email;
    String password;
}
