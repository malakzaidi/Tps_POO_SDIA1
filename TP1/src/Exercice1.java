import java.util.Arrays;
import java.util.Scanner;

public class Exercice1 {
        public double[] notes;

        // Initialiser le tableau notes et le remplir avec les notes saisies par l'utilisateur
        public Exercice1(int numEtudiants) {
            notes = new double[numEtudiants];
            Scanner scanner = new Scanner(System.in);
            System.out.println("Veuillez entrer les notes des étudiants");
            for (int i = 0; i < numEtudiants; i++) {
                System.out.print("Note " + (i + 1) + ": ");
                notes[i] = scanner.nextDouble();
            }
            scanner.close(); // Fermer le scanner après la saisie pour éviter les fuites de ressources
        }

        // Trier les notes dans l'ordre croissant
        public void trierNotes() {
            Arrays.sort(notes);
        }

        // Calculer et retourner la moyenne des notes
        public double moyenne() {
            double somme = 0;
            for (double note : notes) {
                somme += note;
            }
            return somme / notes.length;
        }

        // Retourner la note minimale en supposant que le tableau est trié
        public double noteminimale() {
            return notes[0];
        }

        // Retourner la note maximale en supposant que le tableau est trié
        public double notemaximale() {
            return notes[notes.length - 1];
        }
       // Method to count the number of students with a specific grade
        public int compterEtudiants(double noteSaisie) {
        int count = 0;
        for (double note : notes) {
            if (note == noteSaisie) {
                count++;
            }
        }
        return count;
    }


}


