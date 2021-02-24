package com.project.sf.modele;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Entity
public class DevisComplexiteItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long devisComplexiteItemId;

    @OneToMany(mappedBy = "devisComplexiteItem", cascade = CascadeType.ALL)
    private Set<DevisComplexite> devisComplexite;

    @ManyToOne
    @JoinColumn(name = "devis_item_id")
    @JsonProperty
    private DevisItem devisItem;

    public Long getDevisComplexiteItemId() {
        return devisComplexiteItemId;
    }

    public void setDevisComplexiteItemId(Long devisComplexiteItemId) {
        this.devisComplexiteItemId = devisComplexiteItemId;
    }

    public Set<DevisComplexite> getDevisComplexite() {
        return devisComplexite;
    }

    public void setDevisComplexite(Set<DevisComplexite> devisComplexite) {
        this.devisComplexite = devisComplexite;
    }

    public DevisItem getDevisItem() {
        return devisItem;
    }

    public void setDevisItem(DevisItem devisItem) {
        this.devisItem = devisItem;
    }
}
