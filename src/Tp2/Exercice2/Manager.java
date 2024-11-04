package Tp2.Exercice2;


// Classe représentant un manager qui hérite de la classe Employe
public class Manager extends Employe {
    private String service; // Service du manager

    // Constructeur pour initialiser les attributs du manager
    public Manager(String nom, String prenom, String email, String telephone, double salaire, String service) {
        super(nom, prenom, email, telephone, salaire); // Appel au constructeur de la classe parente
        this.service = service;
    }

    // Méthode pour calculer le salaire du manager avec une augmentation de 20%
    @Override
    public double calculerSalaire() {
        return salaire * 1.2; // Augmentation de 20%
    }

    // Méthode pour afficher les informations du manager
    public void afficher() {
        System.out.println("Nom : " + nom);
        System.out.println("Prénom : " + prenom);
        System.out.println("Email : " + email);
        System.out.println("Téléphone : " + telephone);
        System.out.println("Salaire : " + salaire);
        System.out.println("Service : " + service);
    }
}
