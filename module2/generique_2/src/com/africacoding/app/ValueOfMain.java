package com.africacoding.app;

import com.africacoding.app.entity.Saison;

import java.util.Scanner;

public class ValueOfMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine().toUpperCase();

        try {
            System.out.println(Saison.valueOf(input));
        } catch (IllegalArgumentException ex) {
            System.out.println("Cette valeur est invalide");
        } catch (Exception ex) {
            System.out.println("Il y a un soucis");
        }
    }
}
