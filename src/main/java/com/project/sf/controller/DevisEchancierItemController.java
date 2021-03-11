package com.project.sf.controller;

import com.project.sf.modele.DevisEchancierItem;
import com.project.sf.modele.DevisRatioItem;
import com.project.sf.repository.DevisEchancierItemRepository;
import com.project.sf.repository.DevisRatioItemRepository;
import com.project.sf.services.DevisEchancierItemService;
import com.project.sf.services.DevisRatioItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/devisEchancierItem")
public class DevisEchancierItemController {

    @Autowired private DevisEchancierItemRepository devisEchancierItemRepository;
    @Autowired private DevisEchancierItemService devisEchancierItemService;


    @GetMapping
    public List<DevisEchancierItem> getAll(){
        return devisEchancierItemRepository.findAll();
    }

    @GetMapping("/{id}")
    public DevisEchancierItem get(@PathVariable Long id){
        return devisEchancierItemRepository.findByDevisEchancierItemId(id);
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody DevisEchancierItem devisEchancierItem){
        return new ResponseEntity<>(devisEchancierItemService.save(devisEchancierItem), HttpStatus.ACCEPTED);
    }
}
