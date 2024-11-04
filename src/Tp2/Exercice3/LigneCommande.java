package Tp2.Exercice3;


// Classe représentant une ligne de commande
public class LigneCommande {
    private int quantite; // Quantité commandée
    private Commande commande; // Commande à laquelle cette ligne appartient
    private Ordinateur ordCommande; // Ordinateur commandé

    // Constructeur pour initialiser les attributs de la ligne de commande
    public LigneCommande(int quantite, Commande commande, Ordinateur ordCommande) {
        this.quantite = quantite;
        this.commande = commande;
        this.ordCommande = ordCommande;
    }

    // Getters et Setters
    public int getQuantite() {
        return quantite;
    }
    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
    public Commande getCommande() {
        return commande;
    }
    public void setCommande(Commande commande) {
        this.commande = commande;
    }
    public Ordinateur getOrdCommande() {
        return ordCommande;
    }
    public void setOrdCommande(Ordinateur ordCommande) {
        this.ordCommande = ordCommande;
    }

    // Méthode toString pour afficher les détails de la ligne de commande
    @Override
    public String toString() {
        return "LigneCommande [quantité=" + quantite + ", ordinateur=" + ordCommande.getNom() + "]";
    }
}
