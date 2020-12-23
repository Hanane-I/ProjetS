package com.project.sf.modele;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class TjId implements Serializable {

	private long clientId;
	private long profilId;
	
	
	public TjId() {}

	public TjId(long clientId, long profilId) {
		this.clientId = clientId;
		this.profilId = profilId;
	}
	
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
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (clientId ^ (clientId >>> 32));
		result = prime * result + (int) (profilId ^ (profilId >>> 32));
		return result;
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
