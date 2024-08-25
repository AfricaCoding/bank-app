package service;

public class Paypal extends MoyenPaiement {

    public Paypal(double montant) {
        super(montant);
    }

    @Override
    public void payer() {
        System.out.println("Paiement de $" + montant + " via paypal");
    }
}
