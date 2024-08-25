package service;

public class CarteCredit extends MoyenPaiement {

    public CarteCredit(double montant) {
        super(montant);
    }

    @Override
    public void payer() {
        System.out.println("Paiement de $" + montant + " par la carte credit");
    }
}
