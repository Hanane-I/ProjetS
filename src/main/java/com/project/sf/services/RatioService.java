package com.project.sf.services;


import com.project.sf.modele.Activite;
import com.project.sf.modele.Delivery;
import com.project.sf.modele.Ratio;
import com.project.sf.modele.RatioId;
import com.project.sf.repository.ActiviteRepository;
import com.project.sf.repository.DeliveryRepository;
import com.project.sf.repository.RatioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatioService {

    @Autowired
    public RatioRepository ratioRepository;

    @Autowired public ActiviteService activiteService;
    @Autowired public ActiviteRepository activiteRepository;

    @Autowired public DeliveryService deliveryService;
    @Autowired public DeliveryRepository deliveryRepository;

    public List<Ratio> findRatioByActiviteId(Long activiteId){
        return ratioRepository.findByIdActiviteId(activiteId);
    }

    /*public Ratio update(Ratio ratio,Long idA, Long idD){
        Activite activite = activiteRepository.findByActiviteId(ratio.getId().getActiviteId());
        Delivery delivery = deliveryRepository.findByDeliveryId(ratio.getDelivery().getDeliveryId());
        Ratio newRatio = ratioRepository.findRatioByActivite_ActiviteIdAndDelivery_DeliveryId(idA, idD);
        RatioId id = new RatioId();
        id.setActiviteId(activite.getActiviteId());
        id.setDeliveryId(delivery.getDeliveryId());
        newRatio.setId(id);
        newRatio.setActivite(activite);
        newRatio.setDelivery(delivery);
        newRatio.setPourcentage(ratio.getPourcentage());
        return newRatio;
    }*/

}
