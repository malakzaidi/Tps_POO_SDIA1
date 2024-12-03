package Tp2.Exercice1;

// Classe représentant un livre dans la bibliothèque
public class Livre {
    private String ISBN; // Numéro ISBN du livre (changé en String pour flexibilité)
    private String titre; // Titre du livre
    private Auteur auteur; // Auteur du livre

    // Constructeur pour initialiser les attributs du livre
    public Livre(String ISBN, String titre, Auteur auteur) {
        this.ISBN = ISBN;
        this.titre = titre;
        this.auteur = auteur;
    }

    // Méthode pour afficher les informations du livre
    public void afficher() {
        System.out.println("ISBN: " + ISBN); // Affiche le numéro ISBN
        System.out.println("Titre: " + titre); // Affiche le titre du livre
        auteur.afficher(); // Appel à la méthode afficher de l'auteur pour afficher ses informations
    }
}

