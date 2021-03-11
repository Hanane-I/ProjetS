package com.project.sf.services;

import com.project.sf.modele.DevisComplexiteItem;
import com.project.sf.repository.DevisComplexiteItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DevisComplexiteItemService {

    @Autowired
    private DevisComplexiteItemRepository devisComplexiteItemRepository;


    public DevisComplexiteItem save(DevisComplexiteItem devisComplexiteItem){
        DevisComplexiteItem newDevisComplexiteItem = new DevisComplexiteItem();
        newDevisComplexiteItem.setDevisComplexite(devisComplexiteItem.getDevisComplexite());
        newDevisComplexiteItem.setDevisItem(devisComplexiteItem.getDevisItem());
        return devisComplexiteItemRepository.save(newDevisComplexiteItem);
    }



}
