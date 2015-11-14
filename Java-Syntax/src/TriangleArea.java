import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a1 = console.nextInt();
        int a2 = console.nextInt();
        int b1 = console.nextInt();
        int b2 = console.nextInt();
        int c1 = console.nextInt();
        int c2 = console.nextInt();
        int area = ((a1 * (b2 - c2)) + (b1 * (c2 - a2)) + (c1 * (a2 - b2))) / 2;
        System.out.println(area);
    }
}
