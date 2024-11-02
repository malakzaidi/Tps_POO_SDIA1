import java.util.Scanner;
public class Exercice3 {
        private String chaine;

        // Méthode pour saisir une chaîne de caractères
        public void saisir() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Entrez une chaîne de caractères : ");
            chaine = scanner.nextLine();
        }

        // Méthode pour afficher la chaîne saisie
        public void afficher() {
            System.out.println("La chaîne saisie est : " + chaine);
        }

        // Méthode pour inverser la chaîne saisie
        public void inverser() {
            String inverse = new StringBuilder(chaine).reverse().toString();
            System.out.println("La chaîne inversée est : " + inverse);
        }

        // Méthode pour compter le nombre de mots dans la chaîne
        public void compterMots() {
            String[] mots = chaine.trim().split("\\s+"); // Diviser par les espaces multiples
            System.out.println("Nombre de mots : " + mots.length);
        }

        // Méthode pour afficher le menu et exécuter les opérations choisies
        public void menu() {
            Scanner scanner = new Scanner(System.in);
            int choix;
            do {
                System.out.println("\nMenu des opérations sur la chaîne de caractères :");
                System.out.println("1. Saisir");
                System.out.println("2. Afficher");
                System.out.println("3. Inverser");
                System.out.println("4. Compter le nombre de mots");
                System.out.println("0. Quitter");
                System.out.print("Choix : ");
                choix = scanner.nextInt();
                scanner.nextLine(); // Consommer le saut de ligne

                switch (choix) {
                    case 1 -> saisir();
                    case 2 -> afficher();
                    case 3 -> inverser();
                    case 4 -> compterMots();
                    case 0 -> System.out.println("Sortie du menu.");
                    default -> System.out.println("Choix invalide.");
                }
                if (choix != 0) {
                    System.out.println("Frappez une touche pour revenir au menu.");
                    scanner.nextLine();
                }
            } while (choix != 0);
        }
    }

