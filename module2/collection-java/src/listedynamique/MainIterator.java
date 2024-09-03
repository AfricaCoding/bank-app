package listedynamique;

import java.util.ArrayList;

public class MainIterator {
    public static void main(String[] args) {
        ArrayList<String> persons = new ArrayList<>();
        System.out.println("Le cas avec Iterator");
        persons.add("Godson");
        persons.add("Lemuel");
        persons.add("Elie");
        persons.add("Davy");
        persons.add("Delvanie");
        persons.add("Lemuel");
        persons.add("Veronica");
// ici
        var iterator = persons.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}