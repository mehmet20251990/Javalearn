package J99_Lambda;

import java.util.*;
import java.util.stream.Stream;

public class C08_limit {
    public static void main(String[] args) {
        //limit(a) akısdan cıkan elemanları a parametresine gore ilk a kadar elamanını alır.

        List<String> menu = new ArrayList<String>(Arrays.asList("küşleme", "küşleme", "küşleme", "soğanlı", "soğanlı", "soğanlı", "trileçe", "bicibici", "büryan", "welemen", "cacix", "kokerç", "yağlama", "güveç", "arabAşı", "tantuni"));
        charSayisiEnBykElPrint( menu);
        System.out.println("\n   ***   ");
    }//main sonu
    // Task : Karakter sayisi en buyuk elemani yazdiriniz.
    public static  void charSayisiEnBykElPrint(List<String> menu){

        Stream<String> enBykKarktr= menu.
                stream().
                sorted(Comparator.comparing(String::length).reversed()).
                limit(1);//akısdaki ilk 1 elelman alındı
        // System.out.println(enBykKarktr);//java.util.stream.SliceOps$1@6e8dacdf->limit meth bir stream yaı akıs(birden çok eleman) return eder
        //dolaysıyle limit cıktısı doprudan sout ile print edilemez.limit çıktısı list veya array gibi bir coll. atanmalı
        System.out.println(Arrays.toString(enBykKarktr.toArray()));//java.util.stream.SliceOps$1@6e8dacdf

        menu.stream().
                sorted(Comparator.comparing(String::length).reversed()).
                limit(1).forEach(t->System.out.print(t+" "));;

        Object[] arrr=menu.stream().
                sorted(Comparator.comparing(String::length).reversed()).
                limit(1).toArray();
        System.out.println(Arrays.toString(arrr));

        Optional<String> enBykKarktr2= menu.stream().
                sorted(Comparator.comparing(String::length).reversed()).
                findFirst();
    }
}