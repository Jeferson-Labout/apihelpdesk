package com.jefson.apihelpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jefson.apihelpdesk.domain.Pessoa;

public interface TecnicoRepository extends JpaRepository<Pessoa, Integer>{

}
