import java.util.Scanner;

public class ConvertFromBase7ToDecimal {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int numberInBase7 = console.nextInt();
        String numberInDecimal = Integer.toString(numberInBase7, 10);

        System.out.println(numberInDecimal);
    }
}
