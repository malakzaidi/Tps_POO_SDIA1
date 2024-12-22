package Tp3.Exercice1;

public class App1  {
public static void main(String[] args) {
    // Créer un objet de la classe véhicule
    Vehicule v = new Vehicule();
    try {
        v.testvitesse (60); // Appel avec une vitesse qui ne déclenche pas l'exception
        v.testvitesse(120); // Appel avec une vitesse qui déclenche  l'exception
    }
    catch (TropViteException e) {
        e.printStackTrace();} // Affichage de la pile d'appel
}
}
