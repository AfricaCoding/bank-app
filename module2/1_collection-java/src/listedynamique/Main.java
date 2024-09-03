package listedynamique;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Collection
//        List
//        Set
//        Queue

//        Map

        ArrayList<String> persons = new ArrayList<>();

        persons.add("Godson");
        persons.add("Lemuel");
        persons.add("Elie");
        persons.add("Davy");
        persons.add("Delvanie");
        persons.add("Lemuel");
        persons.add("Veronica");

//        Collections.sort(persons);
//        System.out.println("Avant de mettre l'ordre: ");
//        for (int i=0; i<persons.size(); i++){
//            System.out.println(persons.get(i));
//        }

//        Collections.sort(persons);
//        System.out.println("\nApres : ");
//        for (int i=persons.size()-1; i>=0; i--){
//            System.out.println("la person s'appelle: "+persons.get(i)+" il est a la position "+i);
//        }

        int[] arr = {1,2,6,9,75,58};
        int count =0;
        while (count < arr.length){
            System.out.println(arr[count]);
            count++;
        }
    }
}