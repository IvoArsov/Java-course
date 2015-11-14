import java.util.Scanner;

public class HeiganDance {
    public static void main(String[] args) {
        double heiganHealth = 3000000;
        int playerHealth = 18500;

        Scanner scan = new Scanner(System.in);

        double playerDamage = Double.parseDouble(scan.nextLine());
        int playerRow = 7;
        int playerCol = 7;

        String lastSpell = "";
        while (true){
            String line = scan.nextLine();
            String[] tokens = line.split(" ");

            if (lastSpell.equals("Cloud")){
                playerHealth -= 3500;
                heiganHealth -= playerDamage;  //// !!!!!!!!!
            }

            if (heiganHealth <= 0 || playerHealth <= 0){
                break;
            }

            if (!lastSpell.equals("Cloud")){
               heiganHealth -= playerDamage;  //// !!!!!!!!!
            }

            lastSpell = "Eruption";
            heiganHealth -= playerDamage; ///// !!!!!!!!!!!!!!

            String spellName = tokens[0];
            int damageRow = Integer.parseInt(tokens[1]);
            int damageCol = Integer.parseInt(tokens[2]);

            int movedOnRow = playerRow;
            int movedOnCol = playerCol;

            if (isInDamageArea(damageRow, damageCol, movedOnRow, movedOnCol)){
                movedOnRow = playerRow - 1;
                if (isInDamageArea(damageRow, damageCol, movedOnRow, movedOnCol)
                        || isNextMoveWall(movedOnRow, movedOnCol)){
                    movedOnRow = playerRow;
                    movedOnCol = playerCol + 1;
                    if (isInDamageArea(damageRow, damageCol, movedOnRow, movedOnCol)
                            || isNextMoveWall(movedOnRow, movedOnCol)){
                        movedOnRow = playerRow + 1;
                        movedOnCol = playerCol;
                        if (isInDamageArea(damageRow, damageCol, movedOnRow, movedOnCol)
                                || isNextMoveWall(movedOnRow, movedOnCol)){
                            movedOnRow = playerRow;
                            movedOnCol = playerCol - 1;
                            if (isInDamageArea(damageRow, damageCol, movedOnRow, movedOnCol)
                                    || isNextMoveWall(movedOnRow, movedOnCol)){
                                if (spellName.equals("Cloud")){
                                    playerHealth -= 3500;
                                } else{
                                    playerHealth -= 6000;
                                }
                                lastSpell = spellName;
                            } else {
                                playerCol--;
                            }
                        } else {
                            playerRow++;
                        }
                    } else {
                        playerCol++;
                    }
                } else {
                    playerRow--;
                }
            }
        }


        if (heiganHealth <= 0){
            System.out.println("Heigan: Defeated!");
        } else {
            System.out.printf("Heigan: %d.2f", heiganHealth);
            System.out.println();
        }

        if (playerHealth <= 0){
            System.out.println("Player: Kiled by " + (lastSpell.equals("Cloud") ? "Plague Cloud" : lastSpell ));
        } else {
            System.out.println("Player: " + playerHealth);
        }

        System.out.println("Final position: " + playerRow + ", " + playerCol);
    }

    static boolean isInDamageArea (int dmgRow, int dmgCol, int plRow, int plCol){
        for (int row = dmgRow - 1; row <= dmgRow + 1; row++){
            for (int col = dmgCol - 1; col <= dmgCol + 1; col++){
                if (plRow == row && plCol == col){
                    return true;
                }
            }
        }
        return false;
    }

    static boolean isNextMoveWall (int plX, int plY){
        return plX < 0 || plX >= 15 || plY < 0 || plY >= 15;
    }
}
