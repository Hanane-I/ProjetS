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
@RequestMapping("/api/delivery")
public class DeliveryController {
	
	@Autowired private DeliveryRepository deliveryRepository;
	@Autowired private DeliveryService deliveryService;

	@GetMapping
	public List<Delivery> retrieveAllDelivery() {
		return deliveryRepository.findAll();
	}

	@GetMapping("/{id}")
	public Delivery getDelivery(@PathVariable Long id){
		return deliveryRepository.findByDeliveryId(id);
	}

	@PostMapping
	public Delivery createDelivery(@RequestBody Delivery delivery) {
		return deliveryService.save(delivery);
	}

	@DeleteMapping("/{id}")
	public void deleteDelivery(@PathVariable Long id){
		deliveryRepository.deleteById(id);
	}

	@PutMapping("/{id}")
	public Delivery updateDelivery(@RequestBody Delivery newDelivery, @PathVariable Long id){
		return deliveryService.update(newDelivery, id);
	}
}
