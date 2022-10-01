package j13_Break_Continue;

import java.util.Scanner;

public class C03_Asal_Kontrol {
    public static void main(String[] args) {
        // Task-> girilen tamsayının asal olmasını kontrol eden code create ediniz.

        Scanner sc = new Scanner(System.in);
        System.out.println("sayı gir");
        int sayi = sc.nextInt();

        boolean asalMı = true;
        for (int i = 2; i < sayi; i++) {
            if (sayi%i==0){//eğer sayi kendisine kadar olan sayılara tam bölunuyorsa
                asalMı=false;
                break;
            }

        }
        if (asalMı){
            System.out.println("girilen sayı ASAL");
        }else System.out.println("girlen sayı asal DEGİL ");

    }
}