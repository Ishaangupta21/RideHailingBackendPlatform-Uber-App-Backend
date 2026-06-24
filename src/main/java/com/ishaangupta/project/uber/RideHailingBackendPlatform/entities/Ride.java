package com.ishaangupta.project.uber.RideHailingBackendPlatform.entities;

import com.ishaangupta.project.uber.RideHailingBackendPlatform.entities.enums.PaymentMethod;
import com.ishaangupta.project.uber.RideHailingBackendPlatform.entities.enums.RideStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Ride {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "Geometry(Point,4326)")
    private Point pickupLocation;

    @Column(columnDefinition = "geometry(Point,4326)")
    private Point dropOffLocation;

    @CreationTimestamp
    private LocalDateTime createdTime;

    @ManyToOne(fetch = FetchType.LAZY)
    private Rider rider;

    @ManyToOne(fetch = FetchType.LAZY)
    private Driver driver;

    @Enumerated(value = EnumType.STRING)
    private RideStatus rideStatus;

    @Enumerated(value = EnumType.STRING)
    private PaymentMethod paymentMethod;

    private LocalDateTime startedAt;
    private LocalDateTime endedAt;
    private Double fare;
}
