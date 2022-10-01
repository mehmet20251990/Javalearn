package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_indexOf {
    public static void main(String[] args) {

        // indexOf(); -> list içinde istenen elemanın index değerini verir

        ArrayList<String> listUlke = new ArrayList<>(List.of("Alamanya","Amerigonya","ingiltere","isvec"));
        ArrayList<String> listSehir = new ArrayList<>(List.of("Münih","LosAngeles","Londra","Stockholm"));

        System.out.println(listSehir.indexOf("Londra")); //2
        System.out.println(listSehir.indexOf("londra")); //-1 -> listte aynen olmayan elemanı -1 return eder
        System.out.println(listSehir.indexOf("manisa")); //-1

        listUlke.add("Amerigonya");
        System.out.println(listUlke); // [Alamanya, Amerigonya, ingiltere, isvec, Amerigonya]
        System.out.println(listUlke.indexOf("Amerigonya")); //1 -> tekrarlı elemanlarda soldan ilk elemanın indexini verir
        System.out.println(listUlke.lastIndexOf("Amerigonya")); //4 -> tekrarlı elemanlarda sağdan ilk elemanın indexini verir

    }
}
