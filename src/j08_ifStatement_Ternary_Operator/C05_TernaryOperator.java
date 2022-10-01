package j08_ifStatement_Ternary_Operator;

import java.util.Scanner;

public class C05_TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("sayı gir: ");
        int sayı = sc.nextInt();

        // Task-> "girilen tamsayı çiftse yarısını değilse, tek olduğu için yarısı tam sayı değildir" print et

        System.out.println(sayı%2==0 ? sayı/2 : "tek olduğu için yarısı tamsayı değildir");

        //int sonuc=agaSayisi%2==0 ? agaSayisi/2 : "girilen sayı tek oldugu için yarısı tamsayı değildir";

        // TRİCK-> ternary iki durum için farklı data type çıktısı veriyorsa variable atama yapmadan sout yapılmalı
        // ya da ternary çıktısı aynı data type serializable edilmeli.
    }
}
