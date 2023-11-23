package com.daywid.carparkingapi.models;

import org.springframework.lang.NonNull;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Establishment {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String name;

    @NonNull
    private String address;

    @NonNull
    private String phoneNumber;

    @NonNull
    private int motorcycleSpots;

    @NonNull
    private int carSpots;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getMotorcycleSpots() {
        return motorcycleSpots;
    }

    public void setMotorcycleSpots(int motorcycleSpots) {
        this.motorcycleSpots = motorcycleSpots;
    }

    public int getCarSpots() {
        return carSpots;
    }

    public void setCarSpots(int carSpots) {
        this.carSpots = carSpots;
    }

}
