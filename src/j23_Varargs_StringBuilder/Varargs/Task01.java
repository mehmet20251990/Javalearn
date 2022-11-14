package j23_Varargs_StringBuilder.Varargs;

import java.util.ArrayList;
import java.util.Arrays;

public class Task01 {
    public static void main(String[] args) {
        /*
Task ->
verilen Stringleri birlestiren concat isimli METHOD create ediniz.
input : "m", "e", "r", "v", "e";
output : merve
 */

        String arr1[] = { "m", "e", "r", "v", "e"};
        String arr2[] = { "a","l","i"};

        // birden fazla arrayi aynı anda alamaz (aar1,arr2) gibi...
        strBirlestir(arr1);// merve
        strBirlestir(arr2);// ali
        strBirlestir("javaCAN"," Enise"," hanım");// javaCAN Enise hanım
    }//main sonu

    public static  void strBirlestir(String...str){
        String birlesenStr="";

        for (String w:str){
            birlesenStr= birlesenStr.concat(w);
        }
        System.out.println("birlesenStr = " + birlesenStr);
    }
}
