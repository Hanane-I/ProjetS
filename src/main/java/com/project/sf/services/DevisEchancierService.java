package com.project.sf.services;

import com.project.sf.modele.DevisEchancier;
import org.springframework.stereotype.Service;

@Service
public class DevisEchancierService {

    public DevisEchancier save(DevisEchancier newDevisEchancier){
        DevisEchancier devisEchancier = new DevisEchancier();
        devisEchancier.setDeliveryId(newDevisEchancier.getDeliveryId());
        devisEchancier.setPourcentage(newDevisEchancier.getPourcentage());
        devisEchancier.setEtapeEchancierId(newDevisEchancier.getEtapeEchancierId());
        return devisEchancier;
    }
}
