import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;

public class SumLines {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("resources/ text.txt"))){
            String line;
            while((line = reader.readLine()) != null){
                int charSum = 0;
                for (int i = 0; i < line.length(); i++) {
                    charSum += line.charAt(i);
                }
                System.out.println(charSum);
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
