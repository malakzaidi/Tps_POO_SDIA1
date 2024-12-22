package Tp6.exercise3;

import java.util.Scanner;
public class ApplicationProduit {
    public static void main(String[] args) {
        MetierProduitImpl metier = new MetierProduitImpl("produits.dat");
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("\n--- Menu Produit ---");
            System.out.println("1. Afficher la liste des produits");
            System.out.println("2. Rechercher un produit par nom");
            System.out.println("3. Ajouter un produit");
            System.out.println("4. Supprimer un produit");
            System.out.println("5. Sauvegarder les produits");
            System.out.println("6. Quitter");
            System.out.print("Choisissez une option : ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consommer la ligne restante
            switch (choice) {
                case 1:
                    metier.getAll().forEach(System.out::println);
                    break;
                case 2:
                    System.out.print("Entrez le nom du produit : ");
                    String nomRecherche = scanner.nextLine();
                    Produit produit = metier.findByNom(nomRecherche);
                    System.out.println(produit != null ? produit : "Produit introuvable !");
                    break;
                case 3:
                    System.out.print("Entrez le nom : ");
                    String nom = scanner.nextLine();
                    System.out.print("Entrez la marque : ");
                    String marque = scanner.nextLine();
                    System.out.print("Entrez le prix : ");
                    double prix = scanner.nextDouble();
                    scanner.nextLine(); // Consommer la ligne restante
                    System.out.print("Entrez la description : ");
                    String description = scanner.nextLine();
                    System.out.print("Entrez le nombre en stock : ");
                    int stock = scanner.nextInt();
                    scanner.nextLine(); // Consommer la ligne restante
                    metier.add(new Produit(nom, marque, prix, description, stock));
                    break;
                case 4:
                    System.out.print("Entrez le nom du produit à supprimer : ");
                    String nomSupprimer = scanner.nextLine();
                    metier.delete(nomSupprimer);
                    break;
                case 5:
                    metier.saveAll();
                    break;
                case 6:
                    running = false;
                    break;
                default:
                    System.out.println("Option invalide !");
            }
        }
        scanner.close();
    }
}
