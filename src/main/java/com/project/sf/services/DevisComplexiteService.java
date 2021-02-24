package com.project.sf.services;

import com.project.sf.modele.DevisComplexite;
import org.springframework.stereotype.Service;

@Service
public class DevisComplexiteService {


    public DevisComplexite save(DevisComplexite newDevisComplexite){
        DevisComplexite devisComplexite = new DevisComplexite();
        devisComplexite.setNom(newDevisComplexite.getNom());
        devisComplexite.setDomaineId(newDevisComplexite.getDomaineId());
        devisComplexite.setLibelle(newDevisComplexite.getLibelle());
        devisComplexite.setValeur(newDevisComplexite.getValeur());
        return devisComplexite;
    }
}
