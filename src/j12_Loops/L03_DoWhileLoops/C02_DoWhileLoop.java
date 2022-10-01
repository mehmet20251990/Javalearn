package j12_Loops.L03_DoWhileLoops;

import java.util.Scanner;

public class C02_DoWhileLoop {
    public static void main(String[] args) {

        // TASK-> Girilen sayı 17den küçük ise kazandınız büyük ise kaybettiniz print eden code create ediniz.

        Scanner sc=new Scanner(System.in);
        System.out.println("AGAM nassıng :) bir tamsayı giriyorsun : ");
        int sayi = sc.nextInt();
        if (sayi < 17) {
            do {
                System.out.println("kazandınız...");
                sayi++;
            } while (sayi < 17) ;  System.out.println("kaybettiniz");
        }else System.out.println("kaybettiniz");
    }
}
