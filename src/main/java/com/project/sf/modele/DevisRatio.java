package com.project.sf.modele;


import javax.persistence.*;
import java.util.Date;

@Entity
public class DevisRatio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long devisRatioId;

    private Long activiteId;

    private Long deliveryId;

    private double pourcentage;
    private int ordreAffichage;
    private Date date;

    //info activite
    private String activiteLibelle;
    private String activiteIdCourt;
    private String activiteIdLong;


    //info delivery
    private String deliveryNom;
    private String deliveryLibelle;


    @ManyToOne
    @JoinColumn(name = "devis_retio_item_id")
    private DevisRatioItem devisRatioItem;

    public long getDevisRatioId() {
        return devisRatioId;
    }

    public void setDevisRatioId(long devisRatioId) {
        this.devisRatioId = devisRatioId;
    }

    public Long getActiviteId() {
        return activiteId;
    }

    public void setActiviteId(Long activiteId) {
        this.activiteId = activiteId;
    }

    public Long getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(Long deliveryId) {
        this.deliveryId = deliveryId;
    }

    public double getPourcentage() {
        return pourcentage;
    }

    public void setPourcentage(double pourcentage) {
        this.pourcentage = pourcentage;
    }

    public int getOrdreAffichage() {
        return ordreAffichage;
    }

    public void setOrdreAffichage(int ordreAffichage) {
        this.ordreAffichage = ordreAffichage;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
