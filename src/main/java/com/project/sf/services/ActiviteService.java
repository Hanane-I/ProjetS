package com.project.sf.services;


import com.project.sf.modele.Delivery;
import com.project.sf.modele.Ratio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.sf.modele.Activite;
import com.project.sf.repository.ActiviteRepository;

import java.util.stream.Collectors;

@Service
public class ActiviteService {
	@Autowired
	private ActiviteRepository activiteRepository;
	@Autowired
	private DeliveryService deliveryService;

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
			Delivery delivery = deliveryService.findDeliveryById(ratio.getDelivery().getDeliveryId());
			Ratio newRatio = new Ratio();
			newRatio.setDelivery(delivery);
			newRatio.setPourcentage(ratio.getPourcentage());
			newRatio.setActivite(newActivite);
			return newRatio;
		}).collect(Collectors.toList())
		));
		return activiteRepository.save(newActivite);

	}
}
