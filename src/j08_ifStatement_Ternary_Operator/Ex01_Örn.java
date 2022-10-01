package j08_ifStatement_Ternary_Operator;

import java.util.Scanner;

public class Ex01_Örn {
    public static void main(String[] args) {
     /*
     Task-> Girilen bir karakterin harf olup olmadığını kont eden code create et.

      */

        Scanner sc = new Scanner(System.in);
        System.out.println("harf gir: ");
        char harf = sc.nextLine().charAt(0);

        int a = (int) 'a';
        int z = (int) 'z';
        int A = (int) 'A';
        int Z = (int) 'Z';

        System.out.println((harf>=a && harf<=z) || (harf>=A && harf<=Z) ? "harftir" : "değildir");

        /*
        if ((harf>='A'&&harf<='Z')||(harf>='a'&&harf<='z')){
            System.out.println("harftir");
        } else System.out.println("harf değildir");
       */

    }
}
