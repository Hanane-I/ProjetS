package com.project.sf.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.project.sf.modele.Domaine;
import com.project.sf.repository.DomaineRepository;

@RestController
public class DomaineController {
	
	@Autowired
	private DomaineRepository domaineRepository; 

	@GetMapping("/domaines")
	public List<Domaine> retrieveAllDomaines() {
		return domaineRepository.findAll();
	}
	
	@GetMapping("/domaines/{id}")
	public Domaine retrieveDomaine(@PathVariable long id) {
		Optional<Domaine> activite = domaineRepository.findById(id);
		return activite.get();
	}
	
	@PostMapping("/domaines")
	public ResponseEntity<Object> createDomaine(@RequestBody Domaine domaine) {
		Domaine savedDomaine = domaineRepository.save(domaine);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(savedDomaine.getId()).toUri();

		return ResponseEntity.created(location).build();
	}
	
	
	@DeleteMapping("/domaines/{id}")
	public void deleteDomaine(@PathVariable long id) {
		domaineRepository.deleteById(id);
	}
}
