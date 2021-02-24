package com.project.sf.repository;

import com.project.sf.modele.Ratio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.lang.annotation.Retention;
import java.util.List;

@Repository
public interface RatioRepository extends JpaRepository<Ratio, Long> {
    public List<Ratio> findByIdActiviteId(Long activiteId);

    public void deleteRatioByActivite_ActiviteIdAndDelivery_DeliveryId(Long idA,  Long idD);

    public Ratio findRatioByActivite_ActiviteIdAndDelivery_DeliveryId(Long idA, Long idD);

    public List<Ratio> findRatioByActivite_ActiviteId(Long idA);
    public List<Ratio> findRatioByDelivery_DeliveryId(Long idD);
    public void deleteRatioByActivite_ActiviteId(Long id);
}
