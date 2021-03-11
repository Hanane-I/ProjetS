package com.project.sf.services;

import com.project.sf.modele.DevisEchancierItem;
import com.project.sf.repository.DevisEchancierItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DevisEchancierItemService {

    @Autowired
    private DevisEchancierItemRepository devisEchancierItemRepository;


    public DevisEchancierItem save(DevisEchancierItem devisEchancierItem){
        DevisEchancierItem newDevisEchancierItem = new DevisEchancierItem();
        newDevisEchancierItem.setDevisEchancierS(devisEchancierItem.getDevisEchancierS());
        newDevisEchancierItem.setDevisItem(devisEchancierItem.getDevisItem());
        return devisEchancierItemRepository.save(newDevisEchancierItem);
    }
}
