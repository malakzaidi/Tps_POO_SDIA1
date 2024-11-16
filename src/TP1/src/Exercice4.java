package TP1.src;

import java.util.Scanner;
public class Exercice4 {
    private String texte;

    // Méthode pour saisir une ligne de texte
    public void saisirTexte() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez une ligne de texte (max. 100 caractères) : ");
        texte = scanner.nextLine().toUpperCase(); // Convertir en majuscule pour uniformité
    }

    // Méthode pour compter les occurrences de chaque lettre
    public void compterOccurrences() {
        int[] nbOccurrences = new int[26]; // Tableau pour mémoriser les occurrences

        for (char c : texte.toCharArray()) {
            if (c >= 'A' && c <= 'Z') { // Vérifier si c'est une lettre
                nbOccurrences[c - 'A']++;
            }
        }

        System.out.println("Occurrences des lettres dans le texte :");
        for (int i = 0; i < nbOccurrences.length; i++) {
            if (nbOccurrences[i] > 0) {
                System.out.println(nbOccurrences[i] + " fois la lettre '" + (char) (i + 'A') + "'");
            }
        }
    }
}
