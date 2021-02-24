package com.project.sf.modele;


import javax.persistence.*;
import java.util.Date;

@Entity
public class DevisTJ {

    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long devisTjId;

    //info client
    private Long clientId;
    private String clientCom;
    private String clientSiret;
    private String clientRefClient;
    private String clientIdentTva;
    private String clientAdresse;
    private String clientTelephone;

    //info profil
    private long profilId;
    private String prodilLibelle;
    private double prodilCout;


    private double cout;
    private Date date;

    @ManyToOne
    @JoinColumn(name = "devis_tj_item_id")
    private DevisTjItem devisTjItem;

    public long getDevisTjId() {
        return devisTjId;
    }

    public void setDevisTjId(long devisTjId) {
        this.devisTjId = devisTjId;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public Long getProfilId() {
        return profilId;
    }

    public void setProfilId(Long profilId) {
        this.profilId = profilId;
    }

    public double getCout() {
        return cout;
    }

    public void setCout(double cout) {
        this.cout = cout;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
