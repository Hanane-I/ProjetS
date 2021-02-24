package com.project.sf.modele;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Set;

@Entity
public class DevisRatioItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long devisRatioItemId;

    @OneToMany(mappedBy = "devisRatioItem", cascade = CascadeType.ALL)
    private Set<DevisRatio> devisRatios;

    @ManyToOne
    @JoinColumn(name = "devis_item_id")
    @JsonProperty
    private DevisItem devisItem;

    public long getDevisRatioItemId() {
        return devisRatioItemId;
    }

    public void setDevisRatioItemId(long devisRatioItemId) {
        this.devisRatioItemId = devisRatioItemId;
    }

    public Set<DevisRatio> getDevisRatios() {
        return devisRatios;
    }

    public void setDevisRatios(Set<DevisRatio> devisRatios) {
        this.devisRatios = devisRatios;
    }

    public DevisItem getDevisItem() {
        return devisItem;
    }

    public void setDevisItem(DevisItem devisItem) {
        this.devisItem = devisItem;
    }
}
