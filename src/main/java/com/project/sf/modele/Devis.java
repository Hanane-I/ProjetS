package com.project.sf.modele;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@Entity
public class Devis {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long devisId;
    private String libelle;
    private Date dateCreation;
    private Date dateValidation; //valable 1 mois

    @OneToMany( mappedBy = "devis", cascade = CascadeType.ALL)
    private Collection<DevisItem> devisItems = new ArrayList<DevisItem>();

    @OneToOne
    @JoinColumn(name="devis_projet_id")
    private DevisProjet devisProjet;

    public DevisProjet getDevisProjet() {
        return devisProjet;
    }

    public void setDevisProjet(DevisProjet devisProjet) {
        this.devisProjet = devisProjet;
    }

    public Long getDevisId() {
        return devisId;
    }

    public void setDevisId(Long devisId) {
        this.devisId = devisId;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Date getDateValidation() {
        return dateValidation;
    }

    public void setDateValidation(Date dateValidation) {
        this.dateValidation = dateValidation;
    }

    public Collection<DevisItem> getDevisItems() {
        return devisItems;
    }

    public void setDevisItems(Collection<DevisItem> devisItems) {
        this.devisItems = devisItems;
    }
}
