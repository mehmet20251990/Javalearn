package j00_Homeworks.tasks3;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		
		
		// kullanicidan 2 tam sayi alip bu 2 tamsayinin  dort islem sonucunu yazdiriniz.

		Scanner scan = new Scanner(System.in);
		System.out.println("2 sayı gir:");
		Integer a=scan.nextInt();
		Integer b=scan.nextInt();
		System.out.println("Sonuç = " + (a*b+a-b));


	}

}
