package j00_Homeworks.Tasks4;

import java.util.Scanner;

public class _03_ArithmeticOperator_subtract1 {

    public static void main(String[] args) {

    /*     /*    kullanıcıdan alınan iki tane int  (num1 , num2),
         farkını print eden code create ediniz. */

        Scanner scan = new Scanner(System.in);
        System.out.println("2 sayı:");
        int a=scan.nextInt();
        int b=scan.nextInt();
        int fark=a-b;
        System.out.println(fark);

    }
}
