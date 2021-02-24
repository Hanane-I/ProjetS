package com.project.sf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.sf.modele.Profil;

import java.util.List;

@Repository
public interface ProfilRepository extends JpaRepository<Profil, Long> {
        void deleteProfilByProfilId(Long id);
        Profil findProfilByProfilId(Long id);
        List<Profil> findAllByProfilId(Long id);
}






