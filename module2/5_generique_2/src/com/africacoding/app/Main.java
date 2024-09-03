package com.africacoding.app;

import com.africacoding.app.entity.Jour;

public class Main {
    public static void main(String[] args) {
        System.out.print("les jours de la semaine: ");
        Jour[] jours = Jour.values();
        for (int i = 0; i < jours.length; i++) {
            String ponctuation = i < (jours.length - 1) ? ", " : ".";
            System.out.print(jours[i] + ponctuation);
        }
    }
}