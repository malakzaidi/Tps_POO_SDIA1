package Tp2.Exercice1;

public class Auteur extends Personne {
    private int numAuteur;
    public Auteur(String firstname, String lastname, int age, String telephone, String email , int numAuteur) {
        super(firstname, lastname, age, telephone, email);
        this.numAuteur = numAuteur;
    }

    public int getNumAuteur() {
        return numAuteur;

    }
    public void setNumAuteur(int numAuteur) {
        this.numAuteur = numAuteur;

    }
    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Num Auteur: " + numAuteur);

    }

}
