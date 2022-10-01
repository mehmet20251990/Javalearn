package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C12_remove {
    public static void main(String[] args) {

        // remove(); -> listten istenen elemanı siler
        ArrayList<String> listSehir = new ArrayList<>(List.of("Münih","LosAngeles","Londra","Stockholm"));

        System.out.println(listSehir.remove("Amerigonya")); // false - olmadığı için silemedi
        System.out.println(listSehir.remove("Londra")); // true - silindi
        System.out.println(listSehir.remove(1)); // losAngeles - sildiği elemanı verir

        System.out.println(listSehir); // [Münih, Stockholm]
        // System.out.println(listSehir.remove(11)); // indexi olmadığı için RTE verir
        listSehir.add("Münih");
        listSehir.add("Angara");
        listSehir.add("Münih");
        System.out.println(listSehir); // [Münih, Stockholm, Münih, Angara, Münih]

        listSehir.remove("Münih"); // tekrarlı eleman varsa ilki silinir diğerlerine dokunulmaz
        System.out.println(listSehir); // [Stockholm, Münih, Angara, Münih]

        ArrayList<String> listUlke = new ArrayList<>(List.of("Alamanya","Amerigonya","ingiltere","isvec"));

        listSehir.addAll(listUlke);//sehirList'e ulkeList eklendi
        System.out.println("listSehir = " + listSehir);//ulkeList eklenemiş hali->[Stockholm, Münih, Angara, Münih, Alamanya, Amerigonya, ingiltere, isvec]

        listSehir.removeAll(listUlke);//sehirList'tten ulkeList çıkarıldı
        System.out.println("listSehir = " + listSehir);//ulkeList çıkarılmış hali->[Stockholm, Münih, Angara, Münih]

    }
}
