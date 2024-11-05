import Exercice2.Calculateur;
import Exercice2.RacineCarree;

public static void main(String[] args) {
    Calculateur calculateur = new Calculateur();
    try {
        calculateur.testRacineCarree(-5); // Will throw RacineCarreeException
        calculateur.testRacineCarree(25); // Will display the square root
    } catch (RacineCarree e) {
        e.printStackTrace(); // Print the exception stack trace
    }
}
