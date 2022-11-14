package j00_Homeworks.AListTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _12_array1 {

    /*
    dupicate() isminde bir method oluşturun.
    Parametresi int Array olmalı
    Return tipi boolean
    Eğer Array içinde çiftleme(yineleme) var ise true dönmeli.
    Eğer Array içinde çiftleme(yineleme) yok ise false dönmeli.
    
    Örnek1:
    Input: [1,2,3,1]
    Output: true

    Örnek 2:
    Input: [1,2,3,4]
    Output: false
         */

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,1));
        Collections.sort(numbers);
        int numb[] = {1,2,3,4};
        Arrays.sort(numb);

        System.out.println(dupicate(numbers));
        System.out.println(dupicate1(numb));
    }
    private static boolean dupicate1(int[] numb) {
        boolean flag = false;
        for (int i=1; i< numb.length; i++) {
            if (numb[i-1] == numb[i])
                flag = true;
        }
        return flag;
    }
    private static boolean dupicate(ArrayList<Integer> numbers) {
        boolean flag = false;
        for (int i=1; i< numbers.size(); i++) {
            if (numbers.get(i-1) == numbers.get(i))
                flag = true;
        }
        return flag;
    }
}