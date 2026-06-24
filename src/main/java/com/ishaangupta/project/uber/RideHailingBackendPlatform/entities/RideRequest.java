package com.ishaangupta.project.uber.RideHailingBackendPlatform.entities;

import com.ishaangupta.project.uber.RideHailingBackendPlatform.entities.enums.PaymentMethod;
import com.ishaangupta.project.uber.RideHailingBackendPlatform.entities.enums.RideRequestStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class RideRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "Geometry(Point,4326)")
    private Point pickupLocation;

    @Column(columnDefinition = "geometry(Point,4326)")
    private Point dropOffLocation;

    @CreationTimestamp
    private LocalDateTime requestedTime;

    @ManyToOne(fetch = FetchType.LAZY)
    private Rider rider;

    @Enumerated(value = EnumType.STRING)
    private RideRequestStatus rideRequestStatus;

    @Enumerated(value = EnumType.STRING)
    private PaymentMethod paymentMethod;



}
