package com.jefson.apihelpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jefson.apihelpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{

}
