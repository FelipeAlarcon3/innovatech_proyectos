package com.example.proyectos.Controller;

import com.example.proyectos.Model.Proyecto;
import com.example.proyectos.Service.ProyectoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/proyectos")
@CrossOrigin(origins = "*")
public class ProyectoController {

    private final ProyectoService service;

    public ProyectoController(ProyectoService service){
        this.service = service;
    }
    @GetMapping
    public List<Proyecto> listar(){
        return service.listar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Proyecto> buscar (@PathVariable Long id){
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/{id}")
    public Proyecto crear (@RequestBody Proyecto proyecto){
        return service.guardar(proyecto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Proyecto> actualizar (@PathVariable Long id, @RequestBody Proyecto proyecto){
        return service.buscarPorId(id).map(proyecto1 -> {
            proyecto.setId(id);
            return ResponseEntity.ok(service.guardar(proyecto));
        }).orElse(ResponseEntity.noContent().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id){
        service.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
