package com.project.sf.modele;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class EchancierId implements Serializable {

    private long etapeEchancierId;
    private long deliveryId;

    public long getEtapeEchancierId() {
        return etapeEchancierId;
    }

    public void setEtapeEchancierId(long etapeEchancierId) {
        this.etapeEchancierId = etapeEchancierId;
    }

    public long getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(long deliveryId) {
        this.deliveryId = deliveryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EchancierId that = (EchancierId) o;
        return etapeEchancierId == that.etapeEchancierId &&
                deliveryId == that.deliveryId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(etapeEchancierId, deliveryId);
    }
}
