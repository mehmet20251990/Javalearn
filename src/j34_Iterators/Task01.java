package j34_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Task01 {
    public static void main(String[] args) {
        /*
        task -> Verilen bir integer listin tek elemanrının karesini tersten iterator print eden code create ediniz
         */
        List<Integer> list = new ArrayList<>(List.of(24,38,65,9,11));
        ListIterator<Integer> it = list.listIterator();
        while(it.hasNext()) {
            int eleman=it.next();
            if(eleman%2==1) {
                it.set(eleman*eleman);
            }else {
                it.remove();
            }
        }
        while(it.hasPrevious()) System.out.print(it.previous() + " ");

        System.out.println();
        List<Integer> l1 = new ArrayList<>(Arrays.asList(24,38,65,9,11));
        ListIterator<Integer> it1 = l1.listIterator();
        while (it1.hasNext()) {
            it1.next();
        }
        while (it1.hasPrevious()) {
            if(it1.previous()%2==1){
                System.out.print(((int) Math.pow(it1.next(),2))+" ");
            }
            it1.previous();
        }


        System.out.println();
        List<Integer> l3= new ArrayList<>(Arrays.asList(24,38,65,9,11));
        ListIterator <Integer> it3=l3.listIterator();

        while (it3.hasNext()){
            int sayi= it3.next();
            if (sayi%2==1){
                it3.set((int)Math.pow(sayi,2));
            }else it3.remove();
        }
        while (it3.hasPrevious()){

            System.out.print(it3.previous() + " ");
        }
    }

    }

