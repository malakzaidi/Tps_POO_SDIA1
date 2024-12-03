package Tp4.Collections.Exercice2;
import java.util.HashMap;
public class Exo2 {
    public static void main(String[] args) {
        // 1. Création d'une HashMap pour stocker les notes des étudiants
        HashMap<String, Double> notesEtudiants = new HashMap<>();
        // 2. Insertion des notes des étudiants
        notesEtudiants.put("Ahmed", 20.0);
        notesEtudiants.put("Fatima", 17.0);
        notesEtudiants.put("Hassan", 15.0);
        System.out.println("=== Initialisation des notes ===");
        afficherNotes(notesEtudiants);
        // 3. Augmenter la note d'un étudiant
        System.out.println("\n=== Augmentation de la note de Fatima ===");
        augmenterNote(notesEtudiants, 2.0);
        afficherNotes(notesEtudiants);
        // 4. Supprimer la note d'un étudiant
        System.out.println("\n=== Suppression de la note de Hassan ===");
        notesEtudiants.remove("Hassan");
        afficherNotes(notesEtudiants);

        // 5. Afficher la taille de la HashMap
        System.out.println("\nTaille de la liste des étudiants : " + notesEtudiants.size());

        // 6. Afficher la moyenne, le max et le min des notes
        System.out.println("\n=== Statistiques des notes ===");
        afficherStatistiques(notesEtudiants);

        // 7. Vérifier s'il y a une note égale à 20
        System.out.println("\n=== Vérification de l'existence d'une note égale à 20 ===");
        boolean noteParfaite = notesEtudiants.containsValue(20.0);
        System.out.println(noteParfaite
                ? "Une note de 20 est présente."
                : " Aucune note de 20 n'est trouvée.");
    }
    // Méthode pour afficher les statistiques des notes
    private static void afficherStatistiques(HashMap<String, Double> notesEtudiants) {
        if (notesEtudiants.isEmpty()) {
            System.out.println(" Pas de notes disposable.");
            return;
        }
        // Calcul de la somme des notes
        double somme = notesEtudiants.values().stream().mapToDouble(Double::doubleValue).sum();
        // Calcul de la moyenne
        double moyenne = somme / notesEtudiants.size();
        // Recherche de la note maximale
        double max = notesEtudiants.values().stream().mapToDouble(Double::doubleValue).max().orElse(0.0);
        // Recherche de la note minimale
        double min = notesEtudiants.values().stream().mapToDouble(Double::doubleValue).min().orElse(0.0);
        // Affichage des statistiques
        System.out.println("Somme des notes : " + somme);
        System.out.println("Moyenne des notes : " + moyenne);
        System.out.println("Note maximale : " + max);
        System.out.println("Note minimale : " + min);
    }
    // Méthode pour augmenter la note d'un étudiant
    private static void augmenterNote(HashMap<String, Double> notesEtudiants, double augmentation) {
        // Utilisation de computeIfPresent pour modifier la note si l'étudiant existe
        notesEtudiants.computeIfPresent("Fatima", (k, v) -> v + augmentation);
    }
    // Méthode pour afficher les notes des étudiants
    private static void afficherNotes(HashMap<String, Double> notesEtudiants) {
        System.out.println("=== Liste des notes des étudiants ===");
        // Utilisation de forEach avec une expression lambda
        notesEtudiants.forEach((nom, note) -> System.out.println(nom + " : " + note));
    }
}

