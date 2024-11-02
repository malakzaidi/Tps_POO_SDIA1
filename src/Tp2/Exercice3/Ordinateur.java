package Tp2.Exercice3;

// Classe représentant un ordinateur
public class Ordinateur {
    private String nom; // Nom de l'ordinateur
    private double prix; // Prix de l'ordinateur
    private String description; // Description de l'ordinateur
    private String marque; // Marque de l'ordinateur
    private int nombreStock; // Nombre d'ordinateurs en stock

    // Constructeur pour initialiser les attributs de l'ordinateur
    public Ordinateur(String nom, double prix, String description, String marque, int nombreStock) {
        this.nom = nom;
        this.prix = prix;
        this.description = description;
        this.marque = marque;
        this.nombreStock = nombreStock;
    }

    // Méthode pour retourner le prix pour une quantité donnée
    public double calculerPrix(int quantite) {
        return quantite * prix; // Calcul du prix total
    }

    // Getters et Setters
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
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getMarque() {
        return marque;
    }
    public void setMarque(String marque) {
        this.marque = marque;
    }
    public int getNombreStock() {
        return nombreStock;
    }
    public void setNombreStock(int nombreStock) {
        this.nombreStock = nombreStock;
    }

    // Méthode toString pour afficher les détails de l'ordinateur
    @Override
    public String toString() {
        return "Ordinateur [nom=" + nom + ", marque=" + marque + ", prix=" + prix + ", description=" + description + ", nombre en stock=" + nombreStock + "]";
    }
}
