package Tp2.Exercice1;

public class Livre {
    private int ISBN;
    private String titre ;
    private Auteur auteur;
    public Livre(int ISBN, String titre, Auteur auteur) {
        this.ISBN = ISBN;
        this.titre = titre;
        this.auteur = auteur;

    }
    public void afficher() {
        System.out.println("ISBN: " + ISBN);
        auteur.afficher();
    }
}
