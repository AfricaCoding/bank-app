import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainWitghPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Comment vous joindre?");
        String text = sc.nextLine(); // "Appelez-moi au 555-1234 ou au 555-5678.";
        Pattern pattern = Pattern.compile("\\b\\d{3}-\\d{4}\\b");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println("Numéro trouvé : " + matcher.group());
        }
    }
}
