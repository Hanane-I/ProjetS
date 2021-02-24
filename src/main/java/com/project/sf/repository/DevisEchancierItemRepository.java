package com.project.sf.repository;

import com.project.sf.modele.DevisEchancierItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DevisEchancierItemRepository extends JpaRepository<DevisEchancierItem, Long> {

    public DevisEchancierItem findByDevisEchancierItemId(Long id);
}
