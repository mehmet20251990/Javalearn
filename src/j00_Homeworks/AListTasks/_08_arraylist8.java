package j00_Homeworks.AListTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _08_arraylist8 {
    /*
        secondMax()  isminde bir method oluşturun.
        Parametre olarak integer ArrayList.
        Return tipi int olmalı.
        ArrayList'teki en yüksek (maximum) 2. değeri bulun ve onu döndürün
        ÖRN;
        ArrayList   --  5,3,4,6,7
        CEVAP : 6
     */
    public static void main(String[] args) {
        ArrayList <Integer> listSayi = new ArrayList<>(Arrays.asList(5,3,4,6,7));

        System.out.println(secondMax(listSayi));
    }
    private static int secondMax(ArrayList<Integer> listSayi) {
        int sm = 0;
        Collections.reverse(listSayi);
        sm = listSayi.get(1);
        return sm;
    }
}

