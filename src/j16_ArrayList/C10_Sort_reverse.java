package j16_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C10_Sort_reverse {
    public static void main(String[] args) {

        // Collections.sort(list); -> verilen listi naturel sıralama yapar
        // Collections.reverse(list); -> verilen listi ters sıralar

        ArrayList<String> listSehir = new ArrayList<>(List.of("Münih","LosAngeles","Londra","Stockholm"));
        Collections.sort(listSehir); // Sıralandı. sort() methodu sout içinde çalışmaz.
        System.out.println(listSehir); // [Londra, LosAngeles, Münih, Stockholm]

        Collections.reverse(listSehir); // ters sıralandı
        System.out.println(listSehir); // [Stockholm, Münih, LosAngeles, Londra]

        ArrayList<String> listUlke = new ArrayList<>(List.of("Alamanya","Amerigonya","İngiltere","isvec"));
        Collections.reverse(listUlke); // ters sıralandı
        System.out.println(listUlke); // [isvec, İngiltere, Amerigonya, Alamanya]

    }
}
