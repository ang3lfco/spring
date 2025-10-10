package com.ang3lfco.libreria.Controlador;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ang3lfco.libreria.Servicio.ServicioLibro;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/libros")
public class ControladorLibreria {
    private final ServicioLibro servicioLibro;

    public ControladorLibreria(ServicioLibro servicioLibro){
        this.servicioLibro = servicioLibro;
    }

    @GetMapping("/{titulo}")
    public String dameLibro(@PathVariable String titulo){
        return servicioLibro.buscaLibro(titulo);
    }
}
