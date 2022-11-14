package j00_Homeworks.AListTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task12_Manav {
    static Scanner scan = new Scanner(System.in);
    static double toplamUcret;

    public static void main(String[] args) {
        /* TASK :
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
         * */
        menu();
    }
    public static double menu() {
        List<String> urun = new ArrayList<>(List.of("Elma", "Armut", "Domates", "Biber", "Patlıcan"));
        List<Integer> fiyat = new ArrayList<>(Arrays.asList(10, 20, 15, 20, 25));

        System.out.println("-----Manava Hoş Geldiniz------");
        for (int i = 0; i < urun.size(); i++) {
            System.out.print(i + 1 + " ");
            System.out.printf("%8s", urun.get(i));
            System.out.print(" ----> ");
            System.out.printf("%3d Tl\n", fiyat.get(i));
        }
        System.out.println("Almak istediğiniz ürünün sırasını giriniz");
        int urunSec = scan.nextInt();
        if (urunSec < 1 || urunSec > 5) {
            System.out.println("Geçersiz giriş yaptınız!...");
            menu();
        } else {
            System.out.println(urun.get(urunSec - 1) + " seçtiniz! Bu üründen kaç kilo almak istiyorsunuz : ");
            double kilo = scan.nextDouble();
            if (kilo < 0) {
                System.out.println("Geçersiz giriş yaptınız!...");
                menu();
            } else {
                toplamUcret += fiyat.get(urunSec - 1) * kilo;
                devammi();
            }
        }
        return toplamUcret;
    }

    public static void devammi() {
        System.out.println("Toplam borcunuz " + toplamUcret + " Tl. Alışverişe devam etmek için -1- Çıkış için -2- seçiniz : ");
        int secim = scan.nextInt();
        switch (secim) {
            case 1:
                menu();
                break;
            case 2:
                System.out.println("Alışverişi tamamladınız Toplam borcunuz " + toplamUcret + " tl. Yine bekleriz");
                break;
            default:
                System.out.println("Geçersiz işlem yaptınız!..");
                devammi();
                break;
        }
    }
}