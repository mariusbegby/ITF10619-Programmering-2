import java.util.Scanner; // Importing the Scanner class to get user input

public class Oppgave_3_1 {
    public static void main(String[] args) {

        System.out.println("\nCreating a new planet. Enter the information below: ");

        Scanner input = new Scanner(System.in);

        System.out.println("Planet name (e.g. Earth):");
        String planetName = input.next();

        System.out.println("Planet mass (e.g. 6371):");
        double planetMass = input.nextDouble();

        System.out.println("Planet radius (e.g. 5,97E24):");
        double planetRadius = input.nextDouble();

        input.close();

        Planet userPlanet = new Planet(planetName, planetMass, planetRadius);
        userPlanet.printPlanetDescription();

    }
}
