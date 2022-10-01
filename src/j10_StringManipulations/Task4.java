package j10_StringManipulations;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        // Task -> Girilen String in son karakterini silen code create et.

        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen bir string giriniz:");
        String q= sc.nextLine();
        System.out.println( q.substring(0,q.length()-1));

        // Task -> Girilen String içindeki istenen indexteki karakteri print eden code create et

        System.out.print("bir metin giriniz : ");
        String str = sc.next();

        System.out.println("istenen karakterin index'ini giriniz : ");
        int index=sc.nextInt();

        if (str.length()>index){
            // System.out.println(str.substring(index, index + 1));
            System.out.println(str.charAt(index));
        }else System.out.println("girdiğiniz metinde olmayan index istiyorsunuz");

        /*  TASK :
     Asagidaki String degiskenini kullanarak  konsolda isminizi yazdiriniz.
     String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        */
        String harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        char c=harfDepo.charAt(harfDepo.indexOf("C"));
        char a=harfDepo.charAt(harfDepo.indexOf("A"));
        char n=harfDepo.charAt(harfDepo.indexOf("N"));

        System.out.println(c + a + n); // ascii -> toplama
        System.out.println("" + c + a + n); // string -> concat eder

    }
}
