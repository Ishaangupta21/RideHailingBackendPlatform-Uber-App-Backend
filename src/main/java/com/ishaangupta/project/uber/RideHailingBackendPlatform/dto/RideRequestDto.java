package com.ishaangupta.project.uber.RideHailingBackendPlatform.dto;

import com.ishaangupta.project.uber.RideHailingBackendPlatform.entities.Rider;
import com.ishaangupta.project.uber.RideHailingBackendPlatform.entities.enums.PaymentMethod;
import com.ishaangupta.project.uber.RideHailingBackendPlatform.entities.enums.RideRequestStatus;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

public class RideRequestDto {
    private Long id;
    private Point pickupLocation;
    private Point dropOffLocation;
    private LocalDateTime requestedTime;
    private RiderDto rider;
    private RideRequestStatus rideRequestStatus;
    private PaymentMethod paymentMethod;
}
