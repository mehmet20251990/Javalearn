package j35_Collection.C02_Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Task03 {
    public static void main(String[] args) {
/*
commonValues() isminde bir method oluşturun ve parametresi  2 tane hashset olmalı.
return tipi arraylist olmalı.
ÖRNEĞİN:
İlk Hashset : "Germany" , "England" , "South Africa" , "Brazil" , "USA"
İkinci  hashset  : "Germany" , "China" , "Brazil" , "France" ,  "USA"
Ortak değerleri ArrayListe ekleyiniz.
çıktı:  "Germany" , "Brazil" ,"USA"
ArrayListi yazdırınız.
 */
        HashSet<String>hs1 = new HashSet<>(Arrays.asList("Germany" , "England" , "South Africa" , "Brazil" , "USA"));
        HashSet<String>hs2 = new HashSet<>(Arrays.asList("Germany" , "China" , "Brazil" , "France" ,  "USA"));
        System.out.println(commonValues(hs1, hs2));
    }
    public static ArrayList commonValues(HashSet<String> hs1, HashSet<String> hs2) {
        System.out.println(hs1.retainAll(hs2));
        ArrayList<String> kesisim = new ArrayList<>(hs1);
        return kesisim;
    }
}
