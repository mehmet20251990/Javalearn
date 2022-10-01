package j10_StringManipulations;

import java.util.Scanner;

public class C04_Contains {
    public static void main(String[] args) {
        /*
        String içerisinde istenen stringin varlığını kont eder boolean return eder.

         */
        String s1 = "Enise Hanım başarılı bir Qa tester team lead";
        System.out.println(s1.contains("hanım")); // False
        System.out.println(s1.contains("E")); // True
        System.out.println(s1.contains(" ")); // True

        String s2 = "Qa";
        System.out.println(s1.contains(s2)); // True
        System.out.println(s2.contains(s1)); // False

        //-> Girilen bir cümlede aranan kelimenin varlığını kontrol eden bir code create et. TERNARY kullan

        Scanner sc =new Scanner(System.in);
        System.out.println("cümle gir");
        String cumle= sc.nextLine();
        System.out.println("kelime gir");
        String kelime= sc.nextLine();

        String x=(cumle.contains(kelime))==true ? "var" : "yok";
        System.out.println(x);

    }
}
