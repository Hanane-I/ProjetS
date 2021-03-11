package com.project.sf.services;

import com.project.sf.modele.DevisTJ;
import com.project.sf.repository.DevisTJRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DevisTJService {

    @Autowired
    private DevisTJRepository devisTJRepository;

    public DevisTJ save(DevisTJ newDevisTJ){

        DevisTJ devisTJ = new DevisTJ();
        devisTJ.setDeliveryId(newDevisTJ.getDeliveryId());
        devisTJ.setProfilId(newDevisTJ.getProfilId());
        devisTJ.setCout(newDevisTJ.getCout());
        devisTJ.setDate(newDevisTJ.getDate());
        devisTJ.setLibelle(newDevisTJ.getLibelle());
        devisTJ.setNom(newDevisTJ.getNom());
        devisTJ.setProfilId(newDevisTJ.getProfilId());
        devisTJ.setProfilLibelle(newDevisTJ.getProfilLibelle());
        devisTJ.setDevisTjItem(newDevisTJ.getDevisTjItem());

        return devisTJRepository.save(devisTJ);
    }
}
