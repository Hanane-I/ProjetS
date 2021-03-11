
package com.project.sf.services;

import com.project.sf.modele.DevisItem;
import com.project.sf.repository.DevisItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DevisItemService {
    @Autowired
    private DevisItemRepository devisItemRepository;


    public DevisItem save(DevisItem devisItem){
        DevisItem devisItem1 = new DevisItem();
        devisItem1.setDevis(devisItem.getDevis());
        devisItem1.setDevisComplexiteItems(devisItem.getDevisComplexiteItems());
        devisItem1.setDevisEchancierItems(devisItem.getDevisEchancierItems());
        devisItem1.setDevisRatioItems(devisItem.getDevisRatioItems());
        devisItem1.setDevisTjItems(devisItem.getDevisTjItems());
        devisItem1.setEvolution(devisItem.getEvolution());
        devisItem1.setFonction(devisItem.getFonction());
        return devisItemRepository.save(devisItem1);
    }
}
