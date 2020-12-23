package com.project.sf.modele;




import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.Collection;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Delivery {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long deliveryId;
	private double charge;
	private long idClient;
	
	@OneToMany(mappedBy = "delivery", cascade = CascadeType.ALL)
	@JsonIgnore
	private Collection<Ratio> ratio = new ArrayList<Ratio>() ;
	

	public Collection<Ratio> getRatio() {
		return ratio;
	}

	public void setRatio(Collection<Ratio> ratio) {
		this.ratio = ratio;
	}

	public long getDeliveryId() {
		return deliveryId;
	}

	public void setDeliveryId(long deliveryId) {
		this.deliveryId = deliveryId;
	}

	public double getCharge() {
		return charge;
	}

	public void setCharge(double charge) {
		this.charge = charge;
	}

	public long getIdClient() {
		return idClient;
	}

	public void setIdClient(long idClient) {
		this.idClient = idClient;
	}
	
	
}
