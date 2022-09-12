package com.api.library.domain.service;

import com.api.library.persistance.entity.Lector;

import java.util.List;

public interface LectorService {

        // CRUD Lector
        Lector saveLector(Lector lector);

        Lector updateLector(Lector lector);

        void deleteLector(Integer id) throws RuntimeException;

        Lector getLector(Integer id) throws RuntimeException;

        List<Lector> getAllLectores();

        // metodo para insertar lectores al desplegar la aplicacion
        void insertLectores();

}
