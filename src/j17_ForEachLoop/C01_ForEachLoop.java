package j17_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C01_ForEachLoop {
    public static void main(String[] args) {
        /*
        for each loop, for loop un gelişmiş halidir.
        1. clean code yazım kolaylığı
        2. code okuma kolaylığı
        3. hata yapma riskini azaltır
         */

        List<Integer>sayıList = new ArrayList<>(List.of(16,5,2,33,22,27,41,24));
        // Task -> list elemanlarını ayrı satırlara print et

        for (int a:sayıList){
            System.out.println(a);
        }
        // Task -> list elemanlarını ilk 3 eleman hariç tek olanlarını print et

        for (int a:sayıList.subList(3, sayıList.size())){
            if (a%2==1){
                System.out.print(a);
            }
        }
        // Task -> list elemanlarının 2 ile 5 index elemanlarının arasındaki (2,3,4,5) elemanların toplamını print et
        System.out.println(); // dumy

        int toplam=0;
        for (int a:sayıList.subList(2, 6)){
            toplam+=a;
        }
        System.out.println(toplam);
    }
}
