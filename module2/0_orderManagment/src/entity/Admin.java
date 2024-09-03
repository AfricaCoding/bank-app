package entity;

public class Admin extends Utilisateur {

    public Admin(int id, String nom, String email) {
        super(id, nom, email);
    }

    public void gererProduit(Produit produit) {
        System.out.println("Produit gere par l'admin "
                + getNom() + ": " + produit.getNom());
    }
}
