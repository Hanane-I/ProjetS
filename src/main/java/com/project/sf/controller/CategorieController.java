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

import com.project.sf.modele.Categorie;
import com.project.sf.repository.CategorieRepository;

@RestController
public class CategorieController {

	@Autowired
	private CategorieRepository categorieRepository;
	
	@GetMapping("/categories")
	public List<Categorie> retrieveAllCategories() {
		return categorieRepository.findAll();
	}
	

	@GetMapping("/categories/{id}")
	public Categorie retrieveCategorie(@PathVariable long id) {
		Optional<Categorie> categorie = categorieRepository.findById(id);
		return categorie.get();
	}
	
	@PostMapping("/categories")
	public ResponseEntity<Object> createCategorie(@RequestBody Categorie categorie) {
		Categorie savedCategorie = categorieRepository.save(categorie);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(savedCategorie.getId()).toUri();

		return ResponseEntity.created(location).build();
	}
	
	@DeleteMapping("/categories/{id}")
	public void deleteCategorie(@PathVariable long id) {
		categorieRepository.deleteById(id);
	}
}
