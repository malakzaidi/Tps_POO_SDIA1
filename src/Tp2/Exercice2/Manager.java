package Tp2.Exercice2;

public class Manager extends Employe {
    private String service;
    public Manager(String nom , String prenom ,String email , String telephone , double salaire ,String service) {
        super(nom , prenom , email , telephone , salaire);
        this.service = service;
    }
    @Override
    public double calculerSalaire() {
        return salaire * 1.2;
    }

    public void afficher () {
        System.out.println("Nom : " + nom);
        System.out.println("Prenom : " + prenom);
        System.out.println("Email : " + email);
        System.out.println("Telephone : " + telephone);
        System.out.println("Salaire : " + salaire);
        System.out.println("Service : " + service);

    }

}
