package  Tp6.exercise3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import exercise3.Produit;
import exercise3.IMetier;
public class MetierProduitImpl implements IMetier<Produit> {
    private List<Produit> produits;
    private final String fileName;

    public MetierProduitImpl(String fileName) {
        this.fileName = fileName;
        this.produits = new ArrayList<>();
        loadFromFile();
    }

    @Override
    public Produit add(Produit produit) {
        produits.add(produit);
        return produit;
    }

    @Override
    public List<Produit> getAll() {
        return produits;
    }

    @Override
    public Produit findByNom(String nom) {
        return produits.stream()
                .filter(p -> p.getNom().equalsIgnoreCase(nom))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void delete(String nom) {
        produits.removeIf(p -> p.getNom().equalsIgnoreCase(nom));
    }

    @Override
    public void saveAll() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(produits);
            System.out.println("Produits sauvegardés avec succès !");
        } catch (IOException e) {
            System.out.println("Erreur lors de la sauvegarde des produits !");
        }
    }

    private void loadFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            produits = (List<Produit>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            produits = new ArrayList<>();
        }
    }
}
