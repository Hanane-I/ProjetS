package com.project.sf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.sf.modele.Projet;

@Repository
public interface ProjetRepository extends JpaRepository<Projet, Long>{

	
}
