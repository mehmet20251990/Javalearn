package j00_Homeworks.Tasks4.tasks;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {
        /*
         * Kullanicidan uc basamakli bir sayi alin
         * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
         *
         * Ornek : Inputs : 853
         * Output : Girdiginiz sayinin birler basamagi : 3
         *          Girdiginiz sayinin onlar basamagi : 5
         *          Girdiginiz sayinin yuzler basamagi : 8
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("sayı gir");
        int x= scan.nextInt();
        int brler= x % 10;
        int onlr= (x/10)%10;
        int yzler= x/100;
        System.out.println(x+"\n"+yzler+"\n"+onlr+"\n"+brler);


        System.out.print("3 basamaklı sayı giriniz : ");
        int p = scan.nextInt();
        System.out.println("Girdiğiniz sayının yüzler basamağı = " + (p/100));
        System.out.println("Girdiğiniz sayının onlar basamağı = " + (((p%100) - (p%10))/10));
        System.out.println("Girdiğiniz sayının birler basamağı =" + (p%10));


        System.out.print("3 basamaklı bir sayı giriniz : ");
        int sayi = scan.nextInt();
        // 1 ler basamgı-> bir sayının 10 bolumunden kalan 1 ler basmagıdır..
        int birler = sayi % 10;//sayının birler basamagı
        sayi /= 10;// sayı 10 bolumunden bolumu verir 853/10->85
        int onlar = sayi % 10;// 85in 10 bolumunden kalan->5
        int yüzler = sayi / 10;// 85'in 10' a bolumu ->8
        System.out.println("Girdiginiz sayinin birler basamagi :"+birler+"\nGirdiginiz sayinin onlar basamagi : "+onlar
                +"\nGirdiginiz sayinin yuzler basamagi :"+yüzler);


    }
}
