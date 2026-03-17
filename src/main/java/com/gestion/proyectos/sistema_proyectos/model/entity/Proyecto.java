package com.gestion.proyectos.sistema_proyectos.model.entity;

import com.gestion.proyectos.sistema_proyectos.model.embeddable.ContactoCliente;
import com.gestion.proyectos.sistema_proyectos.model.enums.EstadoProyecto;
import com.gestion.proyectos.sistema_proyectos.model.enums.Prioridad;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "proyectos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class Proyecto extends BaseEntity {

    private String nombre;
    private String descripcion;

    @Embedded
    private ContactoCliente contactoCliente;

    @Enumerated(EnumType.STRING)
    private EstadoProyecto estado;

    @Enumerated(EnumType.STRING)
    private Prioridad prioridad;
}
