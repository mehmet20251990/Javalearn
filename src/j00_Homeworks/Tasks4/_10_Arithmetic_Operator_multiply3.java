package j00_Homeworks.Tasks4;

import java.util.Scanner;

public class _10_Arithmetic_Operator_multiply3 {

    public static void main(String[] args) {

        /* Oluşturulmuş olan int ler hakkında, (num1, num2 , num3, num4),
        Bu int'leri birbiriyle çarpın ve sonuca eşitleyin.
        int sonuc u yazdırın. */

        Scanner scan = new Scanner(System.in);
        System.out.println("3 sayı:");
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        int d=scan.nextInt();

        int carp=a*b*c*d;
        System.out.println(carp);




    }
}
