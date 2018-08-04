/**
 * 
 */
package com.cosmosapi.resource;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cosmosapi.service.PlanetService;

/**
 * @author Delano Jr
 *
 */
@CrossOrigin("*")
@RestController
@RequestMapping(value = "/planet")
public class PlanetResource implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	private PlanetService planetService;

	@GetMapping
	private ResponseEntity<?> getPlanets() {
		return ResponseEntity.ok(planetService.getAllPlanets());
	}

}
