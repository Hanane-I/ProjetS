package com.project.sf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.sf.modele.Projet;

import java.util.List;

@Repository
public interface ProjetRepository extends JpaRepository<Projet, Long>{
    public Projet findProjetByProjetId(Long id);
    public List<Projet> findAllByClient_ClientId(Long id);
	
}
