package com.project.sf.services;

import com.project.sf.modele.DevisEchancierItem;
import org.springframework.stereotype.Service;

@Service
public class DevisEchancierItemService {

    public DevisEchancierItem save(DevisEchancierItem devisEchancierItem){
        DevisEchancierItem newDevisEchancierItem = new DevisEchancierItem();
        newDevisEchancierItem.setDevisEchancierS(devisEchancierItem.getDevisEchancierS());
        newDevisEchancierItem.setDevisItem(devisEchancierItem.getDevisItem());
        return newDevisEchancierItem;
    }
}
