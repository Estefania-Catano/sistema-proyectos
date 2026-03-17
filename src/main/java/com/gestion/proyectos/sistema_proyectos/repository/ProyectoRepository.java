package com.gestion.proyectos.sistema_proyectos.repository;

import com.gestion.proyectos.sistema_proyectos.model.entity.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProyectoRepository extends JpaRepository<Proyecto, Long> {
}
