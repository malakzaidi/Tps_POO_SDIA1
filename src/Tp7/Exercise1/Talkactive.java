package Tp7.Exercise1;

public class Talkactive implements Runnable {
    private final int id;

    // Constructeur prenant un entier comme paramètre
    public Talkactive(int id) {
        this.id = id;
    }

    // Méthode run redéfinie
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Talkative ID: " + id + " - Count: " + i);
        }
    }
}
