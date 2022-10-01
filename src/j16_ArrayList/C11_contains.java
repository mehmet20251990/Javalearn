package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C11_contains {
    public static void main(String[] args) {

        // contains(); -> method listte istenen elemanın varlığını kontrol eder t/f verir

        ArrayList<String> listSehir = new ArrayList<>(List.of("Münih","LosAngeles","Londra","Stockholm"));
        System.out.println(listSehir.contains("angara")); // False
        System.out.println(listSehir.contains("Münih")); // True
        System.out.println(listSehir.contains("münih")); // False

    }
}
