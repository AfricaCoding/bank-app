package listedynamique.comparablecomparator;

public class PersonSanSComparable {
    String name;
    int age;

    public PersonSanSComparable(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ": " + age;
    }

}