package com.africacoding.app;

import java.util.List;

public class MainCalculateur {

    public static void main(String[] args) {
        Calculateur<?> calcInt = new Calculateur<>(20L);

//        System.out.println(calcInt.doubler());

        Calculateur.ajouterNombre(List.of(2, 5));
    }
}
