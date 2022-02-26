package no.hiof.mariubeg.Oblig_3.models;

public class Star extends CelestialBody{

    private int effectiveTemp;
    private static final double rsun = 695_700;
    private static final double msun = 1.98892E30;

    public Star(String name, double radius, double mass, int effectiveTemp) {
        super(name, radius, mass);
        this.effectiveTemp = effectiveTemp;
    }

    public double getRadiusInKm() {
        return super.getRadius() * rsun;
    }

    public double getMassInKg() {
        return super.getMass() * msun;
    }

    public double getSurfaceGravity() {
        return (super.getGravityConstant() * getMassInKg()) / Math.pow(getRadiusInKm()*1000, 2);
    }

    @Override
    public String toString() {
        return "The star " + super.getName() + " has a radius of " + super.getRadius() +
                " Rsun, and a mass of " + super.getMass() + " Msun. It's effective temperature is " +
                effectiveTemp + " kelvin.";
    }

    public int getEffectiveTemp() {
        return effectiveTemp;
    }

    public void setEffectiveTemp(int effectiveTemp) {
        this.effectiveTemp = effectiveTemp;
    }
}
