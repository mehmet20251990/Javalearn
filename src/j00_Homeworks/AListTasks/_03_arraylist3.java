package j00_Homeworks.AListTasks;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.reflect.Array.getLength;

public class _03_arraylist3 {

    /*
        getLength() isminde bir method oluşturun.
        Parametre olarak String ArrayList
        Return tipi Integer ArrayList
        ArrayList içindeki her bir Stringin uzunluğunu bulunuz.

        Tüm elementlerin uzunluğunu döndürün

        Örneğin;
        ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"
        Tüm Stringlerin uzunluklarını yazdırın;
        cevap: 10 ,  8 , 4 , 7 , 6 olmalı
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("New jersey", "New york", "Ohio", "Florida", "Boston"));

        System.out.println(getLength(list));;
    }
    public static ArrayList getLength(ArrayList<String> list) {
        ArrayList<Integer> length = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            length.add(list.get(i).length());
        }
        return length;
    }
}