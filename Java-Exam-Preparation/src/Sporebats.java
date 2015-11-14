import java.util.Scanner;

public class Sporebats {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int health = 5800;
        int glowcaps = 0;

        String line = scan.nextLine();

        boolean hasDied = false;

        while(!line.equals("Sporeggar")){
            for (int i = 0; i < line.length() - 1; i++) {
                if (line.charAt(i) == 'L'){
                    health += 200;
                }else{
                    health -= line.charAt(i);
                }
            }
            if (health < 0){
                hasDied = true;
                break;
            }
            glowcaps += Integer.parseInt(line.charAt(line.length() - 1) + "");
            line = scan.nextLine();
        }
        if (!hasDied){
            System.out.println("Health left: " + health);
            int glowcapsNeeded = 30 - glowcaps;
            if(glowcapsNeeded > 0){
                System.out.printf("Safe in Sporeggar, but another %d Glowcaps needed.", glowcapsNeeded);
                System.out.println();
            } else{
                System.out.printf("Bought the sporebat. Glowcaps left: %d", Math.abs(glowcapsNeeded));
                System.out.println();
            }
        }else {
            System.out.printf("Died. Glowcaps: %d", glowcaps);
        }
    }
}
