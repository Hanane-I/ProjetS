package com.project.sf.modele;




import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;


import javax.persistence.*;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler","ratio","tj", "echanciers"})
public class Delivery {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long deliveryId;
	private String nom;
	private String libelle;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "projet_id")
	private Projet projet;

	@OneToMany(mappedBy = "delivery", cascade = CascadeType.ALL)
	private Collection<Ratio> ratio = new ArrayList<Ratio>() ;

	@OneToMany(mappedBy = "delivery", cascade = CascadeType.ALL)
	private Collection<Tj> tj = new ArrayList<Tj>() ;

	@OneToMany(mappedBy = "delivery", cascade = CascadeType.ALL)
	private Collection<Echancier> echanciers = new ArrayList<Echancier>();

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

	public Projet getProjet() {
		return projet;
	}

	public void setProjet(Projet projet) {
		this.projet = projet;
	}

	public Collection<Tj> getTj() {
		return tj;
	}

	public void setTj(Collection<Tj> tj) {
		this.tj = tj;
	}

	public Collection<Echancier> getEchanciers() {
		return echanciers;
	}

	public void setEchanciers(Collection<Echancier> echanciers) {
		this.echanciers = echanciers;
	}
}
