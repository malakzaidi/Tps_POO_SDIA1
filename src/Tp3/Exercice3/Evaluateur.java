package Tp3.Exercice3;
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


}
