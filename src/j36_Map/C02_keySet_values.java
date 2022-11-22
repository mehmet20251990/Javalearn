package j36_Map;

import java.util.HashMap;

public class C02_keySet_values {
    public static void main(String[] args) {
        HashMap<String ,String > hm=new HashMap<>();
        //map.keySet();->map key değerlerini Sete atayıp return eder
        //map.values();->map value değerlerini coll. atayıp return eder
        hm.put("Amazon","296 Euro");
        hm.put("Ebay","234 Euro");
        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("Apple store","333 Euro");
        hm.put("MediaMarkt","183 Euro");

        System.out.println("hm = " + hm);

        System.out.println("hm.keySet() = " + hm.keySet());// [Saturn, Ebay, Apple store, MediaMarkt, Amazon, Vatan]
        System.out.println("hm.values() = " + hm.values());// [300 Euro, 234 Euro, 333 Euro, 183 Euro, 296 Euro, 111 Euro]

        //Task-> hm key ve value değerlerini satır satır print ediniz
        for (String s:hm.keySet()) {
            System.out.println(s+" ");
        }
        for (String w:hm.values()) {
            System.out.println(w+" ");
        }

    }
}
