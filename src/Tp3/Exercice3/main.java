package Tp3.Exercice3;
public static void main(String[] args) {
        Evaluateur evaluateur = new Evaluateur();

        try {
            evaluateur.verifierNote(15); // Note valide
            evaluateur.verifierNote(25); // Note invalide
        } catch (NoteInvalideException e) {
            // Affichage du message de l'exception et de la pile d'appel
            System.out.println(e.getMessage());
            e.printStackTrace(); // Affiche la pile d'appel
        }
    }
