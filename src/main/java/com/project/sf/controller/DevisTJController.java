package com.project.sf.controller;

import com.project.sf.modele.DevisTJ;
import com.project.sf.repository.DevisTJRepository;
import com.project.sf.services.DevisTJService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/devisTj")
public class DevisTJController {

    @Autowired private DevisTJRepository devisTJRepository;
    @Autowired private DevisTJService devisTJService;

    //get
    @GetMapping
    public List<DevisTJ> getAllDevisProjet(){
        return devisTJRepository.findAll();
    }



    //post
    @PostMapping
    public ResponseEntity<?> save(@RequestBody DevisTJ devisTJ){
        return new ResponseEntity(devisTJService.save(devisTJ), HttpStatus.ACCEPTED);
    }
}
