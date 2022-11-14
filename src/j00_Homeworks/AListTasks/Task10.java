package j00_Homeworks.AListTasks;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task10 {

    public static void main(String[] args) {
        /* TASK :
         * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir code create ediniz.
         *
         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * OUTPUT : [1,2,3,4,5,6,7,8,9]
         */
        int [] sayilar = {1,2,2,3,1,4,2,5,6,8,7,5,9,1};
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));
        ArrayList <Integer> sayiTekrarsiz = new ArrayList<>();
        for(int i = 0 ; i<=sayilar.length-1 ; i++) {
            if(!sayiTekrarsiz.contains(sayilar[i])) {
                sayiTekrarsiz.add(sayilar[i]);
            }
        }
        System.out.println(sayiTekrarsiz);
    }
}