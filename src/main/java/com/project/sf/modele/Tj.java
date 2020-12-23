package com.project.sf.modele;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class Tj implements Serializable {

	@EmbeddedId
	private TjId id = new TjId();
	
	@ManyToOne
	@MapsId("clientId")
	private Client client;
	
	@ManyToOne
	@MapsId("profilId")
	private Profil profil;
	
	private double cout;

	
	public TjId getId() {
		return id;
	}

	public void setId(TjId id) {
		this.id = id;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
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
