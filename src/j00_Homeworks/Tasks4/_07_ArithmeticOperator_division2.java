package j00_Homeworks.Tasks4;

import java.util.Scanner;

public class _07_ArithmeticOperator_division2 {

    public static void main(String[] args) {

        /* Verilen int ler hakkında, (num1, num2),
            num1'i num2'ye bölün ve sonucu int sonuc'a eşitleyin.
            int sonucu yazdırın. */

        Scanner scan = new Scanner(System.in);
        System.out.println("3 sayı:");
        int a=scan.nextInt();
        int b=scan.nextInt();

        int bölüm=a/b;
        System.out.println(bölüm);


    }
}
