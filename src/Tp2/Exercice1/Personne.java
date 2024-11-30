package Tp2.Exercice1;

// Classe représentant une personne avec des informations de base
public class Personne {
    private String prenom; // Prénom de la personne
    private String nom; // Nom de la personne
    private int age; // Âge de la personne
    private String telephone; // Numéro de téléphone de la personne
    private String email; // Adresse email de la personne

    // Constructeur pour initialiser les attributs de la personne
    public Personne(String prenom, String nom, int age, String telephone, String email) {
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
        this.telephone = telephone;
        this.email = email;
    }
    // Méthode pour afficher les informations de la personne
    public void afficher() {
        System.out.println(prenom + " " + nom + " " + age + " " + telephone + " " + email);
    }
}
