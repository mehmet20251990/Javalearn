package j12_Loops.L02_WhileLoops;

import java.util.Scanner;

public class C02_WhileLoop {
    public static void main(String[] args) {

        // TASK-> Girilen tamsayının rakamları toplamını print eden code create ediniz.

        Scanner sc=new Scanner(System.in);
        System.out.println("AGAM nassıng :) bir tamsayı giriyorsun : ");
        int sayi = sc.nextInt();

        rakamTopla(sayi);
    } // main sonu
    private static int rakamTopla(int sayi) {

        int rakamToplamı=0;
        while (sayi>0) {
            rakamToplamı+=sayi% 10;
            sayi /= 10;
        }
        return rakamToplamı;
    }
}
