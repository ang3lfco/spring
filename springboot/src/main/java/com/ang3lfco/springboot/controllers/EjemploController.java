package com.ang3lfco.springboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ang3lfco.springboot.models.Empleados;


@Controller
public class EjemploController {

    @GetMapping("/detalles_info")
    public String info(Model model){
        Empleados empleado1 = new Empleados(
            "Juan",
            "Rodriguez",
            "Calle 1 No 2",
            "Gerente",
            35,
            1234567890,
            001
        );
        model.addAttribute("Empleado", empleado1);
        return "detalles_info";
    }
}
