package j16_ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class C02_nCopies {
    public static void main(String[] args) {

        ArrayList<String> listUlke = new ArrayList<>(List.of("Alamanya","Amerigonya","ingiltere","isvec"));
        ArrayList<String> listSehir = new ArrayList<>(List.of("Münih","LosAngeles","Londra","Stockholm"));

        // nCopies(int, Obj); -> int elemanlı bir obj den oluşan list ataması yapılır
        ArrayList<String> yeniList = new ArrayList<>(Collections.nCopies(3, "javaCAN")); //[javaCAN, javaCAN, javaCAN]
        System.out.println(yeniList);

        // addAll(); -> bir list e diğer list i olduğu gibi ekler
        listUlke.addAll(listSehir); // ülkelist sonuna şehirlist tamamen eklendi.

        System.out.println(listUlke); //[Alamanya, Amerigonya, ingiltere, isvec, Münih, LosAngeles, Londra, Stockholm]
        listSehir.addAll(3, listUlke); // 3. indexten itibaren ülkelist i şehirlist e eklendi

        System.out.println(listSehir);// [Münih, LosAngeles, Londra, Alamanya, Amerigonya, ingiltere, isvec, Münih, LosAngeles, Londra, Stockholm, Stockholm]

        // Task-> 1 den 10 a kadar sayılara bir liste atayıp print eden code create ediniz
        ArrayList<Integer> listSayi= new ArrayList<>();//boş integer list

        for (int i = 1; i <=10; i++) {
            listSayi.add(i);
        }
        System.out.println("listSayi = " + listSayi);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    }
}


