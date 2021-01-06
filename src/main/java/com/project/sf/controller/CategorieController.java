package com.project.sf.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import com.project.sf.services.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.project.sf.modele.Categorie;
import com.project.sf.repository.CategorieRepository;

@RestController
@RequestMapping("/api/categorie")
public class CategorieController {

	@Autowired private CategorieRepository categorieRepository;
	@Autowired private CategorieService categorieService;
	
	@GetMapping
	public List<Categorie> retrieveAllCategories() {
		return categorieRepository.findAll();
	}
	

	@GetMapping("/{id}")
	public Categorie retrieveCategorie(@PathVariable long id) {
		return categorieRepository.findCategorieByCategorieId(id);
	}
	
	@PostMapping
	public ResponseEntity<Object> createCategorie(@RequestBody Categorie categorie) {
		Categorie savedCategorie = categorieService.save(categorie);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(savedCategorie.getCategorieId()).toUri();

		return ResponseEntity.created(location).build();
	}
	
	@DeleteMapping("/{id}")
	public void deleteCategorie(@PathVariable long id) {
		categorieRepository.deleteById(id);
	}

	@PutMapping("/{id}")
	public ResponseEntity<?> updateCategorie(@RequestBody Categorie categorie,@PathVariable long id)	{
		Categorie savedCategorie = categorieService.update(categorie, id);
		return ResponseEntity.ok(savedCategorie);
	}
}
