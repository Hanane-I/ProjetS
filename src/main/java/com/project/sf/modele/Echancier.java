package com.project.sf.modele;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Echancier {

    @EmbeddedId
    private EchancierId echancierId = new EchancierId();

    @ManyToOne
    @MapsId("etapeEchancierId")
    @JoinColumn(name = "etape_echancier_id")
    @JsonIgnore
    private EtapeEchancier etapeEchancier;


    @ManyToOne
    @MapsId("deliveryId")
    @JoinColumn(name = "delivery_id")
    @JsonProperty
    private Delivery delivery;

    private int pourcentage;


    public EchancierId getEchancierId() {
        return echancierId;
    }

    public void setEchancierId(EchancierId echancierId) {
        this.echancierId = echancierId;
    }

    public EtapeEchancier getEtapeEchancier() {
        return etapeEchancier;
    }

    public void setEtapeEchancier(EtapeEchancier etapeEchancier) {
        this.etapeEchancier = etapeEchancier;
    }

    @JsonIgnore
    public Delivery getDelivery() {
        return delivery;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    public int getPourcentage() {
        return pourcentage;
    }

    public void setPourcentage(int pourcentage) {
        this.pourcentage = pourcentage;
    }
}
