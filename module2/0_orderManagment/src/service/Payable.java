package service;

public interface Payable {

    void payer();

    default void AfficherRecap(){
        System.out.println("Recapitulatif de la commande");
    }

    static void verifierPaiement(){
        System.out.println("Verification du paiement en cours...");
    }
}
