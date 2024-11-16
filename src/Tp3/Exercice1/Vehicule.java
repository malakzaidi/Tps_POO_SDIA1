package Tp3.Exercice1;

public class Vehicule {
    // Constructeur vide
    public Vehicule() {
    }
    // Méthode qui teste la vitesse et lance une exception si la vitesse dépasse 90
    public void testvitesse (int vitesse ) throws TropViteException{
        if (vitesse > 90) {
            throw new TropViteException(vitesse);
        }
    }

}
