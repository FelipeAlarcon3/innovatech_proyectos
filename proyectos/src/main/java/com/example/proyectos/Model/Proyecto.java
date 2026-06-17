package com.example.proyectos.Model;

import jakarta.persistence.*;

@Entity
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

    // CONSTRUCTOR VACÍO
    public Proyecto() {
    }

    // CONSTRUCTOR COMPLETO CORREGIDO
    public Proyecto(Long id, String nombre, String descripcion, String estado, Integer avancePorcentaje, Integer tareasCompletadas, Integer tareasTotales) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
        this.avancePorcentaje = avancePorcentaje;
        this.tareasCompletadas = tareasCompletadas;
        this.tareasTotales = tareasTotales;
    }

    // GETTERS Y SETTERS
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getAvancePorcentaje() {
        return avancePorcentaje;
    }

    public void setAvancePorcentaje(Integer avancePorcentaje) {
        this.avancePorcentaje = avancePorcentaje;
    }

    public Integer getTareasCompletadas() {
        return tareasCompletadas;
    }

    public void setTareasCompletadas(Integer tareasCompletadas) {
        this.tareasCompletadas = tareasCompletadas;
    }

    public Integer getTareasTotales() {
        return tareasTotales;
    }

    public void setTareasTotales(Integer tareasTotales) {
        this.tareasTotales = tareasTotales;
    }
}
