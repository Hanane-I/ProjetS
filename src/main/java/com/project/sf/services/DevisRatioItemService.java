package com.project.sf.services;

import com.project.sf.modele.DevisRatioItem;
import com.project.sf.repository.DevisRatioItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DevisRatioItemService {

    @Autowired
    private DevisRatioItemRepository devisRatioItemRepository;

    public DevisRatioItem save(DevisRatioItem devisRatioItem){
        DevisRatioItem newDevisRatioItem = new DevisRatioItem();
        newDevisRatioItem.setDevisItem(devisRatioItem.getDevisItem());
        newDevisRatioItem.setDevisRatios(devisRatioItem.getDevisRatios());
        return devisRatioItemRepository.save(newDevisRatioItem);
    }
}
