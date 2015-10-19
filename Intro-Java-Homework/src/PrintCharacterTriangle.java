import java.util.Scanner;

public class PrintCharacterTriangle {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int inputNum = Integer.parseInt(console.nextLine());

        for (int i = 1; i <= inputNum; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((char) (j + 97) + " ");
            }
            System.out.println();
        }

        for (int i = inputNum - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print((char)(j + 97) + " ");
            }
            System.out.println();
        }
    }
}
