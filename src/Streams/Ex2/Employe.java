package Streams.Ex2;
public class Employe {
    private String nom;
    private String departement;
    private double salaire;
    // Constructeur
    public Employe(String nom, String departement, double salaire) {
        this.nom = nom;
        this.departement = departement;
        this.salaire = salaire;
    }
    // Getters
    public String getNom() {
        return nom;
    }
    public String getDepartement() {
        return departement;
    }
    public double getSalaire() {
        return salaire;
    }
    // Méthode toString
    @Override
    public String toString() {
        return "Employe{" +
                "nom='" + nom + '\'' +
                ", departement='" + departement + '\'' +
                ", salaire=" + salaire +
                '}';
    }
}

