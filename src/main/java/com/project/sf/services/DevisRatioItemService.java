package com.project.sf.services;

import com.project.sf.modele.DevisRatioItem;
import org.springframework.stereotype.Service;

@Service
public class DevisRatioItemService {

    public DevisRatioItem save(DevisRatioItem devisRatioItem){
        DevisRatioItem newDevisRatioItem = new DevisRatioItem();
        newDevisRatioItem.setDevisItem(devisRatioItem.getDevisItem());
        newDevisRatioItem.setDevisRatios(devisRatioItem.getDevisRatios());
        return newDevisRatioItem;
    }
}
