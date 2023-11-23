package com.daywid.carparkingapi.services;

import java.util.List;

import com.daywid.carparkingapi.models.Vehicle;

public interface VehicleService {
    List<Vehicle> getAllVehicles();
    Vehicle getVehicleById(Long id);
    Vehicle saveVehicle(Vehicle vehicle);
    Vehicle updateVehicle(Long id, Vehicle vehicle);
    void deleteVehicle(Long id);
}
