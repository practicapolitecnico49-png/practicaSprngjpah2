package com.politecnico.microservicio.service;

import com.politecnico.microservicio.model.Estudiante;
import com.politecnico.microservicio.repository.EstudianteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteService {

    private final EstudianteRepository repository;

    public EstudianteService(EstudianteRepository repository) {
        this.repository = repository;
    }

    public List<Estudiante> obtenerEstudiantes() {
        return repository.findAll();
    }

    public Estudiante guardarEstudiante(Estudiante estudiante) {
        return repository.save(estudiante);
    }
}