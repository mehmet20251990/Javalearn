package j00_Homeworks.Tasks4.tasks;

import java.util.Scanner;

public class Task09 {


    /*
     Çiftlikteki hayvanların ayaklarının toplam sayısını bulma.
     Çiftlikteki bulunun inek, koyun, tavukların ayark sayısını hesaplayalım.

     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("inek, koyun, tavuklar");
        int inek = scan.nextInt();
        int koyun = scan.nextInt();
        int tavuk = scan.nextInt();
        System.out.println("top="+(inek*4+koyun*4+tavuk*2));


    }

}
