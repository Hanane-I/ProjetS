package com.project.sf.services;

import com.project.sf.modele.DevisTjItem;
import org.springframework.stereotype.Service;

@Service
public class DevisTjItemService {

    public DevisTjItem save(DevisTjItem devisTjItem){
        DevisTjItem newDevisTjItem = new DevisTjItem();
        newDevisTjItem.setDevisItem(devisTjItem.getDevisItem());
        newDevisTjItem.setDevisTJS(devisTjItem.getDevisTJS());
        return newDevisTjItem;
    }
}

