package j00_Homeworks.ArraysOdev;

import java.util.Arrays;

public class _21_Array_reverse {

    public static void main(String[] args) {

        /*
        Girilen 123 Intiger'ının basamaklarını ters çevirin.
        Örnek:
        Input(girdi): 123
        Output(çıktı): 321
         */
        String number ="123";
        String array[]=number.split("");
        for (int i= array.length-1; i>=0; i--) {
            System.out.print(array[i]);
        }

    }
}


