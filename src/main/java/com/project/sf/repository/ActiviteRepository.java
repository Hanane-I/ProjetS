package com.project.sf.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.sf.modele.Activite;
import org.springframework.stereotype.Repository;

@Repository
public interface ActiviteRepository extends JpaRepository<Activite, Long>{

    public Activite findByActiviteId(Long activiteId);
    public void deleteActiviteByActiviteId(Long activiteId);

}

