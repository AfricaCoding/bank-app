package listedynamique.comparablecomparator;

import java.util.ArrayList;
import java.util.Collections;

public class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age); // Tri par âge
    }

    @Override
    public String toString() {
        return name + ": " + age;
    }

}