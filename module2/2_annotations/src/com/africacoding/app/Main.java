package com.africacoding.app;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        try {

            Class<Medecin> classe = Medecin.class;

            Person person = classe.getDeclaredConstructor().newInstance();

            for (Method methode : classe.getDeclaredMethods()) {
                if (classe.isAnnotationPresent(ServiteurDeEtat.class)) {
                    ServiteurDeEtat annotation = classe.getAnnotation(ServiteurDeEtat.class);
                    System.out.println("Valeur de l'annotation : " + annotation.name());
                    methode.invoke(classe.getDeclaredConstructor().newInstance());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}