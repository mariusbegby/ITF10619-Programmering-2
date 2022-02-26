package no.hiof.mariubeg.Oblig_3.models;

public abstract class CelestialBody {
    private String name;
    private double radius;
    private double mass;
    private static final double gravityConstant = 6.67408E-11;

    public CelestialBody(String name, double radius, double mass) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
    }

    public String getName() {
        return name;
    }

    public double getGravityConstant() {
        return gravityConstant;
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

    public abstract String toString();
    public abstract double getRadiusInKm();
    public abstract double getMassInKg();

}
