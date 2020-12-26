package com.prasanth.planet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prasanth.planet.dao.PlanetDao;
import com.prasanth.planet.dto.Planet;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/")
public class planetController {

	@Autowired
	private PlanetDao planetDao;
	
	@GetMapping("/")
	public List<Planet> findAll() {
		return planetDao.findAll();
	}
	
	@PostMapping("/planet")
	public void update(@RequestBody Planet planet) {
		planetDao.save(planet);
	}
}
