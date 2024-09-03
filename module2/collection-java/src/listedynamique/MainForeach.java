package listedynamique;

import java.util.ArrayList;

public class MainForeach {
    public static void main(String[] args) {
        ArrayList<String> persons = new ArrayList<>();
        System.out.println("Le cas avec forEach");
        persons.add("Godson");
        persons.add("Lemuel");
        persons.add("Elie");
        persons.add("Davy");
        persons.add("Delvanie");
        persons.add("Lemuel");
        persons.add("Veronica");

        for (String item: persons){
            System.out.println("la person s'appelle: "+item+" il est a la position "+persons.indexOf(item));
        }


    }
}