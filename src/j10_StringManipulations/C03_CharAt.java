package j10_StringManipulations;

import java.util.Scanner;

public class C03_CharAt {
    public static void main(String[] args) {
        /*
        charAt() methodu parametre int olarak girilen index teki char değeri return eder.
        index değeri 0'dan başlar.
         */
        String sehir="istanbul";
        char besinciİndexkrkt=sehir.charAt(5);
        System.out.println(besinciİndexkrkt); // b

        // son index karakteri -> length()-1
        System.out.println(sehir.charAt(sehir.length() - 1)); // l
        System.out.println(sehir.charAt(0)); // i
        //System.out.println(sehir.charAt(18); // RTE

        // Task-> İstanbul, ortadaki karakteri print et.
        System.out.println(sehir.charAt((sehir.length() - 1)/2));

        Scanner sc =new Scanner(System.in);
        System.out.println("bir kelime gir");
        String kelime= sc.nextLine();

        if (kelime.length()%2!=0){
            System.out.println(kelime.charAt((kelime.length()-1) / 2));
        }else System.out.println("girilen kelimenin orta karakteri yoktur");

    }
}
