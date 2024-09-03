package listedynamique.comparablecomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorMain {

    public static void main(String[] args) {
        ArrayList<PersonSanSComparable> list = new ArrayList<>();
        list.add(new PersonSanSComparable("Alice", 30));
        list.add(new PersonSanSComparable("Charlie", 35));
        list.add(new PersonSanSComparable("Bob", 25));
        System.out.println("Avant");
        System.out.println(list);
        Collections.sort(list, new Comparator<PersonSanSComparable>() {
            @Override
            public int compare(PersonSanSComparable p1, PersonSanSComparable p2) {
                return p1.name.compareTo(p2.name); // Tri par nom
            }
        });

        System.out.println("Apres");
        System.out.println("Sorted ArrayList by age: " + list);
        Collections.sort(list, new Comparator<PersonSanSComparable>() {
            @Override
            public int compare(PersonSanSComparable p1, PersonSanSComparable p2) {
                return Integer.compare(p1.age, p2.age); // p1.age.compareTo(p2.age); // Tri par nom
            }
        });

        System.out.println("Apres par age");
        System.out.println("Sorted ArrayList by age: " + list);
    }

}
