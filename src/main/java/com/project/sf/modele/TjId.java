package com.project.sf.modele;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class TjId implements Serializable {

	private long deliveryId;
	private long profilId;

	public long getProjetId() {
		return deliveryId;
	}

	public void setProjetId(long projetId) {
		this.deliveryId = projetId;
	}

	public long getProfilId() {
		return profilId;
	}
	public void setProfilId(long profilId) {
		this.profilId = profilId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof TjId)) return false;
		TjId tjId = (TjId) o;
		return deliveryId == tjId.deliveryId &&
				getProfilId() == tjId.getProfilId();
	}

	@Override
	public int hashCode() {
		return Objects.hash(deliveryId, getProfilId());
	}
}
