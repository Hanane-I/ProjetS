package com.project.sf.services;

import com.project.sf.modele.DevisTjItem;
import com.project.sf.repository.DevisTjItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DevisTjItemService {

    @Autowired
    private DevisTjItemRepository devisTjItemRepository;

    public DevisTjItem save(DevisTjItem devisTjItem){
        DevisTjItem newDevisTjItem = new DevisTjItem();
        newDevisTjItem.setDevisItem(devisTjItem.getDevisItem());
        newDevisTjItem.setDevisTJS(devisTjItem.getDevisTJS());
        return devisTjItemRepository.save(newDevisTjItem);
    }
}

