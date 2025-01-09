package com.espe.micro_cursos.model.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity // Indica que esta clase es una entidad de base de datos
public class Curso {

    @Id // Marca este campo como clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Define que el ID se genera automáticamente
    private Long id;

    private String nombre;
    private String descripcion;
    private int duracion;
    private int creditos;

    @Temporal(TemporalType.TIMESTAMP)
    private Date creadoEn;

    // Constructor vacío (obligatorio para JPA)
    public Curso() {}

    // Constructor con parámetros
    public Curso(String nombre, String descripcion, int duracion, int creditos, Date creadoEn) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.creditos = creditos;
        this.creadoEn = creadoEn;
    }
    // Método para inicializar creadoEn antes de persistir
    @PrePersist
    protected void prePersist() {
        if (this.creadoEn == null) {
            this.creadoEn = new Date();
        }
    }

    // Getters y Setters
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

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public Date getCreadoEn() {
        return creadoEn;
    }

    public void setCreadoEn(Date creadoEn) {
        this.creadoEn = creadoEn;
    }
}
