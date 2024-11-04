package Tp3.Exercice2;

public class Calculateur {
    // Empty constructor
    public Calculateur() {
    }

    // Method to test square root with exception for negative numbers
    public void testRacineCarree(int nombre) throws RacineCarreeException {
        if (nombre < 0) {
            throw new RacineCarreeException(nombre);
        } else {
            System.out.println("La racine carrée de " + nombre + " est " + Math.sqrt(nombre));
        }
    }

    // Main method
    public static void main(String[] args) {
        Calculateur calculateur = new Calculateur();
        try {
            calculateur.testRacineCarree(-5); // Will throw RacineCarreeException
            calculateur.testRacineCarree(25); // Will display the square root
        } catch (RacineCarreeException e) {
            e.printStackTrace(); // Print the exception stack trace
        }
    }
}
