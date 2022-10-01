package j00_Homeworks.ArraysOdev;

import java.util.Arrays;

public class _14_String_method_replace {

    public static void main(String[] args) {

        /*
        Bu String'i oluşturunuz.  "Hello World"
        "o" harfleri yerine "K" yerleştiriniz.
        Sonuç bu şekilde olmalıdır:
        HellK WKrld
         */
        String sentence = "Hello World";
        System.out.println(sentence.replace('o', 'K'));
        String newsentence[]= sentence.split("");
        System.out.println(Arrays.toString(newsentence));

      /*  String newsentence = "";
        for (int i=0; i<sentence.length(); i++) {
            if (sentence.charAt(i)=='o') {
                newsentence += 'K';
            } else newsentence += sentence.charAt(i);
        }
        System.out.println(newsentence); */
    }
}