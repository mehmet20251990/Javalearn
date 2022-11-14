package j00_Homeworks.AListTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class _02_arraylist2 {

      /*
        getSum() isminde bir method oluşturun.
        Parametresi ArrayList olmalı
        Return tipi int olmalı.
        ArrayList teki tüm sayıları birbiri ile toplayın.
        return olarak toplam sonucu döndürün.
        Örneğin;
        Arraylist = 1,2,3,4,5
        return 15 olmalı
         */

    public static void main(String[] args) {

        ArrayList<Integer> listSayi = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(getSum(listSayi));
    }

    private static int getSum(ArrayList<Integer> listSayi) {
        int toplam =0;
        for (int x : listSayi){
            toplam+=x;
        }
        return toplam;
    }
}
