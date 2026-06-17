package com.example.proyectos;

import static org.junit.jupiter.api.Assertions.*;

import com.example.proyectos.Model.Proyecto;
import com.example.proyectos.Repository.ProyectoRepository;
import com.example.proyectos.Service.ProyectoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProyectosApplicationTests {

    @Autowired
    private ProyectoRepository proyectoRepository;

    @Autowired
    private ProyectoService proyectoService;

    @Test
    void contextLoads() {

    }

    @Test
    void testCalcularPorcentajeAvance_FlujoReal() {

        Proyecto proyecto = new Proyecto();
        proyecto.setNombre("Proyecto Test Cobertura");
        proyecto.setEstado("ACTIVO");
        proyecto.setTareasTotales(10);
        proyecto.setTareasCompletadas(7);


        Proyecto proyectoGuardado = proyectoRepository.save(proyecto);
        Long idGenerado = proyectoGuardado.getId();


        Proyecto resultado = proyectoService.buscarPorId(idGenerado).orElse(null);


        assertNotNull(resultado);
        assertEquals("Proyecto Test Cobertura", resultado.getNombre());


        assertEquals(70, resultado.getAvancePorcentaje());
    }
}