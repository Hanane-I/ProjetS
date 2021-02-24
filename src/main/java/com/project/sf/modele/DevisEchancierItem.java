package com.project.sf.modele;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Set;

@Entity
public class DevisEchancierItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long devisEchancierItemId;

    @OneToMany(mappedBy = "devisEchancierItem", cascade = CascadeType.ALL)
    private Set<DevisEchancier> devisEchancierS;

    @ManyToOne
    @JoinColumn(name = "devis_item_id")
    @JsonProperty
    private DevisItem devisItem;


    public Long getDevisEchancierItemId() {
        return devisEchancierItemId;
    }

    public void setDevisEchancierItemId(Long devisEchancierItemId) {
        this.devisEchancierItemId = devisEchancierItemId;
    }

    public Set<DevisEchancier> getDevisEchancierS() {
        return devisEchancierS;
    }

    public void setDevisEchancierS(Set<DevisEchancier> devisEchancierS) {
        this.devisEchancierS = devisEchancierS;
    }

    public DevisItem getDevisItem() {
        return devisItem;
    }

    public void setDevisItem(DevisItem devisItem) {
        this.devisItem = devisItem;
    }
}
