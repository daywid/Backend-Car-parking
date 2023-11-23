package com.daywid.carparkingapi.controllers;

import com.daywid.carparkingapi.models.Establishment;
import com.daywid.carparkingapi.services.EstablishmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/establishments")
public class EstablishmentController {

    @Autowired
    private EstablishmentService establishmentService;

    @GetMapping
    public List<Establishment> getAllEstablishments() {
        return establishmentService.getAllEstablishments();
    }

    @GetMapping("/{id}")
    public Establishment getEstablishmentById(@PathVariable Long id) {
        return establishmentService.getEstablishmentById(id);
    }

    @PostMapping
    public Establishment saveEstablishment(@RequestBody Establishment establishment) {
        return establishmentService.saveEstablishment(establishment);
    }

    @PutMapping("/{id}")
    public Establishment updateEstablishment(@PathVariable Long id, @RequestBody Establishment establishment) {
        return establishmentService.updateEstablishment(id, establishment);
    }

    @DeleteMapping("/{id}")
    public void deleteEstablishment(@PathVariable Long id) {
        establishmentService.deleteEstablishment(id);
    }
}
