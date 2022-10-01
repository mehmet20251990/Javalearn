package j00_Homeworks.Tasks4;

import java.util.Scanner;

public class _13_ArithmeticOperator_reminder3 {

    public static void main(String[] args) {

        /* Verilen iki int hakkında,
            num1'in num2'ye bölümünden kalanı yazdırınız.  */

        Scanner scan = new Scanner(System.in);
        System.out.println("2 sayı:");
        int a=scan.nextInt();
        int b=scan.nextInt();

        int kalan=a%b;
        System.out.println(kalan);

    }
}
