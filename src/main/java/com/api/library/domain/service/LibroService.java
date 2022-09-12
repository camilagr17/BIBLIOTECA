package com.api.library.domain.service;

import com.api.library.persistance.entity.Libro;

import java.util.List;

public interface LibroService {

    // CRUD Libro
    Libro saveLibro(Libro libro);

    Libro updateLibro(Libro libro);

    void deleteLibro(Integer id) throws RuntimeException;

    Libro getLibro(Integer id) throws RuntimeException;

    List<Libro> getAllLibros();

    // metodo para insertar libros al desplegar la aplicacion
    void insertLibros();


}
