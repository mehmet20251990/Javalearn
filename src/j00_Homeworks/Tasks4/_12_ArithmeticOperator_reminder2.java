package j00_Homeworks.Tasks4;

import java.util.Scanner;

public class _12_ArithmeticOperator_reminder2 {

    public static void main(String[] args) {

        /* Verilen int ler hakkında (num1 ve num2),
            num1'in num2'ye bölümünden kalanı int sonuc'a eşitleyiniz.
            int sonuc'u yazdırınız.  */

        Scanner scan = new Scanner(System.in);
        System.out.println("2 sayı:");
        int a=scan.nextInt();
        int b=scan.nextInt();

        int kalan=a%b;
        System.out.println(kalan);


    }
}
