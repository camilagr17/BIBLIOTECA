package com.api.library.web.config;

import com.api.library.domain.service.impl.LibroServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class InsercionesBD {

    // Inyeccion de dependencias
    @Autowired
    private LibroServiceImpl libroService;

    // anotacion que llama al metodo al iniciar la aplication para insertar datos en la base de datos
    @PostConstruct
    public void insertarDatos() {

        //Insertar datos en la base de datos
        libroService.insertLibros();

    }
}
