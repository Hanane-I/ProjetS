package com.project.sf.repository;

import com.project.sf.modele.DevisItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DevisItemRepository extends JpaRepository<DevisItem, Long> {
    DevisItem findAllByDevisItemId(Long id);
}
