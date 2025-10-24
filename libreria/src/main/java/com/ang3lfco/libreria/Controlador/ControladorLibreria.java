package com.ang3lfco.libreria.Controlador;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ang3lfco.libreria.LibrosRepositorio.LibrosRepositorio;
import com.ang3lfco.libreria.Model.Libros;
import com.ang3lfco.libreria.Servicio.ServicioLibro;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/libros")
public class ControladorLibreria {
    private final ServicioLibro servicioLibro;
    private final LibrosRepositorio librosRepositorio;

    public ControladorLibreria(ServicioLibro servicioLibro, LibrosRepositorio librosRepositorio){
        this.servicioLibro = servicioLibro;
        this.librosRepositorio = librosRepositorio;
    }

    @GetMapping("/{titulo}")
    public String dameLibro(@PathVariable String titulo){
        return servicioLibro.buscaLibro(titulo);
    }

    @GetMapping("/todos")
    public List<Libros> dimeTodos(){
        return librosRepositorio.findAll();
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Libros> buscaId(@PathVariable long id){
        return librosRepositorio.buscaId(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
}
