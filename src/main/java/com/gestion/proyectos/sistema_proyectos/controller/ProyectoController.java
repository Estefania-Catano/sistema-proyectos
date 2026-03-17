package com.gestion.proyectos.sistema_proyectos.controller;

import com.gestion.proyectos.sistema_proyectos.model.entity.Proyecto;
import com.gestion.proyectos.sistema_proyectos.repository.ProyectoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/proyectos")
public class ProyectoController {

    private final ProyectoRepository proyectoRepository;

    public ProyectoController(ProyectoRepository proyectoRepository) {
        this.proyectoRepository = proyectoRepository;
    }

    @GetMapping
    public ResponseEntity<List<Proyecto>> listar() {
        return ResponseEntity.ok(proyectoRepository.findAll());
    }
}
