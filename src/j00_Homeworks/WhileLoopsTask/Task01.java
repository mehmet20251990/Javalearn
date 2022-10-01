package j00_Homeworks.WhileLoopsTask;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
/*
Task-> girilen sayıların toplamı 333 gectiğinde girilen sayı adedini ve toplamını prşnt eden code create ediniz.
 */
        Scanner sc = new Scanner(System.in);
        int toplam=0;
        int count = 0;
        while(toplam<=333){
            System.out.println("sayı gir");
            int x =sc.nextInt();
            toplam+=x;
            count++;
        }
        System.out.println(count);
        System.out.println(toplam);
    }
}
