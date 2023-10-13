package com.example.lugaresseguros.services;

import com.example.lugaresseguros.models.PlaceModel;

import java.util.List;
import java.util.Optional;

public interface PlaceService {

    public PlaceModel createPlace(PlaceModel place);

    public List<PlaceModel> getAllPlaces();

    public Optional<PlaceModel> updatePlaceByID(Long id, PlaceModel place);

    Boolean deletePLaceByID(Long id);

    public Boolean deletePlaceByID(Long id);

}
