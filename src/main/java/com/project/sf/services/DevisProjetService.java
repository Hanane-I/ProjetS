package com.project.sf.services;

import com.project.sf.modele.DevisProjet;
import com.project.sf.repository.DevisProjetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DevisProjetService {

    @Autowired private DevisProjetRepository devisProjetRepository;

    public DevisProjet saveDevisProjet(DevisProjet newDevisProjet){
        DevisProjet devisProjet = new DevisProjet();
        devisProjet.setCommentaire(newDevisProjet.getCommentaire());
        devisProjet.setNomProjet(newDevisProjet.getNomProjet());
        devisProjet.setNumContrat(newDevisProjet.getNumContrat());
        return devisProjetRepository.save(devisProjet);
    }
}
