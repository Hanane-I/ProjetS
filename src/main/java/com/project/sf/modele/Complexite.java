package com.project.sf.modele;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.io.Serializable;


@Entity
public class Complexite implements Serializable {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long complexiteId;
	private String nom;
	private String libelle;
	private double valeur;
	
	@ManyToOne
	@JoinColumn(name = "domaine_id")
	private Domaine domaine;

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public double getValeur() {
		return valeur;
	}

	public void setValeur(double valeur) {
		this.valeur = valeur;
	}

	public long getComplexiteId() {
		return complexiteId;
	}

	public void setComplexiteId(long complexiteId) {
		this.complexiteId = complexiteId;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Domaine getDomaine() {
		return domaine;
	}

	public void setDomaine(Domaine domaine) {
		this.domaine = domaine;
	}
	
	
	
}
