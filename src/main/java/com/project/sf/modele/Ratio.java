package com.project.sf.modele;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;


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
	private Delivery delivery;

	private long pourcentage;

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

	public Delivery getDelivery() {
		return delivery;
	}

	public void setDelivery(Delivery delivery) {
		this.delivery = delivery;
	}

	public long getPourcentage() {
		return pourcentage;
	}

	public void setPourcentage(long pourcentage) {
		this.pourcentage = pourcentage;
	}
}
