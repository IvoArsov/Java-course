import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ExtractWords {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String stringPattern = "[a-z,A-Z]";
        Pattern pat = Pattern.compile(stringPattern);

        Matcher match = pat.matcher(console.nextLine());

        while(match.find()){
            System.out.print(match.group()+ " ");
        }
    }
}
