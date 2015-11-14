import java.util.ArrayList;
import java.util.Scanner;

public class BubleSort {
    static void bubleSort(Integer[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j]> arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        bubleSort(arr);
        for(Integer v : arr){
            System.out.printf(v + " ");
        }
        System.out.println("");
    }
}
