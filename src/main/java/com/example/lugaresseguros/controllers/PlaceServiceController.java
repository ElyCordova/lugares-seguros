package com.example.lugaresseguros.controllers;

import com.example.lugaresseguros.models.PlaceModel;
import com.example.lugaresseguros.services.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("places")/*end point llamado places*/
public class PlaceServiceController {

    @Autowired
    PlaceService placeService;

    //Create place
    @PostMapping
    public PlaceModel createPlaceController(@RequestBody PlaceModel place) {
        return placeService.createPlace(place);
    }

    //Retrieve all places
    @GetMapping
    public List<PlaceModel> getAllPlacesController() {
        return placeService.getAllPlaces();
    }

    //Update place by ID
    @PatchMapping("/{id}")
    public Optional <PlaceModel> updatePlaceController(@PathVariable Long id, @RequestBody PlaceModel request) {
        return placeService.updatePlaceByID(id, request);
    }

    //Delete place by ID
    @DeleteMapping("/{id}")
    public String deletePlaceController(@PathVariable Long id) {
        if(placeService.deletePlaceByID(id)){
            return "Place deleted successfully";
        }else{
            return "Error";
        }
    }

    //Save a URL image to a place by ID
    @PostMapping("/{id}/image")
    public Optional<PlaceModel> savePlaceUrlImageController(@PathVariable Long id, @RequestBody PlaceModel request){
        return placeService.savePlaceUrlImage(id, request); //método que recibe el id y request
    }

}

