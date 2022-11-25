package J99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C05_sorted {
    public static void main(String[] args) {
        List<Integer> sayi = new ArrayList<>(Arrays.asList(1, 3, 5,4,6,12,8));
        //Lambda -> Stream API
        System.out.println(sayi);
        System.out.println("\n *****  ");

        ciftKareKbPrint(sayi);
        System.out.println();
        tekKareBkPrint(sayi);


    }
    //sorted() => Doğal düzene göre sıralanmış, bu akışın elemanlarında oluşan bir akış döndürür.
   //Sorted() methodu tekrarlı kullanılırsa en son kullanılan aktif olur.

    // Task : list'in cift  elemanlarinin karelerini  kucukten buyuge print ediniz.
    public static void ciftKareKbPrint(List<Integer>sayi){
        sayi.stream().filter(C01_LambdaExpression::ciftMi).map(t->t*t).sorted().forEach(C01_LambdaExpression::yazdir);
    }
    //reverseOrder() => Comparator Class'ının bir methodudur. Doğal sıralamanın tersini (büyükten küçüğe) uygulayan
    // bir Comparator (karşılaştırıcı) return eder.

    // Task : list'in tek  elemanlarinin kareleri ni buykten kucuge  print ediniz.
    public static void tekKareBkPrint(List<Integer>sayi){
        sayi.stream().filter(t-> t%2==1).map(t->t*t).sorted(Comparator.reverseOrder()).forEach(C01_LambdaExpression::yazdir);
    }

}
