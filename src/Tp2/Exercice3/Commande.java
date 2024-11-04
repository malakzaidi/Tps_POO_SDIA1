package Tp2.Exercice3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Classe représentant une commande
public class Commande {
    private String reference; // Référence de la commande
    private Client client; // Client ayant passé la commande
    private Date date; // Date de la commande
    private String etat; // État de la commande
    private List<LigneCommande> lignesCommandes; // Liste des lignes de commande

    // Constructeur pour initialiser les attributs de la commande
    public Commande(String reference, Client client, Date date, String etat) {
        this.reference = reference;
        this.client = client;
        this.date = date;
        this.etat = etat;
        this.lignesCommandes = new ArrayList<>(); // Initialisation de la liste
    }

    // Getters et Setters
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public List<LigneCommande> getLignesCommandes() {
        return lignesCommandes;
    }

    // Méthode pour ajouter une ligne de commande
    public void ajouterLigneCommande(LigneCommande ligneCommande) {
        if (!lignesCommandes.contains(ligneCommande)) {
            lignesCommandes.add(ligneCommande);
        } else {
            System.out.println("Ligne de commande existante.");
        }
    }

    // Méthode toString pour afficher les détails de la commande
    @Override
    public String toString() {
        StringBuilder details = new StringBuilder("Commande [référence=" + reference +
                ", client=" + client.getNom() + " " + client.getPrenom() +
                ", date=" + date + ", état=" + etat + ", lignes=");

        for (LigneCommande ligne : lignesCommandes) {
            details.append("\n\t").append(ligne); // Assurez-vous que la méthode toString() est définie dans LigneCommande
        }
        details.append("]");
        return details.toString();
    }
}
