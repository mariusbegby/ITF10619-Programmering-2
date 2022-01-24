import java.util.Objects;
import java.util.Scanner; // Importing the Scanner class to get user input

public class Oppgave_3_2 {
    public static void main(String[] args) {

        boolean programIsRunning = true;

        Scanner input = new Scanner(System.in);

        while(programIsRunning) {

            System.out.println("\nCreating a new planet. Enter the information below: ");

            System.out.println("Planet name (e.g. Earth):");
            String planetName = input.next();

            System.out.println("Planet mass (e.g. 6371):");
            double planetMass = input.nextDouble();

            System.out.println("Planet radius (e.g. 5,97E24):");
            double planetRadius = input.nextDouble();

            Planet userPlanet = new Planet(planetName, planetMass, planetRadius);
            userPlanet.printPlanetDescription();

            System.out.println("Do you want to create another planet? (yes/no)");
            String userContinue = input.next();
            if (!Objects.equals(userContinue, "yes")) {
                programIsRunning = false;
                System.out.println("Exiting program...");
            }

        }

        input.close();

    }
}
