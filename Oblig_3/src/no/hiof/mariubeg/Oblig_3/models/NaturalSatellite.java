package no.hiof.mariubeg.Oblig_3.models;

public abstract class NaturalSatellite extends CelestialBody {

    private double semiMajorAxis;
    private double eccentricity;
    private double orbitalPeriod;
    private CelestialBody centralCelestialBody;

    public NaturalSatellite(String name, double radius, double mass, double semiMajorAxis, double eccentricity, double orbitalPeriod, CelestialBody centralCelestialBody) {
        super(name, radius, mass);
        this.semiMajorAxis = semiMajorAxis;
        this.eccentricity = eccentricity;
        this.orbitalPeriod = orbitalPeriod;
        this.centralCelestialBody = centralCelestialBody;
    }

    public double getSemiMajorAxis() {
        return semiMajorAxis;
    }

    public void setSemiMajorAxis(double semiMajorAxis) {
        this.semiMajorAxis = semiMajorAxis;
    }

    public double getEccentricity() {
        return eccentricity;
    }

    public void setEccentricity(double eccentricity) {
        this.eccentricity = eccentricity;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public void setOrbitalPeriod(double orbitalPeriod) {
        this.orbitalPeriod = orbitalPeriod;
    }

    public CelestialBody getCentralCelestialBody() {
        return centralCelestialBody;
    }

    public void setCentralCelestialBody(CelestialBody centralCelestialBody) {
        this.centralCelestialBody = centralCelestialBody;
    }

    public double getDistanceToCelestialBody(double degrees) {
        double r = (semiMajorAxis * (1 - Math.pow(eccentricity, 2))) / (1 + (eccentricity * Math.cos(Math.toRadians(degrees))));
        return r * super.getAu();
    }

    public double orbitingVelocity(double distance) {
        double orbitVelocity = Math.sqrt((super.getGravityConstant() * centralCelestialBody.getMassInKg()) / (distance * 1000));
        return orbitVelocity / 1000;
    }
}
