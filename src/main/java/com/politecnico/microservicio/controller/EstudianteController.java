package com.politecnico.microservicio.controller;

import com.politecnico.microservicio.model.Estudiante;
import com.politecnico.microservicio.service.EstudianteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {

    private final EstudianteService service;

    public EstudianteController(EstudianteService service) {
        this.service = service;
    }

    @GetMapping
    public List<Estudiante> obteberEstudiantes() {
        return service.obtenerEstudiantes();
    }

    @PostMapping
    public Estudiante guardarEstudiante(@RequestBody Estudiante estudiante) {

        return service.guardarEstudiante(estudiante);
    }
}