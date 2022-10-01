package j00_Homeworks.WhileLoopsTask;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        /*
    task -> 0 (sıfır) girilene kadar girilen tum sayıların adedini ve toplamını print eden code create edinz.
    */
        Scanner sc = new Scanner(System.in);
        int countadet = 1;
        int toplamSayi = 0;
        System.out.println("bir sayı giriniz ");
        int girSayi = sc.nextInt();
        while (girSayi != 0) {
            countadet++;
            toplamSayi += girSayi;
            girSayi = sc.nextInt();
        }System.out.println("toplam sayi = " + toplamSayi + " Sayı adedi = " + countadet);
    }
}
