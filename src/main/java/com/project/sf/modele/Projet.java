package com.project.sf.modele;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Projet {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String nomProjet;
	private String commentaire;
	private String nomClient;
	private String typeProjetAgence;
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
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
	public String getNomClient() {
		return nomClient;
	}
	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}
	public String getTypeProjetAgence() {
		return typeProjetAgence;
	}
	public void setTypeProjetAgence(String typeProjetAgence) {
		this.typeProjetAgence = typeProjetAgence;
	}
	
	
}
