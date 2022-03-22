package no.hiof.mariubeg.models;

import java.util.ArrayList;

public class PlanetSystem implements Comparable<PlanetSystem> {
    private String name;
    private Star centerStar;
    private ArrayList<Planet> planets = new ArrayList<>();

    public PlanetSystem(String name, Star centerStar) {
        this.name = name;
        this.centerStar = centerStar;
    }

    @Override
    public int compareTo(PlanetSystem planetSystem) {
        if(planets.size() == planetSystem.getPlanets().size()) {
            return 0;
        }
        else if (planets.size() < planetSystem.getPlanets().size()) {
            return 1;
        }
        else {
            return -1;
        }
    }

    public Planet getPlanet(String name) {
        for (Planet aPlanet : planets ) {
            if (aPlanet.getName().equalsIgnoreCase(name)) {
                return aPlanet;
            }
        }

        return null;
    }

    public Planet getSmallestPlanet() {
        if (planets.size() == 0)
            return null;

        Planet smallestPlanet = planets.get(0);

        for (Planet currentPlanet : planets) {
            if (currentPlanet.getRadius() < smallestPlanet.getRadius()) {
                smallestPlanet = currentPlanet;
            }
            else if (currentPlanet.getRadius() == smallestPlanet.getRadius() &&
                    currentPlanet.getMass() < smallestPlanet.getMass()) {
                smallestPlanet = currentPlanet;
            }
        }

        return smallestPlanet;
    }

    public Planet getLargestPlanet() {
        if (planets.size() == 0)
            return null;

        Planet largestPlanet = planets.get(0);

        for (Planet currentPlanet : planets) {
            if (currentPlanet.getRadius() > largestPlanet.getRadius()) {
                largestPlanet = currentPlanet;
            }
            else if (currentPlanet.getRadius() == largestPlanet.getRadius() &&
                    currentPlanet.getMass() > largestPlanet.getMass()) {
                largestPlanet = currentPlanet;
            }
        }

        return largestPlanet;
    }

    public void addPlanet(Planet aPlanet) {
        planets.add(aPlanet);
    }

    public ArrayList<Planet> getPlanets() {
        return new ArrayList<>(planets);
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

    // Object.java
    @Override
    public String toString() {
        return name + " has " + planets.size() +
                " planets that revolve around the star " +
                centerStar.getName();
    }
}
