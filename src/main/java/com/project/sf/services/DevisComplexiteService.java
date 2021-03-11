package com.project.sf.services;

import com.project.sf.modele.DevisComplexite;
import com.project.sf.repository.DevisComplexiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DevisComplexiteService {

    @Autowired
    private DevisComplexiteRepository devisComplexiteRepository;


    public DevisComplexite save(DevisComplexite newDevisComplexite){
        DevisComplexite devisComplexite = new DevisComplexite();
        devisComplexite.setNom(newDevisComplexite.getNom());
        devisComplexite.setLibelle(newDevisComplexite.getLibelle());
        devisComplexite.setValeur(newDevisComplexite.getValeur());
        devisComplexite.setDate(newDevisComplexite.getDate());

        devisComplexite.setCategorieDescription(newDevisComplexite.getCategorieDescription());
        devisComplexite.setCategorieId(newDevisComplexite.getCategorieId());
        devisComplexite.setCategorieName(newDevisComplexite.getCategorieName());

        devisComplexite.setDevisComplexiteItem(newDevisComplexite.getDevisComplexiteItem());
        devisComplexite.setDomaineId(newDevisComplexite.getDomaineId());
        devisComplexite.setDomaineDesciption(newDevisComplexite.getDomaineDesciption());
        devisComplexite.setDomaineName(newDevisComplexite.getDomaineName());
        return devisComplexiteRepository.save(devisComplexite);
    }
}
