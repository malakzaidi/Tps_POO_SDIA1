package Tp3.Exercice1;

// Classe TropViteException héritant de la classe Exception
public class TropViteException  extends Exception {
    // Constructeur prenant en paramètre un entier vitesse
    public TropViteException(int vitesse ) {
        // Appel du super constructeur 
        super ("C'est une exception de type TropViteException TropViteException. Vitesse en cause : " + vitesse );
    }

}
