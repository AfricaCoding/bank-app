package entity;

public class Produit {

    private final int id;
    private String nom;
    private double prix;
    private int quantite;

    public Produit(int id, int quantite, double prix, String nom) {
        this.id = id;
        this.quantite = quantite;
        this.prix = prix;
        this.nom = nom;
    }

    public final double calculerPrix() {
        return this.prix * this.quantite;
    }


    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    @Override
    public String toString() {
        return "Produit{" +
                ", nom='" + nom + '\'' +
                ", prix=" + prix +
                ", quantite=" + quantite +
                '}';
    }
}