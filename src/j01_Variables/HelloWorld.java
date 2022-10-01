package j01_Variables;

public class HelloWorld {



    public static void main(String[] args) {
        System.out.println("merhaba dünya");// bu komut konsola yazılan metni print eder
        // dan sonra yazılan ifadeler komut veya kod satırı olarak değil yorum olarak tanımlanır
        /*
        bu araya yazılan her ifade yorum satırıdır, java kod olarak derlemez.
        Çoklu satıra yorum yapmayı sağlar.
        Başarı Gayrete Aşıktır...
         */
        // imlecin olduğu satır ctrld+d ile alt satıra kopyalanır.
        System.out.println("javacan'lara selam olsun");// çalışmasını istemediğiniz kod satırının başına
        System.out.println("javacan'lara selam olsun");// çalışmasını istemediğiniz kod satırının başına
        // yazarak yoruma alabilirsin.

        /*
        TRİCK: Javada code satırı cümle(statement) sonuna mutlaka ; koyulmalı.
        code satırında kırmızı alt çizgi uyarısı "compile time error" CTE hatası uyarısı demektir.
        CTE düzeltilmeden code yazılmaz yazılan code çalışmaz.
         */

        System.out.println("Mehmet ŞİMŞEK, 32, Samsun, TMGD");

        /*
        TRİCK:
        print-> yazdırma işleminden sonraki komutu AYNI satırda devam ettirir.
        println-> yazdırma işleminden sonraki komutu bir alt satıra devam ettirir.
        Javada space yani "boşluk" bir character olarak tanımlanır. Boşluklu olarak print eder.

        */


    }


}
