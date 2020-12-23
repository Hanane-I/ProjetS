package com.project.sf.modele;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
public class Domaine {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String libelle;
	
	@ManyToOne
	@JoinColumn(name = "categorie_id")
	private Categorie categorie;
	
	@OneToMany(mappedBy = "domaine", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<Complexite> complexites;
	
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getLibelle() {
		return libelle;
	}
	
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	@JsonBackReference
	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	
	@JsonManagedReference
	public Set<Complexite> getComplexites() {
		return complexites;
	}

	public void setComplexites(Set<Complexite> complexites) {
		this.complexites = complexites;
	}
	
	

	

}
