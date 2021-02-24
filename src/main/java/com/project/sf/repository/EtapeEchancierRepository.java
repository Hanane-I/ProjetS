package com.project.sf.repository;

import com.project.sf.modele.EtapeEchancier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtapeEchancierRepository extends JpaRepository<EtapeEchancier, Long> {
    public EtapeEchancier findAllByEtapeEchancierId(Long id);
}
