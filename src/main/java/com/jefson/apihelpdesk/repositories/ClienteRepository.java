package com.jefson.apihelpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jefson.apihelpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
