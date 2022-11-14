package j23_Varargs_StringBuilder.StringBuilder;

import java.time.LocalTime;

public class C01_StringBuilder {
     /*
String = > daha yavas ,Immutable==> degisemez,
String'lerde method kullanarak String'i degistirmek atama yapmadan mumkun degildir.

1) Java pass-by-value kullanir
2) String Class'i immutable Class'dir.

 StringBuffer =mutable==>degisebilir,less efficient/ daha yavas ,
 StringBuffer synchronized,thread safe.

StringBuilders = mutable==>degisebilir ,
not senkronized/not thread safe,fakat more efficient(daha etkili,ve hizli )

1) String Class'i immutable(Degistirilemez)dir. Java mutable Stringler uretebilmemiz icin
StringBuilder isimli bir class uretmistir.
2) Java'da StringBuilder ile hemen hemen ayni isi yapan bir de StringBuffer classi vardir.
"StringBuffer" Class'i StringBuilder Class'indan daha once uretilmistir.
"StringBuffer" yavas calisan bir class'dir, "StringBuilder" ise hizli calisir.
"StringBuffer"  "synchronize" islemlerini yapabilir, ama "StringBuilder" yapamaz.
3) Ayni anda bir cok isin yapilmasina "multi threading" denir. "multi" = Cok, "thread"= Yapilan islerin herbiri
Multi threading varsa, bu islerin siraya konulmasi lazim.Islerin siraya konulmasina "synchronization" denir.
    */
     public static void main(String[] args) {
         String str = "JavaCAN";
         System.out.println("meth öncesi str = " + str); // "JavaCAN"

         strBirlestir(str);
         System.out.println("meth sonrası str = " + str); // "JavaCAN" -> immutable

         // Task -> 50000 tekrarlı bir loop ile String ve StringBuilder obj run time sürelerini karşılaştır

         String str1= "";
         StringBuilder sb1= new StringBuilder("");

         LocalTime str1Basla = LocalTime.now(); // str1 döngü başlama zamanı
         System.out.println("str1basla = " + str1Basla);
         for (int i = 0; i<50000; i++) {
             str1+=i;
         }
         LocalTime str1Bitti = LocalTime.now(); // str1 döngü bitiş zamanı
         System.out.println("str1Bitti = " + str1Bitti);

         LocalTime sb1Basla = LocalTime.now(); // sb1 döngü başlama zamanı
         System.out.println("sb1basla = " + sb1Basla);
         for (int i = 0; i<50000; i++) {
             sb1.append(i);
         }
         LocalTime sb1Bitti = LocalTime.now();// sb1 döngü bitiş zamanı
         System.out.println("sb1Bitti = " + sb1Bitti);

     } // main sonu

    public static void strBirlestir(String str) {
        System.out.println(str+" Selamlar");
    }

}
