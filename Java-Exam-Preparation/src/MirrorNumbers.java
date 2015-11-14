import java.util.Scanner;

public class MirrorNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        scan.nextLine();
        String inputDigits = scan.nextLine();

        Boolean validMatch = false;
        String[] digits = inputDigits.split(" ");
        for (int i = 0; i < digits.length; i++) {
            for (int j = i+1; j < digits.length; j++) {
                String a = digits[i];
                String b = digits[j];
                if (a.charAt(0) == b.charAt(3) && a.charAt(1) == b.charAt(2) &&
                        a.charAt(2) == b.charAt(1) && b.charAt(0) == a.charAt(3)){
                    System.out.printf("%s<!>%s%n", a, b);
                    validMatch = true;
                }
            }
        }
        if (!validMatch){
            System.out.println("No");
        }
    }
}
