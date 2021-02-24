package com.project.sf.repository;

import com.project.sf.modele.DevisRatioItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DevisRatioItemRepository extends JpaRepository<DevisRatioItem, Long> {

    public DevisRatioItem findByDevisRatioItemId(Long id);
}
