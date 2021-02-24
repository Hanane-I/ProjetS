package com.project.sf.modele;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class DevisItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long devisItemId;
    private String evolution;
    private String fonction;

    @ManyToOne
    @JoinColumn(name = "devis_id")
    @JsonProperty
    private Devis devis;

    //ensemble de devisComp
    @OneToMany( mappedBy = "devisItem", cascade = CascadeType.ALL)
    private Collection<DevisComplexiteItem> devisComplexiteItems = new ArrayList<DevisComplexiteItem>();

    @OneToMany( mappedBy = "devisItem", cascade = CascadeType.ALL)
    private Collection<DevisRatioItem> devisRatioItems = new ArrayList<DevisRatioItem>();

    @OneToMany( mappedBy = "devisItem", cascade = CascadeType.ALL)
    private Collection<DevisTjItem> devisTjItems = new ArrayList<DevisTjItem>();


    @OneToMany( mappedBy = "devisItem", cascade = CascadeType.ALL)
    private Collection<DevisEchancierItem> devisEchancierItems = new ArrayList<DevisEchancierItem>();


    public Collection<DevisComplexiteItem> getDevisComplexiteItems() {
        return devisComplexiteItems;
    }

    public void setDevisComplexiteItems(Collection<DevisComplexiteItem> devisComplexiteItems) {
        this.devisComplexiteItems = devisComplexiteItems;
    }

    public Collection<DevisRatioItem> getDevisRatioItems() {
        return devisRatioItems;
    }

    public void setDevisRatioItems(Collection<DevisRatioItem> devisRatioItems) {
        this.devisRatioItems = devisRatioItems;
    }

    public Collection<DevisTjItem> getDevisTjItems() {
        return devisTjItems;
    }

    public void setDevisTjItems(Collection<DevisTjItem> devisTjItems) {
        this.devisTjItems = devisTjItems;
    }

    public Collection<DevisEchancierItem> getDevisEchancierItems() {
        return devisEchancierItems;
    }

    public void setDevisEchancierItems(Collection<DevisEchancierItem> devisEchancierItems) {
        this.devisEchancierItems = devisEchancierItems;
    }

    public Devis getDevis() {
        return devis;
    }

    public void setDevis(Devis devis) {
        this.devis = devis;
    }

    public Long getDevisItemId() {
        return devisItemId;
    }

    public void setDevisItemId(Long devisItemId) {
        this.devisItemId = devisItemId;
    }

    public String getEvolution() {
        return evolution;
    }

    public void setEvolution(String evolution) {
        this.evolution = evolution;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }
}
