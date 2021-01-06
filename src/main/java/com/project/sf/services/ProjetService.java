package com.project.sf.services;

import com.project.sf.modele.Projet;
import com.project.sf.repository.ProjetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjetService {

    @Autowired private ProjetRepository projetRepository;

    public Projet save(Projet projet){
        Projet newProjet = new Projet();
        newProjet.setNomProjet(projet.getNomProjet());
        newProjet.setCommentaire(projet.getCommentaire());
        newProjet.setNumContrat(projet.getNumContrat());
        newProjet.setClient(projet.getClient());
        newProjet.setCategories(projet.getCategories());
        newProjet.setDeliveries(projet.getDeliveries());
        return projetRepository.save(newProjet);
    }

    public Projet update (Projet newProjet, Long id){
        Projet projet = projetRepository.findProjetByProjetId(id);
        projet.setClient(newProjet.getClient());
        projet.setNomProjet(newProjet.getNomProjet());
        projet.setCommentaire(newProjet.getCommentaire());
        projet.setNumContrat(newProjet.getNumContrat());
        projet.setCategories(newProjet.getCategories());
        projet.setDeliveries(newProjet.getDeliveries());
        return projetRepository.save(projet);
    }
}
