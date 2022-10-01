package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_Set {
    public static void main(String[] args) {

        // set(); -> listin istenen indexe istenen elemanı update eder

        ArrayList<String> listSehir = new ArrayList<>(List.of("Münih","LosAngeles","Londra","Stockholm"));

        System.out.println(listSehir.set(3, "Angara")); //Stockholm -> set edilen değer print edilir
        System.out.println(listSehir); //[Münih, LosAngeles, Londra, Angara]-> listin set edilmiş hali print edilir

        // System.out.println(listSehir.set(11, "pataGONYA"));//olmayan index set edilirse RTE verir
        System.out.println("listSehir = " + listSehir);

        // listSehir.set(1,"bursa",2,"izmir"); // -> listte çoklu set metodu çalışmaz.BUZ gibi İNTERVİEW sorusu...CTE

    }
}
