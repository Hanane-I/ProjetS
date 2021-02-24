package com.project.sf.modele;

import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;
import javax.sql.rowset.serial.SerialArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler","categories"})
public class Projet implements Serializable {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long projetId;
	
	private String nomProjet;
	private String commentaire;
	private String numContrat;

	@ManyToOne
	@JoinColumn(name = "client_id")
    @JsonProperty
	private Client client;

	@OneToMany( mappedBy = "projet", cascade = CascadeType.ALL)
	@JsonProperty
	private Collection<Categorie> categories = new ArrayList<Categorie>();

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "projet", cascade = CascadeType.ALL)
	@JsonIgnore
	private Collection<Delivery> deliveries = new ArrayList<Delivery>();



	@JsonIgnore
	public Client getClient() { return client; }
	public void setClient(Client client) { this.client = client; }


	public long getProjetId() { return projetId; }
	public void setProjetId(long projetId) { this.projetId = projetId; }
	public String getNomProjet() {
		return nomProjet;
	}
	public void setNomProjet(String nomProjet) {
		this.nomProjet = nomProjet;
	}
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	public String getNumContrat() {return numContrat; }
	public void setNumContrat(String numContrat) { this.numContrat = numContrat; }

	public Collection<Categorie> getCategories() {
		return categories;
	}
	public void setCategories(Collection<Categorie> categories) {
		this.categories = categories;
	}


	public Collection<Delivery> getDeliveries() {
		return deliveries;
	}
	public void setDeliveries(Collection<Delivery> deliveries) {
		this.deliveries = deliveries;
	}
}
