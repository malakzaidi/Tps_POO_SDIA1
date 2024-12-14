package Tp6.exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        exercise2.DossierContact dossier = new exercise2.DossierContact("contacts");
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Rechercher un numéro de téléphone.");
            System.out.println("2. Ajouter un nouveau contact.");
            System.out.println("3. Supprimer un contact.");
            System.out.println("4. Changer le numéro de téléphone d’un contact.");
            System.out.println("5. Quitter ce programme.");
            System.out.print("Votre choix: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1: // Search contact
                    System.out.print("Entrez le nom du contact: ");
                    String searchName = scanner.nextLine();
                    String phoneNumber = dossier.searchContact(searchName);
                    if (phoneNumber != null) {
                        System.out.println("Numéro de téléphone: " + phoneNumber);
                    } else {
                        System.out.println("Contact non trouvé.");
                    }
                    break;
                case 2: // Add contact
                    System.out.print("Entrez le nom du contact: ");
                    String newName = scanner.nextLine();
                    System.out.print("Entrez le numéro de téléphone: ");
                    String newPhone = scanner.nextLine();
                    dossier.addContact(newName, newPhone);
                    break;
                case 3: // Delete contact
                    System.out.print("Entrez le nom du contact: ");
                    String deleteName = scanner.nextLine();
                    dossier.deleteContact(deleteName);
                    break;
                case 4: // Update contact
                    System.out.print("Entrez le nom du contact: ");
                    String updateName = scanner.nextLine();
                    System.out.print("Entrez le nouveau numéro de téléphone: ");
                    String updatedPhone = scanner.nextLine();
                    dossier.updateContact(updateName, updatedPhone);
                    break;
                case 5: // Exit
                    dossier.saveContacts();
                    System.out.println("Au revoir!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Choix invalide.");
            }
        }
    }
}
