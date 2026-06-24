package com.ishaangupta.project.uber.RideHailingBackendPlatform.dto;

import com.ishaangupta.project.uber.RideHailingBackendPlatform.entities.enums.PaymentMethod;
import com.ishaangupta.project.uber.RideHailingBackendPlatform.entities.enums.RideStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RideDto {
    private Long id;
    private Point pickupLocation;
    private Point dropOffLocation;
    private LocalDateTime createdTime;
    private RiderDto rider;
    private DriverDto driver;
    private RideStatus rideStatus;
    private PaymentMethod paymentMethod;
    private LocalDateTime startedAt;
    private LocalDateTime endedAt;
    private Double fare;
}
