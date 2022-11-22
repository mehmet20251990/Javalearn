package j36_Map;

import java.util.HashMap;

public class Task01 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Amazon", 296);
        map.put("Ebay", 301);
        map.put("Saturn", 326);
        map.put("MediaMarkt", 340);
        map.put("Apple Store", 320);
// task -> urun fiyatları toplamını hesaplayan code create ediniz...
        int toplam=0;

        // for (Map.Entry<String, Integer> a : map.entrySet()){//["Amazon"=296,"Ebay"=301,..]
        //     toplam+=a.getValue(); }

        for( int w: map.values()){
            toplam+=w;
        }
        System.out.println("toplam = " + toplam);
    }
}
