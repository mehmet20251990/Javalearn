package j10_StringManipulations;

public class C09_Replace_ReplaceAll {
    public static void main(String[] args) {

        /** replace()
         * Metin icerisindeki karakter ya da bir parcasinin, istenilen karakter ya da
         * metinle degistirilmesini (update -set) saglar. Sonuc String'dir..
         */
        String str = "JavaCAN'lara selam olsun java ile bolcana offer";
        System.out.println(str.replace('a', '@')); // a'lar @ ile yer değiştirir.
        System.out.println(str.replace("can", "kan"));

        /** ReplaceFirst
         * Replace ile aynı sadece ilk bulunanı değiştirir
         */
        System.out.println(str.replaceFirst("a", "@")); // sadece ilk a'yı değiştirir.

        // replaceAll() method u replace() methoduna benzer ama 2 fark vardır
        //1-replace() methodu char kabul eder ama replaceAll kabul etmez
        // 2-replaceAll() method u regex kullanımına izin verir (Regular Expressions)

        //(Regular Expressions)
        //   \\s bosluk (
        //   \\S bosluk disindaki tum karakterler
        //   \\w harfler ve rakamlar (a z A Z, 0 9)
        //   \\W harfler ve rakamlar disindaki tum karakterler
        //   \\d rakamlar 0 9
        //   \\D rakamlar disindaki tum karakterler

        str = "    JavaCAN'lara selam olsun :) java ile 123456789 offer ***    ";

        System.out.println(str.replaceAll("\\s", "+")); // ++++JavaCAN'lara+selam+olsun+:)+java+ile+123456789+offer+***++++
        System.out.println(str.replaceAll("\\S", "+")); //     ++++++++++++ +++++ +++++ ++ ++++ +++ +++++++++ +++++ +++
        System.out.println(str.replaceAll("\\w", "+")); //     +++++++'++++ +++++ +++++ :) ++++ +++ +++++++++ +++++ ***
        System.out.println(str.replaceAll("\\W", "+")); // ++++JavaCAN+lara+selam+olsun++++java+ile+123456789+offer++++++++
        System.out.println(str.replaceAll("\\d", "+")); // ++++JavaCAN+lara+selam+olsun++++java+ile+123456789+offer++++++++
        System.out.println(str.replaceAll("\\D", "+")); // +++++++++++++++++++++++++++++++++++++++++123456789++++++++++++++

        // Task-> girilen ismini soyismini ve 16 haneli kredi kartı no bilgilerini aşağıdaki formatta print et.
        // isim-soyisim : M***** Ş*****
        // kart no : **** **** **** 1234

        String isim = "Çigdem";
        String soyad = "Şen";
        String kartNo = "1234567890123456";
        String yeniİsim = isim.charAt(0)+isim.substring(1).replaceAll("\\w","*");
        String yeniSoyİsim = soyad.charAt(0)+soyad.substring(1).replaceAll("\\w","*");
        String yeniKartNo = " **** **** **** "+ kartNo.substring(12);

        System.out.println(yeniİsim + yeniSoyİsim + yeniKartNo);


    }
}
