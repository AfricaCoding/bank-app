import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        List<Double> person = new ArrayList<>();
//
//        int nombrePrimitif = 10;
//        Integer nombreObjet = Integer.valueOf(nombrePrimitif);
//
//        int nombreRetourne = nombreObjet.intValue();
//        System.out.println("Nombre retourné : " + nombreRetourne);

        Scanner sc = new Scanner(System.in);
Integer d = null;

int gg = d.intValue();

        System.out.println("Quel est votre age? ");
        int age = Integer.parseInt(sc.nextLine()); //"25"
        System.out.println("Quel est votre poids? ");
        double poids =Double.parseDouble(sc.nextLine());// "55.5"
        System.out.println("Quel est votre nom? ");
        String name = sc.nextLine();

        System.out.println("Votre nom est "+name +" et vous avez "+age
        +" votre poids est "+poids+" kg");

    }
}