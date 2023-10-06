package com.example.lugaresseguros.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/") /*aquí le decimos cuál es la ruta*/
    public String index(){
        return "Hello World";
    }
}
