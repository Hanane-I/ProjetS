package com.project.sf.services;

import com.project.sf.modele.Client;
import com.project.sf.modele.Profil;
import com.project.sf.modele.Tj;
import com.project.sf.repository.ProfilRepository;
import com.sun.scenario.effect.impl.prism.PrFilterContext;
import org.hibernate.property.access.internal.PropertyAccessFieldImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfilService {

    @Autowired public ProfilRepository profilRepository;
    @Autowired public ClientService clientService;

    public Profil findProfilById(Long id){ return profilRepository.findProfilByProfilId(id);}

    public Profil updateProfil(Profil profil, Long id){
        Profil newProfil = profilRepository.findProfilByProfilId(id);
        newProfil.setCout(profil.getCout());
        newProfil.setLibelle(profil.getLibelle());
        newProfil.setTj(profil.getTj());
        return profilRepository.save(newProfil);
    }

    public Profil save(Profil profil){
        Profil newProfil =  new Profil();
        newProfil.setCout(profil.getCout());
        newProfil.setLibelle(profil.getLibelle());
        newProfil.setTj(profil.getTj());
        return profilRepository.save(newProfil);
    }


}
