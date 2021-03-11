package com.project.sf.modele;


import javax.persistence.*;
import java.util.Date;

@Entity
public class DevisTJ {

    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long devisTjId;

    //info delivery
    private long deliveryId;
    private String nom;
    private String libelle;

    //info profil
    private long profilId;
    private String profilLibelle;


    private double cout;
    private Date date;

    @ManyToOne
    @JoinColumn(name = "devis_tj_item_id")
    private DevisTjItem devisTjItem;

    public long getDevisTjId() {
        return devisTjId;
    }

    public void setDevisTjId(long devisTjId) {
        this.devisTjId = devisTjId;
    }

    public double getCout() {
        return cout;
    }

    public void setCout(double cout) {
        this.cout = cout;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public long getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(long deliveryId) {
        this.deliveryId = deliveryId;
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

    public long getProfilId() {
        return profilId;
    }

    public void setProfilId(long profilId) {
        this.profilId = profilId;
    }

    public String getProfilLibelle() {
        return profilLibelle;
    }

    public void setProfilLibelle(String profilLibelle) {
        this.profilLibelle = profilLibelle;
    }

    public DevisTjItem getDevisTjItem() {
        return devisTjItem;
    }

    public void setDevisTjItem(DevisTjItem devisTjItem) {
        this.devisTjItem = devisTjItem;
    }
}
