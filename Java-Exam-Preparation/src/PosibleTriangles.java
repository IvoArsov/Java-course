import java.text.MessageFormat;
import java.util.Scanner;

public class PosibleTriangles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String[] inputNumbers = scan.nextLine().split(" ");
        double[] numbers = new double[inputNumbers.length];
        for (int i = 0; i < inputNumbers.length; i++) {
            numbers[i] = Double.parseDouble(inputNumbers[i]);
        while (inputNumbers[0] != "End") {
                double a = numbers[0];
                double b = numbers[1];
                double c = numbers[3];

                if (a + b > c) {
                    System.out.println(MessageFormat.format("{0}+{1}>{2}", a, b, c));
                } else {
                    System.out.println("No");
                }

            }
            scan.nextLine();

        }

    }
}
