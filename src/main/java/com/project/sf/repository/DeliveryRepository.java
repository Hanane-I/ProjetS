package com.project.sf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.project.sf.modele.Delivery;


public interface DeliveryRepository extends JpaRepository<Delivery, Long>{
    Delivery findByDeliveryId(Long deliveryId);
    void deleteDeliveryByDeliveryId(Long deliveryId);
}
