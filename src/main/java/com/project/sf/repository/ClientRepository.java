package com.project.sf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.sf.modele.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

    public Client findClientByClientId(Long id);
    public void deleteClientByClientId(Long id);

}
