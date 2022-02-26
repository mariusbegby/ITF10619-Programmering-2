package no.hiof.mariubeg.Oblig_3.models;

public class Planet extends CelestialBody {

    private static final double rjup = 71_492;
    private static final double mjup = 1.898E27;
    private static final double rearth = 6371;
    private static final double mearth = 5.972E24;

    public Planet(String name, double radius, double mass) {
        super(name, radius, mass);
    }

    public double getRadiusInKm() {
        return super.getRadius() * rjup;
    }

    public double getMassInKg() {
        return super.getMass() * mjup;
    }

    public double radiusInRearth() {
        return getRadiusInKm()/rearth;
    }

    public double massInMearth() {
        return getMassInKg()/mearth;
    }

    public double getSurfaceGravity() {
        return (super.getGravityConstant() * getMassInKg()) / Math.pow(getRadiusInKm()*1000, 2);
    }

    @Override
    public String toString() {
        return "The planet " + super.getName() + " has a radius of " + super.getRadius() +
                " Rjup, and a mass of " + super.getMass() + " Mjup.";
    }
}
