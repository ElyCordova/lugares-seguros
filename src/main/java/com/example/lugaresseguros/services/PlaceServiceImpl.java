package com.example.lugaresseguros.services;
import com.example.lugaresseguros.models.PlaceModel;
import com.example.lugaresseguros.repositories.PlaceJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlaceServiceImpl implements PlaceService {

    @Autowired //genera beans//
    private PlaceJpaRepository repository;

    @Override
    public PlaceModel createPlace(PlaceModel place) {
        return repository.save(place);
    }

    @Override
    public List<PlaceModel> getAllPlaces() {
        return repository.findAll();
    }

    @Override
    public Optional<PlaceModel> updatePlaceByID(Long id, PlaceModel placeReceived) {
        return repository.findById(id)
                .map(placeFound -> {
                    placeFound.setName(placeReceived.getName());
                    placeFound.setDescription(placeReceived.getDescription());
                    placeFound.setAddress_state(placeReceived.getAddress_state());
                    placeFound.setAddress_city(placeReceived.getAddress_city());
                    placeFound.setAddress_colonia(placeReceived.getAddress_colonia());
                    placeFound.setAddress_street(placeReceived.getAddress_street());
                    placeFound.setAddress_zipcode(placeReceived.getAddress_zipcode());

                    return repository.save(placeFound);
                });
    }

    @Override
    public Boolean deletePLaceByID(Long id) {
        return null;
    }

    @Override
    public Boolean deletePlaceByID(Long id) {
        repository.deleteById(id);
        return repository.findById(id)
                .map(placeFound -> {
                    return false;
                })
                .orElseGet(() -> {
                    return true;
                });
    }

}