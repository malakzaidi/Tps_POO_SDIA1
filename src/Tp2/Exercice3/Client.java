package Tp2.Exercice3;

import java.util.List;

public class Client {
    private String nom ;
    private String prenom ;
    private String adresse;
    private String email;
    private String ville ;
    private String telephone;
    private List<Commande> commandes ;
    public Client() {
    }
    public Client(String nom, String prenom, String adresse, String email, String ville) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.email = email;
        this.ville = ville;
    }
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
    public void setCommandes(List<Commande> commandes) {
        this.commandes = commandes;
    }
    public void ajouterCommande(Commande commande) {
        if (!commandes.contains(commande)) {
            commandes.add(commande);
        }
        else {
            System.out.println("Commande existante");
        }
    }
    public void supprimerCommande(Commande commande) {
        if (commandes.contains(commande)) {
            commandes.remove(commande);
        } else {
            System.out.println("Commande n'existe pas");
        }
    }
}
