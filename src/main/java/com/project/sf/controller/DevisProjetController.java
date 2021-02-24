package com.project.sf.controller;

import com.project.sf.modele.DevisProjet;
import com.project.sf.repository.DevisProjetRepository;
import com.project.sf.services.DevisProjetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/devisProjet")
public class DevisProjetController {

    @Autowired private DevisProjetService devisProjetService;
    @Autowired private DevisProjetRepository devisProjetRepository;

    //get
    @GetMapping
    public List<DevisProjet> getAllDevisProjet(){
        return devisProjetRepository.findAll();
    }

    //get by id
    @GetMapping("/{id}")
    public DevisProjet getDevisProjet(@PathVariable Long id){
        return devisProjetRepository.findDevisProjetByDevisProjetId(id);
    }

    //post
    @PostMapping
    public ResponseEntity<?> saveDevisProjet(@RequestBody DevisProjet devisProjet){
        return new ResponseEntity(devisProjetService.saveDevisProjet(devisProjet), HttpStatus.ACCEPTED);
    }
}
