package j00_Homeworks.ArraysTask;

import java.util.Arrays;
import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        //Task-> girilen 7 elemanlı bir int  arrayın tek elemanlarını print eden code create ediniz.
        Scanner sc = new Scanner(System.in);
        int num[] = new int[7];
        for (int i = 0; i < 7; i++) {
            System.out.println("sayı gir");
            num[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(num));

        for (int i = 0; i < 7; i++) {
            if (num[i]%2==1){
                System.out.print(num[i] + " ");
            }
        }




    }
}
