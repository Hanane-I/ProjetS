package com.project.sf.modele;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class RatioId implements Serializable {
	
	private long activiteId;
	private long deliveryId;


	public long getActiviteId() {
		return activiteId;
	}

	public void setActiviteId(long activiteId) {
		this.activiteId = activiteId;
	}

	public long getDeliveryId() {
		return deliveryId;
	}

	public void setDeliveryId(long deliveryId) {
		this.deliveryId = deliveryId;
	}


	@Override
	public int hashCode() {
		return Objects.hash(activiteId, deliveryId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RatioId other = (RatioId) obj;
		if (activiteId != other.activiteId)
			return false;
		if (deliveryId != other.deliveryId)
			return false;
		return true;
	}
	
	

}
