package Tp2.Exercice3;

public class Ordinateur {
    private String nom;
    private double  prix;
    private String description;
    private String marque;
    private int nombrestock;
    public Ordinateur(String nom, double prix, String description, String marque, int nombrestock) {
        this.nom = nom;
        this.prix = prix;
        this.description = description;
        this.marque = marque;
        this.nombrestock = nombrestock;
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
    public int getNombrestock() {
        return nombrestock;
    }
    public void setNombrestock(int nombrestock) {
        this.nombrestock = nombrestock;
    }
    public double calculerprix (int quantite , double prix) {
        return quantite * prix ;
    }



}
