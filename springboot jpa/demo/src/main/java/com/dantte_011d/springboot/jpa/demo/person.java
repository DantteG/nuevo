package com.dantte_011d.springboot.jpa.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "persons")
public class person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;

    @Column(name = "lenguajes_programacion")
    private String lenguajesProgramacion;

    public person() {
    }

    public person(Long id, String nombre, String apellido, String lenguajesProgramacion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.lenguajesProgramacion = lenguajesProgramacion;
    }

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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getLenguajes() {
        return lenguajesProgramacion;
    }

    public void setLenguajes(String lenguajes) {
        this.lenguajesProgramacion = lenguajes;
    }

    @Override
    public String toString() {
        return "Person[id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", lenguajesProgramacion=" 
                + lenguajesProgramacion + "]";
    }
}