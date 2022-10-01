package j16_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_size {
    public static void main(String[] args) {
        // size();-> listğin eleman sayısını return eder
        ArrayList<String> listSehir = new ArrayList<>(List.of("Münih","LosAngeles","Londra","Stockholm"));

        System.out.println(listSehir.size()); //4


    }
}
