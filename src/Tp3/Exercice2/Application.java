package Tp3.Exercice2;
public static void main(String[] args) {
    Calculateur calculateur = new Calculateur();
    try {
        calculateur.testRacineCarree(-5); // Will throw RacineCarreeException
        calculateur.testRacineCarree(25); // Will display the square root
    } catch (RacineCarreeException e) {
        e.printStackTrace(); // Print the exception stack trace
    }
}