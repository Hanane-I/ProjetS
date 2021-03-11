package com.project.sf.modele;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@Entity
public class DevisProjet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long devisProjetId;

    private String nomProjet;
    private String commentaire;
    private String numContrat;
    //private Date date;

    @OneToOne( fetch = FetchType.LAZY, mappedBy = "devisProjet")
    @JsonIgnore
    private Devis devis;

    //info client
    private Long clientId;
    private String clientNom;
    private String siret;
    private String refClient;
    private String identTva;
    private String adresse;
    private String telephone;


    //info categories
    private long categorieId;
    private String categorieNom;
    private String categorieLibelle;

    @JsonIgnore
    public Devis getDevis() {
        return devis;
    }

    public void setDevis(Devis devis) {
        this.devis = devis;
    }

    public String getClientNom() {
        return clientNom;
    }

    public void setClientNom(String clientNom) {
        this.clientNom = clientNom;
    }

    public long getCategorieId() {
        return categorieId;
    }

    public void setCategorieId(long categorieId) {
        this.categorieId = categorieId;
    }

    public String getCategorieNom() {
        return categorieNom;
    }

    public void setCategorieNom(String categorieNom) {
        this.categorieNom = categorieNom;
    }

    public String getCategorieLibelle() {
        return categorieLibelle;
    }

    public void setCategorieLibelle(String categorieLibelle) {
        this.categorieLibelle = categorieLibelle;
    }

    public long getDevisProjetId() {
        return devisProjetId;
    }

    public void setDevisProjetId(long devisProjetId) {
        this.devisProjetId = devisProjetId;
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

    public String getNumContrat() {
        return numContrat;
    }

    public void setNumContrat(String numContrat) {
        this.numContrat = numContrat;
    }


    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public String getSiret() {
        return siret;
    }

    public void setSiret(String siret) {
        this.siret = siret;
    }

    public String getRefClient() {
        return refClient;
    }

    public void setRefClient(String refClient) {
        this.refClient = refClient;
    }

    public String getIdentTva() {
        return identTva;
    }

    public void setIdentTva(String identTva) {
        this.identTva = identTva;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
