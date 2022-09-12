package com.api.library.domain.service.impl;

import com.api.library.domain.service.LibroService;
import com.api.library.persistance.entity.Libro;
import com.api.library.persistance.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroServiceImpl implements LibroService {

    // Inyeccion de dependencia libro repository
    @Autowired
    private LibroRepository libroRepository;


    @Override
    public Libro saveLibro(Libro libro) {
        return libroRepository.save(libro);
    }

    @Override
    public Libro updateLibro(Libro libro) {
        return null;
    }

    @Override
    public void deleteLibro(Integer id) throws RuntimeException {

    }

    @Override
    public Libro getLibro(Integer id) throws RuntimeException {
        return null;
    }

    @Override
    public List<Libro> getAllLibros() {
        return null;
    }

    @Override
    public void insertLibros() {
        libroRepository.save(new Libro("don quijote", "miguel de cervantes", "novela", "Cuento"));
        libroRepository.save(new Libro("el principito", "antoine de saint-exupery", "novela", "Cuento"));
        libroRepository.save(new Libro("el alquimista", "paulo coelho", "novela", "Cuento"));
        libroRepository.save(new Libro("el hobbit", "j.r.r. tolkien", "novela", "Cuento"));
        libroRepository.save(new Libro("el señor de los anillos", "j.r.r. tolkien", "novela", "Cuento"));
        libroRepository.save(new Libro("la iliada", "homero", "novela", "Cuento"));
        libroRepository.save(new Libro("la odisea", "homero", "novela", "Cuento"));
        libroRepository.save(new Libro("la divina comedia", "dante alighieri", "novela", "Cuento"));
        libroRepository.save(new Libro("la metamorfosis", "franz kafka", "novela", "Cuento"));
        libroRepository.save(new Libro("la muerte de ivan ilyich", "lev tolstoi", "novela", "Cuento"));


    }
}
