package Tp2.Exercice3;
import java.util.ArrayList;
import java.util.List;

// Classe représentant un client
public class Client {
    private String nom; // Nom du client
    private String prenom; // Prénom du client
    private String adresse; // Adresse du client
    private String email; // Email du client
    private String ville; // Ville du client
    private String telephone; // Téléphone du client
    private List<Commande> commandes = new ArrayList<>(); // Liste des commandes passées par le client

    // Constructeur pour initialiser les attributs du client
    public Client(String nom, String prenom, String adresse, String email, String ville, String telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.email = email;
        this.ville = ville;
        this.telephone = telephone;
    }

    // Méthode pour ajouter une nouvelle commande à la liste
    public void ajouterCommande(Commande commande) {
        if (!commandes.contains(commande)) {
            commandes.add(commande);
            System.out.println("Commande ajoutée avec succès.");
        } else {
            System.out.println("Commande déjà existante.");
        }
    }

    // Méthode pour supprimer une commande
    public void supprimerCommande(Commande commande) {
        if (commandes.contains(commande)) {
            commandes.remove(commande);
            System.out.println("Commande supprimée avec succès.");
        } else {
            System.out.println("Commande non existante.");
        }
    }

    // Getters et Setters
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getVille() {
        return ville;
    }
    public void setVille(String ville) {
        this.ville = ville;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public List<Commande> getCommandes() {
        return commandes;
    }

    // Méthode toString pour afficher les détails du client
    @Override
    public String toString() {
        return "Client [nom=" + nom + ", prénom=" + prenom + ", email=" + email + ", ville=" + ville + "]";
    }

    // Méthode pour définir une commande (ajouter à la liste des commandes)
    public void setCommande(Commande commande) {
        ajouterCommande(commande);
    }
}
