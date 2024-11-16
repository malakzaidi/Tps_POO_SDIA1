package Tp2.Exercice2;

// Classe représentant un ingénieur qui hérite de la classe Employe
public class Ingenieur extends Employe {
    private String specialite; // Spécialité de l'ingénieur

    // Constructeur pour initialiser les attributs de l'ingénieur
    public Ingenieur(String nom, String prenom, String email, String telephone, double salaire, String specialite) {
        super(nom, prenom, email, telephone, salaire); // Appel au constructeur de la classe parente
        this.specialite = specialite;
    }

    // Méthode pour calculer le salaire de l'ingénieur avec une augmentation de 15%
    @Override
    public double calculerSalaire() {
        return salaire * 1.15; // Augmentation de 15%
    }

    // Méthode pour afficher les informations de l'ingénieur
    public void afficher() {
        System.out.println("Nom : " + nom);
        System.out.println("Prénom : " + prenom);
        System.out.println("Email : " + email);
        System.out.println("Téléphone : " + telephone);
        System.out.println("Salaire : " + salaire);
        System.out.println("Spécialité : " + specialite);
    }
}

