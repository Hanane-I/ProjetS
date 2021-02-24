package com.project.sf.repository;

import com.project.sf.modele.DevisComplexiteItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DevisComplexiteItemRepository extends JpaRepository<DevisComplexiteItem, Long> {
    public DevisComplexiteItem findByDevisComplexiteItemId(Long id);
}
