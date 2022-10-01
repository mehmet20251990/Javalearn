package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C08_isEmpty {
    public static void main(String[] args) {
        // isEmpty-> List boş mu kontrol eder ve t/f verir
        // clear-> Listin tüm elemanlarını siler

        ArrayList<String> listSehir = new ArrayList<>(List.of("Münih","LosAngeles","Londra","Stockholm"));
        System.out.println(listSehir);
        System.out.println(listSehir.isEmpty()); // list boş mu kontrol edildi, False yani dolu
        listSehir.clear(); // list temizlendi
        System.out.println(listSehir); // []
        System.out.println(listSehir.isEmpty()); // list boş mu kontrol edildi, True yani boş...


    }
}
