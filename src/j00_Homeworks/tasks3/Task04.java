package j00_Homeworks.tasks3;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        /* TASK ->
        Clarusway spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini hesplayıp print eden code create ediniz.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Ad Soyad, ,Yaş, kilo, Boy, Süre:");
        String adSoyad=scan.nextLine();
        Integer yas=scan.nextInt();
        Integer kilo=scan.nextInt();
        Integer boy=scan.nextInt();
        Integer ay=scan.nextInt();
        System.out.println("Ücret = " + (ay*20)+"$");


    }
}
