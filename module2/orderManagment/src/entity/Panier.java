package entity;

import java.util.ArrayList;
import java.util.List;

public class Panier {
    private List<Produit> produits;

    public Panier() {
        this.produits = new ArrayList<>();
    }

    public void ajouterProduit(Produit produit) {
        this.produits.add(produit);
    }

    public void supprimerProduit(Produit produit) {
        this.produits.remove(produit);
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void viderPanier() {
        this.produits.clear();
    }

    public double calculerTotal() {
        return produits.stream().mapToDouble(Produit::calculerPrix).sum();
    }
}
