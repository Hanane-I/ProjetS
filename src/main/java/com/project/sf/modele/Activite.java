package com.project.sf.modele;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.*;

import javax.persistence.*;

@Entity
public class Activite  {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long activiteId;
	private String libelle;
	private String idCourt;
	private String idLong;
	
	@OneToMany(mappedBy = "activite", cascade = CascadeType.ALL)
	private Collection<Ratio> ratio;

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
	public String getIdCourt() {
		return idCourt;
	}
	public void setIdCourt(String idCourt) {
		this.idCourt = idCourt;
	}
	public String getIdLong() {
		return idLong;
	}
	public void setIdLong(String idLong) {
		this.idLong = idLong;
	}
	public Collection<Ratio> getRatio() {
		return ratio;
	}
	public void setRatio(Collection<Ratio> ratio) { this.ratio = ratio;}
}
