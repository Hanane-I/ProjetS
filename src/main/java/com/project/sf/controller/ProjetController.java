package com.project.sf.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import com.project.sf.services.ProjetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.project.sf.modele.Projet;
import com.project.sf.repository.ProjetRepository;

@RestController
@CrossOrigin
@RequestMapping("/api/projet")
public class ProjetController {

	@Autowired private ProjetRepository projetRepository;
	@Autowired private ProjetService projetService;
	
	@GetMapping
	public List<Projet> retrieveAllProjets() {
		return projetRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Projet getProjet(@PathVariable long id) {
		return projetRepository.findProjetByProjetId(id);
	}

	@GetMapping("/client/{id}")
	public List<Projet> getAllProjetByClient(@PathVariable long id){return projetRepository.findAllByClient_ClientId(id);}

	
	@PostMapping
	public ResponseEntity<Object> createProjet(@RequestBody Projet projet) {
		Projet savedProjet = projetService.save(projet);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(savedProjet.getProjetId()).toUri();

		return ResponseEntity.created(location).build();
	}
	
	
	@DeleteMapping("/{id}")
	public void deleteProjet(@PathVariable long id) {
		projetRepository.deleteById(id);
	}

	@PutMapping("/{id}")
	public ResponseEntity<?> updateProjet(@RequestBody Projet newProjet, @PathVariable Long id){
		Projet projet = projetService.update(newProjet, id);
		return ResponseEntity.ok(projet);
	}
}
