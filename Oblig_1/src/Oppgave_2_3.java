public class Oppgave_2_3 {
    public static void main(String[] args) {
        Planet mars = new Planet("Mars", 3889, 6.38E23);
        mars.printPlanetDescription();

        Planet earth = new Planet("Earth", 6371, 5.97E24);
        earth.printPlanetDescription();

        Planet mercury = new Planet("Mercury", 2440, 3.26E23);
        mercury.printPlanetDescription();
    }
}
