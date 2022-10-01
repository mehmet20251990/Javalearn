package j00_Homeworks.Tasks4;

import java.util.Scanner;

public class _11_ArithmeticOperator_reminder1 {

    public static void main(String[] args) {

        /*  Verilen int ler hakkında (num1, num2),
            num1 'in   num2'ye bölümünden kalanı, int sonuc'a  eşitleyin.
            int sonucu yazdırın.  */

        Scanner scan = new Scanner(System.in);
        System.out.println("2 sayı:");
        int a=scan.nextInt();
        int b=scan.nextInt();

        int kalan=a%b;
        System.out.println(kalan);

    }
}
