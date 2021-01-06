package com.project.sf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.sf.modele.Domaine;

@Repository
public interface DomaineRepository extends JpaRepository<Domaine, Long>{

    public Domaine findDomaineByDomaineId(Long id);
}
