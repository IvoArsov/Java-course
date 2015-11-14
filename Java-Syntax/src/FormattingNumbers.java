
import java.util.Scanner;
public class FormattingNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        float b = console.nextFloat();
        float c = console.nextFloat();

        String intAsHex = Integer.toHexString(a).toUpperCase();
        String intAsBinary = String.format("%10s", Integer.toBinaryString(a)).replace(' ', '0');

        System.out.format("|%-10s|%10s|%10.2f|%-10.3f|", intAsHex, intAsBinary, b, c);
    }
}

