package com.project.sf.controller;

import com.project.sf.modele.DevisComplexite;
import com.project.sf.modele.DevisComplexiteItem;
import com.project.sf.repository.DevisComplexiteItemRepository;
import com.project.sf.services.DevisComplexiteItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/devisComplexiteItem")
public class DevisComplexiteItemController {

    @Autowired private DevisComplexiteItemRepository devisComplexiteItemRepository;
    @Autowired private DevisComplexiteItemService devisComplexiteItemService;


    @GetMapping
    public List<DevisComplexiteItem> getAll(){ return devisComplexiteItemRepository.findAll();}

    @GetMapping("/{id}")
    public DevisComplexiteItem get(@PathVariable Long id){return devisComplexiteItemRepository.findByDevisComplexiteItemId(id);}

    @PostMapping
    public ResponseEntity<?> save(@RequestBody DevisComplexiteItem devisComplexiteItem){
        return new ResponseEntity<>(devisComplexiteItemService.save(devisComplexiteItem), HttpStatus.ACCEPTED);
    }

}
