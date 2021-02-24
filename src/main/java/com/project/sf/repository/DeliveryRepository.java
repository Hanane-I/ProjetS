package com.project.sf.repository;

import jdk.nashorn.internal.runtime.logging.DebugLogger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.project.sf.modele.Delivery;

import java.util.List;

@Repository
public interface DeliveryRepository extends JpaRepository<Delivery, Long>{
    Delivery findByDeliveryId(Long deliveryId);
    void deleteDeliveryByDeliveryId(Long deliveryId);
    List<Delivery> findAllByProjet_ProjetId(Long id);
}
