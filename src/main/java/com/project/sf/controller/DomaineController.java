package com.project.sf.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import com.project.sf.services.DomaineService;
import org.hibernate.procedure.spi.ParameterRegistrationImplementor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.project.sf.modele.Domaine;
import com.project.sf.repository.DomaineRepository;

@RestController
@RequestMapping("/api/domaine")
public class DomaineController {
	
	@Autowired private DomaineRepository domaineRepository;
	@Autowired private DomaineService domaineService;

	@GetMapping
	public List<Domaine> retrieveAllDomaines() {
		return domaineRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Domaine retrieveDomaine(@PathVariable long id) {
		Optional<Domaine> activite = domaineRepository.findById(id);
		return activite.get();
	}
	
	@PostMapping
	public ResponseEntity<Object> createDomaine(@RequestBody Domaine domaine) {
		Domaine savedDomaine = domaineService.save(domaine);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(savedDomaine.getDomaineId()).toUri();

		return ResponseEntity.created(location).build();
	}
	
	
	@DeleteMapping("/{id}")
	public void deleteDomaine(@PathVariable long id) {
		domaineRepository.deleteById(id);
	}

	@PutMapping("/{id}")
	public ResponseEntity<?> putDomaine(@RequestBody Domaine newDomaine, @PathVariable Long id){
		Domaine domaine = domaineService.update(newDomaine, id);
		return new ResponseEntity<>(domaineRepository.save(domaine), HttpStatus.ACCEPTED);
	}
}
