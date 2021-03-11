package com.project.sf.modele;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Date;

@Entity
public class DevisComplexite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long devisComplexiteId;
    private String nom;
    private String libelle;
    private double valeur;
    private Date date; // la date de devis

    @ManyToOne
    @JoinColumn(name = "devis_complexite_item_id")
    @JsonIgnore
    private DevisComplexiteItem devisComplexiteItem;

    private Long domaineId;
    private String domaineName;
    private String domaineDescription;

    //info categorie
    private Long categorieId;
    private String categorieName;
    private String categorieDescription;


    public DevisComplexiteItem getDevisComplexiteItem() {
        return devisComplexiteItem;
    }

    public void setDevisComplexiteItem(DevisComplexiteItem devisComplexiteItem) {
        this.devisComplexiteItem = devisComplexiteItem;
    }

    public String getDomaineName() {
        return domaineName;
    }

    public void setDomaineName(String domaineName) {
        this.domaineName = domaineName;
    }

    public String getDomaineDesciption() {
        return domaineDescription;
    }

    public void setDomaineDesciption(String domaineDesciption) {
        this.domaineDescription = domaineDesciption;
    }

    public Long getCategorieId() {
        return categorieId;
    }

    public void setCategorieId(Long categorieId) {
        this.categorieId = categorieId;
    }

    public String getCategorieName() {
        return categorieName;
    }

    public void setCategorieName(String categorieName) {
        this.categorieName = categorieName;
    }

    public String getCategorieDescription() {
        return categorieDescription;
    }

    public void setCategorieDescription(String categorieDescription) {
        this.categorieDescription = categorieDescription;
    }

    public long getDevisComplexiteId() {
        return devisComplexiteId;
    }

    public void setDevisComplexiteId(long devisComplexiteId) {
        this.devisComplexiteId = devisComplexiteId;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public double getValeur() {
        return valeur;
    }

    public void setValeur(double valeur) {
        this.valeur = valeur;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getDomaineId() {
        return domaineId;
    }

    public void setDomaineId(Long domaineId) {
        this.domaineId = domaineId;
    }
}
