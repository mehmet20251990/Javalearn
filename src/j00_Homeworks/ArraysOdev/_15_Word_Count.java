package j00_Homeworks.ArraysOdev;

import java.util.Arrays;

public class _15_Word_Count {

    public static void main(String[] args) {

        /*
        Bu String'i oluşturun. "Removes white space from both ends of a string"
        String'deki kelime sayısını yazdırınız.
         */
        String sentence="Removes white space from both ends of a string";
        String newArray[]=sentence.split(" ");
        System.out.println(Arrays.toString(newArray));
        System.out.println("newArray.length = " + newArray.length);

    }
}