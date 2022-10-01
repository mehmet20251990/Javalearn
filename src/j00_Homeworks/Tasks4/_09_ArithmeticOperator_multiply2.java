package j00_Homeworks.Tasks4;

import java.util.Scanner;

public class _09_ArithmeticOperator_multiply2 {

    public static void main(String[] args) {

    /*    Oluşturulmuş olan double'lar hakkında,
        Bu 4 doubleyi  birbiriyle çarpın ve sonuca  eşitleyin.
        Double sonucu yazdırın.   */

        Scanner scan = new Scanner(System.in);
        System.out.println("4 sayı:");
        double a=scan.nextDouble();
        double b=scan.nextDouble();
        double c=scan.nextDouble();
        double d=scan.nextDouble();

        double carp=a*b*c*d;
        System.out.println(carp);

    }
}
