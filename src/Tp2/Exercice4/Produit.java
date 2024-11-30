package Tp2.Exercice4;

// Classe représentant un produit
public class Produit {
    private long id; // ID du produit
    private String nom; // Nom du produit
    private String marque; // Marque du produit
    private double prix; // Prix du produit
    private String description; // Description du produit
    private int nombreStock; // Nombre de produits en stock

    // Constructeur pour initialiser les attributs du produit
    public Produit(long id, String nom, String marque, double prix, String description, int nombreStock) {
        this.id = id;
        this.nom = nom;
        this.marque = marque;
        this.prix = prix;
        this.description = description;
        this.nombreStock = nombreStock;
    }
    // Getters et Setters
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
    public String getMarque() {
        return marque;
    }
    public void setMarque(String marque) {
        this.marque = marque;
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
    public int getNombreStock() {
        return nombreStock;
    }
    public void setNombreStock(int nombreStock) {
        this.nombreStock = nombreStock;
    }

    // Méthode toString pour afficher les détails du produit
    @Override
    public String toString() {
        return "Produit [ID=" + id + ", nom=" + nom + ", marque=" + marque + ", prix=" + prix + ", description=" + description + ", stock=" + nombreStock + "]";
    }
}

