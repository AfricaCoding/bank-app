import java.io.IOException;

public class MainNullPointerExc {
    public static void main(String[] args) {

        try {
            String str = null;
            System.out.println(str.length()); // Cette ligne déclenche une NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Erreur : Référence null.");
        } catch (Exception e) {
            System.out.println("Erreur générique : " + e.getMessage());
        }
    }

}