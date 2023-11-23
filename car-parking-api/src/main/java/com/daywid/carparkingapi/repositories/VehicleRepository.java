package com.daywid.carparkingapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daywid.carparkingapi.models.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}
