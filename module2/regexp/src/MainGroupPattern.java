import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainGroupPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Comment vous joindre?");
        String text = sc.nextLine();
        Pattern pattern = Pattern.compile("([A-Za-z0-9+_.-]+)@([A-Za-z0-9.-]+)");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            System.out.println("Nom d'utilisateur : " + matcher.group(1));
            System.out.println("Domaine : " + matcher.group(2));
        }
    }
}
