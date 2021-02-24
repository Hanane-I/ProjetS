package com.project.sf.services;

import com.project.sf.modele.DevisComplexiteItem;
import org.springframework.stereotype.Service;

@Service
public class DevisComplexiteItemService {

    public DevisComplexiteItem save(DevisComplexiteItem devisComplexiteItem){
        DevisComplexiteItem newDevisComplexiteItem = new DevisComplexiteItem();
        newDevisComplexiteItem.setDevisComplexite(devisComplexiteItem.getDevisComplexite());
        newDevisComplexiteItem.setDevisItem(devisComplexiteItem.getDevisItem());
        return newDevisComplexiteItem;
    }



}
