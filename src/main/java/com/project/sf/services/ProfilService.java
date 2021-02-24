package com.project.sf.services;

import com.project.sf.modele.*;
import com.project.sf.repository.DeliveryRepository;
import com.project.sf.repository.ProfilRepository;
import com.sun.scenario.effect.impl.prism.PrFilterContext;
import org.hibernate.property.access.internal.PropertyAccessFieldImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class ProfilService {

    @Autowired public ProfilRepository profilRepository;
    @Autowired public ClientService clientService;
    @Autowired public DeliveryRepository deliveryRepository;


    public Profil updateProfil(Profil profil, Long id){
        Profil newProfil = profilRepository.findProfilByProfilId(id);
        newProfil.setLibelle(profil.getLibelle());
        newProfil.getTj().addAll((profil.getTj().stream().map(tj -> {
            Delivery delivery = deliveryRepository.findByDeliveryId(tj.getDelivery().getDeliveryId());
            System.out.println(delivery.getDeliveryId());
            Tj newTj = new Tj();
            newTj.setDelivery(delivery);
            newTj.setProfil(newProfil);
            newTj.setCout(tj.getCout());
            return newTj;
        }).collect(Collectors.toList())
        ));

        return profilRepository.save(newProfil);
    }

    public Profil save(Profil profil){
        Profil newProfil =  new Profil();
        newProfil.setLibelle(profil.getLibelle());
        newProfil.getTj().addAll((profil.getTj().stream().map(tj -> {
            Delivery delivery = deliveryRepository.findByDeliveryId(tj.getDelivery().getDeliveryId());
            Tj newTj = new Tj();
            newTj.setDelivery(delivery);
            newTj.setProfil(newProfil);
            newTj.setCout(tj.getCout());
            return newTj;
        }).collect(Collectors.toList())
        ));
        return profilRepository.save(newProfil);
    }


}
