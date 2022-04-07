package com.jefson.apihelpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jefson.apihelpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

}
