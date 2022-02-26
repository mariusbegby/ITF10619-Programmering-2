package no.hiof.mariubeg.Oblig_3.models;

import java.util.ArrayList;
import java.util.Locale;

public class PlanetSystem {
    private String name;
    private Star centerStar;
    private ArrayList<Planet> planets;

    public PlanetSystem(String name, Star centerStar, ArrayList<Planet> planets) {
        this.name = name;
        this.centerStar = centerStar;
        this.planets = planets;
    }

    public Planet getBiggestPlanet() {
        Planet biggestPlanet = planets.get(0);
        for (Planet planet : planets) {
            if (planet.getRadius() > biggestPlanet.getRadius()) {
                biggestPlanet = planet;
            }
            else if (planet.getRadius() == biggestPlanet.getRadius() &&
            planet.getMass() > biggestPlanet.getMass()) {
                biggestPlanet = planet;
            }
        }
        return biggestPlanet;
    }

    public Planet getSmallestPlanet() {
        Planet smallestPlanet = planets.get(0);
        for (Planet planet : planets) {
            if (planet.getRadius() < smallestPlanet.getRadius()) {
                smallestPlanet = planet;
            }
            else if (planet.getRadius() == smallestPlanet.getRadius() &&
                    planet.getMass() < smallestPlanet.getMass()) {
                smallestPlanet = planet;
            }
        }
        return smallestPlanet;
    }

    public Planet getPlanetByName(String planetName) {
        Planet foundPlanet = null;
        for (Planet planet : planets) {
            if (planet.getName().equalsIgnoreCase(planetName)) {
                foundPlanet = planet;
            }
        }

        return foundPlanet;
    }

    @Override
    public String toString() {
        return "The planet system " + name + " has the center star " + centerStar.getName() +
                " and a total of " + planets.size() + " planets.";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Star getCenterStar() {
        return centerStar;
    }

    public void setCenterStar(Star centerStar) {
        this.centerStar = centerStar;
    }

    public ArrayList<Planet> getPlanets() {
        return planets;
    }

    public void setPlanets(ArrayList<Planet> planets) {
        this.planets = planets;
    }
}
