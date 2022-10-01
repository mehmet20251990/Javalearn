package j00_Homeworks.tasks3;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {
        /*
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Vize1,2,Final:");
        Integer a=scan.nextInt();
        Integer b=scan.nextInt();
        Integer c=scan.nextInt();

        System.out.println("Not = " + ((a+b)/2*0.3+c*0.7));


    }
}
