package Tp2.Exercice3;

import java.util.ArrayList;
import java.util.List;

// Classe représentant une catégorie d'ordinateurs
public class Categorie {
    private String nom; // Nom de la catégorie
    private String description; // Description de la catégorie
    private List<Ordinateur> ordinateurs = new ArrayList<>(); // Liste des ordinateurs dans cette catégorie

    // Constructeur pour initialiser les attributs de la catégorie
    public Categorie(String nom, String description) {
        this.nom = nom;
        this.description = description;
    }

    // Méthode pour ajouter un nouvel ordinateur à la liste
    public void ajouterOrdinateur(Ordinateur ord) {
        if (!ordinateurs.contains(ord)) {
            ordinateurs.add(ord);
        } else {
            System.out.println("Ordinateur déjà existant dans la catégorie.");
        }
    }

    // Méthode pour supprimer un ordinateur de la liste
    public void supprimerOrdinateur(Ordinateur ord) {
        if (ordinateurs.contains(ord)) {
            ordinateurs.remove(ord);
        } else {
            System.out.println("Ordinateur non existant dans la catégorie.");
        }
    }

    // Méthode pour rechercher des ordinateurs par prix
    public List<Ordinateur> rechercherParPrix(double prix) {
        List<Ordinateur> resultats = new ArrayList<>();
        for (Ordinateur ord : ordinateurs) {
            if (ord.getPrix() <= prix) { // On cherche des ordinateurs moins ou égaux au prix donné
                resultats.add(ord);
            }
        }
        return resultats;
    }

    // Getters et Setters
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    // Méthode toString pour afficher les détails de la catégorie
    @Override
    public String toString() {
        return "Catégorie [nom=" + nom + ", description=" + description + "]";
    }
}

