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

import com.project.sf.modele.Tj;
import com.project.sf.repository.TjRepository;

@RestController
public class TjController {
	@Autowired
	private TjRepository tjRepository;
	
	@GetMapping("/tjs")
	public List<Tj> retrieveAllTj() {
		return tjRepository.findAll();
	}
	
	@GetMapping("/tj/{id}")
	public Tj retrieveTj(@PathVariable long id) {
		Optional<Tj> tj = tjRepository.findById(id);
		return tj.get();
	}
	
	@PostMapping("/tj")
	public ResponseEntity<Object> createTj(@RequestBody Tj tj) {
		Tj savedTj= tjRepository.save(tj);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(savedTj.getId()).toUri();

		return ResponseEntity.created(location).build();
	}
	
	@DeleteMapping("/tj/{id}")
	public void deleteTj(@PathVariable long id) {
		tjRepository.deleteById(id);
	}


}
