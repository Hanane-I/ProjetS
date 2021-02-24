package com.project.sf.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.project.sf.modele.Tj;
import com.project.sf.repository.TjRepository;

@RestController
@RequestMapping("/api/tj")
public class TjController {
	@Autowired
	private TjRepository tjRepository;
	
	@GetMapping
	public List<Tj> retrieveAllTj() {
		return tjRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Tj retrieveTj(@PathVariable long id) {
		Optional<Tj> tj = tjRepository.findById(id);
		return tj.get();
	}

	@GetMapping("/delivery/{id}")
	public List<Tj> getAllByDelivery(@PathVariable Long id){
		return tjRepository.findAllByDelivery_DeliveryId(id);
	}
	
	@PostMapping
	public ResponseEntity<Object> createTj(@RequestBody Tj tj) {
		Tj savedTj= tjRepository.save(tj);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(savedTj.getId()).toUri();

		return ResponseEntity.created(location).build();
	}
	
	@DeleteMapping("/{id}")
	@Transactional
	public void deleteTj(@PathVariable long id) {
		tjRepository.deleteById(id);
	}


}
