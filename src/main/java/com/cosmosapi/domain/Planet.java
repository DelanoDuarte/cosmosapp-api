/**
 * 
 */
package com.cosmosapi.domain;

import java.io.Serializable;
import java.util.List;

/**
 * @author Delano Jr
 *
 */
public class Planet implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String planetName;
	private String planetDescription;
	private Double planetSize;
	private Double planetSunDistance;
	private List<String> planetMoons;
	private List<String> planetChemicalsComposition;
	private String planetPhotoLink;
	private List<String> planetPhotos;

	public Planet() {
		super();
	}

	public Planet(String planetName, String planetDescription, Double planetSize, Double planetSunDistance,
			List<String> planetMoons, List<String> planetChemicalsComposition, String planetPhotoLink,
			List<String> planetPhotos) {
		super();
		this.planetName = planetName;
		this.planetDescription = planetDescription;
		this.planetSize = planetSize;
		this.planetSunDistance = planetSunDistance;
		this.planetMoons = planetMoons;
		this.planetChemicalsComposition = planetChemicalsComposition;
		this.planetPhotoLink = planetPhotoLink;
		this.planetPhotos = planetPhotos;
	}

	public String getPlanetName() {
		return planetName;
	}

	public void setPlanetName(String planetName) {
		this.planetName = planetName;
	}

	public String getPlanetDescription() {
		return planetDescription;
	}

	public void setPlanetDescription(String planetDescription) {
		this.planetDescription = planetDescription;
	}

	public Double getPlanetSize() {
		return planetSize;
	}

	public void setPlanetSize(Double planetSize) {
		this.planetSize = planetSize;
	}

	public Double getPlanetSunDistance() {
		return planetSunDistance;
	}

	public void setPlanetSunDistance(Double planetSunDistance) {
		this.planetSunDistance = planetSunDistance;
	}

	public List<String> getPlanetMoons() {
		return planetMoons;
	}

	public void setPlanetMoons(List<String> planetMoons) {
		this.planetMoons = planetMoons;
	}

	public List<String> getPlanetChemicalsComposition() {
		return planetChemicalsComposition;
	}

	public void setPlanetChemicalsComposition(List<String> planetChemicalsComposition) {
		this.planetChemicalsComposition = planetChemicalsComposition;
	}

	public String getPlanetPhotoLink() {
		return planetPhotoLink;
	}

	public void setPlanetPhotoLink(String planetPhotoLink) {
		this.planetPhotoLink = planetPhotoLink;
	}

	public List<String> getPlanetPhotos() {
		return planetPhotos;
	}

	public void setPlanetPhotos(List<String> planetPhotos) {
		this.planetPhotos = planetPhotos;
	}

}
