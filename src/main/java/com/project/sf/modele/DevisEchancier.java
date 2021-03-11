package com.project.sf.modele;

import javax.persistence.*;
import java.util.Date;

@Entity
public class DevisEchancier {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long devisEchancierId;

    //info delivery
    private Long deliveryId;
    private String deliveryNom;
    private String deliveryLibelle;

    //info etape echancier
    private Long etapeEchancierId;
    private String etapeEchancierEtape;


    private int pourcentage;
    private Date date;

    @ManyToOne
    @JoinColumn(name = "devis_echancier_item_id")
    private DevisEchancierItem devisEchancierItem;


    public String getDeliveryNom() {
        return deliveryNom;
    }

    public void setDeliveryNom(String deliveryNom) {
        this.deliveryNom = deliveryNom;
    }

    public String getDeliveryLibelle() {
        return deliveryLibelle;
    }

    public void setDeliveryLibelle(String deliveryLibelle) {
        this.deliveryLibelle = deliveryLibelle;
    }

    public String getEtapeEchancierEtape() {
        return etapeEchancierEtape;
    }

    public void setEtapeEchancierEtape(String etapeEchancierEtape) {
        this.etapeEchancierEtape = etapeEchancierEtape;
    }

    public DevisEchancierItem getDevisEchancierItem() {
        return devisEchancierItem;
    }

    public void setDevisEchancierItem(DevisEchancierItem devisEchancierItem) {
        this.devisEchancierItem = devisEchancierItem;
    }

    public Long getDevisEchancierId() {
        return devisEchancierId;
    }

    public void setDevisEchancierId(Long devisEchancierId) {
        this.devisEchancierId = devisEchancierId;
    }

    public Long getEtapeEchancierId() {
        return etapeEchancierId;
    }

    public void setEtapeEchancierId(Long etapeEchancierId) {
        this.etapeEchancierId = etapeEchancierId;
    }

    public Long getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(Long deliveryId) {
        this.deliveryId = deliveryId;
    }

    public int getPourcentage() {
        return pourcentage;
    }

    public void setPourcentage(int pourcentage) {
        this.pourcentage = pourcentage;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
