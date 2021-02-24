package com.project.sf.services;

import com.project.sf.modele.DevisProjet;
import com.project.sf.modele.DevisRatio;
import org.springframework.stereotype.Service;

@Service
public class DevisRatioService {

    public DevisRatio save(DevisRatio newDevisRatio){
        DevisRatio devisRatio = new DevisRatio();
        devisRatio.setActiviteId(newDevisRatio.getActiviteId());
        devisRatio.setDeliveryId(newDevisRatio.getDeliveryId());
        devisRatio.setOrdreAffichage(newDevisRatio.getOrdreAffichage());
        devisRatio.setPourcentage(newDevisRatio.getPourcentage());
        return devisRatio;
    }
}
