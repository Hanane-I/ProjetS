package com.project.sf.modele;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity 
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Categorie {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String libelle;
	
	//@OneToMany(fetch = FetchType.EAGER, mappedBy = "categorie")
	@OneToMany( mappedBy = "categorie", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<Domaine> domaines;
	
	public String getLibelle() {
		return libelle;
	}
	
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	@JsonManagedReference
	public Set<Domaine> getDomaines() {
		return domaines;
	}
	
	public void setDomaines(Set<Domaine> domaines) {
		this.domaines = domaines;
	}
}
