package com.project.sf.controller;

import com.project.sf.modele.Client;
import com.project.sf.modele.Tj;
import com.project.sf.repository.ClientRepository;
import com.project.sf.services.ClientService;
import com.sun.tracing.dtrace.ProviderAttributes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/api/client")
public class ClientController {

    @Autowired public ClientService clientService;
    @Autowired public ClientRepository clientRepository;

    @GetMapping
    public List<Client> getAllClient(){
        return clientRepository.findAll();
    }

    @GetMapping("/{id}")
    public Client getClient(@PathVariable Long id){
        return clientRepository.findClientByClientId(id);
    }


    @PostMapping
    public ResponseEntity<?> saveClient(@RequestBody Client client){
        return new ResponseEntity<>(clientService.save(client), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public void deleteClient(@PathVariable Long id){
        clientRepository.deleteById(id);
    }


    @PutMapping("/{id}")
    public ResponseEntity<?> updateClient(@RequestBody Client client, @PathVariable Long id){
        System.out.println(client.getClientId());
        return new ResponseEntity<>(clientService.updateClient(client, id), HttpStatus.ACCEPTED);
    }







}
