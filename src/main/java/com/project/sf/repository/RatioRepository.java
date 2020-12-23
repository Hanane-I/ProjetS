package com.project.sf.repository;

import com.project.sf.modele.Ratio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RatioRepository extends JpaRepository<Ratio, Long> {
    public List<Ratio> findByIdActiviteId(Long activiteId);

    public void deleteRatioByActivite_ActiviteIdAndDelivery_DeliveryId(Long idA,  Long idD);

    public Ratio findRatioByActivite_ActiviteIdAndDelivery_DeliveryId(Long idA, Long idD);

    public List<Ratio> findRatioByActivite_ActiviteId(Long idA);
    public List<Ratio> findRatioByDelivery_DeliveryId(Long idD);
}
