package Collections.Exercice1;
import java.util.ArrayList;
import java.util.Scanner;
// Classe principale pour gérer les opérations sur les produits
public class GestionProduitsApp {
    public static void main(String[] args) {
        // Liste pour stocker les produits
        ArrayList<Produit> produits = new ArrayList<>();
        // Scanner pour la saisie utilisateur
        Scanner sc = new Scanner(System.in);
        // Produits par défaut ajoutés à la liste
        produits.add(new Produit(1, "Cahier", 10.0));
        produits.add(new Produit(2, "Stylo", 20.0));
        produits.add(new Produit(3, "Sticker", 30.0));
        int choix; // Variable pour stocker le choix de l'utilisateur
        // Boucle principale pour afficher le menu et gérer les options
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Ajouter un produit");
            System.out.println("2. Supprimer un produit par indice");
            System.out.println("3. Afficher la liste des produits");
            System.out.println("4. Modifier un produit par indice");
            System.out.println("5. Rechercher un produit par son nom");
            System.out.println("6. Quitter");
            System.out.print("Veuillez choisir une option : ");
            choix = sc.nextInt();
            sc.nextLine(); // Consomme le caractère de nouvelle ligne
            switch (choix) {
                case 1: // Ajouter un produit
                    System.out.print("Entrer l'ID du produit : ");
                    long id = sc.nextLong();
                    sc.nextLine(); // Consomme le caractère de nouvelle ligne
                    System.out.print("Entrer le nom du produit : ");
                    String nom = sc.nextLine();
                    System.out.print("Entrer le prix du produit : ");
                    double prix = sc.nextDouble();
                    produits.add(new Produit(id, nom, prix));
                    System.out.println(" Produit ajouté avec succès !");
                    break;
                case 2: // Supprimer un produit
                    System.out.print("Entrer l'indice du produit à supprimer : ");
                    int indice = sc.nextInt();
                    if (indice >= 0 && indice < produits.size()) {
                        produits.remove(indice);
                        System.out.println("Produit supprimé avec succès !");
                    } else {
                        System.out.println(" Erreur : Indice invalide.");
                    }
                    break;
                case 3: // Afficher les produits
                    System.out.println("\n=== Liste des Produits ===");
                    if (produits.isEmpty()) {
                        System.out.println(" Aucun produit dans la liste.");
                    } else {
                        for (Produit p : produits) {
                            System.out.println(p);
                        }
                    }
                    break;
                case 4: // Modifier un produit
                    System.out.print("Entrer l'indice du produit à modifier : ");
                    int indice2 = sc.nextInt();
                    if (indice2 >= 0 && indice2 < produits.size()) {
                        Produit produitAModifier = produits.get(indice2);
                        sc.nextLine(); // Consomme le caractère de nouvelle ligne
                        System.out.print("Entrer le nouveau nom du produit : ");
                        String nouveauNom = sc.nextLine();
                        System.out.print("Entrer le nouveau prix du produit : ");
                        double nouveauPrix = sc.nextDouble();
                        produitAModifier.setNom(nouveauNom);
                        produitAModifier.setPrix(nouveauPrix);
                        System.out.println("Produit modifié avec succès !");
                    } else {
                        System.out.println("Erreur : Indice invalide.");
                    }
                    break;
                case 5: // Rechercher un produit
                    System.out.print("Entrer le nom du produit à rechercher : ");
                    String nomRecherche = sc.nextLine();
                    boolean trouve = false;
                    for (Produit p : produits) {
                        if (p.getNom().equalsIgnoreCase(nomRecherche)) {
                            System.out.println(" Produit trouvé : " + p);
                            trouve = true;
                            break;
                        }
                    }
                    if (!trouve) {
                        System.out.println("Aucun produit trouvé avec ce nom.");
                    }
                    break;

                case 6: // Quitter le programme
                    System.out.println("Au revoir !");
                    break;

                default: // Option invalide
                    System.out.println(" Option invalide. Veuillez réessayer.");
            }
        } while (choix != 6);

        // Fermeture du scanner
        sc.close();
    }
}

