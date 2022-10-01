package j00_Homeworks.tasks_MethodCreation;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		// Saati saniyeye, mil'i kilometreye, kilogrami gram'a 
		// ceviren bir method yaziniz.
		Scanner sc=new Scanner(System.in);
		System.out.println("Saat için bir değer giriniz :");
		int saat = sc.nextInt();
		System.out.println("Mil için bir değer giriniz :");
		int mil = sc.nextInt();
		System.out.println("Kg için bir değer giriniz :");
		int kg = sc.nextInt();
/*
		saat = sn(saat);
		System.out.println(saat);
		mil = km(mil);
		System.out.println(mil);
		kg = gr(kg);
		System.out.println(kg);
*/
		System.out.println(sn(saat));
		System.out.println(km(mil));
		System.out.println(gr(kg));
	}

	private static int km(int a) {
		return a*1600;
	}

	private static int gr(int b) {
		return b*1000;
	}

	static int sn(int c) {

		return c*3600;
	}


}
