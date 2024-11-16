package Tp2.Exercice1;

// Classe représentant un adhérent d'une bibliothèque qui hérite de la classe Personne
public class Adherent extends Personne {
    private int numAdherent; // Numéro d'adhérent

    // Constructeur pour initialiser les attributs de l'adhérent
    public Adherent(String prenom, String nom, int age, String telephone, String email, int numAdherent) {
        super(prenom, nom, age, telephone, email); // Appel au constructeur de la classe parente
        this.numAdherent = numAdherent;
    }

    // Méthode pour afficher les informations de l'adhérent
    @Override
    public void afficher() {
        super.afficher(); // Appel à la méthode afficher de la classe parente
        System.out.println("Num Adhérent: " + numAdherent); // Affiche le numéro d'adhérent
    }

}

