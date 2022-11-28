package J99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C06_distinct {
    public static void main(String[] args) {

        List<String> menu = new ArrayList<String>(Arrays.asList("küşleme","küşleme","küşleme","soğanlı","soğanlı","trileçe"
                ,"bicibici","büryan","melemen","cacıx","kokoreç","yağlama","güveç","arabaşı","tantuni","et"));
        System.out.println(menu);
        System.out.println("     ******     ");

        alfBkTkszPrint(menu);
        System.out.println();
        chrSysTersSıraPrint(menu);
        System.out.println();
        chrSysBkSıraPrint(menu);
        System.out.println();
        sonHrfTrsPrint(menu);
        System.out.println();
        chrSysCiftKrBkTksPrint(menu);
    }
    //distinct() => Bu method tekrarlı elemanları sadece bir kere akısa sokar.
    // Bu akışın farklı elemanlarından (Object.equals (Object) 'e göre) oluşan bir akış döndürür.
    // Sıralı akışlar için, farklı elemanın seçimi sabittir
    // (yinelenen öğeler için, karşılaşma sırasında ilk görünen öğe korunur.)
    // Sırasız akışlar için, herhangi bir kararlılık garantisi verilmez. Stream return eder.

    // Task : List elemanlarini alafabetik buyuk harf ve  tekrarsiz print ediniz.
    public static void alfBkTkszPrint(List<String>menu) {
        menu.stream().map(String::toUpperCase).sorted().distinct().forEach(t->System.out.print(t+" "));
    }

    // Task : list elelmanlarinin character sayisini ters sirali olarak tekrarsiz print ediniz.
    public static void chrSysTersSıraPrint(List<String>menu) {
       menu.stream().map(String::length).sorted(Comparator.reverseOrder()).distinct().forEach(t->System.out.print(t+" "));
    }
    public static void chrSysBkSıraPrint(List<String>menu) {
        menu.stream().sorted(Comparator.comparing(String::length)).forEach(t->System.out.print(t+" "));
    }

    // Task : list elemanlarinin son harfine gore ters sirali print ediniz.
    public static void sonHrfTrsPrint(List<String>menu) {
        menu.stream().sorted(Comparator.comparing(t-> t.toString().charAt(t.toString().length()-1)).reversed())
                .forEach(t->System.out.print(t+" "));
    }

    // Task : listin elemanlarin karakterlerinin cift sayili karelerini hesaplayan ve karelerini tekrarsiz buyukten
    // kucuge sirali  print ediniz...
    public static void chrSysCiftKrBkTksPrint(List<String>menu) {
        menu.stream().map(String::length).filter(C01_LambdaExpression::ciftMi).map(t -> t*t)
                .sorted(Comparator.reverseOrder()).distinct().forEach(t->System.out.print(t+" "));

        menu.stream().//akısa alndı
                map(t -> t.length() * t.length()).//akısdaki string elemanları boyutlarının karesine update edildi
                filter(C01_LambdaExpression::ciftMi).//cift elelmalar filtrelendi
                distinct().//tekrarsız yapıldı
                sorted(Comparator.reverseOrder()).//ters b->k sıra yapıldı
                forEach(C01_LambdaExpression::yazdir);// print edildi
    }
}
