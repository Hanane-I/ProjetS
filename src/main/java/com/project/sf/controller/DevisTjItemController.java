package com.project.sf.controller;

import com.project.sf.modele.DevisRatioItem;
import com.project.sf.modele.DevisTjItem;
import com.project.sf.repository.DevisRatioItemRepository;
import com.project.sf.repository.DevisTjItemRepository;
import com.project.sf.services.DevisRatioItemService;
import com.project.sf.services.DevisTjItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/devisTjItem")
public class DevisTjItemController {

    @Autowired private DevisTjItemRepository devisTjItemRepository;
    @Autowired private DevisTjItemService devisTjItemService;


    @GetMapping
    public List<DevisTjItem> getAll(){
        return devisTjItemRepository.findAll();
    }

    @GetMapping("/{id}")
    public DevisTjItem get(@PathVariable Long id){
        return devisTjItemRepository.findByDevisTjItemId(id);
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody DevisTjItem devisTjItem){
        return new ResponseEntity<>(devisTjItemService.save(devisTjItem), HttpStatus.ACCEPTED);
    }
}
