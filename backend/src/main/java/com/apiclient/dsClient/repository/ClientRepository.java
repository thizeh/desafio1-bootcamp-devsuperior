package com.apiclient.dsClient.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apiclient.dsClient.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
