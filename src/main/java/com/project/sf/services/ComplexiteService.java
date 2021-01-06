package com.project.sf.services;

import com.project.sf.modele.Complexite;
import com.project.sf.repository.ComplexiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComplexiteService {

    @Autowired private ComplexiteRepository complexiteRepository;


    public Complexite save(Complexite complexite){
        Complexite newComplexite = new Complexite();
        newComplexite.setNom(complexite.getNom());
        newComplexite.setLibelle(complexite.getLibelle());
        newComplexite.setValeur(complexite.getValeur());
        newComplexite.setDomaine(complexite.getDomaine());
        return complexiteRepository.save(newComplexite);
    }

    public Complexite update(Complexite complexite, Long id){
        Complexite newComplexite = complexiteRepository.findComplexiteByComplexiteId(id);
        newComplexite.setNom(complexite.getNom());
        newComplexite.setLibelle(complexite.getLibelle());
        newComplexite.setValeur(complexite.getValeur());
        newComplexite.setDomaine(complexite.getDomaine());
        return complexiteRepository.save(newComplexite);
    }
}
