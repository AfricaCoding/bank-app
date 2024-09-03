package entity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Commande {

    private List<Produit> produits;
    private Utilisateur utilisateur;

    public Commande(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
        this.produits = new ArrayList<>();
    }

    public void ajouterProduit(Produit produit) {
        this.produits.add(produit);
    }

    public double calculerTotal() {
        return produits.stream().mapToDouble(Produit::calculerPrix).sum();
    }

    public List<Produit> getProduits() {
        return produits;
    }

    @Override
    public String toString() {
        return "CommandeUtilisateur{" +
                "utilisateur=" + utilisateur.getNom() +
                ", produits=" + produits.stream().map(Produit::getNom)
                .collect(Collectors.joining(", ")) +
                ", total=$" + calculerTotal() + '}';
    }
}
