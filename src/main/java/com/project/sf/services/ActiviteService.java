package com.project.sf.services;


import com.project.sf.modele.Delivery;
import com.project.sf.modele.Ratio;
import com.project.sf.repository.RatioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.sf.modele.Activite;
import com.project.sf.repository.ActiviteRepository;

import java.util.Collection;
import java.util.stream.Collectors;

@Service
public class ActiviteService {
	@Autowired private ActiviteRepository activiteRepository;
	@Autowired private DeliveryService deliveryService;
	@Autowired private RatioService ratioService;
	@Autowired private RatioRepository ratioRepository;

	public Activite findActiviteById(Long activiteId){
		return activiteRepository.findByActiviteId(activiteId);
	}


	public Activite saveActivite(Activite activite){
		Activite newActivite = new Activite();
		newActivite.setIdCourt(activite.getIdCourt());
		newActivite.setIdLong(activite.getIdLong());
		newActivite.setLibelle(activite.getLibelle());
		newActivite.getRatio().addAll((activite.getRatio()
			.stream()
			.map(ratio -> {
				Delivery delivery = deliveryService.findDeliveryById(ratio.getDelivery().getDeliveryId());
				Ratio newRatio = new Ratio();
				newRatio.setDelivery(delivery);
				newRatio.setActivite(newActivite);
				newRatio.setPourcentage(ratio.getPourcentage());
				newRatio.setOrdreAffichage(ratio.getOrdreAffichage());
				return newRatio;
			})
			.collect(Collectors.toList())
		));
		return activiteRepository.save(newActivite);
	}

	public Activite updateActivite(Activite activite, Long id){
		Activite newActivite = activiteRepository.findByActiviteId(id);
		newActivite.setLibelle(activite.getLibelle());
		newActivite.setIdLong(activite.getIdLong());
		newActivite.setIdCourt(activite.getIdCourt());
		newActivite.getRatio().addAll((activite.getRatio().stream().map(ratio -> {
			System.out.println(ratio.getDelivery().getDeliveryId());
			Delivery delivery = deliveryService.findDeliveryById(ratio.getDelivery().getDeliveryId());
			Ratio newRatio = new Ratio();
			newRatio.setDelivery(delivery);
			newRatio.setPourcentage(ratio.getPourcentage());
			newRatio.setOrdreAffichage(ratio.getOrdreAffichage());
			newRatio.setActivite(newActivite);
			return newRatio;
		}).collect(Collectors.toList())
		));
		return activiteRepository.save(newActivite);

	}


	public void deleteRatioActivite(Activite activite, int idr){
		Collection<Ratio> ratioList = activite.getRatio();
		Ratio ratio = (Ratio) ratioList.toArray()[idr - 1];
		Long idD = ratio.getDelivery().getDeliveryId();
		System.out.println(activite.getActiviteId() + "  "+ idD );
		ratioRepository.deleteRatioByActivite_ActiviteIdAndDelivery_DeliveryId(activite.getActiviteId(), idD);
		//ratioService.delete(activite.getActiviteId(), idD);
	}
}
