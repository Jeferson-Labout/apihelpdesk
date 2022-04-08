package com.jefson.apihelpdesk.resources;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jefson.apihelpdesk.domain.Tecnico;
import com.jefson.apihelpdesk.domain.dtos.TecnicoDTO;
import com.jefson.apihelpdesk.services.TecnicoService;



@RestController
@RequestMapping(value = "/tecnicos")
public class TecnicoResource {

	@Autowired
	private TecnicoService service;

	@GetMapping(value = "/{id}")
	public ResponseEntity<TecnicoDTO> findById(@PathVariable Integer id) {
		Tecnico obj = service.findById(id);
		
		return ResponseEntity.ok().body(new TecnicoDTO(obj));
	}

	
	@GetMapping
	public ResponseEntity<java.util.List<TecnicoDTO>> findAll() {
		java.util.List<Tecnico> list = service.findAll();
		java.util.List<TecnicoDTO> listDTO = list.stream().map(obj -> new TecnicoDTO(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDTO);
	}


	
	
	
	
}