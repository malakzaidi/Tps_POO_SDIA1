package Tp2.Exercice4;

import java.util.List;
import java.util.Scanner;

    public class Application {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            MetierProduitImpl metier = new MetierProduitImpl();
            int choice;

            do {
                // Affichage du menu
                System.out.println("Menu :");
                System.out.println("1. Afficher la liste des produits");
                System.out.println("2. Rechercher des produits par mot clé");
                System.out.println("3. Ajouter un nouveau produit dans la liste");
                System.out.println("4. Récupérer et afficher un produit par ID");
                System.out.println("5. Supprimer un produit par ID");
                System.out.println("0. Quitter");
                System.out.print("Choisissez une option : ");
                choice = scanner.nextInt();
                scanner.nextLine(); // Consommer la nouvelle ligne

                switch (choice) {
                    case 1:
                        // Afficher la liste des produits
                        List<Produit> produits = metier.getAll();
                        if (produits.isEmpty()) {
                            System.out.println("Aucun produit disponible.");
                        } else {
                            for (Produit p : produits) {
                                System.out.println(p);
                            }
                        }
                        break;

                    case 2:
                        // Rechercher des produits par mot clé
                        System.out.print("Entrez un mot clé : ");
                        String motCle = scanner.nextLine();
                        List<Produit> resultats = metier.findByNom(motCle);
                        if (resultats.isEmpty()) {
                            System.out.println("Aucun produit trouvé.");
                        } else {
                            for (Produit p : resultats) {
                                System.out.println(p);
                            }
                        }
                        break;

                    case 3:
                        // Ajouter un nouveau produit
                        System.out.print("Entrez l'ID du produit : ");
                        long id = scanner.nextLong();
                        scanner.nextLine(); // Consommer la nouvelle ligne
                        System.out.print("Entrez le nom du produit : ");
                        String nom = scanner.nextLine();
                        System.out.print("Entrez la marque du produit : ");
                        String marque = scanner.nextLine();
                        System.out.print("Entrez le prix du produit : ");
                        double prix = scanner.nextDouble();
                        scanner.nextLine(); // Consommer la nouvelle ligne
                        System.out.print("Entrez la description du produit : ");
                        String description = scanner.nextLine();
                        System.out.print("Entrez le nombre en stock : ");
                        int nombreStock = scanner.nextInt();

                        Produit nouveauProduit = new Produit(id, nom, marque, prix, description, nombreStock);
                        metier.add(nouveauProduit);
                        System.out.println("Produit ajouté avec succès.");
                        break;

                    case 4:
                        // Récupérer un produit par ID
                        System.out.print("Entrez l'ID du produit à récupérer : ");
                        long produitId = scanner.nextLong();
                        Produit produit = metier.findById(produitId);
                        if (produit != null) {
                            System.out.println("Produit trouvé : " + produit);
                        } else {
                            System.out.println("Produit non trouvé.");
                        }
                        break;

                    case 5:
                        // Supprimer un produit par ID
                        System.out.print("Entrez l'ID du produit à supprimer : ");
                        long supprimerId = scanner.nextLong();
                        metier.delete(supprimerId);
                        System.out.println("Produit supprimé avec succès, si existait.");
                        break;

                    case 0:
                        System.out.println("Au revoir !");
                        break;

                    default:
                        System.out.println("Option invalide. Veuillez réessayer.");
                        break;
                }

                System.out.println(); // Ligne vide pour une meilleure lisibilité

            } while (choice != 0);

            scanner.close(); // Fermer le scanner
        }
    }

