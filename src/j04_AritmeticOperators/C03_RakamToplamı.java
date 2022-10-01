package j04_AritmeticOperators;

import java.util.Scanner;

public class C03_RakamToplamı {
    public static void main(String[] args) {

        // Kullanıcıdan alınan 3 basamaklı bir sayının rakamları toplamını print et

        Scanner scan = new Scanner(System.in);
        System.out.print("3 basamaklı bir sayı giriniz : ");
        int sayi = scan.nextInt();
        int birler = sayi % 10;
        sayi /= 10;
        int onlar = sayi % 10;
        int yüzler = sayi / 10;

        //int rakamToplamı = birler + onlar + yüzler;
        //System.out.println("rakamToplamı = " + rakamToplamı);
        System.out.println("top = " + (birler+onlar+yüzler));

    }
}
