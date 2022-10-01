package j00_Homeworks.Tasks4;

import java.util.Scanner;

public class _05_ArithmeticOperator_sum3 {

    public static void main(String[] args) {

          /*    kullanıcıdan alınan 3 tane int
         toplamını print eden code create ediniz. */
        Scanner scan = new Scanner(System.in);
        System.out.println("3 sayı:");
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();

        int top=a+b+c;
        System.out.println(top);

    }
}
