package com.project.sf.repository;

import org.apache.catalina.LifecycleState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.project.sf.modele.Profil;

import java.util.List;

@Repository
public interface ProfilRepository extends JpaRepository<Profil, Long> {

        public void deleteProfilByProfilId(Long id);
        public Profil findProfilByProfilId(Long id);
}
