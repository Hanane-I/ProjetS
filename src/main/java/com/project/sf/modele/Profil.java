package com.project.sf.modele;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Profil implements Serializable {

	@Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long profilId;
	private String libelle;

	@OneToMany(mappedBy = "profil", cascade = CascadeType.ALL)
	private Collection<Tj> tj;

	public long getProfilId() {
		return profilId;
	}

	public void setProfilId(long profilId) {
		this.profilId = profilId;
	}

	public Collection<Tj> getTj() {
		return tj;
	}

	public void setTj(Collection<Tj> tj) {
		this.tj = tj;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}




}
