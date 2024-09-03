package treeset;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class MainTreeSet {

    public static void main(String[] args) {

        Comparator<Animal> comparatorByName = new Comparator<>() {
            @Override
            public int compare(Animal animal1, Animal animal2) {
                return animal1.getName().compareTo(animal2.getName());
            }
        };
        Comparator<Animal> comparatorByPrice = new Comparator<>() {
            @Override
            public int compare(Animal animal1, Animal animal2) {
                return Double.compare(animal1.getPrix(), animal2.getPrix());
            }
        };
        Set<Animal> set = new TreeSet<>(comparatorByPrice);
        set.add(new Animal("Oiseau", 522));
        set.add(new Animal("Chien", 600));
        set.add(new Animal("Paon", 100));
        set.add(new Animal("Antilope", 630));
        set.add(new Animal("Zebre", 900));

        for (Animal s : set) {
            System.out.println(s.getName()+
                    " qui coute $"+s.getPrix());
        }

    }
}

class Animal{

    private String name;
    private double prix;

    public Animal(String name, double prix) {
        this.name = name;
        this.prix = prix;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}
