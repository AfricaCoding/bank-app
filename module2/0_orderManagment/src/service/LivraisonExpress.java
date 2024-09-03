package service;

public class LivraisonExpress implements Expediable {
    @Override
    public void expedier() {
        System.out.println("Commande expediee en livraison express.");
    }
}
