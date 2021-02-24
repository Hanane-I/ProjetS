package com.project.sf.controller;

import com.project.sf.modele.DevisEchancier;
import com.project.sf.repository.DevisEchancierRepository;
import com.project.sf.services.DevisEchancierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/devisEchancier")
public class DevisEchancierController {

    @Autowired private DevisEchancierRepository devisEchancierRepository;
    @Autowired private DevisEchancierService devisEchancierService;

    //get
    @GetMapping
    public List<DevisEchancier> getListDevisEchancier(){
        return devisEchancierRepository.findAll();
    }

    //get by id
    @GetMapping("/{id}")
    public DevisEchancier getDevisEchancier(@PathVariable Long id){
        return devisEchancierRepository.findDevisEchancierByDevisEchancierId(id);
    }

    //post
    @PostMapping
    public ResponseEntity<?> save(@RequestBody DevisEchancier devisEchancier){
        return new ResponseEntity(devisEchancierService.save(devisEchancier), HttpStatus.ACCEPTED);
    }
}
