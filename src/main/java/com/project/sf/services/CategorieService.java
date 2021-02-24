package com.project.sf.services;

import com.project.sf.modele.Categorie;
import com.project.sf.repository.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategorieService {

    @Autowired
    CategorieRepository categorieRepository;

    public Categorie save(Categorie categorie){
        Categorie newCategorie = new Categorie();
        newCategorie.setLibelle(categorie.getLibelle());
        newCategorie.setNom(categorie.getNom());
        newCategorie.setProjet(categorie.getProjet());
        newCategorie.setDomaines(categorie.getDomaines());
        return categorieRepository.save(newCategorie);
    }

    public Categorie update(Categorie categorie,long id){
        Categorie newCategorie = categorieRepository.findCategorieByCategorieId(id);
        newCategorie.setLibelle(categorie.getLibelle());
        newCategorie.setNom(categorie.getNom());
        newCategorie.setProjet(categorie.getProjet());
        newCategorie.setDomaines(categorie.getDomaines());
        return categorieRepository.save(newCategorie);
    }


}
