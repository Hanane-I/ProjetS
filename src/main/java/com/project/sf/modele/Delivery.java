package com.project.sf.modele;




import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;


import javax.persistence.*;

@Entity
public class Delivery {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long deliveryId;
	private String nom;
	private String libelle;

	@ManyToOne
	@JoinColumn(name = "projet_id")
	private Projet projet;

	@OneToMany(mappedBy = "delivery", cascade = CascadeType.ALL)
	private Collection<Ratio> ratio = new ArrayList<Ratio>() ;

	//@JsonManagedReference //@JsonIgnore
	public Collection<Ratio> getRatio() {
		return ratio;
	}

	public void setRatio(Collection<Ratio> ratio) {
		this.ratio = ratio;
	}

	public long getDeliveryId() {
		return deliveryId;
	}

	public void setDeliveryId(long deliveryId) {
		this.deliveryId = deliveryId;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	@JsonIgnore
	public Projet getProjet() {
		return projet;
	}

	public void setProjet(Projet projet) {
		this.projet = projet;
	}
}
