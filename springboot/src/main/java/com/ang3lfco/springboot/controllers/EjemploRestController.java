package com.ang3lfco.springboot.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ang3lfco.springboot.models.Empleados;
import com.ang3lfco.springboot.models.dto.ClaseDTO;

import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("/api")

public class EjemploRestController {

    @GetMapping("/detalles_info2")
    public ClaseDTO detalles_info2() {
        ClaseDTO usuario1 = new ClaseDTO();
        usuario1.setTitulo("Administrador");
        usuario1.setUsuario("Informaticonfig");

        // Empleados empleado1 = new Empleados(
        //     "Juan",
        //     "Rodriguez",
        //     "Calle 1 No 2",
        //     "Gerente",
        //     35,
        //     1234567890,
        //     001
        // );

        // Map<String, Object> respuesta = new HashMap<>();
        // respuesta.put("Empleado", empleado1);
        return usuario1;
    }
}
