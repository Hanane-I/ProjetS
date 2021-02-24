package com.project.sf.controller;

import com.project.sf.modele.DevisRatio;
import com.project.sf.repository.DevisRatioRepository;
import com.project.sf.services.DevisRatioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api/devisRatio")
public class DevisRatioController {

    @Autowired
    private DevisRatioRepository devisRatioRepository;
    @Autowired private DevisRatioService devisRatioService;

    //get
    @GetMapping
    public List<DevisRatio> getAllDevisProjet(){
        return devisRatioRepository.findAll();
    }



    //post
    @PostMapping
    public ResponseEntity<?> save(@RequestBody DevisRatio devisRatio){
        return new ResponseEntity(devisRatioService.save(devisRatio), HttpStatus.ACCEPTED);
    }
}
