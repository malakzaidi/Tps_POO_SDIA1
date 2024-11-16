package Tp2.Exercice2;

public class Ingenieur  extends Employe {
    private String specialite ;
    public Ingenieur (String nom , String prenom ,String email , String telephone , double salaire , String specialite) {
        super (nom , prenom , email , telephone , salaire );
        this.specialite =specialite;
    }

    @Override
    public double calculerSalaire() {
        return salaire * 1.15;
    }
    public void afficher () {
        System.out.println("Nom : " + nom);
        System.out.println("Prenom : " + prenom);
        System.out.println("Email : " + email);
        System.out.println("Telephone : " + telephone);
        System.out.println("Salaire : " + salaire);
        System.out.println("specialite : " + specialite);

    }
}
