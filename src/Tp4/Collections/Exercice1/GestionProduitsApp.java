package Tp4.Collections.Exercice1;

import java.util.ArrayList;
import java.util.Scanner;
public class GestionProduitsApp {
    public static void main(String[] args) {
        ArrayList<Produit> produits = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        // Produits par défaut
        produits.add(new Produit(1, "Cahier", 10.0));
        produits.add(new Produit(2, "Stylo", 20.0));
        produits.add(new Produit(3, "Sticker", 30.0));
        int choix;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Ajouter un produit");
            System.out.println("2. Supprimer un produit (par ID, nom ou prix)");
            System.out.println("3. Afficher la liste des produits");
            System.out.println("4. Modifier un produit (par ID, nom ou prix)");
            System.out.println("5. Rechercher un produit par son nom");
            System.out.println("6. Quitter");
            System.out.print("Veuillez choisir une option : ");
            choix = sc.nextInt();
            sc.nextLine(); // Consomme le caractère de nouvelle ligne

            switch (choix) {
                case 1: // Ajouter un produit
                    System.out.print("Entrer l'ID du produit : ");
                    long id = sc.nextLong();
                    sc.nextLine();
                    System.out.print("Entrer le nom du produit : ");
                    String nom = sc.nextLine();
                    System.out.print("Entrer le prix du produit : ");
                    double prix = sc.nextDouble();
                    produits.add(new Produit(id, nom, prix));
                    System.out.println("Produit ajouté avec succès !");
                    break;

                case 2: // Supprimer un produit
                    System.out.println("Entrer un critère pour supprimer le produit (ID, nom ou prix) : ");
                    String critereSuppression = sc.nextLine();
                    Produit produitASupprimer = null;

                    for (Produit p : produits) {
                        if (String.valueOf(p.getId()).equals(critereSuppression) ||
                                p.getNom().equalsIgnoreCase(critereSuppression) ||
                                String.valueOf(p.getPrix()).equals(critereSuppression)) {
                            produitASupprimer = p;
                            break;
                        }
                    }

                    if (produitASupprimer != null) {
                        produits.remove(produitASupprimer);
                        System.out.println("Produit supprimé avec succès !");
                    } else {
                        System.out.println("Aucun produit correspondant trouvé.");
                    }
                    break;

                case 3: // Afficher les produits
                    System.out.println("\n=== Liste des Produits ===");
                    if (produits.isEmpty()) {
                        System.out.println("Aucun produit dans la liste.");
                    } else {
                        for (Produit p : produits) {
                            System.out.println(p);
                        }
                    }
                    break;

                case 4: // Modifier un produit
                    System.out.println("Entrer un critère pour modifier le produit (ID, nom ou prix) : ");
                    String critereModification = sc.nextLine();
                    Produit produitAModifier = null;

                    for (Produit p : produits) {
                        if (String.valueOf(p.getId()).equals(critereModification) ||
                                p.getNom().equalsIgnoreCase(critereModification) ||
                                String.valueOf(p.getPrix()).equals(critereModification)) {
                            produitAModifier = p;
                            break;
                        }
                    }

                    if (produitAModifier != null) {
                        System.out.print("Entrer le nouveau nom du produit : ");
                        String nouveauNom = sc.nextLine();
                        System.out.print("Entrer le nouveau prix du produit : ");
                        double nouveauPrix = sc.nextDouble();
                        produitAModifier.setNom(nouveauNom);
                        produitAModifier.setPrix(nouveauPrix);
                        System.out.println("Produit modifié avec succès !");
                    } else {
                        System.out.println("Aucun produit correspondant trouvé.");
                    }
                    break;

                case 5: // Rechercher un produit
                    System.out.print("Entrer le nom du produit à rechercher : ");
                    String nomRecherche = sc.nextLine();
                    boolean trouve = false;
                    for (Produit p : produits) {
                        if (p.getNom().equalsIgnoreCase(nomRecherche)) {
                            System.out.println("Produit trouvé : " + p);
                            trouve = true;
                            break;
                        }
                    }
                    if (!trouve) {
                        System.out.println("Aucun produit trouvé avec ce nom.");
                    }
                    break;

                case 6: // Quitter
                    System.out.println("Au revoir !");
                    break;

                default:
                    System.out.println("Option invalide. Veuillez réessayer.");
            }
        } while (choix != 6);

        sc.close();
    }
}

