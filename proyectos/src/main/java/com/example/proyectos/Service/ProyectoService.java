package com.example.proyectos.Service;

import com.example.proyectos.Model.Proyecto;
import com.example.proyectos.Repository.ProyectoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProyectoService {

    private final ProyectoRepository repository;

    public ProyectoService(ProyectoRepository repository){
        this.repository = repository;
    }

    public List<Proyecto> listar(){
        return repository.findAll();
    }

    public Proyecto guardar(Proyecto proyecto){
        if (proyecto.getTareasTotales() > 0){
            proyecto.setAvancePorcentaje((proyecto.getTareasCompletadas() * 100 / proyecto.getTareasTotales()));
        }
        return repository.save(proyecto);
    }

    public Optional<Proyecto> buscarPorId(Long id){
        return repository.findById(id);
    }

    public void eliminar(Long id){
        repository.deleteById(id);
    }

}
