

package com.project.sf.controller;


import com.project.sf.modele.Ratio;
import com.project.sf.repository.ActiviteRepository;
import com.project.sf.repository.DeliveryRepository;
import com.project.sf.repository.RatioRepository;
import com.project.sf.services.ActiviteService;
import com.project.sf.services.RatioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/ratio")
public class RatioController {

    @Autowired private RatioService ratioService;
    @Autowired private RatioRepository ratioRepository;
    @Autowired private ActiviteRepository activiteRepository;
    @Autowired private DeliveryRepository deliveryRepository;

    @GetMapping
    public List<Ratio> getAllRatio(){
        return ratioRepository.findAll();
    }

    @GetMapping("/{id}")
    public List<Ratio> getRatio(@PathVariable Long id){
        return ratioService.findRatioByActiviteId(id);
    }

    @GetMapping("/activite/{id}")
    public List<Ratio> getRatioByActiviteId(@PathVariable Long id){ return ratioRepository.findRatioByActivite_ActiviteId(id);}

    @GetMapping("/delivery/{id}")
    public List<Ratio> getRatioByDeliveryId(@PathVariable Long id){ return ratioRepository.findRatioByDelivery_DeliveryId(id);}


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
}
