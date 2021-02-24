package com.project.sf.modele;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class EtapeEchancier{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long etapeEchancierId;
    private String etape;

    @OneToMany(mappedBy = "etapeEchancier", cascade = CascadeType.ALL)
    private Collection<Echancier> echanciers;

    public long getEtapeEchancierId() {
        return etapeEchancierId;
    }

    public void setEtapeEchancierId(long etapeEchancierId) {
        this.etapeEchancierId = etapeEchancierId;
    }

    public Collection<Echancier> getEchanciers() {
        return echanciers;
    }

    public void setEchanciers(Collection<Echancier> echanciers) {
        this.echanciers = echanciers;
    }

    public String getEtape() {
        return etape;
    }

    public void setEtape(String etape) {
        this.etape = etape;
    }
}
