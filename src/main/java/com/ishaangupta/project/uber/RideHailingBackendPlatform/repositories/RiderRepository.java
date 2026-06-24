package com.ishaangupta.project.uber.RideHailingBackendPlatform.repositories;

import com.ishaangupta.project.uber.RideHailingBackendPlatform.entities.Rider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RiderRepository extends JpaRepository<Rider, Long> {
}