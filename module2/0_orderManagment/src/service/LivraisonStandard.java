package service;

public class LivraisonStandard implements Expediable {
    @Override
    public void expedier() {
        System.out.println("Commande expediee en livraison standard.");
    }
}
