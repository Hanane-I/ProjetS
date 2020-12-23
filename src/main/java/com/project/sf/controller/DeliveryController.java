package com.project.sf.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import com.project.sf.modele.Delivery;
import com.project.sf.repository.DeliveryRepository;
import com.project.sf.services.DeliveryService;

@RestController
@CrossOrigin
@RequestMapping("/delivery")
public class DeliveryController {
	
	@Autowired
	private DeliveryRepository deliveryRepository;

	@GetMapping
	public List<Delivery> retrieveAllDelivery() {
		return deliveryRepository.findAll();
	}


	@PostMapping
	public Delivery createDelivery(@RequestBody Delivery delivery) {
		return deliveryRepository.save(delivery);
	}

	@DeleteMapping("/{id}")
	public void deleteDelivery(@PathVariable Long id){
		deliveryRepository.deleteById(id);
	}

	@PutMapping("/{id}")
	public Delivery updateDelivery(@RequestBody Delivery newDelivery, @PathVariable Long id){
		return deliveryRepository.findById(id)
				.map(delivery -> {
					delivery.setCharge(newDelivery.getCharge());
					delivery.setIdClient(newDelivery.getIdClient());
					return deliveryRepository.save(delivery);
				})
				.orElseGet(() -> {
					newDelivery.setDeliveryId(id);
					return deliveryRepository.save(newDelivery);
				});
	}
}
