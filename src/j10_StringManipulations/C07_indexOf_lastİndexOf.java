package j10_StringManipulations;

import java.util.Scanner;

public class C07_indexOf_lastİndexOf {
    public static void main(String[] args) {

/*      indexOf()
 * char karakter ya da String metnin kacinci indexden basladigini veren bir method dur. Sonuc integer dir.
 * Bu method index'i sorulan char'in String icindeki ilk gorunumunun index'ini return eder
  contains den farkı indexini verir, contains ise true false

*/
        String str = "Good";
        System.out.println(" ilk görülen o nun yeri index nosu" + str.indexOf('o')); //1
        System.out.println(" d nin yeri index nosu" + str.indexOf('d')); //3
        System.out.println(" d nin yeri index nosu" + str.indexOf('D')); //-1 -> D karakteri olmadığı için...

        // TRİCK-> olmayan karakter indexi sorgulanırsa -1 return eder.

        System.out.println("od un yeri index nosu" + str.indexOf("od")); //2
        System.out.println("Od un yeri index nosu" + str.indexOf("Od")); //-1

        /**      lastIndexOf()
         *  String içinde aranan karakter(ler)in sondan itibaren ilk indexini verır
         *  indexOf un sondan olan hali fakat index numaraları değişmez.
         *  lastIndexOf() Method'u index'i sorulan character'in son gorunumunun index'ini return eder.
         *  indexOf() methodunda birden fazla character'in index'i sorulursa ilk character'in index'i return edilir.
         */

        String isim = "Mehmet Şimşek";
        System.out.println(isim.lastIndexOf('e')); // 11
        System.out.println(isim.lastIndexOf("et")); // 4
        System.out.println(isim.indexOf('e')); // 1

        // TASK->  Girilen cümlenin aşaıdaki durumları sağlayacak code create ediniz
        //
        // 1-Girilen cumle java icermiyor
        // 2-Girilen cumle 1 tane java iceriyor
        // 3-Girilen cumlede birden fazla java var

        Scanner sc =new Scanner(System.in);
        System.out.print("cümle gir");
        String cumle= sc.next().toLowerCase();

        if (cumle.contains("java") != true) {
            System.out.println("girilen cümle java içermiyor");

        } else if (cumle.indexOf("java") == cumle.lastIndexOf("java")) {
            System.out.println("java bir adet yazmaktadır");

        } else {
            System.out.println("iki ve üstü java yazmakta");
        }



    }
}
