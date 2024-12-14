package Exercise2;

import java.util.concurrent.*;

class Sommeur implements Runnable {
    private final int[] array;
    private final int debut;
    private final int fin;
    private int somme;

    // Constructeur prenant un tableau et une plage d'indices
    public Sommeur(int[] array, int debut, int fin) {
        this.array = array;
        this.debut = debut;
        this.fin = fin;
    }

    // Méthode run redéfinie
    @Override
    public void run() {
        somme = 0;
        for (int i = debut; i < fin; i++) {
            somme += array[i];
        }
    }

    // Méthode pour obtenir la somme calculée
    public int getSomme() {
        return somme;
    }
}
