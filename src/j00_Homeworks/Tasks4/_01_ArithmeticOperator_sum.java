package j00_Homeworks.Tasks4;

import java.util.Scanner;

public class _01_ArithmeticOperator_sum {
    public static void main(String[] args) {

    /*    kullanıcıdan alınan iki tane int  (num1 , num2),
         toplamını print eden code create ediniz. */

        Scanner scan = new Scanner(System.in);
        System.out.println("2 sayı:");
        int a=scan.nextInt();
        int b=scan.nextInt();
        int top=a+b;
        System.out.println(top);



    }
}
