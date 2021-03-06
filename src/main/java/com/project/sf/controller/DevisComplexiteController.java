package com.project.sf.controller;

import com.project.sf.modele.DevisComplexite;
import com.project.sf.repository.DevisComplexiteRepository;
import com.project.sf.services.DevisComplexiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/devisComplexite")
public class DevisComplexiteController {

    @Autowired private DevisComplexiteRepository devisComplexiteRepository;
    @Autowired private DevisComplexiteService devisComplexiteService;


    @GetMapping
    public List<DevisComplexite> getListDevisComplexite(){
        return devisComplexiteRepository.findAll();
    }

    @GetMapping("/{id}")
    public DevisComplexite getDevisComplexite(@PathVariable Long id){
        return devisComplexiteRepository.findDevisComplexiteByDevisComplexiteId(id);
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody DevisComplexite devisComplexite){
        return new ResponseEntity<>(devisComplexiteService.save(devisComplexite), HttpStatus.ACCEPTED);
    }
}
