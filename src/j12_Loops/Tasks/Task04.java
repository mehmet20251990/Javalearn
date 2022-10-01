package j12_Loops.Tasks;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        /*
        Girilen iki sayı arasındaki çift sayıları yanyana print eden code create ediniz.
         */

        Scanner sc= new Scanner(System.in);
        System.out.println("iki pozitif tam sayı giriniz : ");
        int sayı1=sc.nextInt();
        int sayı2=sc.nextInt();
        if (sayı1 < sayı2) {
            for (int i = sayı1; i < sayı2; i++) {
                if (i % 2 == 0) {
                    System.out.print(i);
                }
            }
        }   else {
            for (int i = sayı2; i < sayı1; i++) {
                if (i % 2 == 0) {
                    System.out.print(i);
                }
            }
        }

        //          for (int i=(a<b?a:b);i<=(a>b?a:b);i++ ){     CİNCİK CODE......
        //            System.out.print(i%2==0?i:" ");}

    }
}
