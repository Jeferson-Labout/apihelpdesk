package com.jefson.apihelpdesk;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jefson.apihelpdesk.domain.Chamado;
import com.jefson.apihelpdesk.domain.Cliente;
import com.jefson.apihelpdesk.domain.Tecnico;
import com.jefson.apihelpdesk.domain.enums.Perfil;
import com.jefson.apihelpdesk.domain.enums.Prioridade;
import com.jefson.apihelpdesk.domain.enums.Status;
import com.jefson.apihelpdesk.repositories.ChamadoRepository;
import com.jefson.apihelpdesk.repositories.ClienteRepository;
import com.jefson.apihelpdesk.repositories.TecnicoRepository;

@SpringBootApplication
public class ApihelpdeskApplication implements CommandLineRunner {
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;

	public static void main(String[] args) {
		SpringApplication.run(ApihelpdeskApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Tecnico tec1 = new Tecnico(null, "Jeferson Labout", "33407705069", "jefson@gmail.com", "123");
		tec1.addPerfil(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "Spartakus", "32552279090", "spartakus@gmail.com", "123");
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro chamado", tec1, cli1);
		
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
	}

}
