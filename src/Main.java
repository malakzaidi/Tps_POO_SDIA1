import Tp2.Exercice1.Adherent;
import Tp2.Exercice1.Auteur;
import Tp2.Exercice1.Livre;
import Tp2.Exercice2.Ingenieur;
import Tp2.Exercice2.Manager;
import Tp2.Exercice3.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Adherent adherent = new Adherent("Malak","Zaidi",21,"01111117777","malakzaidi815@gmail.com",30);
        Auteur auteur = new Auteur ("Bob","Jorje",44,"01111187777","jorjebob@gmail.com",21);
        Livre livre = new Livre (414134115,"Clean Code", auteur);
        System.out.println("Informations sur l'adhérent");
        adherent.afficher();
        System.out.println("Informations sur le livre");
        livre.afficher();
        Manager manager = new Manager("Nom","Prenom","nomprenom@gmail.com","099988766",22344,"Informatique");
        System.out.println("Informations sur le manager");
        manager.afficher();
        Ingenieur ingenieur = new Ingenieur("Nom","Prenom","nomprenom@gmail.com","099988766",22344,"Informatique");
        System.out.println("Informations sur l'ingenieur");
        ingenieur.afficher();
        Ordinateur ordinateur1 = new Ordinateur("elitebook",23212,"Un pc ","Macbook",3);
        Ordinateur   ordinateur2 = new Ordinateur("elitebook", 23212, "Un pc ", "Macbook", 3);
        Ordinateur ordinateur3 = new Ordinateur("elitebook", 23212, "Un pc ", "Macbook", 3);
        List<Ordinateur> listeordinateurs = new ArrayList<>();
        listeordinateurs.add(ordinateur1);
        listeordinateurs.add(ordinateur2);
        listeordinateurs.add(ordinateur3);
        Categorie categorie = new Categorie("Malak","Zaidi");
        Client client = new Client ("Nom","Prenom","Casa","nomprenom@gmail.com","Casaaa","099988766",commande);
        Commande commande = new Commande ("124", client , new Date(),"en cours ");
        LigneCommande lignecommande1 = new LigneCommande("4",commande,ordinateur1);
        LigneCommande lignecommande2 = new LigneCommande("2",commande,ordinateur2);
        LigneCommande lignecommande3 = new LigneCommande("1",commande,ordinateur3);
        categorie.ajouterOrdinateur(ordinateur1);
        categorie.ajouterOrdinateur(ordinateur2);
        categorie.ajouterOrdinateur(ordinateur3);


    }
}