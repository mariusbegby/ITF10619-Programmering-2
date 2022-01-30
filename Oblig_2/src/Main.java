import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        String planetSystemName = "Solar system";

        Star planetSystemCenterStar = new Star("Sun", 1.0, 1.0, 5777);

        ArrayList<Planet> planetSystemPlanets = new ArrayList<>();
        planetSystemPlanets.add(new Planet("Mercury", 0.03412549655905556, 1.7297154899894627E-4));
        planetSystemPlanets.add(new Planet("Venus", 0.08465003077267387, 0.002564278187565859));
        planetSystemPlanets.add(new Planet("Earth", 0.08911486599899289, 0.003146469968387777));
        planetSystemPlanets.add(new Planet("Mars", 0.04741089912158004, 3.3667017913593256E-4));
        planetSystemPlanets.add(new Planet("Jupiter", 1.0, 1.0));
        planetSystemPlanets.add(new Planet("Saturn", 0.8145247020645666, 0.2994204425711275));
        planetSystemPlanets.add(new Planet("Uranus", 0.35475297935433336, 0.04573761854583773));
        planetSystemPlanets.add(new Planet("Neptune", 0.34440217087226543, 0.05395152792413066));

        PlanetSystem solarSystem = new PlanetSystem(planetSystemName, planetSystemCenterStar, planetSystemPlanets);
        System.out.println("### Oppgave 2.3 ###");
        solarSystem.printDescription();

        Planet saturn = planetSystemPlanets.get(5);

        System.out.println("\n### Oppgave 2.4 ###");
        System.out.println("Saturn has a radius of " + saturn.getRadiusKm() + " km and a mass of " + saturn.getMassKg() + " kg.");
        System.out.println("The Sun has a radius of " + planetSystemCenterStar.getRadiusKm() + " km and a mass of " + planetSystemCenterStar.getMassKg() + " kg.");

        Planet neptune = planetSystemPlanets.get(7);
        System.out.println("\n### Oppgave 2.5 ###");
        System.out.println("Neptune has a surface gravity of " + neptune.getSurfaceGravity() + " m/s^2");

        Planet biggestPlanet = solarSystem.getBiggestPlanet();
        Planet smallestPlanet = solarSystem.getSmallestPlanet();

        System.out.println("\n### Oppgave 2.6 ###");
        System.out.println("The biggest planet is " + biggestPlanet.getName() + " with a radius of " + biggestPlanet.getRadiusKm() + " km and a mass of " + biggestPlanet.getMassKg() + " kg.");
        System.out.println("The smallest planet is " + smallestPlanet.getName() + " with a radius of " + smallestPlanet.getRadiusKm() + " km and a mass of " + smallestPlanet.getMassKg() + " kg.");

        Planet mars = planetSystemPlanets.get(3);
        System.out.println("\n### Oppgave 3.1 ###");
        System.out.println("Mars has an Mearth of " + mars.getEarthMass() + " and an Rearth of " + mars.getEarthRadius() + ".");
    }

}
