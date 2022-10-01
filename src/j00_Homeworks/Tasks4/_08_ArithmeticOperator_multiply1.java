package j00_Homeworks.Tasks4;

import java.util.Scanner;

public class _08_ArithmeticOperator_multiply1 {

    public static void main(String[] args) {

        /* Verilen 3 double hakkında, (num1 , num2, num3),
            Bu üç double'ı birbiriyle çarpın ve cevabı  sonuca eşitleyin.
            Sonucu yazdırın.  */
        Scanner scan = new Scanner(System.in);
        System.out.println("3 sayı:");
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();

        int carp=a*b*c;
        System.out.println(carp);



    }
}
