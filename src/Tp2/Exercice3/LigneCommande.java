package Tp2.Exercice3;

public class LigneCommande {
    private String quantite;
    private Commande commande;
    private Ordinateur ordcommande;
    public LigneCommande(String quantite, Commande commande , Ordinateur ordcommande) {
        this.quantite = quantite;
        this.commande = commande;
        this.ordcommande = ordcommande;
    }

}
