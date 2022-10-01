package j12_Loops.L02_WhileLoops;

import java.util.Scanner;

public class C03_WhileLoop {
    public static void main(String[] args) {


        // TASK-> Girilen tamsayının tam bölen sayısını print eden code create ediniz...
        // 10 -> 1,2,5,10 : 10un 4 tane böleni vardır.

        Scanner sc=new Scanner(System.in);
        System.out.println("AGAM nassıng :) bir tamsayı giriyorsun : ");
        int sayi = sc.nextInt();

        int bolenSayi=1;
        int tamBolenAdedi=0;
        while (bolenSayi <= sayi){
            if (sayi%bolenSayi==0){
                tamBolenAdedi++;
            }
            bolenSayi++;
        }
        System.out.println(tamBolenAdedi);

    }
}
