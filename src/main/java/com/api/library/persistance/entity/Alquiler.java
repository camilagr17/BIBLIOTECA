package com.api.library.persistance.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "alquileres")
public class Alquiler {
    // attributes
    @Id
    @Column(name = "id_alquiler")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_lector")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Lector lector;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_libro")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Libro libro;
    private String fechaAlquiler;
    private String fechaDevolucion;

    // constructors
    public Alquiler() {
    }

    public Alquiler(Integer id, Lector lector, Libro libro, String fechaAlquiler, String fechaDevolucion) {
        this.id = id;
        this.lector = lector;
        this.libro = libro;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
    }

    // getters and setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Lector getLector() {
        return lector;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public String getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(String fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
}
