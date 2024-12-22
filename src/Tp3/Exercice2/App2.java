package Tp3.Exercice2;

public class App2 {
    public static void main(String[] args) {
        Calculateur calculateur = new Calculateur();
        try {
            calculateur.testRacineCarree(25);
            calculateur.testRacineCarree(-1);
        } catch (RacineCarreeException e) {
            System.out.println(e.getMessage());
        }
    }
}


