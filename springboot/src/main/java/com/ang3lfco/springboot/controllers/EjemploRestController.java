package com.ang3lfco.springboot.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ang3lfco.springboot.models.Empleados;

import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("/api")

public class EjemploRestController {

    @GetMapping("/detalles_info2")
    public Map<String, Object> detalles_info2() {
        Empleados empleado1 = new Empleados(
            "Juan",
            "Rodriguez",
            "Calle 1 No 2",
            "Gerente",
            35,
            1234567890,
            001
        );

        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("Empleado", empleado1);
        return respuesta;
    }
}
