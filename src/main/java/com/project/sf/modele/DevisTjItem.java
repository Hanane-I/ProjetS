package com.project.sf.modele;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Set;

@Entity
public class DevisTjItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long devisTjItemId;

    @OneToMany(mappedBy = "devisTjItem", cascade = CascadeType.ALL)
    private Set<DevisTJ> devisTJS;

    @ManyToOne
    @JoinColumn(name = "devis_item_id")
    @JsonIgnore
    private DevisItem devisItem;

    public long getDevisTjItemId() {
        return devisTjItemId;
    }

    public void setDevisTjItemId(long devisTjItemId) {
        this.devisTjItemId = devisTjItemId;
    }

    public Set<DevisTJ> getDevisTJS() {
        return devisTJS;
    }

    public void setDevisTJS(Set<DevisTJ> devisTJS) {
        this.devisTJS = devisTJS;
    }

    public DevisItem getDevisItem() {
        return devisItem;
    }

    public void setDevisItem(DevisItem devisItem) {
        this.devisItem = devisItem;
    }
}
