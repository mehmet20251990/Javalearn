package j00_Homeworks.WhileLoopsTask;

import java.util.Random;
import java.util.Scanner;

public class Task06_sayiBulmaca {


    public static void main(String[] args) {
        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin

        Scanner scan = new Scanner(System.in);

        int javaSayi = (int) ((Math.random()*100)+1);
        int tahminSayisi = 1;
        System.out.print("Sayıyı tahmin ediniz : ");
        int tahmin = scan.nextInt();
        while (javaSayi != tahmin) {
            System.out.println(tahmin<javaSayi ? "büyült" : "küçült");
            tahmin = scan.nextInt();
            tahminSayisi++;

            /*if (tahmin > javaSayi) {
                System.out.print("Büyük tahmin ettin, tahmin sayısını düşürün : ");
                tahmin = scan.nextInt();
                tahminSayisi++;
            }else {
                System.out.print("Küçük sayı tahmin ettin, tahmin sayısını artırın : ");
                tahmin = scan.nextInt();
                tahminSayisi++;
            }*/
        }System.out.println(tahminSayisi + " defa da buldunuz ");
    }

}
