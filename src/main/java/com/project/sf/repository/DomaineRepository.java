package com.project.sf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.sf.modele.Domaine;

import java.util.List;

@Repository
public interface DomaineRepository extends JpaRepository<Domaine, Long>{

    public Domaine findDomaineByDomaineId(Long id);
    public List<Domaine> findAllByCategorie_CategorieId(Long id);
    public Domaine findByDomaineId(Long id);
}
