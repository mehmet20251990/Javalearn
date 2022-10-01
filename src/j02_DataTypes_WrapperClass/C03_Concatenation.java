package j02_DataTypes_WrapperClass;

public class C03_Concatenation {
    public static void main(String[] args) {

        String ad="Mehmet";
        String soyad="ŞİMŞEK";

        int a=7;
        int b=11;

        // Birden çok string variable ile farklı data type variable'lar + ile işleme alınırsa
        // java birleştirme yaparak yeni bir String oluşturur. Stringten sonra gelen HERŞEY String olur...
        // TRICK :) Bir aritmetik işlem içinde String kullanılırsa, aritmetik işlem önceliğine göre
        // işlem yapılıp String variable'a Concatenation yapılır.

        System.out.println(ad+soyad+a+b); // MehmetŞİMŞEK711

        System.out.println(a+ad+soyad+b);// 7MehmetŞİMŞEK11

        System.out.println(a+b+ad+soyad);// 18MehmetŞİMŞEK

        System.out.println(" "+a+b);// (boşluk)711

        System.out.println(ad+soyad+(a+b));// MehmetŞİMŞEK18 -> Önce özel yapılar işleme alınır.

        System.out.println((a+b)+ad+soyad);// 18MehmetŞİMŞEK

        System.out.println(ad+(a-b)+(a-b));// Mehmet-4-4

        System.out.println(ad+((a-b)+(a-b)));// Mehmet-8

        char ch='1';
        System.out.println(ad+ch); // Mehmet1

        System.out.println(a+ch+ad); // 56Mehmet -> ASCII değeri ile toplar.

        System.out.println(ad+(ch+b)); // Mehmet60

        System.out.println(a+ad+ch); // 7Mehmet1

        /* TRICK -> char data turu isleme girdigi variables'in turune gore farkli işlem yapar
  eger isleme girdigi variables aritmetik bir islemse  ascii değeri ile işlem yapar ->
 */

    }
}
