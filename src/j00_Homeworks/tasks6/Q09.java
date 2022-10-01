package j00_Homeworks.tasks6;

import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {

		/*  TASK :
				StringMethods:
				girilen  bir strngin ilk yarisini print eden code create ediniz
	    	    ORNEK:
		     	INPUT :istanbul
				OUTPUT :ista
	    */

        Scanner sc = new Scanner(System.in);
        System.out.println("şehir gir");
        String sehir= sc.nextLine();

        System.out.println(sehir.substring(0,sehir.length()/2));

    }
}
