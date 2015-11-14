import java.util.Scanner;

public class Gandalf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int initialHappines = Integer.parseInt(scan.nextLine());

        String[] objects = scan.nextLine().toLowerCase().split("[^a-zA-Z]+");

        for(String object : objects){
            switch (object){
                case "cram":
                    initialHappines += 2;
                    break;
                case "lembas":
                    initialHappines += 3;
                    break;
                case "apple":
                    initialHappines += 1;
                    break;
                case "melon":
                    initialHappines += 1;
                    break;
                case "honeycake":
                    initialHappines += 5;
                    break;
                case "muushrooms":
                    initialHappines -= 10;
                    break;
                default:
                    initialHappines -= 1;
                    break;
            }
        }
        System.out.println(initialHappines);
        if (initialHappines < -5){
            System.out.println("Angry");
        }else if (initialHappines >= -5 && initialHappines < 0){
            System.out.println("Sad");
        }else if (initialHappines >= 0 && initialHappines < 15){
            System.out.println("Happy");
        }else if (initialHappines >=15){
            System.out.println("Special JavaScript mood");
        }
    }
}
