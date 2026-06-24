package com.ishaangupta.project.uber.RideHailingBackendPlatform.entities;

import com.ishaangupta.project.uber.RideHailingBackendPlatform.entities.enums.PaymentMethod;
import com.ishaangupta.project.uber.RideHailingBackendPlatform.entities.enums.PaymentStatus;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    private Ride ride;

    @Enumerated(value = EnumType.STRING)
    private PaymentMethod paymentMethod;

    @Enumerated(value = EnumType.STRING)
    private PaymentStatus paymentStatus;

    private Double amount;

    @CreationTimestamp
    private LocalDateTime paymentTime;


}
