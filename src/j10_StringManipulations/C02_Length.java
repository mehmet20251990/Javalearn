package j10_StringManipulations;

public class C02_Length {
    public static void main(String[] args) {

        /*
        Length methodu girilen stringin uzunluğunu, içinde bulunan karakter sayısını return eder.
        Bütün karakterleri (boşluk vs.) sayıp adedini verir.

        */

        String str = "java çalış";
        int strKrtrSayisi= str.length(); // int type bir data verir.
        System.out.println(strKrtrSayisi); // 10
        System.out.println(str); // java çalış
        System.out.println(str.length()); // 10

        String str1="";
        System.out.println(str1.length()); // 0

        String str2=" ";
        System.out.println(str2.length()); // 1

        // String str3=null;
        // str3.concat(str1); // RTE
        // System.out.println(str3.length()); // Olmayan değer hatası verir. RTE. HİÇLİK...

        // TRİCK-> null atanan stringler String method çalışmaz.

        /* null case sensitivedir. Yani Null veya NULL yazılamaz. Bir değer değildir.
        Sadece hiçliği gösteren bir pointer(işaretçi) dir.
         */

        String name; // deklare edilmiş ama atanmamış string String method çalışmaz CTE verir.
        // name.concat(str1); // CTE

    }
}
