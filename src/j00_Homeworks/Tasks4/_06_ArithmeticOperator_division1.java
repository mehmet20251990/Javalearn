package j00_Homeworks.Tasks4;

import java.util.Scanner;

public class _06_ArithmeticOperator_division1 {

    public static void main(String[] args) {

        /*    /*    kullanıcıdan alınan iki tane int  (num1 , num2),
         bölümünü print eden code create ediniz. */
        Scanner scan = new Scanner(System.in);
        System.out.println("3 sayı:");
        int a=scan.nextInt();
        int b=scan.nextInt();

        int bölüm=a/b;
        System.out.println(bölüm);


    }
}
