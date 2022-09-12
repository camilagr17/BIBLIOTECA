package com.api.library.domain.service;

import com.api.library.persistance.entity.Alquiler;

public interface AlquilerService {

    // CRUD Alquiler
    Alquiler saveAlquiler(Alquiler alquiler);

    Alquiler updateAlquiler(Alquiler alquiler);

    void deleteAlquiler(Integer id) throws RuntimeException;

    Alquiler getAlquiler(Integer id) throws RuntimeException;

    // metodo para insertar alquileres al desplegar la aplicacion
    void insertAlquileres();
}
