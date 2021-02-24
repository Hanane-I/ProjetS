package com.project.sf.repository;

import com.project.sf.modele.DevisTJ;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DevisTJRepository extends JpaRepository<DevisTJ, Long> {
}
