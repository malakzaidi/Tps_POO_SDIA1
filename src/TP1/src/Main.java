package TP1.src;

import java.util.Scanner; // Importer de la classe Scanner pour la saisie utilisateur
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Créer d'un objet Scanner pour lire les entrées de l'utilisateur
        int choix; // Déclarer une variable pour stocker le choix de l'utilisateur
        // Boucle do-while pour afficher le menu et exécuter les options jusqu'à ce que l'utilisateur choisisse de quitter
        do {
            // Afficher le menu principal
            System.out.println("\nMenu Principal : Choisissez un exercice");
            System.out.println("1. Gestion des notes des étudiants (Exercice 1)");
            System.out.println("2. Conjugaison d'un verbe du premier groupe (Exercice 2)");
            System.out.println("3. Opérations sur une chaîne de caractères (Exercice 3)");
            System.out.println("4. Compter les occurrences des lettres dans un texte (Exercice 4)");
            System.out.println("0. Quitter");
            System.out.print("Choix : "); // Demander à l'utilisateur de faire un choix
            choix = scanner.nextInt(); // Lire le choix de l'utilisateur
            scanner.nextLine(); // Consommer le saut de ligne après la saisie de l'entier
            // Switch pour traiter le choix de l'utilisateur
            switch (choix) {
                case 1 -> { // Si l'utilisateur choisit l'exercice 1
                    System.out.print("Entrez le nombre d'étudiants : "); // Demander le nombre d'étudiants
                    int numEtudiants = scanner.nextInt(); // Lire le nombre d'étudiants
                    Exercice1 exercice1 = new Exercice1(numEtudiants); // Créer d'une instance de Exercice1
                    // Appel des méthodes de l'exercice 1
                    exercice1.trierNotes(); // Trier les notes des étudiants
                    System.out.println("Liste des notes triées : "); // Afficher un message pour les notes triées
                    for (double note : exercice1.notes) { // Boucle pour afficher chaque note
                        System.out.println(note); // Afficher la note
                    }
                    // Afficher la moyenne, la note minimale et la note maximale
                    System.out.println("Moyenne des notes : " + exercice1.moyenne());
                    System.out.println("Note minimale : " + exercice1.noteminimale());
                    System.out.println("Note maximale : " + exercice1.notemaximale());
                    System.out.print("Entrez une note pour compter les étudiants ayant cette note : "); // Demander une note à l'utilisateur
                    double noteSaisie = scanner.nextDouble(); // Lire la note saisie
                    // Afficher le nombre d'étudiants ayant la note saisie
                    System.out.println("Nombre d'étudiants avec la note " + noteSaisie + " : " + exercice1.compterEtudiants(noteSaisie));
                }
                case 2 -> { // Si l'utilisateur choisit l'exercice 2
                    System.out.print("Entrez un verbe du premier groupe : "); // Demande un verbe à l'utilisateur
                    String verbe = scanner.nextLine(); // Lecture du verbe saisi
                    Exercice2 exercice2 = new Exercice2(verbe); // Création d'une instance de Exercice2
                    exercice2.conjuguer(); // Appel de la méthode pour conjuguer le verbe
                }
                case 3 -> { // Si l'utilisateur choisit l'exercice 3
                    Exercice3 exercice3 = new Exercice3(); // Création d'une instance de Exercice3
                    exercice3.menu(); // Affiche le menu de l'exercice 3
                }
                case 4 -> { // Si l'utilisateur choisit l'exercice 4
                    Exercice4 exercice4 = new Exercice4(); // Créer une instance de l'exercice4
                    exercice4.saisirTexte(); // Demander à l'utilisateur de saisir un texte
                    exercice4.compterOccurrences(); // Compter les occurrences des lettres dans le texte
                }
                case 0 -> System.out.println("Fin du programme."); // Message de fin si l'utilisateur choisit de quitter
                default -> System.out.println("Choix invalide. Veuillez réessayer."); // Message d'erreur pour un choix invalide
            }
        } while (choix != 0); // Continuer la boucle tant que l'utilisateur ne choisit pas de quitter

        scanner.close(); // Fermer le scanner pour libérer les ressources
    }
}
