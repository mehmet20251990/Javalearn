package j00_Homeworks.ArraysTask;

import java.util.Arrays;
import java.util.Scanner;

public class Task05 {


    public static void main(String[] args) {
        // Task-> girilen int değeri tersten print eden code create ediniz.
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        String sayı = String.valueOf(num);

        String array[] = sayı.split("");
        for (int i = sayı.length() - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
