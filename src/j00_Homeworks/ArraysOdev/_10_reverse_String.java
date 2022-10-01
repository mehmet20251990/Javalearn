package j00_Homeworks.ArraysOdev;

import java.util.Arrays;

public class _10_reverse_String {

    public static void main(String[] args) {

        /*
        Bir String oluşturun : "Hello World"
        Stringi tersten yazdırın ve print edin.
        Cevap böyle olmalı :  "dlroW olleH"
         */
        String word = "Hello World";
        String reverseword[]=word.split("");
        String newwrd="";

        for (int i= reverseword.length-1; i>=0; i--){
            newwrd+= reverseword[i];
        }
        System.out.println(newwrd);

       /* for (int i=word.length()-1; i>=0; i--) {
            reverseword += word.charAt(i);
        }
        System.out.println(reverseword); */




    }
}