import java.util.Scanner;

public class Calculate≈xpression {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double a = console.nextFloat();
        double b = console.nextFloat();
        double c = console.nextFloat();

        double firstExNumber = ((a * a) + (b * b)) / ((a * a) - (b * b));
        double firstExPower = (a + b + c) / Math.sqrt(c);
        double firstResult = Math.pow(firstExNumber,firstExPower);

        double secondExNumber = (a * a) + (b * b) - (c * c * c);
        double secondExPower = a - b;
        double secondResult = Math.pow(secondExNumber,secondExPower);

        double diff = Math.abs((a + b + c) / 3 - (firstResult + secondResult) / 2);

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", firstResult, secondResult, diff);
    }
}
