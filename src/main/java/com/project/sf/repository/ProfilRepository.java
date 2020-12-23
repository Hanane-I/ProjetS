package com.project.sf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.project.sf.modele.Profil;

@Repository
public interface ProfilRepository extends JpaRepository<Profil, Long> {

}
