package com.project.sf.controller;

import com.project.sf.modele.Echancier;
import com.project.sf.repository.EchancierRepository;
import com.project.sf.repository.EtapeEchancierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/echancier")
public class EchancierController {

    @Autowired private EchancierRepository echancierRepository;
    @Autowired private EtapeEchancierRepository etapeEchancierRepository;

    @GetMapping
    public List<Echancier> getAllEchancier(){
        return echancierRepository.findAll();
    }

    @GetMapping("/delivery/{id}")
    public List<Echancier> getEchancierByDeliveryId(@PathVariable Long id){
        return echancierRepository.findAllByDelivery_DeliveryId(id);
    }
}
