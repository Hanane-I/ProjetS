package com.project.sf.controller;

import com.project.sf.modele.Activite;
import com.project.sf.modele.Delivery;
import com.project.sf.modele.Ratio;
import com.project.sf.modele.RatioId;
import com.project.sf.repository.ActiviteRepository;
import com.project.sf.repository.DeliveryRepository;
import com.project.sf.repository.RatioRepository;
import com.project.sf.services.ActiviteService;
import com.project.sf.services.RatioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api/ratio")
public class RatioController {

    @Autowired
    private RatioService ratioService;

    @Autowired
    private RatioRepository ratioRepository;

    @Autowired
    private ActiviteService activiteService;

    @Autowired
    private ActiviteRepository activiteRepository;
    @Autowired private DeliveryRepository deliveryRepository;

    @GetMapping
    public List<Ratio> getAllRatio(){
        return ratioRepository.findAll();
    }

    @GetMapping("/{id}")
    public List<Ratio> getRatio(@PathVariable Long id){
        return ratioService.findRatioByActiviteId(id);
    }

    @DeleteMapping
    @Transactional
    @Query("delete from Ratio r where r.activite.activiteId=:idA and r.delivery.deliveryId=:idD")
    public void deleteRatio(@Param("idA") Long idA, @Param("idD") Long idD){
        int nbActivite = ratioRepository.findRatioByActivite_ActiviteId(idA).size();
        int nbDelivery = ratioRepository.findRatioByDelivery_DeliveryId(idD).size();
        if(nbActivite == 1)
            activiteRepository.deleteActiviteByActiviteId(idA);
        if(nbDelivery == 1)
            deliveryRepository.deleteDeliveryByDeliveryId(idD);
        ratioRepository.deleteRatioByActivite_ActiviteIdAndDelivery_DeliveryId(idA, idD);
    }

   /* @PutMapping
    public Ratio updateRatio(@RequestBody Ratio ratio, @Param("idA") Long idA, @Param("idD") Long idD){
        Ratio r = ratioService.update(ratio,idA, idD);
        return ratioRepository.save(r);
    }*/
}
