package com.project.sf.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.sf.modele.Delivery;
import com.project.sf.repository.DeliveryRepository;

@Service
public class DeliveryService {

	@Autowired
	private DeliveryRepository deliveryRepository;

	public Delivery findDeliveryById(Long deliveryId){
		return deliveryRepository.findByDeliveryId(deliveryId);
	}
	


	
}
