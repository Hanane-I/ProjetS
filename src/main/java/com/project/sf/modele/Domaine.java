package com.project.sf.modele;

import java.io.Serializable;
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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler","complexites"})
public class Domaine implements Serializable {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long domaineId;
	private String nom;
	private String libelle;
	
	@ManyToOne
	@JoinColumn(name = "categorie_id")
	private Categorie categorie;
	
	@OneToMany(mappedBy = "domaine", cascade = CascadeType.ALL)
	private Set<Complexite> complexites;

	public long getDomaineId() {
		return domaineId;
	}

	public void setDomaineId(long domaineId) {
		this.domaineId = domaineId;
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

	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	
	public Set<Complexite> getComplexites() {
		return complexites;
	}

	public void setComplexites(Set<Complexite> complexites) {
		this.complexites = complexites;
	}
	
	

	

}
