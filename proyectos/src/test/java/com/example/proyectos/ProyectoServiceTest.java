package com.example.proyectos;

import com.example.proyectos.Model.Proyecto;
import com.example.proyectos.Repository.ProyectoRepository;
import com.example.proyectos.Service.ProyectoService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class ProyectoServiceTest {
    ProyectoRepository repository = Mockito.mock(ProyectoRepository.class);
    ProyectoService service = new ProyectoService(repository);

    @Test
    void calcularKpiAvance(){
        Proyecto proyecto = new Proyecto(null, "Test", "Desc", "ACTIVO", 0, 7, 10);
        when(repository.save(proyecto)).thenReturn(proyecto);

        Proyecto resultado = service.guardar(proyecto);
        assertEquals(70, resultado.getAvancePorcentaje());
    }

    @Test
    void listarProyectos(){
        when(repository.findAll()).thenReturn(List.of(new Proyecto()));
        assertEquals(1,service.listar().size());
    }
}
