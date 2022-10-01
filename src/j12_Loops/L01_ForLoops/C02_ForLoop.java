package j12_Loops.L01_ForLoops;

import java.util.Scanner;

public class C02_ForLoop {
    public static void main(String[] args) {
        // TASK-> Girilen sayıdan 100e kadar 4un katı tamsayıları print et
       Scanner sc = new Scanner(System.in);
       int sayı= sc.nextInt();

       if (sayı>100){
           System.out.println("yanlış girdin");
       }else {
           for (int i=sayı; i<100; i++){
               if (i%4==0){
                   System.out.print(i+" ");
               }
           }
       }

    }
}
