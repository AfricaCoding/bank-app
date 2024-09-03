package com.africacoding.app;

public class Utilitaire {
    public static <T> void afficherTableau(T[] tableau) {
        for (T element : tableau) {
            System.out.println(element);
        }
    }
    public static void main(String[] args) {
        String[] tableauDeString = {"A", "B", "C"};
        Integer[] tableauDeNombre = {1, 2, 3};
        afficherTableau(tableauDeString);
        System.out.println(" ");
        afficherTableau(tableauDeNombre);
    }
}
