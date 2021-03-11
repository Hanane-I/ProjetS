package com.project.sf.controller;

import com.project.sf.modele.DevisComplexiteItem;
import com.project.sf.modele.DevisItem;
import com.project.sf.repository.DevisComplexiteItemRepository;
import com.project.sf.repository.DevisItemRepository;
import com.project.sf.services.DevisComplexiteItemService;
import com.project.sf.services.DevisItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/devisItem")
public class DevisItemController {

    @Autowired private DevisItemRepository devisItemRepository;
    @Autowired private DevisItemService devisItemService;


    @GetMapping
    public List<DevisItem> getAll(){ return devisItemRepository.findAll();}

    @GetMapping("/{id}")
    public DevisItem get(@PathVariable Long id){return devisItemRepository.findAllByDevisItemId(id);}

    @PostMapping
    public ResponseEntity<?> save(@RequestBody DevisItem devisItem){
        return new ResponseEntity<>(devisItemService.save(devisItem), HttpStatus.ACCEPTED);
    }
}
