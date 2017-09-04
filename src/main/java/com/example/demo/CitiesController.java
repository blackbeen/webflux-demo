package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Madhura Bhave
 */
@RestController
public class CitiesController {

	private CityRepository repository;

	public CitiesController(CityRepository repository) {
		this.repository = repository;
	}

	@GetMapping("/cities/{id}")
	public City findById(@PathVariable String id) {
		return this.repository.findById(id).orElse(null);
	}

	@GetMapping("/cities")
	public Iterable<City> all() {
		return this.repository.findAll();
	}
}
