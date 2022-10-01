package j19_StaticVariable;

/*
        1.Static blok yapıları static var.ları değer ataması (update) için kullanılır.
        2.Static blok class oluşturulduğunda bütün meth.lardan (main meth. dahil) önce çalışır.
        3.Birden fazla static blok varsa yukarıdan aşağıya sıralama ile çalışır.
         */

public class C02_StaticBlok {

    // önce static bloklar yukarıdan aşağı, sonra main method ve diğerleri çalışır...
    static String isim= "Mehmet";

    static{ // 1. bu çalışır
        System.out.println("1. static blok çalıştı");
        isim="Dilek Hanım";
        System.out.println(isim);
    }

    public static void main(String[] args) { // 3. bu çalışır

        System.out.println("main meth başladı");
        isim="Kerim Bey";
        System.out.println(isim);
        System.out.println("main meth bitti");
    }
    static{ // 2. bu çalışır
        System.out.println("2. static blok çalıştı");
        isim="Dilek JavaCAN";
        System.out.println(isim);
    }

}
