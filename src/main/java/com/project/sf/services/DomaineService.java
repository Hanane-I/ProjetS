package com.project.sf.services;

import com.project.sf.modele.Domaine;
import com.project.sf.repository.DomaineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DomaineService {

    @Autowired private DomaineRepository domaineRepository;

    public Domaine save(Domaine newDomaine){
        Domaine domaine = new Domaine();
        domaine.setNom(newDomaine.getNom());
        domaine.setLibelle(newDomaine.getLibelle());
        domaine.setCategorie(newDomaine.getCategorie());
        domaine.setComplexites(newDomaine.getComplexites());
        return domaineRepository.save(domaine);
    }

    public Domaine update(Domaine newDomaine, Long id){
        Domaine domaine = domaineRepository.findDomaineByDomaineId(id);
        domaine.setNom(newDomaine.getNom());
        domaine.setLibelle(newDomaine.getLibelle());
        domaine.setCategorie(newDomaine.getCategorie());
        domaine.setComplexites(newDomaine.getComplexites());
        return domaineRepository.save(domaine);
    }
}
