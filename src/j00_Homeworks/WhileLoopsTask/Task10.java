package j00_Homeworks.WhileLoopsTask;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        // task ->  Girilen bir sayıya kadar  tek olanlarını print eden code create ediniz.

        Scanner sc = new Scanner(System.in);
        int count = 1;
        System.out.print("Pozitif bir sayı giriniz :");
        int number = Math.abs(sc.nextInt());
        while (count <= number) {
            System.out.println(count + " ");
            count+=2;
        }

    }
}
