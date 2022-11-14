package j00_Homeworks.ArraysTask;

import java.util.Arrays;
import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        // Task -> Kullanıcıdan alacağınız 5 adet sayıyı , girişi sırasına göre tersten print eden code create ediniz

        Scanner sc = new Scanner(System.in);
        int nums[] = new int[5];

        for (int i=0; i<5; i++){
            System.out.println("sayı");
            nums[nums.length-1-i]= sc.nextInt();
        }
        System.out.println(Arrays.toString(nums));



    }
}
