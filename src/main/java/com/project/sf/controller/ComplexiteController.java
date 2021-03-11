package com.project.sf.controller;

import com.project.sf.modele.Complexite;
import com.project.sf.repository.ComplexiteRepository;
import com.project.sf.services.ComplexiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api/complexite")
public class ComplexiteController {

    @Autowired private ComplexiteRepository complexiteRepository;
    @Autowired private ComplexiteService complexiteService;

    @GetMapping
    public List<Complexite> getAllComplexite(){
        return complexiteRepository.findAll();
    }

    @GetMapping("/{id}")
    public Complexite getComplexite(@PathVariable Long id){
        Optional<Complexite> complexite =  complexiteRepository.findById(id);
        return complexite.get();
    }

    @GetMapping("/domaine/{id}")
    public List<Complexite> getComplexiteByDomaine(@PathVariable Long id){
        return complexiteRepository.findAllByDomaine_DomaineId(id);
    }

    @PostMapping
    public ResponseEntity<?> saveComplexite(@RequestBody Complexite complexite){
        Complexite savedComplexite = complexiteService.save(complexite);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(savedComplexite.getComplexiteId()).toUri();
        return ResponseEntity.created(location).build();
    }

    @DeleteMapping("/{id}")
    public void deleteComplexite(@PathVariable Long id){
        complexiteRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateComplexite(@RequestBody Complexite newComplexite, @PathVariable Long id){
        Complexite complexite = complexiteService.update(newComplexite, id);
        return ResponseEntity.ok(complexite);
    }

}
