package j00_Homeworks.Tasks4;

import java.util.Scanner;

public class _02_ArithmeticOperator_sum2 {

    public static void main(String[] args) {

     /*     /*    kullanıcıdan alınan 4 tane int
         toplamını print eden code create ediniz. */

        Scanner scan = new Scanner(System.in);
        System.out.println("4 sayı:");
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        int d=scan.nextInt();
        int top=a+b+c+d;
        System.out.println(top);


    }
}
