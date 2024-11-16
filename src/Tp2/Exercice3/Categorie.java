package Tp2.Exercice3;
import java.util.*;
public class Categorie {
    private String nom;
    private String description;
    private List<Ordinateur> ordinateurs = new ArrayList<>();
    public Categorie(String nom, String description) {
        this.nom = nom;
        this.description = description;

    }
    public void ajouterOrdinateur(Ordinateur ord) {
        if (!ordinateurs.contains(ord)) {
            ordinateurs.add(ord);
        } else {
            System.out.println("Ordinateur déjà existant");
        }
    }
    public void SupprimerOrdinateur(Ordinateur ord) {
        if (ordinateurs.contains(ord)) {
            ordinateurs.remove(ord);
        }else {
            System.out.println("Ordinateur non existant");
        }

    }
    public List<Ordinateur> RechercherOrdinateurs(double prix ) {
        List<Ordinateur> resultats = new ArrayList<>();
        for (Ordinateur ord : ordinateurs) {
            if (ord.getPrix() == prix) {
                resultats.add(ord);
            }
        }
        return resultats;
    }




}
