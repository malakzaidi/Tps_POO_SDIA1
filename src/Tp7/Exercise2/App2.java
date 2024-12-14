package Exercise2;

public class App2 {
        public static void main(String[] args) {
            // Création d'un tableau d'entiers
            int[] tableau = new int[100];
            for (int i = 0; i < tableau.length; i++) {
                tableau[i] = i + 1; // Remplir avec des nombres de 1 à 1000
            }

            // Diviser le tableau en plages
            int nombreThreads = 10;
            int taillePlage = tableau.length / nombreThreads;

            Sommeur[] sommeurs = new Sommeur[nombreThreads];
            Thread[] threads = new Thread[nombreThreads];

            // Créer et démarrer les threads
            for (int i = 0; i < nombreThreads; i++) {
                int debut = i * taillePlage;
                int fin = (i == nombreThreads - 1) ? tableau.length : debut + taillePlage;
                sommeurs[i] = new Sommeur(tableau, debut, fin);
                threads[i] = new Thread(sommeurs[i]);
                threads[i].start();
            }

            // Attendre que tous les threads aient terminé et calculer la somme totale
            int sommeTotale = 0;
            try {
                for (int i = 0; i < nombreThreads; i++) {
                    threads[i].join(); // S'assurer que le thread est terminé
                    sommeTotale += sommeurs[i].getSomme();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Afficher la somme totale
            System.out.println("La somme totale est : " + sommeTotale);
        }
    }



