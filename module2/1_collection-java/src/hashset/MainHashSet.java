package hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

class MainHashSet {

    public static void main(String[] args) {
        Set<Product> persons = new HashSet<>();
        persons.add(new Product("Ordinateur", 9000));
        persons.add(new Product("Clavier", 1000));
        persons.add(new Product("Souris", 566));
        persons.add(new Product("Ecran", 66454));
        persons.add(new Product("Ordinateur", 15000));
        persons.add(new Product("Ordinateur", 50000));
        persons.add(new Product("Ordinateur", 50000));

        System.out.println("**** Liste des produits a vendre! ****");
        Iterator<Product> iterator = persons.iterator();
        while (iterator.hasNext()) {
            Product product =iterator.next();
            System.out.println(product.getName()+
                    " est vendu a $"+product.getPrix());
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
        return Double.compare(prix, product.prix) == 0 && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, prix);
    }
}