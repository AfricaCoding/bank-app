import java.io.FileReader;
import java.io.IOException;

public class MainPropagationException {

    public static void main(String[] args) {
        try {
            methodeQuiPropage();
        }catch (IOException e){
            System.out.println("Erreur capturée : " + e.getMessage());
        } finally {
            System.out.println("Et enfin la logique est finie");
        }
    }

    public static void methodeQuiPropage() throws IOException {
        throw new IOException("Fichier introuvable");
    }
}