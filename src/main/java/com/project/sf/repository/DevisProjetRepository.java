package com.project.sf.repository;

import com.project.sf.modele.DevisProjet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DevisProjetRepository extends JpaRepository<DevisProjet, Long> {
    public DevisProjet findDevisProjetByDevisProjetId(Long id);
}
