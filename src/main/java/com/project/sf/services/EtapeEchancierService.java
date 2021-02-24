package com.project.sf.services;

import com.project.sf.modele.*;
import com.project.sf.repository.DeliveryRepository;
import com.project.sf.repository.EtapeEchancierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class EtapeEchancierService {

    @Autowired private EtapeEchancierRepository etapeEchancierRepository;
    @Autowired private DeliveryRepository deliveryRepository;

    public EtapeEchancier saveEtapeEchancier(EtapeEchancier etapeEchancier){
        EtapeEchancier newEtapeEchancier = new EtapeEchancier();
        newEtapeEchancier.setEtape(etapeEchancier.getEtape());
        newEtapeEchancier.setEchanciers((etapeEchancier.getEchanciers().stream().map(echancier -> {
            Delivery delivery = deliveryRepository.findByDeliveryId(echancier.getDelivery().getDeliveryId());
            Echancier newEchancier = new Echancier();
            newEchancier.setDelivery(delivery);
            newEchancier.setEtapeEchancier(newEtapeEchancier);
            newEchancier.setPourcentage(echancier.getPourcentage());
            return newEchancier;
        })
                .collect(Collectors.toList())
        ));
        return etapeEchancierRepository.save(newEtapeEchancier);
    }


    public EtapeEchancier updateEtapeEchancier(EtapeEchancier etapeEchancier, Long id){
        EtapeEchancier newEtapeEchancier = etapeEchancierRepository.findAllByEtapeEchancierId(id);
        newEtapeEchancier.setEtape(etapeEchancier.getEtape());
        newEtapeEchancier.getEchanciers().addAll((etapeEchancier.getEchanciers().stream().map(echancier -> {
            Delivery delivery = deliveryRepository.findByDeliveryId(echancier.getDelivery().getDeliveryId());
            Echancier newEchancier = new Echancier();
            newEchancier.setDelivery(delivery);
            newEchancier.setEtapeEchancier(newEtapeEchancier);
            newEchancier.setPourcentage(echancier.getPourcentage());
            return newEchancier;
        }).collect(Collectors.toList())
        ));
        return  etapeEchancierRepository.save(newEtapeEchancier);
    }
}
