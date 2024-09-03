package treemap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {

        Comparator<Animal> comparatorByName = new Comparator<>() {
            @Override
            public int compare(Animal animal1, Animal animal2) {
                return Double.compare(animal1.getPrix(), animal2.getPrix());
            }
        };
        
        Map<Animal, Integer> map = new TreeMap<>(comparatorByName);
        map.put(new Animal("Oiseau", 522), 15);
        map.put(new Animal("Chien", 600), 62);
        map.put(new Animal("Paon", 100), 425);
        map.put(new Animal("Antilope", 6530), 255);
        map.put(new Animal("Zebre", 9500), 8588);

        for (Map.Entry<Animal, Integer> entry: map.entrySet()){
            System.out.println("animal "+entry.getKey().getName() +
                    " coute $"+ entry.getKey().getPrix()+ " et pese "+entry.getValue()+"Kg");
        }
    }
}
class Animal {

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
