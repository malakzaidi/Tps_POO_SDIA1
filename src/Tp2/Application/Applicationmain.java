package Tp2.Application;

import Tp2.Exercice1.Adherent;
import Tp2.Exercice1.Auteur;
import Tp2.Exercice1.Livre;
import Tp2.Exercice2.Ingenieur;
import Tp2.Exercice2.Manager;
import Tp2.Exercice3.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Applicationmain {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int choix;
            do {
                // Affichage du menu
                System.out.println("Menu des Exercices :");
                System.out.println("1. Exercice 1");
                System.out.println("2. Exercice 2");
                System.out.println("3. Exercice 3");
                System.out.println("0. Quitter");
                System.out.print("Veuillez entrer votre choix : ");
                choix = scanner.nextInt();
                switch (choix) {
                    case 1:
                        // Exécution de l'exercice 1
                        exercice1();
                        break;
                    case 2:
                        // Exécution de l'exercice 2
                        exercice2();
                        break;
                    case 3:
                        // Exécution de l'exercice 3
                        exercice3();
                        break;
                    case 0:
                        System.out.println("Au revoir !");
                        break;
                    default:
                        System.out.println("Choix invalide. Veuillez réessayer.");
                }
            } while (choix != 0);

            scanner.close(); // Fermeture du scanner
        }

        private static void exercice1() {
            // Code de l'exercice 1
            Adherent adherent = new Adherent("Malak", "Zaidi", 21, "01111117777", "malakzaidi815@gmail.com", 30);
            Auteur auteur = new Auteur("Bob", "Jorje", 44, "01111187777", "jorjebob@gmail.com", 21);
            Livre livre = new Livre("S414134115", "Clean Code", auteur);
            System.out.println("Informations sur l'adhérent :");
            adherent.afficher();
            System.out.println("Informations sur le livre :");
            livre.afficher();
        }

        private static void exercice2() {
            // Code de l'exercice 2
            Manager manager = new Manager("Nom", "Prenom", "nomprenom@gmail.com", "099988766", 22344, "Informatique");
            System.out.println("Informations sur le manager :");
            manager.afficher();
            Ingenieur ingenieur = new Ingenieur("Nom", "Prenom", "nomprenom@gmail.com", "099988766", 22344, "Informatique");
            System.out.println("Informations sur l'ingénieur :");
            ingenieur.afficher();
        }

        private static void exercice3() {
            // Code de l'exercice 3
            List<Ordinateur> listeOrdinateurs = new ArrayList<>();
            Ordinateur ordinateur1 = new Ordinateur("elitebook", 23212, "Un PC", "HP", 3);
            Ordinateur ordinateur2 = new Ordinateur("xps", 23213, "Un autre PC", "Dell", 2);
            Ordinateur ordinateur3 = new Ordinateur("thinkpad", 23214, "Un PC différent", "Lenovo", 4);
            listeOrdinateurs.add(ordinateur1);
            listeOrdinateurs.add(ordinateur2);
            listeOrdinateurs.add(ordinateur3);
            Categorie categorie = new Categorie("Catégorie Ordinateurs", "Description des ordinateurs");
            for (Ordinateur ordinateur : listeOrdinateurs) {
                categorie.ajouterOrdinateur(ordinateur);
            }
            Client client = new Client("NomClient", "PrenomClient", "AdresseClient", "emailClient@example.com", "VilleClient", "0123456789");
            Commande commande = new Commande("124", client, new Date(), "en cours");
            LigneCommande ligneCommande1 = new LigneCommande(4, commande, ordinateur1);
            LigneCommande ligneCommande2 = new LigneCommande(2, commande, ordinateur2);
            LigneCommande ligneCommande3 = new LigneCommande(1, commande, ordinateur3);
            commande.ajouterLigneCommande(ligneCommande1);
            commande.ajouterLigneCommande(ligneCommande2);
            commande.ajouterLigneCommande(ligneCommande3);
            System.out.println("Informations de la commande :");
            System.out.println(commande);
        }
    }

