package j34_Iterators;

import java.util.*;

public class C01_Iterators {
    public static void main(String[] args) {

        List<String> l1 = new ArrayList<>(Arrays.asList("Nur", "Gamze", "Erol", "Bekir"));
        System.out.println("list ik hali: " + l1);

        // l1 elemanları for loop ile print ediniz...
        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i) + " ");
        }
        System.out.println("   ***   ");

        // l1 elemanları for-each loop ile print ediniz...
        for (String w : l1) {
            System.out.println(w + " ");
        }
        System.out.println("   ***   ");

        // l1 elemanlarını :-) ile for loop kullanarak print edin...
        for (int i = 0; i < l1.size(); i++) {
            l1.set(i, l1.get(i) + " :-) ");
        }
        System.out.println("l1 :-) update sonrası: " + l1);
        System.out.println("   ***   ");

        // l1 elemanlarını :-( ile for-each loop kullanarak print edin...
        for (String w : l1) {
            w += " :-( ";
        }
        System.out.println("l1 :-( update sonrası: " + l1);
        /*
        İndex desteklemeyen yapılarda tekrarlayan aksiyon için for-each loop update yapamayabilir. Yukarıdaki TASK de
        olduğu gibi... Bu durumda java Iterator Interface'den tanımlanacak var. ile tekrarlayan aks.lar index olmadan
        yapılır.
         */
        System.out.println();
        System.out.println("   ***   ");

        Iterator<String> it1 = l1.iterator();//Iterator interfaceden it1 var. tanımlandı. Atama olarak l1 elemanları atandı
        while (it1.hasNext()) {
            //hasNext()-> it1 elemanları için pointer old yerde eleman varsa true yoksa false verir ve pointer bir sonraki
            //          eleman önüne koyulur
            //next()-> list'in pointer önündeki  elemnını return eder
            System.out.print(it1.next() + " ");//Nur :-)  Gamze :-)  Erol :-)  Bekir :-)
        }
            System.out.println();
            System.out.println("   *** Iterators ***   ");
            List<String> l2 = new ArrayList<>(Arrays.asList("Baran", "Gülsüm", "Akif", "Nazım"));
            //l2 elamnalrını ıterator ile silip print ediniz-> l2=[]
            System.out.println("iterator öncesi l2 : " + l2);//[Baran, Gülsüm, Akif, Nazım]
            Iterator<String> it2 = l2.iterator();
            while (it2.hasNext()) {//tekraradaki pointer önünde eleman varlığının kontrol eder
                it2.next();//tekrardaki pointer öünüdeki elemanı verir
                it2.remove();// next() ile  gelen elemanı siler
            }
            System.out.println("iterator  remove sonrası l2 : " + l2);// []

            System.out.println();
            System.out.println("   *** Iterators ***   ");
            List<String> l3 = new ArrayList<>(Arrays.asList("Baran", "Gülsüm", "Akif", "Nazım"));
            //l2 elamnalarını ıterator ile :-) set edip print ediniz
            System.out.println("iterator öncesi l3 : " + l3);//[Baran, Gülsüm, Akif, Nazım]
            ListIterator<String>it3 = l3.listIterator(); // tekrarlı iterator yapısı tanımlandı

            while (it3.hasNext()) {
                it3.set(it3.next()+" :-) ");// tekrardaki next() ile elemanları :-) concat ederek update edildi.
            }
            System.out.println("iterator set sonrası l3 : " + l3);//[Baran :-) , Gülsüm :-) , Akif :-) , Nazım :-)]

            System.out.println();
            List<String> l4 = new ArrayList<>(Arrays.asList("Serhat", "Yakup", "Mustafa", "Nazlı"));
            System.out.println("iterator öncesi l3 : " + l3);//[Baran, Gülsüm, Akif, Nazım]
            // l3 elemanlarının ilk harfi büyük kalan 3 harfi *** krkteri ve l4 listi ekleyip print ediniz
            ListIterator<String> ebikGabık = l3.listIterator(); // tekrarlı iterator yapısı tanımlandı

            while (ebikGabık.hasNext()){
                ebikGabık.set(ebikGabık.next().toUpperCase().charAt(0)+"***");// next() ile gelen 14 elemanı ilk harfi
                                // büyük kalan 3 harfi *** ile concat edildi.
            }
            ebikGabık.add(l4.toString());// l4 eklendi
            System.out.println("Listiterator set ve add sonrası l3:"+l3);//[B***, G***, A***, N***, [Serhat, Yakup, Mustafa, Nazlı]]
        }
    }
