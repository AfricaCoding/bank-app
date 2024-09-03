package com.africacoding.app;

import java.util.List;

public class Calculateur<T extends Number> {

    private T valeur;

    public Calculateur(T valeur) {
        this.valeur = valeur;
    }

    public double doubler() {
        return valeur.doubleValue() * 2;
    }

    public static double somme(List<? extends Number> liste) {
        double somme = 0.0;
        for (Number n : liste) {
            somme += n.doubleValue();
        }
        return somme;
    }

    public static void ajouterNombre(List<? super Integer> liste) {
        liste.add(5);
    }
}