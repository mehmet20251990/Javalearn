package j00_Homeworks.AListTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class _06_arraylist6 {

    /*
    hillNum() isminde bir method oluşturun.
    Parametre olarak Integer ArrayList
    Return tipi int,
    Eğer sayı, önceki sayıdan küçük ve bir sonraki sayıdan büyük ise, o sayıyı yazdırın.
    Örneğin;
    ArrayList  5,4,6,2,1
    2, 6'dan küçük ve 1 den büyüktür.
    Return 2 olmalı.
     */
    public static void main(String[] args) {
    ArrayList<Integer> listSayi= new ArrayList<>(Arrays.asList(5,4,6,2,1));
        System.out.println(hillNum(listSayi));

    }

    private static int hillNum(ArrayList<Integer> listSayi) {
        int x=0;
        for (int i= 1; i<listSayi.size()-1; i++){
            if (listSayi.get(i)<listSayi.get(i-1)&&listSayi.get(i)>listSayi.get(i+1)){
                x=listSayi.get(i);
            }
        }

        return x;
    }
}
