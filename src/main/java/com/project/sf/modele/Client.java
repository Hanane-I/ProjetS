package com.project.sf.modele;

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
public class Client implements Serializable {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long clientId;
	private String nom;
	private String siret;
	private String refClient;
	private String identTva;
	private String adresse;
	private String telephone;
	
	@OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
	private Collection<Tj> tj = new ArrayList<Tj>();

	@OneToMany( mappedBy = "client", cascade = CascadeType.ALL)
	private Collection<Projet> projets = new ArrayList<Projet>();

	public long getClientId() {
		return clientId;
	}

	public void setClientId(long clientId) {
		this.clientId = clientId;
	}

	public Collection<Tj> getTj() {
		return tj;
	}

	public void setTj(Collection<Tj> tj) {
		this.tj = tj;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getSiret() {
		return siret;
	}

	public void setSiret(String siret) {
		this.siret = siret;
	}

	public String getRefClient() {
		return refClient;
	}

	public void setRefClient(String refClient) {
		this.refClient = refClient;
	}

	public String getIdentTva() {
		return identTva;
	}

	public void setIdentTva(String identTva) {
		this.identTva = identTva;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTelephone() { return telephone; }

	public void setTelephone(String telephone) { this.telephone = telephone; }

	public Collection<Projet> getProjets() {
		return projets;
	}

	public void setProjets(Collection<Projet> projets) {
		this.projets = projets;
	}
}
