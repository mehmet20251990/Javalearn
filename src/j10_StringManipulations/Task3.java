package j10_StringManipulations;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        //"Alamanya" Stringindeki ikinci 'a' caharacterinin indexini bulunuz.

        String str = "Alamanya";
        System.out.println(str.indexOf('a', str.indexOf('a') + 1));

       /*
          Task->
        Girilen iki kelimeden ilki çift sayıda ka+rakter içeriyorsa 2. kelimeyi 1. kelimenin ortasına print eden
        ilk kelime tek sayıda karakter içeriyorsa "kelime2 kelime1 eklenemez" print eden code create ediniz
        name1= mehmet
        name2= ahmet
        Print ==> mehahmetmet
      */
        Scanner sc = new Scanner(System.in);
        System.out.println("iki isim gir : ");
        String name1 = sc.nextLine();
        String name2 = sc.nextLine();

        if (name1.length()%2 == 0) {
            System.out.println(name1.substring(0, name1.length()/2) + name2 + name1.substring(name1.length()/2, name1.length()));
        }else {
            System.out.println("kelime 2 , kelime 1 e eklenmez");
        }

        /* Task->
           Girilen ad soyad bilgilerinin ilk harflerini buyuk harf print eden code create ediniz..
        */
        System.out.println("Adınızı Giriniz : ");
        String ad = sc.nextLine();
        System.out.println("Soyadınız Giriniz: ");
        String soyad= sc.nextLine();

        System.out.println(ad.substring(0,1).toUpperCase()+ad.substring(1));
        System.out.println(soyad.substring(0,1).toUpperCase()+soyad.substring(1));

    }
}
