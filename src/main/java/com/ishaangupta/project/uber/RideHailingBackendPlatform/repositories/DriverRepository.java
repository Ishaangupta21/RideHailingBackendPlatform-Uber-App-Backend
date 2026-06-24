package com.ishaangupta.project.uber.RideHailingBackendPlatform.repositories;

import com.ishaangupta.project.uber.RideHailingBackendPlatform.entities.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {
}