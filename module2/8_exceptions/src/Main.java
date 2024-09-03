public class Main {
    public static void main(String[] args) {

        try {
            int division = 10 / 0; // Cette ligne déclenche une ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Erreur : Division par zéro.");
        }
    }
}