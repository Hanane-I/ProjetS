package com.project.sf.services;

import com.project.sf.modele.DevisTJ;
import org.springframework.stereotype.Service;

@Service
public class DevisTJService {

    public DevisTJ save(DevisTJ newDevisTJ){

        DevisTJ devisTJ = new DevisTJ();
        devisTJ.setClientId(newDevisTJ.getClientId());
        devisTJ.setProfilId(newDevisTJ.getProfilId());
        devisTJ.setCout(newDevisTJ.getCout());

        return devisTJ;
    }
}
