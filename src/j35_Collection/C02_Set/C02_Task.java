package j35_Collection.C02_Set;

import java.util.*;

public class C02_Task {
    public static void main(String[] args) {
        /*
        Değer ataması yapılan Array'i arrayliste çeviren meth create ediniz
        main içerisinde meth return ettiği arraylisti hashset, linkedhashset ve treesete atayınız.
         */
        String arr[]={"Muharrem", "Umit", "Sinan", "Nihan"};

        arrayListeCevir(arr);
        HashSet<String>hs = new HashSet<>(arrayListeCevir(arr));
        LinkedHashSet<String> lhs=new LinkedHashSet<>(arrayListeCevir(arr));
        TreeSet<String> ts=new TreeSet<>(arrayListeCevir(arr));

        System.out.println("hurra set: " +hs); //[Muharrem, Sinan, Nihan, Umit]
        System.out.println("erken gelen girer set: "+lhs); //[Muharrem, Umit, Sinan, Nihan]
        System.out.println("alfabetik sıra set: "+ts); //[Muharrem, Nihan, Sinan, Umit]
    }
    private static ArrayList<String> arrayListeCevir(String[] arr) {
        ArrayList<String>arLst = new ArrayList<>(List.of(arr));
        return arLst;
    }
}
