package j10_StringManipulations;

public class C11_ValueOf_parse {
    public static void main(String[] args) {

        // Integer.valueOf() rakamlarla olusturulan String'leri sayiya donusturur. Boylece rakamlarla olusturulan
        // Stringlerle matematiksel islemler yapabilmemizi saglar.

        //valueOf() hem Integer wrapper classinin icinde hem de String'in icinde var. Integer wrapper classinin icinde
        //olan valueOf() methdou String'i integer'a cevirir. String'in icindeki valueOf() methodu integer'i String'e cevirir.

        // Task -> string type verilen iki adet bağış miktarını toplayan code yaz

        String bagis1="1500";
        String bagis2="2500";

        int bagışDegeri1= Integer.valueOf(bagis1); // sayı değerini int a çevirdi. bagışDegeri1 e atadı.
        int bagışDegeri2= Integer.valueOf(bagis2); // sayı değerini int a çevirdi. bagışDegeri2 e atadı.

        System.out.println(("Toplam bağış: " + (bagışDegeri1 + bagışDegeri2))); // 4000

        int fetih = Integer.valueOf("1453");
        System.out.println(fetih); // 1453

        System.out.println(Integer.parseInt(bagis1) + Integer.parseInt(bagis2)); // 4000 (bu da stringi int e çevirir ve atar.

        int tc=123456;
        String strTC = String.valueOf(tc);
        System.out.println(strTC); // 123456
        System.out.println(strTC + tc); //123456123456

        // int fiyat = "$150";
        // int yeniFiyat = Integer.valueOf(fiyat);
        // System.out.println(yeniFiyat); // RTE verir. Sadece rakam olursa int a çevirir.



    }
}
