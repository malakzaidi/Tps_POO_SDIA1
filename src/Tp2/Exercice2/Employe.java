package Tp2.Exercice2;


// Classe abstraite représentant un employé
public abstract class Employe {
    protected String nom; // Nom de l'employé
    protected String prenom; // Prénom de l'employé
    protected String email; // Adresse email de l'employé
    protected String telephone; // Numéro de téléphone de l'employé
    protected double salaire; // Salaire de l'employé

    // Constructeur pour initialiser les attributs de l'employé
    public Employe(String nom, String prenom, String email, String telephone, double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
        this.salaire = salaire;
    }

    // Constructeur par défaut
    public Employe() {}

    // Méthode abstraite pour calculer le salaire d'un employé
    public abstract double calculerSalaire();
}
