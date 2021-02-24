package com.project.sf.repository;

import com.project.sf.modele.Devis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DevisRepository extends JpaRepository<Devis, Long> {

     Devis findDevisByDevisId(Long id);



}
