package com.ang3lfco.springboot.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api")

public class EjemploRestController {

    @GetMapping("/detalles_info2")
    public Map<String, Object> detalles_info2() {
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("Titulo", "Servidor en linea");
        respuesta.put("Servidor", "Informaticonfig");
        respuesta.put("Ip", "192.168.1.1");
        return respuesta;
    }
}
