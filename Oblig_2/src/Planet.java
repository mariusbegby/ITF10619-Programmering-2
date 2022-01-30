public class Planet {

    private String name;
    private double radius;
    private double mass;

    public Planet(String planetName, double planetRadius, double planetMass) {
        name = planetName;
        radius = planetRadius;
        mass = planetMass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public void printDescription() {
        System.out.println("The planet '" + this.name + "' has a radius of " + this.radius + " Rjup and a mass of " + this.mass + " Mjup.");
    }

    public double getRadiusKm() {
        return this.radius * 71492;
    }

    public double getMassKg() {
        return this.mass * 1.898E27;
    }

    public double getEarthMass() {
        return this.getMassKg() / 5.972E24;
    }

    public double getEarthRadius() {
        return this.getRadiusKm() / 6371;
    }

    public double getSurfaceGravity() {
        double gravityConst = 6.67408E-11;
        double massInKg = this.getMassKg();
        double radiusInMeter = this.getRadiusKm() * 1000;

        // g = (GM) / (R^2)
        return (gravityConst * massInKg) / (radiusInMeter * radiusInMeter); // m/s^2
    }
}
