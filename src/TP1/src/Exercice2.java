package TP1.src;

public class Exercice2 {
        private String verbe;

        // Constructeur qui initialise le verbe à conjuguer
        public Exercice2(String verbe) {
            this.verbe = verbe;
        }

        // Méthode pour vérifier si le verbe est valide (se termine par 'er')
        public boolean estVerbePremierGroupe() {
            return verbe.endsWith("er") && verbe.length() > 2;
        }

        // Méthode pour afficher la conjugaison du verbe au présent
        public void conjuguer() {
            if (estVerbePremierGroupe()) {
                String racine = verbe.substring(0, verbe.length() - 2); // Racine du verbe
                System.out.println("je " + racine + "e");
                System.out.println("tu " + racine + "es");
                System.out.println("il/elle " + racine + "e");
                System.out.println("nous " + racine + "ons");
                System.out.println("vous " + racine + "ez");
                System.out.println("ils/elles " + racine + "ent");
            } else {
                System.out.println("Le verbe saisi n'est pas du premier groupe.");
            }
        }
    }


