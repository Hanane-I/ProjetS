package com.project.sf.repository;

import com.project.sf.modele.DevisComplexite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DevisComplexiteRepository extends JpaRepository<DevisComplexite, Long> {

    DevisComplexite findDevisComplexiteByDevisComplexiteId(Long id);
}
