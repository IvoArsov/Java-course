import java.util.Scanner;

public class ConvertFromDecimalSystemToBase7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int numberInDecimal = console.nextInt();
        String numberInBase7 = Integer.toString(numberInDecimal , 7);

        System.out.println(numberInBase7);
    }
}
