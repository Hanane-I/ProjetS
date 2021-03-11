package com.project.sf.repository;

import com.project.sf.modele.DevisTjItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DevisTjItemRepository extends JpaRepository<DevisTjItem, Long> {

     DevisTjItem findByDevisTjItemId(Long id);
}
