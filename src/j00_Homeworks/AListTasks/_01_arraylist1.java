package j00_Homeworks.AListTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class _01_arraylist1 {

    /*
        ismi getCount() olan bir method oluşturun.
        Parametre olarak bir String ArayList  ve  bir tane String

        Return tipi int olmalı.

        ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
        Örneğin;
        ArrayList = Orange , Kiwi , Peach , Banana , Orange
        String Orange:
        Count = 2 olmalı. (Orange 2 kez yazılmış)
         */

    public static void main(String[] args) {

        ArrayList<String> List = new ArrayList<>(Arrays.asList("Orange","Kiwi","Peach","Banana","Orange"));
        String s = "Orange";

        System.out.println(getCount(List, s));

    }

    private static int getCount(ArrayList<String> list, String s) {
        int count = 0;
        for (String x : list) {
            if (x.contains(s)) {
                count++;
            }
        }
        return count;
    }
}
