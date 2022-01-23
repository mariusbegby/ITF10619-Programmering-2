public class Oppgave_2_2 {
    public static void main(String[] args) {
        double moonGravitation = 0.165;

        double weightOnEarthInKg = 78.5;

        double weightOnMoonInKg = weightOnEarthInKg * moonGravitation;

        System.out.println("Your weight on Earth is: " + weightOnEarthInKg + " kg.");
        System.out.println("Your weight on the moon is: " + weightOnMoonInKg + " kg.");
    }
}
