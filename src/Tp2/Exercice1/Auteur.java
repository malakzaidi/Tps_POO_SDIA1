package Tp2.Exercice1;


// Classe représentant un auteur qui hérite de la classe Personne
public class Auteur extends Personne {
    private int numAuteur; // Numéro d'auteur

    // Constructeur pour initialiser les attributs de l'auteur
    public Auteur(String prenom, String nom, int age, String telephone, String email, int numAuteur) {
        super(prenom, nom, age, telephone, email); // Appel au constructeur de la classe parente
        this.numAuteur = numAuteur;
    }

    // Méthode pour afficher les informations de l'auteur
    @Override
    public void afficher() {
        super.afficher(); // Appel à la méthode afficher de la classe parente
        System.out.println("Num Auteur: " + numAuteur); // Affiche le numéro d'auteur
    }


}
