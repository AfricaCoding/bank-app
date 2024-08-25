package entity;

public class Client extends Utilisateur {

    public Client(int id, String nom, String email) {
        super(id, nom, email);
    }

    public void passerCommande() {
        System.out.println("Commande passer par le client " + getNom() + ".");
    }
}
