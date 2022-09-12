package com.api.library.persistance.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "libros")
public class Libro {
    // attributes
    @Id
    @Column(name = "id_libro")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String titulo;

    @Column(name = "autor")
    private String autorlibro;

    @Column(name = "editorial")
    private String proveedor;

    @Column(name = "categoria")
    private String genero;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_autor")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Autor autor;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_editorial")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Editorial editorial;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_categoria")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Categoria categoria;

    // constructors

    public Libro() {
    }

    public Libro(String titulo, String autorlibro, String proveedor, String genero) {
        this.titulo = titulo;
        this.autorlibro = autorlibro;
        this.proveedor = proveedor;
        this.genero = genero;
    }

    public Libro(Integer id, String titulo, String autorlibro, String proveedor, String genero, Autor autor, Editorial editorial, Categoria categoria) {
        this.id = id;
        this.titulo = titulo;
        this.autorlibro = autorlibro;
        this.proveedor = proveedor;
        this.genero = genero;
        this.autor = autor;
        this.editorial = editorial;
        this.categoria = categoria;
    }

    // getters and setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutorlibro() {
        return autorlibro;
    }

    public void setAutorlibro(String autorlibro) {
        this.autorlibro = autorlibro;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
