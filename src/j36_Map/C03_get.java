package j36_Map;

import java.util.HashMap;

public class C03_get {
    public static void main(String[] args) {
        HashMap<String ,String > hm=new HashMap<>();
        //map.get(key);->Girilen key değerlerinin valuesini return eder
        hm.put("Amazon","296 Euro");
        hm.put("Ebay","234 Euro");
        hm.put("Saturn","300 Euro");
        hm.put("Vatan","111 Euro");
        hm.put("Apple store","333 Euro");
        hm.put("MediaMarkt","183 Euro");

        System.out.println("hm = " + hm);

        System.out.println("hm.get(\"Ebay\") = " + hm.get("Ebay"));// 234 Euro
        System.out.println("hm.get(\"Sefiller\") = " + hm.get("Sefiller"));// Null
        System.out.println("hm.get(12)= "+hm.get(12));//Null: key data type farketmeksizin olmayan keyi null return eder
        System.out.println("hm.get(\"296 Euro\") = " + hm.get("296 Euro")); //null


    }
}
