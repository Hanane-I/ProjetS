package com.project.sf.modele;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

import javax.persistence.*;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity 
@Data @AllArgsConstructor @NoArgsConstructor @ToString
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler","domaines"})
public class Categorie implements Serializable {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long categorieId;
	private String nom;
	private String libelle;
	
	@OneToMany( mappedBy = "categorie", cascade = CascadeType.ALL)
	private Collection<Domaine> domaines = new ArrayList<Domaine>();

	@ManyToOne
	@JoinColumn(name = "projet_id")
	private Projet projet;

	public long getCategorieId() {
		return categorieId;
	}

	public void setCategorieId(long categorieId) {
		this.categorieId = categorieId;
	}

	public String getLibelle() {
		return libelle;
	}
	
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Projet getProjet() {
		return projet;
	}

	public void setProjet(Projet projet) {
		this.projet = projet;
	}

	public Collection<Domaine> getDomaines() {
		return domaines;
	}

	public void setDomaines(Collection<Domaine> domaines) {
		this.domaines = domaines;
	}
}
