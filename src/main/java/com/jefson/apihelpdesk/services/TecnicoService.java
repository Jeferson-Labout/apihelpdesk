package com.jefson.apihelpdesk.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jefson.apihelpdesk.domain.Tecnico;
import com.jefson.apihelpdesk.repositories.TecnicoRepository;
import com.jefson.apihelpdesk.services.exceptions.ObjectnotFoundException;

@Service
public class TecnicoService {
	
	@Autowired
	private TecnicoRepository repository;
	
	public Tecnico findById(Integer id) {
		Optional<Tecnico> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectnotFoundException("Objeto não encontrado! Id: " + id));
		
	}

	public List<Tecnico> findAll() {
		return repository.findAll();
	}

}
