package Tp3.Exercice3;
public class NoteInvalideException extends Exception {
    public NoteInvalideException(int note) {
        super("Exception de type NoteInvalideException. Note invalide : " + note);
    }
}
