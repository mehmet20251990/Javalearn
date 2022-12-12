package j36_Map;

import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task07 {

    /*
    returnKey() isminde bir method oluşturun.
    Parametresi     String-Integer HashMap olsun.
    Return tipi Array List olsun.
    Hashmap:
                       "Lion",     1
                       "Tiger",    2
                       "Elephant", 3
                       "Cat",      4
                       "Dog",      5
    Tüm ANAHTARLARI(Keys) for döngüsü ile döndürün.
     */

    public static void main(String[] args) {

        Map<Integer, String> mp = new HashMap<>();
        mp.put(1, "Lion");
        mp.put(2, "Tiger");
        mp.put(3,"Elephant");
        mp.put(4, "Cat");
        mp.put(5, "Dog");

        System.out.println(returnKey(mp));

    }

    private static ArrayList returnKey(Map<Integer, String> mp) {

        ArrayList<Integer> Keyler = new ArrayList<>();
        for (int w: mp.keySet()){
            Keyler.add(w);
        }
        return Keyler;
    }
    }



