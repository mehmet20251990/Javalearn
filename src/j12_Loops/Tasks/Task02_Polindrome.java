package j12_Loops.Tasks;

import java.util.Scanner;

public class Task02_Polindrome {

    public static void main(String[] args) {

        /*
        Girilen ifadenin polindrome olmasını kontrol eden code create ediniz.
        polindrome: Her iki yönde okunduğunda eşit aynı olan ifadeler
        Example -> ey edip adanada pide ye
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("metin gir");
        String str=sc.nextLine();

        polindrome(str);

    }

    private static void polindrome(String str) {
        String tersStr="";// boş bir string
        for (int i=str.length()-1; i>=0; i--){
            tersStr+=str.charAt(i);// Str.nin i.ci karakterini tersStr.ye ekler(concat)
        } System.out.println("tersi" + tersStr);

        if (str.equalsIgnoreCase(tersStr)){ // str ile ters eşitlik kontrolü
            System.out.println("polindrome");
        } else System.out.println("polindrome değil");
    }

}
