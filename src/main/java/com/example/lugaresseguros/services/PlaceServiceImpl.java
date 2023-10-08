package com.example.lugaresseguros.services;
import com.example.lugaresseguros.models.PlaceModel;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class PlaceServiceImpl implements PlaceService {
    private static Map<String, PlaceModel> placeRepo = new HashMap<String, PlaceModel>();
    static {
        PlaceModel brasil = new PlaceModel( "1", "Brasil");
        placeRepo.put(brasil.getId(), brasil);
        PlaceModel mexico = new PlaceModel( "2", "Mexico");
        placeRepo.put(mexico.getId(), mexico);

    }
    @Override
    public String getHello(){
        return "Hello world desde un servicio";
    }

    @Override
    public String getHello(String name) {
        return "Hello " + name;
    }

    @Override
    public void createPlace(PlaceModel place) {
        placeRepo.put(place.getId(), place);
    }

    @Override
    public void updatePlace(String id, PlaceModel place) {
        placeRepo.remove(id);
        place.setId(id);
        placeRepo.put(id, place);
    }

    @Override
    public Collection<PlaceModel> getPlace() {
        return  placeRepo.values();
    }
}
