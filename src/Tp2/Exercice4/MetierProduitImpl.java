package Tp2.Exercice4;
import java.util.ArrayList;
import java.util.List;

    // Classe qui implémente l'interface IMetierProduit
    public class MetierProduitImpl implements IMetierProduit {
        private List<Produit> produits; // Liste des produits

        // Constructeur
        public MetierProduitImpl() {
            produits = new ArrayList<>(); // Initialiser la liste des produits
        }

        // Méthode pour ajouter un produit
        @Override
        public Produit add(Produit p) {
            produits.add(p); // Ajouter le produit à la liste
            return p; // Retourner le produit ajouté
        }

        // Méthode pour retourner tous les produits
        @Override
        public List<Produit> getAll() {
            return produits; // Retourner la liste des produits
        }

        // Méthode pour rechercher des produits par nom
        @Override
        public List<Produit> findByNom(String motCle) {
            List<Produit> resultats = new ArrayList<>();
            for (Produit p : produits) {
                if (p.getNom().toLowerCase().contains(motCle.toLowerCase())) { // Vérifier si le nom contient le mot clé
                    resultats.add(p);
                }
            }
            return resultats; // Retourner les produits trouvés
        }

        // Méthode pour trouver un produit par ID
        @Override
        public Produit findById(long id) {
            for (Produit p : produits) {
                if (p.getId() == id) { // Vérifier si l'ID correspond
                    return p; // Retourner le produit trouvé
                }
            }
            return null; // Retourner null si non trouvé
        }

        // Méthode pour supprimer un produit par ID
        @Override
        public void delete(long id) {
            produits.removeIf(p -> p.getId() == id); // Supprimer le produit correspondant à l'ID
        }
    }
