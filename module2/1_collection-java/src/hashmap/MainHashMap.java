package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public class MainHashMap {

    public static void main(String[] args) {

        Map<Product, String> map = new HashMap<>();
        map.put(new Product("Ordinateur", 50), "ererrrre");
        map.put(new Product("Ecran", 50), "fgfgg");
        map.put(new Product("Clavier", 50), "Develagergoper");
        map.put(new Product("telephone", 50), "safaeg");
        map.put(new Product("telephone", 90), "FHhgt");
        map.put(new Product("telephone", 90), "Doublon");


//        for (String key: map.keySet()){
//            System.out.println("La cle: "+key+" est liee a la valeur "+map.get(key));
//        }

//        for (Map.Entry<String, String> entry: map.entrySet()){
//            System.out.println("La cle: "+entry.getKey()+" est liee a la valeur "+entry.getValue());
//        }

        Iterator<Map.Entry<Product, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Product, String> entry = iterator.next();
            System.out.println("La cle: " + entry.getKey().getName()
                    + " est liee a la valeur " + entry.getValue());
        }
    }
}


class Product {
    private String name;
    private double prix;

    public Product(String name) {
        this.name = name;
    }

    public Product(String name, double prix) {
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}