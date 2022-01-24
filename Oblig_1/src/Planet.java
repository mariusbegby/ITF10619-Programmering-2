public class Planet {
    private String name;
    private double mass;
    private double radius;

    public Planet(String planetName, double planetMass, double planetRadius) {
        name = planetName;
        mass = planetMass;
        radius = planetRadius;
    }

    public String getName() {
        return name;
    }

    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setMass(int newMass) {
        mass = newMass;
    }

    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    public void printPlanetDescription() {
        System.out.println("The planet " + name + " has a radius of " + radius + " km and a mass of " + mass + " kg.");
    }
}
