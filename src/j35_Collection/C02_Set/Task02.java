package j35_Collection.C02_Set;

import java.util.HashSet;
import java.util.TreeSet;

public class Task02 {
    public static void main(String[] args) {

        // hashset ve treeset tanımlayıp run surelerini karşılaştırınız
        // TRİCK-> rub süresi için System.currentTimeMillis() meth call ediniz

        long tsBasla = System.currentTimeMillis();
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("ali"); ts.add("bekir"); ts.add("can"); ts.add("salim");
        long tsBitir = System.currentTimeMillis();
        System.out.println("ts run süresi: " + (tsBitir-tsBasla)); // 1

        long hsBasla = System.currentTimeMillis();
        HashSet<String> hs = new HashSet<>();
        hs.add("veli"); hs.add("burak"); hs.add("caner"); hs.add("nazım");
        long hsBitir = System.currentTimeMillis();
        System.out.println("hs run süresi: " + (hsBitir-hsBasla));// 0

        ///interview question
    // girilen string datanın karakterlerini alfabetik print ediniz
    //el cevap--> TreeSet e atanır->ilgili collection a çeviririm
    }
}
