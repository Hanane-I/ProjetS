package com.project.sf.modele;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Tj implements Serializable {

	@EmbeddedId
	private TjId id = new TjId();
	
	@ManyToOne
	@MapsId("deliveryId")
	@JoinColumn(name = "delivery_id")
	@JsonProperty
	private Delivery delivery;    // model delivery
	
	@ManyToOne
	@MapsId("profilId")
	@JoinColumn(name = "profil_id")
	@JsonIgnore
	private Profil profil;
	
	private double cout;

	
	public TjId getId() {
		return id;
	}

	public void setId(TjId id) {
		this.id = id;
	}

	@JsonIgnore
	public Delivery getDelivery() {
		return delivery;
	}

	public void setDelivery(Delivery delivery) {
		this.delivery = delivery;
	}


	public Profil getProfil() {
		return profil;
	}

	public void setProfil(Profil profil) {
		this.profil = profil;
	}

	public double getCout() {
		return cout;
	}

	public void setCout(double cout) {
		this.cout = cout;
	}
	
	
	
}
