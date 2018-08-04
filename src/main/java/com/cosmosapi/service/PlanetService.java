/**
 * 
 */
package com.cosmosapi.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cosmosapi.domain.Planet;

/**
 * @author Delano Jr
 *
 */
@Service
public class PlanetService {

	public List<Planet> getAllPlanets() {
		List<Planet> planets = 
				Arrays.asList(
						new Planet(
						"Mars", 
						"The Red One", 
						144.800, 
						227.900,
						Arrays.asList("Fobos", "Deimos"), 
						Arrays.asList("Magnesium", "Iron"),
						"https://upload.wikimedia.org/wikipedia/commons/thumb/7/7d/Mars_atmosphere.jpg/170px-Mars_atmosphere.jpg",
						Arrays.asList(
								"http://4.bp.blogspot.com/_-_DfA6iMs2w/TCUPzhqm5EI/AAAAAAAAB_Q/kdRMadsIf_E/s400/Planet+Mars.jpg",
								"https://spaceplace.nasa.gov/review/all-about-mars/mars3.en.jpg",
								"http://www.goroadachi.com/etemenanki/010604-1s.jpg")),
						
						new Planet(
						"Jupiter", 
						"The Big One", 
						69.911, 
						778.500, 
						Arrays.asList("Europa","Ganímedes","Io","Calisto"), 
						Arrays.asList("Hidrogenio","Helio"), 
						"https://archive.org/services/img/MSFC-7994970",
						Arrays.asList(
								"http://www.jupiterscientific.org/sciinfo/jupiterimage.jpg",
								"http://static.howstuffworks.com/gif/voyager-jupiter.jpg")));
		return planets;
	}
}
