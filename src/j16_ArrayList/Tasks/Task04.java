package j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.List;

public class Task04 {
    public static void main(String[] args) {
        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde 'a' harfi bulunanlari silen bir code create ediniz.

         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */

        ArrayList<String> list1 = new ArrayList<>(List.of("Ali","Veli","Ayse","Fatma","Omer"));
        ArrayList<String> asızlist = new ArrayList<>(List.of()); // boş list
        for (int i=0; i<list1.size(); i++) {
            if (!list1.get(i).toLowerCase().contains("a")) { // listin herbir elemanı a bulundurmuyorsa
                asızlist.add(list1.get(i)); // yeni liste olmayan elemanlar eklendi
            }
        }
        System.out.println(asızlist); //[Veli, Omer]

        list1.clear(); // list1 boşaltıldı
        list1.addAll(asızlist);
        System.out.println(list1); //[Veli, Omer]
    }
}
