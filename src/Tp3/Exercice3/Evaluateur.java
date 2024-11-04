public class Evaluateur {
    public Evaluateur() {
        // Constructeur vide
    }

    public void verifierNote(int note) throws NoteInvalideException {
        if (note < 0 || note > 20) {
            throw new NoteInvalideException(note);
        }
        // Vous pouvez ajouter d'autres traitements ici si nécessaire
    }

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
}
