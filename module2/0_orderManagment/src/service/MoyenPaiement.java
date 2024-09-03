package service;

public abstract class MoyenPaiement implements Payable {

    protected double montant;

    public MoyenPaiement(double montant) {
        this.montant = montant;
    }
}
