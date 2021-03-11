package com.project.sf.controller;

import java.util.Collection;
import java.util.List;

import com.project.sf.repository.RatioRepository;
import com.project.sf.services.ActiviteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import com.project.sf.modele.Activite;
import com.project.sf.repository.ActiviteRepository;


@RestController
@CrossOrigin
@RequestMapping("/api/activite")
public class ActiviteController {
	
	@Autowired private ActiviteRepository activiteRepository;
	@Autowired private ActiviteService activiteService;
	
	@GetMapping
	public List<Activite> getAllActivite() {
		return activiteRepository.findAll();
	}

	@GetMapping("/{id}")
	public Activite getActiviteById(@PathVariable Long id){
		return activiteRepository.findByActiviteId(id);
	}
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> saveActivite(@RequestBody Activite activite) {
		return new ResponseEntity<>(activiteService.saveActivite(activite), HttpStatus.CREATED);
	}

	@DeleteMapping("/{id}")
	public void deleteActivite(@PathVariable Long id){
		activiteRepository.deleteById(id);
	}

	@PutMapping("/{id}")
	public ResponseEntity<?> updateActivite(@RequestBody Activite activite, @PathVariable Long id){
		return new ResponseEntity<>(activiteService.updateActivite(activite, id), HttpStatus.ACCEPTED);
	}
}
