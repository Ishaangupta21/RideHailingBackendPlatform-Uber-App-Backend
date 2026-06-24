package com.ishaangupta.project.uber.RideHailingBackendPlatform.repositories;

import com.ishaangupta.project.uber.RideHailingBackendPlatform.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}