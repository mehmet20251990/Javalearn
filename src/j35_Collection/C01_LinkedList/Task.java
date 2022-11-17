package j35_Collection.C01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        /*
        Task->
        Node değerleri "yakup","javaCAN","javaTAR" olan bir LinkedList create ediniz
        Girilen bir String değeri Linkedlistte varlığını kontrol edip vrsa silip "Agam eleman halledildi" yoksa "Agam
        aradığınız kişiye ulaşılamadı" print eden code create ediniz.
         */

        LinkedList<String>ll1 = new LinkedList<>(Arrays.asList("yakup","javaCAN","javaTAR","Teykinay"));
        Scanner sc = new Scanner(System.in);
        System.out.println("Kime bakmıştınız");
        String aganınAdamı = sc.next();

        System.out.println(ll1);

        if (ll1.remove(aganınAdamı)) {//true->istenen node var ve silindi

            System.out.println("Agam eleman halledildi");
            System.out.println("aganın adamı halloduktan sonra :" + ll1);

        } else System.out.println("Agam aradığınız kişiye ulaşılamadı");
    }
}
