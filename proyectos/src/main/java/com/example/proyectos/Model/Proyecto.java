package com.example.proyectos.Model;

import jakarta.persistence.*;
import lombok.*;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String descripcion;
    private String estado; // ACTIVO, PAUSADO, TERMINADO
    private Integer avancePorcentaje; // KPI: % de avance
    private Integer tareasCompletadas; // KPI
    private Integer tareasTotales;
}
