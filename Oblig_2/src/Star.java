public class Star {

    private String name;
    private double radius;
    private double mass;
    private int effectiveTemp;

    public Star(String starName, double starRadius, double starMass, int starEffectiveTemp) {
        name = starName;
        radius = starRadius;
        mass = starMass;
        effectiveTemp = starEffectiveTemp;
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

    public int getEffectiveTemp() {
        return effectiveTemp;
    }

    public void setEffectiveTemp(int effectiveTemp) {
        this.effectiveTemp = effectiveTemp;
    }

    public void printDescription() {
        System.out.println("The star '" + this.name + "' has a radius of " + this.radius + " Rsun and a mass of " + this.mass + " Msun with an effective temperature of " + this.effectiveTemp + " kelvin.");
    }

    public double getRadiusKm() {
        return this.radius * 695700;
    }

    public double getMassKg() {
        return this.mass * 1.98892E30;
    }
}
