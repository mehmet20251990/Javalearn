package j03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class C01_ScannerClass {
    public static void main(String[] args) {

        // Kullanıcıdan veri almak için şu 3 adım takip edilir:
        // 1. -> Scanner class'dan obje create edilir.

        Scanner scan = new Scanner(System.in); // Scanner classından scan isminde değerini
                                               // System içinden alan bir objedir.
        // 2. -> Kullanıcıdan istenen veri için bildirimde bulunulur. --> sout("...");

        System.out.println("adınızı giriniz:");

        // 3. -> Kullanıcının girdiği veri data tipine göre bir variable atanır.

        String isim=scan.nextLine(); // Kullanıcıdan gelen String Type nde isim verisi scan objsini
                                     // nextline() methodu ile atandı.
        System.out.println("isim = " + isim);

        // TASK -> Kullanıcının girdiği değere göre kare alanı ve çevresini hesaplayan bir kod create et.


        System.out.println("Karenin kenarının uzunluğunu giriniz ");
        int kenar=scan.nextInt();
        System.out.println("Alan="+(kenar*kenar)+" Çevre="+(kenar*4));

        // TASK -> Kullanıcının günde içtiği çay ve kullandığı şeker değerine göre bir yılda
        // kaç kg şeker kullandığını hesaplayan bir code create et.
        // 1 şeker = 1.7 gr
        // Örnek : Input : çay sayısı = 10 , şeker sayısı = 2
        //         Output: Uılda 12.41 kg şeker kullanıyorsunuz.

        System.out.println("Günlük içtiğiniz çay sayısı:"); // Çay için 2. adım
        int caySayisi=scan.nextInt(); // Çay için 3. adım

        System.out.println("Şeker sayısı:"); // Şeker için 2. adım
        int sekerSayisi=scan.nextInt(); // Şeker için 3. adım

        System.out.println("Yıllık Şeker Tüketimi:"+(caySayisi*sekerSayisi*1.7*365)/1000+" kg şeker tüketiyorsunuz");

        System.out.println("isminiz:"); // 1. adım
        char ch= scan.nextLine().charAt(0); // 2. adım
        System.out.println("isminin ilk harfi= " + ch); // kullanıcıdan gelen string ifadenin 0. index yani ilk
                                                        // karakterini alır.

        String isimm=scan.nextLine();//kullanıcını girdiği tüm satırı isim'e atar
        String ad = scan.next();//kullanıcını girdiği ilk ifadeyi  ad'e atar
        System.out.println("ad = " + ad);
        System.out.println("isim = " + isimm);


    }
}
