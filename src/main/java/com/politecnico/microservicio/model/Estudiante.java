package com.politecnico.microservicio.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "estudiantes")
public class Estudiante {

    @Id
    private Integer id;
    private String nombre;
    private String programa;

    public Estudiante() {
    }

    public Estudiante(Integer id, String nombre, String programa) {
        this.id = id;
        this.nombre = nombre;
        this.programa = programa;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }
}