package Tp3.Exercice1;

public class TropViteException  extends Exception {
    public TropViteException(int vitesse ) {
        super ("C'est une exception de type TropViteException TropViteException. Vitesse en cause : " + vitesse );
    }

}
