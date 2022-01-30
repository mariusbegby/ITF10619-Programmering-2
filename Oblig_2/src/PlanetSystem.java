import java.util.ArrayList;
import java.util.Collections;

public class PlanetSystem {

    private String name;
    private Star centerStar;
    private ArrayList<Planet> planets;

    public PlanetSystem(String planetSystemName, Star planetSystemCenterStar, ArrayList<Planet> planetSystemPlanets) {
        name = planetSystemName;
        centerStar = planetSystemCenterStar;
        planets = planetSystemPlanets;
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

    public void printDescription() {
        System.out.println("Information about '" + this.name + "':");
        System.out.println("\nIt has the following center star:");
        centerStar.printDescription();
        System.out.println("\nAnd the following planets:");
        for (Planet planet : planets) {
            planet.printDescription();
        }
    }

    public Planet getBiggestPlanet() {
        ArrayList<Double> planetRadiusList = new ArrayList<>();
        for (Planet planet : planets) {
            planetRadiusList.add(planet.getRadius());
        }

        int indexOfMax = planetRadiusList.indexOf(Collections.max(planetRadiusList));

        return planets.get(indexOfMax);
    }

    public Planet getSmallestPlanet() {
        ArrayList<Double> planetRadiusList = new ArrayList<>();
        for (Planet planet : planets) {
            planetRadiusList.add(planet.getRadius());
        }

        int indexOfMin = planetRadiusList.indexOf(Collections.min(planetRadiusList));

        return planets.get(indexOfMin);
    }
}
