package J99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class C04_reduce {
    /*
    reduce()-->azaltmak ... bir cok datayi tek bir dataya(max min carp top vs islemlerde) cevirmek icin kullanilir.
kullanımı yaygındır pratiktir.
    Bir Stream içerisindeki verilerin teker teker işlenmesidir. Teker teker işleme sürecinde, bir önceki adımda elde edilen
sonuç bir sonraki adıma girdi olarak sunulmaktadır. Bu sayede yığılmlı bir hesaplama süreci elde edilmiş olmaktadır.
    reduce metodu ilk parametrede identity değeri, ikinci parametrede ise BinaryOperator türünden bir obj kullanılır.
    reduce işleminde bir önceki hesaplanmış değer ile sıradaki değer bir işleme tabi tutulmaktadır.
    İşleme başlarken bir önceki değer olmadığı için bu değer identity parametresinde tanımlanmaktadır.
*/
    public static void main(String[] args) {

        List<Integer> sayi = new ArrayList<>(Arrays.asList(1, 3, 5,4,6,12,8));
    //Lambda -> Stream API
        System.out.println("\n *****  ");
        ciftKareMaxPrint(sayi);//Optional[144]
        elTopla(sayi);
        ciftElCarpPrint(sayi);
        minBul(sayi);
        ydrtBykEkTkPrint(sayi);
    }
    // Task : List'in cift elemanlarin karelerinin en buyugunu print ediniz
    public static void ciftKareMaxPrint(List<Integer> sayi){
        Optional<Integer>maxEleman = sayi.stream().filter(C01_LambdaExpression::ciftMi).map(t -> t*t).reduce(Math::max);
                                    //reduce(Integer::max)-> specific class daha hızlı çalışır...
             // çift filtrelenen ve karesi alınarak update edilen akış elemanları max elemana göre reduce->azaltıldı.
        // filter işlemi null değer verme riskine karşı Optional class type data casting yapıldı...
        System.out.println(maxEleman);

        System.out.println(sayi.stream().filter(C01_LambdaExpression::ciftMi).map(t -> t * t).reduce(Math::max));
        // Direkt olarakta yazdırabiliriz...
    }

    // Task : List'teki tum elemanlarin toplamini yazdiriniz.
    public static void elTopla(List<Integer> sayi){
        System.out.println(sayi.stream().reduce(Integer::sum));
        Optional<Integer> toplam = sayi.stream().reduce(Integer::sum);
        System.out.println(toplam);
        System.out.println("Lambda exp.: "+sayi.stream().reduce(0,(a,b)->a+b));
    /*
        a : ilk değerini her zaman atanan identity değerden alır
        b : değerini her zaman stream() akısdan alır.
        a ilk değerden sonraki değerlerini action(işlem body)'den alır
    */
    }
   // Task : List'teki cift elemanlarin carpimini  yazdiriniz.

    public static void ciftElCarpPrint(List<Integer> sayi){

        System.out.println(sayi.stream().filter(C01_LambdaExpression::ciftMi).reduce(Math::multiplyExact));

        System.out.println(sayi.stream().filter(C01_LambdaExpression::ciftMi).reduce(1, (t, u) -> t * u));
        //Başlangıç değeri belli olduğu zaman null alma ihtimali olmadığı için Optional değil normal değerini print eder.

    }
    // Task : List'teki elemanlardan en kucugunu 4 farklı yontem ile print ediniz.

    public static void minBul(List<Integer> sayi){
        System.out.println(sayi.stream().reduce(Math::min));
        System.out.println(sayi.stream().reduce(Integer::min));
        System.out.println(sayi.stream().reduce(C04_reduce::byhalukMinBul));
        System.out.println(sayi.stream().reduce(Integer.MAX_VALUE, (t, u) -> t < u ? t : u));


    }
    public static int byhalukMinBul(int a, int b){
        return a<b? a : b;
    }

    // Task : List'teki 24'ten buyuk en kucuk tek sayiyi print ediniz.
    public static void ydrtBykEkTkPrint(List<Integer> sayi){
        System.out.println(sayi.stream().filter(t -> t > 24 && t % 2 == 1).reduce(Integer::min));
        // System.out.println(sayi.stream().filter(t -> t > 24 && C01_LambdaExpression::ciftMi)-> CTE : exp. ve meth
        // ref aynı parametrede olamaz
    }



}
