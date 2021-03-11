package com.project.sf.controller;

import com.project.sf.modele.Complexite;
import com.project.sf.modele.DevisRatioItem;
import com.project.sf.repository.ComplexiteRepository;
import com.project.sf.repository.DevisRatioItemRepository;
import com.project.sf.services.ComplexiteService;
import com.project.sf.services.DevisRatioItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api/devisRatioItem")
public class DevisRatioItemController {


    @Autowired private DevisRatioItemRepository devisRatioItemRepository;
    @Autowired private DevisRatioItemService devisRatioItemService;


    @GetMapping
    public List<DevisRatioItem> getAllComplexite(){
        return devisRatioItemRepository.findAll();
    }

    @GetMapping("/{id}")
    public DevisRatioItem getComplexite(@PathVariable Long id){
        return devisRatioItemRepository.findByDevisRatioItemId(id);
    }

    @PostMapping
    public ResponseEntity<?> saveComplexite(@RequestBody DevisRatioItem devisRatioItem){
        return new ResponseEntity<>(devisRatioItemService.save(devisRatioItem), HttpStatus.ACCEPTED);
    }
}
