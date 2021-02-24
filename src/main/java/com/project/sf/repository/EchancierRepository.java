package com.project.sf.repository;

import com.project.sf.modele.Echancier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EchancierRepository  extends JpaRepository<Echancier, Long> {

    List<Echancier> findAllByDelivery_DeliveryId(Long id);
}
