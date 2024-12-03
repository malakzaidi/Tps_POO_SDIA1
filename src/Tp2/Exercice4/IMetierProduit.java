package Tp2.Exercice4;

import java.util.List;

    // Interface pour la gestion des produits
    public interface IMetierProduit {
        public Produit add(Produit p); // Ajouter un produit
        public List<Produit> getAll(); // Retourner tous les produits
        public List<Produit> findByNom(String motCle); // Trouver des produits par nom
        public Produit findById(long id); // Trouver un produit par ID
        public void delete(long id); // Supprimer un produit par ID
    }


