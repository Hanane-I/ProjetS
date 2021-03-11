package com.project.sf.services;

import com.project.sf.modele.DevisProjet;
import com.project.sf.modele.DevisRatio;
import com.project.sf.repository.DevisRatioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DevisRatioService {

    @Autowired private DevisRatioRepository devisRatioRepository;


    public DevisRatio save(DevisRatio newDevisRatio){
        DevisRatio devisRatio = new DevisRatio();
        devisRatio.setActiviteId(newDevisRatio.getActiviteId());
        devisRatio.setDeliveryId(newDevisRatio.getDeliveryId());
        devisRatio.setOrdreAffichage(newDevisRatio.getOrdreAffichage());
        devisRatio.setPourcentage(newDevisRatio.getPourcentage());
        devisRatio.setDate(newDevisRatio.getDate());
        devisRatio.setDeliveryLibelle(newDevisRatio.getDeliveryLibelle());
        devisRatio.setActiviteIdCourt(newDevisRatio.getActiviteIdCourt());
        devisRatio.setActiviteIdLong(newDevisRatio.getActiviteIdLong());
        devisRatio.setActiviteLibelle(newDevisRatio.getActiviteLibelle());
        devisRatio.setDeliveryNom(newDevisRatio.getDeliveryNom());
        devisRatio.setDevisRatioItem(newDevisRatio.getDevisRatioItem());
        return devisRatioRepository.save(devisRatio);
    }
}
