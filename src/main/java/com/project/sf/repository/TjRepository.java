package com.project.sf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.project.sf.modele.Tj;

import java.util.List;

@Repository
public interface TjRepository extends JpaRepository<Tj, Long> {
    List<Tj> findAllByDelivery_DeliveryId(Long id);
}
