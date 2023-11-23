package com.daywid.carparkingapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daywid.carparkingapi.models.Establishment;

public interface EstablishmentRepository extends JpaRepository<Establishment, Long>{
}
