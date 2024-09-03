package listedynamique.comparablecomparator;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableMain {

    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("Alice", 30));
        list.add(new Person("Bob", 25));
        list.add(new Person("Charlie", 35));
        Collections.sort(list); // Utilisation de compareTo()
        System.out.println("Sorted ArrayList by age: " + list);
    }

}
