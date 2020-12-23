package com.project.sf.controller;

import java.net.URI;
import java.util.List;

import com.project.sf.services.ActiviteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.project.sf.modele.Activite;
import com.project.sf.repository.ActiviteRepository;
import java.util.Optional;;

@RestController
@CrossOrigin
@RequestMapping("/api/activite")
public class ActiviteController {
	
	@Autowired
	private ActiviteRepository activiteRepository;

	@Autowired
	private ActiviteService activiteService;
	
	@GetMapping
	public List<Activite> getAllActivite() {
		return (List<Activite>) activiteRepository.findAll();
	}
	
	@PostMapping
	public ResponseEntity<?> saveActivite(@RequestBody Activite activite) {
		return new ResponseEntity<>(activiteService.saveActivite(activite), HttpStatus.CREATED);
	}

	@DeleteMapping("/{id}")
	public void deleteActivite(@PathVariable Long id){
		activiteRepository.deleteById(id);
	}

	@PutMapping("/{id}")
	public ResponseEntity<?> updateActivite(@RequestBody Activite activite, @PathVariable Long id){
		System.out.println("hdhbsdhsd  "+ activite.getActiviteId() );
		return new ResponseEntity<>(activiteService.updateActivite(activite, id), HttpStatus.ACCEPTED);
	}

	
}
