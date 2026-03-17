package com.gestion.proyectos.sistema_proyectos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SistemaProyectosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaProyectosApplication.class, args);
	}

}
