package com.example.lugaresseguros.services;

import com.example.lugaresseguros.models.PlaceModel;

import java.util.Collection;

public interface PlaceService {
    public String getHello();

    public String getHello(String name);


    void createPlace(PlaceModel place);

    void updatePlace(String id, PlaceModel place);

    Collection<PlaceModel> getPlace();
}
