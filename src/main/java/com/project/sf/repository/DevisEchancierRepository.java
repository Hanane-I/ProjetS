package com.project.sf.repository;

import com.project.sf.modele.DevisEchancier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DevisEchancierRepository extends JpaRepository<DevisEchancier, Long> {

    public DevisEchancier findDevisEchancierByDevisEchancierId(Long id);
}
