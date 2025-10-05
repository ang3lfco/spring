package com.ang3lfco.springboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class EjemploController {

    @GetMapping("/detalles_info")
    public String info(Model model){
        model.addAttribute("Titulo", "Servidor en linea");
        model.addAttribute("Servidor", "Informaticonfig");
        model.addAttribute("Ip", "192.168.1.1");
        return "detalles_info";
    }
}
