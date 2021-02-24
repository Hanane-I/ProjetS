package com.project.sf.controller;

import com.project.sf.modele.Devis;
import com.project.sf.repository.DevisRepository;
import com.project.sf.services.DevisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/devis")
public class DevisController {

    @Autowired private DevisRepository devisRepository;
    @Autowired private DevisService devisService;


    //get
    @GetMapping
    public List<Devis> gettDevis(){
        return devisRepository.findAll();
    }

    //get id
    @GetMapping("/{id}")
    public Devis getDevisById(@PathVariable Long id){
        return devisRepository.findDevisByDevisId(id);
    }

    //post
    @PostMapping
    public ResponseEntity<?> saveDevis(@RequestBody Devis devis){
        return new ResponseEntity<>(devisService.saveDevis(devis),  HttpStatus.CREATED);
    }

    //supprimer un devis => supprimer tout le reste
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        Long idDevis = id;
        Long idDevisProjet ;
    }



}
