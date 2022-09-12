package com.api.library.domain.service;

import com.api.library.persistance.entity.Categoria;

import java.util.List;

public interface CategoriaService {

    // CRUD Categoria
    Categoria saveCategoria(Categoria categoria);

    Categoria updateCategoria(Categoria categoria);

    void deleteCategoria(Integer id) throws RuntimeException;

    Categoria getCategoria(Integer id) throws RuntimeException;

    List<Categoria> getAllCategorias();

    // metodo para insertar categorias al desplegar la aplicacion
    void insertCategorias();
}
