import entity.*;
import service.CarteCredit;
import service.Expediable;
import service.LivraisonStandard;
import service.MoyenPaiement;

public class Main {
    public static void main(String[] args) {
        // Création d'un utilisateur client
        Utilisateur client = new Client(1, "Alice", "alice@example.com");

        // Création de quelques produits
        Produit produit1 = new Produit(1, "Ordinateur Portable", 1200.0, 1);
        Produit produit2 = new Produit(2, "Souris", 25.0, 2);
        Produit produit3 = new Produit(3, "Clavier", 45.0, 1);

        // Création d'un panier
        Panier panier = new Panier();
        panier.ajouterProduit(produit1);
        panier.ajouterProduit(produit2);
        panier.ajouterProduit(produit3);

        // Affichage du total du panier
        System.out.println("Total du panier: $" + panier.calculerTotal() );

        // Création d'une commande
        Commande commande = new Commande(client);
        commande.ajouterProduit(produit1);
        commande.ajouterProduit(produit2);
        commande.ajouterProduit(produit3);

        // Affichage de la commande
        System.out.println(commande);

        // Choix d'un moyen de paiement
        MoyenPaiement paiement = new CarteCredit(commande.calculerTotal());
        paiement.payer();

        // Expédition de la commande
        Expediable livraison = new LivraisonStandard();
        livraison.expedier();
    }
}