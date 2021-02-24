package com.project.sf.controller;

import com.project.sf.modele.EtapeEchancier;
import com.project.sf.repository.EtapeEchancierRepository;
import com.project.sf.services.EtapeEchancierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/etapeEchancier")
public class EtapeEchancierController {

    @Autowired private EtapeEchancierRepository etapeEchancierRepository;
    @Autowired private EtapeEchancierService etapeEchancierService;

    @GetMapping
    public List<EtapeEchancier> getAll(){
        return etapeEchancierRepository.findAll();
    }

    @GetMapping("/{id}")
    public EtapeEchancier getEtapeEchancier(@PathVariable Long id){
        return etapeEchancierRepository.findAllByEtapeEchancierId(id);
    }

    @PostMapping
    public ResponseEntity<?> addEtapeEchancier(@RequestBody EtapeEchancier etapeEchancier){
        return new ResponseEntity<>(etapeEchancierService.saveEtapeEchancier(etapeEchancier), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateEtapeEchancier(@RequestBody EtapeEchancier etapeEchancier, @PathVariable Long id){
        return new ResponseEntity<>(etapeEchancierService.updateEtapeEchancier(etapeEchancier, id), HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{id}")
    public void deleteEtapeEchancier(@PathVariable Long id){
        etapeEchancierRepository.deleteById(id);
    }
}
