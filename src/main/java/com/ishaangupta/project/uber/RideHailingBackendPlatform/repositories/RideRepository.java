package com.ishaangupta.project.uber.RideHailingBackendPlatform.repositories;

import com.ishaangupta.project.uber.RideHailingBackendPlatform.entities.Ride;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideRepository extends JpaRepository<Ride, Long> {
}