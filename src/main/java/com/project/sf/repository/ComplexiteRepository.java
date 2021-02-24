package com.project.sf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.sf.modele.Complexite;

import java.util.List;

@Repository
public interface ComplexiteRepository extends JpaRepository<Complexite, Long> {

    public Complexite findComplexiteByComplexiteId(Long id);
    public List<Complexite> findAllByDomaine_DomaineId(Long id);

}
