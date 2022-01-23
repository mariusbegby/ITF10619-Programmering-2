import java.util.Scanner; // Importing the Scanner class to get user input

public class Oppgave_3_1 {
    public static void main(String[] args) {

        System.out.println("\nCreating a new planet. Enter the information below: ");

        Scanner input = new Scanner(System.in);

        System.out.println("Planet name:");
        String planetName = input.next();

        System.out.println("Planet mass:");
        int planetMass = input.nextInt();

        System.out.println("Planet radius:");
        String planetRadius = input.next();

        input.close();

        System.out.println("name: " + planetName + ", mass: " + planetMass + ", radius: " + planetRadius);
    }
}
