package j36_Map;

import java.util.Hashtable;

public class C12_HashTable {
    public static void main(String[] args) {
        /*
        HashTable->
        HashMap'e kullanılan methodlar hashTable obj ile de call edilir
        1- Hashmap ve TreeMap thread-safe ve synchronized olmadığı için Map'ler arasında thread-safe ve synchronized
        olan bir map'e ihtiyaç old. HashTable tanımlanmıştır
        2- Hastable hashMap'e göre daha yavaştır
        3- HashTable key ve Value'larda null değere izin vermez
        4- HashTable eleman ataması yapılırken HashMap random yapar.
         */
        Hashtable<String,String> ht = new Hashtable<>();

        ht.put("kebab", "adana");
        ht.put("döner", "sivas");
        ht.put("köfte", "tekirdağ");
        ht.put("çorba", "beyran");
        ht.put("söğüş", "");
        System.out.println(ht);// {köfte=tekirdağ, söğüş=, çorba=beyran, döner=sivas, kebab=adana}

        ht.put("döner", "dönerse senindir");// Update yapar, key dublicate değil üzerine value ataması yapar
        System.out.println(ht);//{köfte=tekirdağ, söğüş=, çorba=beyran, döner=dönerse senindir, kebab=adana}

        // ht.put(null, "ciğer"); //RTE - NullPointerException
        // ht.put("ciğer", null); //RTE - NullPointerException

        Hashtable<String, String> ht1 = new Hashtable<>();
        ht1.put("salata", "patlıcan");
        ht1.put("tatlı", "içli köfte");
        System.out.println(ht1); //{salata=patlıcan, tatlı=içli köfte}

        ht.putAll(ht1);
        System.out.println(ht);//{köfte=tekirdağ, salata=patlıcan, söğüş=, çorba=beyran, döner=dönerse senindir, tatlı=içli köfte, kebab=adana}
        System.out.println(ht1); //{salata=patlıcan, tatlı=içli köfte}




    }
}
