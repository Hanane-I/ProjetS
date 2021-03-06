package com.project.sf.services;

import com.project.sf.modele.*;
import com.project.sf.repository.ProfilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.sf.repository.DeliveryRepository;

import java.util.stream.Collectors;

@Service
public class DeliveryService {

	@Autowired private DeliveryRepository deliveryRepository;
	@Autowired private ActiviteService activiteService;
	@Autowired private ProfilService profilService;


	public Delivery save(Delivery delivery){
		Delivery newDelivery = new Delivery();
		newDelivery.setNom(delivery.getNom());
		newDelivery.setLibelle(delivery.getLibelle());
		newDelivery.setProjet(delivery.getProjet());
		newDelivery.getRatio().addAll((delivery.getRatio().stream().map(ratio -> {
			Activite activite = activiteService.findActiviteById(ratio.getActivite().getActiviteId());
			Ratio newRatio = new Ratio();
			newRatio.setDelivery(newDelivery);
			newRatio.setPourcentage(ratio.getPourcentage());
			newRatio.setActivite(activite);
			newRatio.setOrdreAffichage(ratio.getOrdreAffichage());
			return newRatio;
		}).collect(Collectors.toList())
		));

		newDelivery.setTj(delivery.getTj());
		return  deliveryRepository.save(newDelivery);
	}

	public Delivery update(Delivery delivery, Long id){
		Delivery newDelivery = deliveryRepository.findByDeliveryId(id);
		newDelivery.setNom(delivery.getNom());
		newDelivery.setLibelle(delivery.getLibelle());
		newDelivery.setProjet(delivery.getProjet());
		newDelivery.getRatio().addAll((delivery.getRatio().stream().map(ratio -> {
			Activite activite = activiteService.findActiviteById(ratio.getActivite().getActiviteId());
			Ratio newRatio = new Ratio();
			newRatio.setDelivery(newDelivery);
			newRatio.setPourcentage(ratio.getPourcentage());
			newRatio.setActivite(activite);
			newRatio.setOrdreAffichage(ratio.getOrdreAffichage());
			return newRatio;
		}).collect(Collectors.toList())
		));

		newDelivery.setTj(delivery.getTj());


		return deliveryRepository.save(newDelivery);
	}




	
}
