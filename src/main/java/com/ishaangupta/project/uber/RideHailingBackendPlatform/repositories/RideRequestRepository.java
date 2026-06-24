package com.ishaangupta.project.uber.RideHailingBackendPlatform.repositories;

import com.ishaangupta.project.uber.RideHailingBackendPlatform.entities.RideRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideRequestRepository extends JpaRepository<RideRequest, Long> {
}