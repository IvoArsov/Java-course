import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StartsAndEndsWithCapitalLetter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String stringPattern = "\\b[A-Z].*?\\b";
        Pattern pat = Pattern.compile(stringPattern);

        Matcher match = pat.matcher(console.nextLine());

        while(match.find()){
            System.out.print(match.group()+ " ");
        }
    }
}
