package j00_Homeworks.ArraysOdev;

import java.util.Arrays;

public class _08_array_min_value {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
        En küçük (minimum) sayıyı yazdırınız.
         */
        int num[]= { 14 , 19 , 5 , 21};
        Arrays.sort(num);
        System.out.println(num[0]);

    }
}

