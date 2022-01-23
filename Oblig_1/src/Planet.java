public class Planet {
    private String name;
    private int mass;
    private String radius;

    public Planet(String planetName, int planetMass, String planetRadius) {
        name = planetName;
        mass = planetMass;
        radius = planetRadius;
    }

    public String getName() {
        return name;
    }

    public int getMass() {
        return mass;
    }

    public String getRadius() {
        return radius;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setMass(int newMass) {
        mass = newMass;
    }

    public void setRadius(String newRadius) {
        radius = newRadius;
    }

    public void printPlanetDescription() {
        System.out.println("Planeten " + name + " har en radius på " + radius + " km og en masse på " + mass + " kg.");
    }
}
