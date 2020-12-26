package com.prasanth.planet.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prasanth.planet.dto.Planet;

public interface PlanetDao extends JpaRepository<Planet, String> {

}
