package Tp2.Exercice1;

public class Adherent extends Personne {
    private int numAdherent;
    public Adherent(String firstname, String lastname, int age, String telephone, String email,int numAdherent) {
        super(firstname, lastname, age, telephone, email);
        this.numAdherent = numAdherent;
    }

    public int getNumAdherent() {
        return numAdherent;
    }
    public void setNumAdherent(int numAdherent) {
        this.numAdherent = numAdherent;
    }
    @Override
    public void afficher(){
        super.afficher();
        System.out.println("numAdherent: " + numAdherent);
    }

}
