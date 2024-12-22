package Tp6.exercise3;
import java.util.Scanner;


public class ApplicationClient {
    public static void main(String[] args) {
        MetierClientImpl metier = new MetierClientImpl("clients.dat");
        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        while (running) {
            System.out.println("\n--- Menu Client ---");
            System.out.println("1. Afficher la liste des clients");
            System.out.println("2. Rechercher un client par nom");
            System.out.println("3. Ajouter un client");
            System.out.println("4. Supprimer un client");
            System.out.println("5. Sauvegarder les clients");
            System.out.println("6. Quitter");
            System.out.print("Choisissez une option : ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consommer la ligne restante

            switch (choice) {
                case 1:
                    // Afficher tous les clients
                    metier.getAll().forEach(System.out::println);
                    break;

                case 2:
                    // Rechercher un client par nom
                    System.out.print("Entrez le nom du client : ");
                    String nomRecherche = scanner.nextLine();
                    Client client = metier.findByNom(nomRecherche);
                    System.out.println(client != null ? client : "Client introuvable !");
                    break;

                case 3:
                    // Ajouter un nouveau client
                    System.out.print("Entrez le nom : ");
                    String nom = scanner.nextLine();
                    System.out.print("Entrez le prénom : ");
                    String prenom = scanner.nextLine();
                    System.out.print("Entrez l'adresse : ");
                    String adresse = scanner.nextLine();
                    System.out.print("Entrez le téléphone : ");
                    String tel = scanner.nextLine();
                    System.out.print("Entrez l'email : ");
                    String email = scanner.nextLine();
                    metier.add(new Client(nom, prenom, adresse, tel, email));
                    break;

                case 4:
                    // Supprimer un client
                    System.out.print("Entrez le nom du client à supprimer : ");
                    String nomSupprimer = scanner.nextLine();
                    metier.delete(nomSupprimer);
                    break;

                case 5:
                    // Sauvegarder les clients
                    metier.saveAll();
                    break;

                case 6:
                    // Quitter le programme
                    running = false;
                    break;

                default:
                    System.out.println("Option invalide !");
            }
        }

        scanner.close();
    }
}
