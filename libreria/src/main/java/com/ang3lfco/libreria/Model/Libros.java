package com.ang3lfco.libreria.Model;

import java.time.LocalDate;

public class Libros {
    private long idLibro;
    private String autor;
    private String titulo;
    private LocalDate fechaPublicacion;

    public Libros(long idLibro, String autor, String titulo, LocalDate fechaPublicacion){
        this.idLibro = idLibro;
        this.autor = autor;
        this.titulo = titulo;
        this.fechaPublicacion = fechaPublicacion;
    }

    public long getIdLibro() {
        return idLibro;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }
}
