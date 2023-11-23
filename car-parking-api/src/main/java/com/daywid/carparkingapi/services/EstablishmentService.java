package com.daywid.carparkingapi.services;

import java.util.List;

import com.daywid.carparkingapi.models.Establishment;

public interface EstablishmentService {

    List<Establishment> getAllEstablishments();
    Establishment getEstablishmentById(Long id);
    Establishment saveEstablishment(Establishment establishment);
    Establishment updateEstablishment(Long id, Establishment establishment);
    void deleteEstablishment(Long id);


}