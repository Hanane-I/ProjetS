package com.project.sf.modele;

import java.util.*;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Activite {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long activiteId;
	private String libelle;
	private long idCourt;
	private long idLong;
	
	@OneToMany(mappedBy = "activite", cascade = CascadeType.ALL)
	private Collection<Ratio> ratio = new ArrayList<Ratio>();

	public long getActiviteId() {
		return activiteId;
	}

	public void setActiviteId(long activiteId) {
		this.activiteId = activiteId;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public long getIdCourt() {
		return idCourt;
	}

	public void setIdCourt(long idCourt) {
		this.idCourt = idCourt;
	}

	public long getIdLong() {
		return idLong;
	}

	public void setIdLong(long idLong) {
		this.idLong = idLong;
	}

	public Collection<Ratio> getRatio() {
		return ratio;
	}

	public void setRatio(Collection<Ratio> ratio) {
		this.ratio = ratio;
	}
	
	
}
