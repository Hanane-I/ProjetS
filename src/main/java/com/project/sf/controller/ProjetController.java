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

import com.project.sf.modele.Projet;
import com.project.sf.repository.ProjetRepository;

@RestController
public class ProjetController {

	@Autowired 
	private ProjetRepository projetRepository;
	
	@GetMapping("/projets")
	public List<Projet> retrieveAllProjets() {
		return projetRepository.findAll();
	}
	
	@GetMapping("/projets/{id}")
	public Projet retrieveProjet(@PathVariable long id) {
		Optional<Projet> projet = projetRepository.findById(id);
		return projet.get();
	}
	
	@PostMapping("/projets")
	public ResponseEntity<Object> createProjet(@RequestBody Projet projet) {
		Projet savedProjet = projetRepository.save(projet);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(savedProjet.getId()).toUri();

		return ResponseEntity.created(location).build();
	}
	
	
	@DeleteMapping("/projets/{id}")
	public void deleteProjet(@PathVariable long id) {
		projetRepository.deleteById(id);
	}
}
