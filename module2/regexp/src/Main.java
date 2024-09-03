import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        Scanner sc = new Scanner(System.in);

        System.out.print("Votre adresse email: ");
        String email = sc.nextLine();

        if (email.matches(emailRegex)) {
            System.out.println("Email valide");
        } else {
            System.out.println("Email invalide");
        }
    }
}