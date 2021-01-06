package com.project.sf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.sf.modele.Categorie;

@Repository
public interface CategorieRepository extends JpaRepository<Categorie, Long> {

    public Categorie findCategorieByCategorieId(Long id);
}
