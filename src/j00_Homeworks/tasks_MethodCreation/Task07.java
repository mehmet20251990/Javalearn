package j00_Homeworks.tasks_MethodCreation;

import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {

    /*
    Üç sayı arasındaki en küçük sayıyı bulan  method create ediniz

    Test data:
    12,24,34

    Beklenen Çıktı:
    12
    */
        Scanner scan = new Scanner(System.in);
        System.out.println("Karşılaştırmak için 3 sayı giriniz :");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        int sayi3 = scan.nextInt();
        karsılastırma((int) sayi1, (int) sayi2, (int) sayi3);


    }

    public static void karsılastırma(int sayi1, int sayi2, int sayi3) {
        if (sayi2 < sayi1) {
            // sayi2 < sayi3 ? "küçük "+sayi2 : "küçük " +sayi3
            if (sayi2 < sayi3) {
                System.out.println("en küçük sayı " + sayi2);
            } else {
                System.out.println("en küçük sayı " + sayi3);
            }

        }else {
            // sayi1 < sayi3 ? "küçük "+sayi1 : "küçük " +sayi3
            if (sayi1 < sayi3) {
            System.out.println("en küçük sayı " + sayi1);
        } else {
            System.out.println("en küçük sayı " + sayi3);
        }

        }

    }
}

