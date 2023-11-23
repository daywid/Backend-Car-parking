package com.daywid.carparkingapi.services;

import com.daywid.carparkingapi.models.Establishment;
import com.daywid.carparkingapi.repositories.EstablishmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstablishmentServiceImpl implements EstablishmentService {

    @Autowired
    private EstablishmentRepository establishmentRepository;

    @Override
    public List<Establishment> getAllEstablishments() {
        return establishmentRepository.findAll();
    }

    @Override
    public Establishment getEstablishmentById(Long id) {
        return establishmentRepository.findById(id).orElse(null);
    }

    @Override
    public Establishment saveEstablishment(Establishment establishment) {
        return establishmentRepository.save(establishment);
    }

    @Override
    public Establishment updateEstablishment(Long id, Establishment establishment) {
        if (establishmentRepository.existsById(id)) {
            establishment.setId(id);
            return establishmentRepository.save(establishment);
        }
        return null; // ou lançar exceção indicando que o estabelecimento não foi encontrado
    }

    @Override
    public void deleteEstablishment(Long id) {
        establishmentRepository.deleteById(id);
    }
}
