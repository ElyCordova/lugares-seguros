package com.example.lugaresseguros.controllers;

import com.example.lugaresseguros.models.PlaceModel;
import com.example.lugaresseguros.services.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("places")/*renombrando el end point con places*/
public class PlaceServiceController {

    @Autowired
    PlaceService placeService;
    @GetMapping("/") /*aquí le decimos cuál es la ruta*/
    public Collection<PlaceModel> index(){
        return placeService.getPlace();
    }

    @GetMapping("/{name}") /*aquí le decimos cuál es la ruta*/
    public String getHello(@PathVariable("name") String name){

        return placeService.getHello(name);
    }
}

