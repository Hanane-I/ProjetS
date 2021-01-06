package com.project.sf.modele;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class TjId implements Serializable {

	private long clientId;
	private long profilId;
	
	public long getClientId() {
		return clientId;
	}
	public void setClientId(long clientId) {
		this.clientId = clientId;
	}
	public long getProfilId() {
		return profilId;
	}
	public void setProfilId(long profilId) {
		this.profilId = profilId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(clientId, profilId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TjId other = (TjId) obj;
		if (clientId != other.clientId)
			return false;
		if (profilId != other.profilId)
			return false;
		return true;
	}
	
	
	
	
}
