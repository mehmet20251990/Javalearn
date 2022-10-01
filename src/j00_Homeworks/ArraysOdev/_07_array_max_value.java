package j00_Homeworks.ArraysOdev;

import java.util.Arrays;

public class _07_array_max_value {

    public static void main(String[] args) {

        /*
            int Array oluşturun ve elemanları : 12,2,5,15,8
            En büyük değeri yazdırınız.
         */
        int num[]= {12,2,5,15,8};
        Arrays.sort(num);
        System.out.println(num[num.length-1]);
    }
}

