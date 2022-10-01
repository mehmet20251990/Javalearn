package j00_Homeworks.tasks5;

import java.util.Scanner;

public class _17_ComparisonOperators_equal_equal {

    public static void main(String[] args) {

        /*  Verilen iki tane int (num1, num2) ile ilgili,
            Eger num1  num2 ya  eşitse console'da true yazsın.
            Değilse false  */

        Scanner scan = new Scanner(System.in);
        int x=scan.nextInt();
        int y=scan.nextInt();

        boolean krstm= x==y;

        System.out.println(krstm);

        System.out.println("x, y ye eşit -> "+ (x==y));


    }
}
