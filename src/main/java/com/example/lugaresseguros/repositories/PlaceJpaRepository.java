package com.example.lugaresseguros.repositories;

import com.example.lugaresseguros.models.PlaceModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaceJpaRepository extends JpaRepository<PlaceModel, Long> {
}
