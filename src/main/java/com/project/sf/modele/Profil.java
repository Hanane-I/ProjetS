package com.project.sf.modele;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Profil {
	@Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String libelle;
	private double cout;
	
	@OneToMany(mappedBy = "profil", cascade = CascadeType.ALL)
	private Set<Tj> tj;

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public double getCout() {
		return cout;
	}

	public void setCout(double cout) {
		this.cout = cout;
	}
	
	
}
