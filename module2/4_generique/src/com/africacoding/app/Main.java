package com.africacoding.app;

public class Main {
    public static void main(String[] args) {

        Boite<String> boiteDeTexte = new Boite<>();
        boiteDeTexte.setContenu("Bonjour");
        System.out.println("Contenu : " + boiteDeTexte.getContenu());

        Boite<Integer> boiteDeNombre = new Boite<>();
        boiteDeNombre.setContenu(123);
        System.out.println("Contenu : " + boiteDeNombre.getContenu());

        Boite<Double> boiteDeNombred = new Boite<>();
        boiteDeNombred.setContenu(123.52);
        System.out.println("Contenu : " + boiteDeNombred.getContenu());

    }
}