package com.politecnico.microservicio.repository;


import com.politecnico.microservicio.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EstudianteRepository
        extends JpaRepository<Estudiante,Integer> {
}