package j08_ifStatement_Ternary_Operator;

import java.util.Scanner;

public class C08_NestedTernaryOperator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

/*
 Kullanıcıdan alacağı ürün miktarını ve ürünün birim fiyatını alın. Eğer urun miktarı 100 den fazla ise
       %33  indirim yapıp  ödemesi gereken toplam miktarı print eden code create ediniz.
 */
        System.out.println("ürün miktarı: ");
        int urun = sc.nextInt();
        System.out.println("ürün fiyatı: ");
        int fiyat = sc.nextInt();

       // System.out.println(urun > 100 ? (urun * fiyat * 0.67) : urun * fiyat);

        double fatura= urun > 100 ? (urun * fiyat * 0.67) : urun * fiyat;
        System.out.println("fatura = " + fatura);

    }
}
