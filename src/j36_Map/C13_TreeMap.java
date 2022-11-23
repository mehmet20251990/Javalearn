package j36_Map;

import java.util.HashMap;
import java.util.TreeMap;

public class C13_TreeMap {
    public static void main(String[] args) {
        /*
        TreeMap->
        1- TreeMap keylerde null değer tanımlanamaz. Fakat valuelerde null değer tanımlanabilir
        2- TreeMap elemanlarının key NATUREL ORDER'a göre tanımlanır
        3- TreeMap synchronized ve thread-safe değildir
        4- TreeMap en yavaş map türüdür. app hızı için kullanırken çoook dikkat edilmeli
         */
        TreeMap<Integer,String> tm = new TreeMap<>();
        tm.put(101,"Uğur");
        tm.put(103,"Ali");
        tm.put(102,"Veli");
        tm.put(105,"Emine");
        tm.put(104,"Fatih");
        System.out.println(tm);//{101=Uğur, 102=Veli, 103=Ali, 104=Fatih, 105=Emine}

        // tm.put(null,"Fatih"); //RTE - NullPointerException (Null doğal sıralamada olamaz...
        tm.put(104,"Hüma"); //Update edildi
        tm.put(106, null); //Update edildi
        tm.put(107, null); //Update edildi
        System.out.println(tm); //{101=Uğur, 102=Veli, 103=Ali, 104=Hüma, 105=Emine, 106=null, 107=null}

        HashMap<String, String> hm = new HashMap<>();
        hm.put("Amazon", "296 Euro");
        hm.put("Ebay", "234 Euro");
        hm.put("Saturn", "300 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple store", "333 Euro");
        hm.put("MediaMarkt", "183 Euro");
        System.out.println("hm = " + hm);

        TreeMap<String, String> tm1 = new TreeMap<>(hm);//hm TreeMap e atanarak convert edildi
        //TreeMap<String, String> tm2 = hm;//CTE->dataType miss-Match
        System.out.println("tm1 = " + tm1);//{Amazon=296 Euro, Apple store=333 Euro, Ebay=234 Euro, MediaMarkt=183 Euro, Saturn=300 Euro, Vatan=111 Euro}
        System.out.println("tm.ceilingKey(103) = " + tm.ceilingKey(103));//103 ceilingKey(103);->method parametre olarak
        // girilen key değer map'de varsa return eder yoksa parametreden buyuk en kuçuk key değerini return eder.
        //parametre map'de yok ve parametreden buyuk en kucuk  key de yoksa null return eder
        //ceilingKey(key)-> en kucuk abi-abla

        System.out.println("tm.ceilingKey(1) = " + tm.ceilingKey(1));//101-> 1'den buyuk en kucuk key 101
        System.out.println("tm.ceilingKey(110) = " + tm.ceilingKey(110));//null -> 110 dan b uyuk en kucuk key yok
        // Key değerleri String olsaydı bu sefer de Naturel ordera göre aynı işlemleri yapacaktı...

        //keySet - ascending order-> artan sıralama
        //descendingKeySet - descending order-> azalan sıralama
        System.out.println(tm.descendingKeySet());//[107, 106, 105, 104, 103, 102, 101]
        System.out.println(tm.keySet());//[101, 102, 103, 104, 105, 106, 107]
        System.out.println(tm.firstKey());// 101
        System.out.println(tm.lastKey());// 107

    }
}