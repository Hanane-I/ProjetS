package com.project.sf.services;

import com.project.sf.modele.DevisEchancier;
import com.project.sf.repository.DevisEchancierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DevisEchancierService {

    @Autowired
    private DevisEchancierRepository devisEchancierRepository;


    public DevisEchancier save(DevisEchancier newDevisEchancier){
        DevisEchancier devisEchancier = new DevisEchancier();
        devisEchancier.setDeliveryId(newDevisEchancier.getDeliveryId());
        devisEchancier.setPourcentage(newDevisEchancier.getPourcentage());
        devisEchancier.setEtapeEchancierId(newDevisEchancier.getEtapeEchancierId());
        devisEchancier.setDate(newDevisEchancier.getDate());
        devisEchancier.setDeliveryNom(newDevisEchancier.getDeliveryNom());
        devisEchancier.setDeliveryLibelle(newDevisEchancier.getDeliveryLibelle());
        devisEchancier.setDevisEchancierItem(newDevisEchancier.getDevisEchancierItem());
        devisEchancier.setEtapeEchancierEtape(newDevisEchancier.getEtapeEchancierEtape());
        return devisEchancierRepository.save(devisEchancier);
    }
}
