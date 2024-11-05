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
    
}
