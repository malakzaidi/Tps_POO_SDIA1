package Collections.Exercice1;
// Classe représentant un produit avec ses attributs
public class Produit {
    long id; // Identifiant unique du produit
    String nom; // Nom du produit
    double prix; // Prix du produit
    // Constructeur pour initialiser un produit
    public Produit(long id, String nom, double prix) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
    }
    // Getters et setters pour chaque attribut
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    // Méthode pour afficher les détails d'un produit
    @Override
    public String toString() {
        return "Produit {ID: " + id + ", Nom: " + nom + ", Prix: " + prix + "}";
    }
}
