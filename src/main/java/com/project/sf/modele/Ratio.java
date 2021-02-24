package com.project.sf.modele;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

import javax.persistence.*;


@Entity
@Data @AllArgsConstructor @NoArgsConstructor @EqualsAndHashCode
public class Ratio {

	@EmbeddedId
	private RatioId id = new RatioId();
	
	@ManyToOne
	@MapsId("activiteId")
	@JoinColumn(name = "activite_id")
	@JsonIgnore
	private Activite activite;

	@ManyToOne
	@MapsId("deliveryId")
	@JoinColumn(name = "delivery_id")
	@JsonProperty
	private Delivery delivery;

	private double pourcentage;
	private int ordreAffichage;

	public RatioId getId() {
		return id;
	}

	public void setId(RatioId id) {
		this.id = id;
	}


	public Activite getActivite() {
		return activite;
	}

	public void setActivite(Activite activite) {
		this.activite = activite;
	}

	@JsonIgnore
	public Delivery getDelivery() {
		return delivery;
	}

	public void setDelivery(Delivery delivery) {
		this.delivery = delivery;
	}

	public double getPourcentage() {
		return pourcentage;
	}

	public void setPourcentage(double pourcentage) {
		this.pourcentage = pourcentage;
	}

	public int getOrdreAffichage() {
		return ordreAffichage;
	}

	public void setOrdreAffichage(int ordreAffichage) {
		this.ordreAffichage = ordreAffichage;
	}
}
