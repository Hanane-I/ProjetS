package com.project.sf.services;

import com.project.sf.modele.*;
import com.project.sf.repository.ClientRepository;
import com.project.sf.repository.ProjetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class ClientService {

    @Autowired private ClientRepository clientRepository;


    public Client findClientById(Long id){ return clientRepository.findClientByClientId(id);}

    public Client updateClient(Client client,Long id ){
        Client newClient = clientRepository.findClientByClientId(id);
        System.out.println(newClient.getClientId());
        newClient.setNom(client.getNom());
        newClient.setSiret(client.getSiret());
        newClient.setRefClient(client.getRefClient());
        newClient.setIdentTva(client.getIdentTva());
        newClient.setAdresse(client.getAdresse());
        newClient.setTelephone(client.getTelephone());
        newClient.setProjets(client.getProjets());
        return clientRepository.save(newClient);
    }

    public Object save(Client client) {
        Client newClient = new Client();
        newClient.setNom(client.getNom());
        newClient.setSiret(client.getSiret());
        newClient.setRefClient(client.getRefClient());
        newClient.setIdentTva(client.getIdentTva());
        newClient.setAdresse(client.getAdresse());
        newClient.setTelephone(client.getTelephone());
        newClient.setProjets(client.getProjets());
        return clientRepository.save(newClient);
    }
}
