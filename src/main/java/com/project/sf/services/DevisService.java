package com.project.sf.services;

import com.project.sf.modele.Devis;
import com.project.sf.repository.DevisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DevisService {

    @Autowired private DevisRepository devisRepository;

    public Object saveDevis(Devis devis){
        Devis newDevis = new Devis();
        newDevis.setLibelle(devis.getLibelle());
        newDevis.setDateCreation(devis.getDateCreation());
        newDevis.setDateValidation(devis.getDateValidation());
        newDevis.setDevisProjet(devis.getDevisProjet());
        newDevis.setDevisItems(devis.getDevisItems());
        return devisRepository.save(newDevis);
    }
}
